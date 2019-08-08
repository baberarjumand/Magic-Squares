/**
 * - Project Description -
 *
 * Generally, you should not print from test code.
 * Exception: in this case, we want to see the printed results
 *
 * Author: Baber Arjumand
 * Date:   Aug 08 2019
 * Time:   2:38 PM
 */

package com.baberarjumand.magic.tuple;

import com.baberarjumand.magic.tuple.contents.CellContents;
import com.baberarjumand.magic.tuple.contents.CellDifferences;
import com.baberarjumand.magic.tuple.coordinates.CellCoordinates;
import com.baberarjumand.magic.tuple.coordinates.CellOffsets;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertArrayEquals;

public class TestTuplePrinting
{
    @Test
    public void displayPrintDelimiters()
    {
        int[] expectedResult = {3,3,3};

        int[] tupleArray = {0,1,2};

        int[] contentsArray0 = {3,4,5};
        int[] contentsArray1 = {6,7,8};

        int[] coordinatesArray0 = {3,4,5};
        int[] coordinatesArray1 = {6,7,8};
        try
        {
            Tuple tuple = new Tuple(3, tupleArray);
            System.out.println("Tuple:\t\t\t" + tuple);

            CellContents contents0 = new CellContents(3, contentsArray0);
            CellContents contents1 = new CellContents(3, contentsArray1);
            System.out.println("Contents:\t\t" + contents0);

            CellDifferences differences = new CellDifferences(3, contents0, contents1);
            System.out.println("Differencess:\t" + differences);
            int[] tempArray = differences.getTupleData();
            assertArrayEquals(expectedResult, tempArray);

            CellCoordinates coordinates0 = new CellCoordinates(3, coordinatesArray0);
            CellCoordinates coordinates1 = new CellCoordinates(3, coordinatesArray1);
            System.out.println("Coordinates:\t" + coordinates0);

            CellOffsets offsets = new CellOffsets(3, coordinates0, coordinates1);
            System.out.println("Offsets:\t\t" + offsets);
            tempArray = offsets.getTupleData();
            assertArrayEquals(expectedResult, tempArray);
        }
        catch (TupleException e)
        {
            fail (e.toString() );
        }
    }
}
