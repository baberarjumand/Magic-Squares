/**
 * - Project Description -
 * - Class Description -
 * Author: Baber Arjumand
 * Date:   Aug 08 2019
 * Time:   2:24 PM
 */

package com.baberarjumand.magic.tuple.coordinates;

import com.baberarjumand.magic.tuple.Tuple;
import com.baberarjumand.magic.tuple.TupleException;

public class CellCoordinates extends Tuple
{
    private final String 	OPEN_PRINT_DELIMINTER = "[";
    private final String 	CLOSE_PRINT_DELIMINTER = "]";

    public CellCoordinates(int size) throws TupleException
    {
        super(size);
    }
    public CellCoordinates(int size, int[] newData) throws TupleException
    {
        super(size, newData);
    }
    public String getOpenDelimiter()
    {
        return this.OPEN_PRINT_DELIMINTER;
    }
    public String getCloseDelimiter()
    {
        return this.CLOSE_PRINT_DELIMINTER;
    }
}