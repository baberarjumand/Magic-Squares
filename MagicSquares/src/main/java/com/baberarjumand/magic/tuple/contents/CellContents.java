/**
 * - Project Description -
 *
 * CellContents represent the data contained within a cell of a multi-dimensional
 * matrix
 *
 * Author: Baber Arjumand
 * Date:   Aug 08 2019
 * Time:   2:20 PM
 */

package com.baberarjumand.magic.tuple.contents;

import com.baberarjumand.magic.tuple.Tuple;
import com.baberarjumand.magic.tuple.TupleException;

public class CellContents extends Tuple
{
    private final String 	OPEN_PRINT_DELIMINTER = "{";
    private final String 	CLOSE_PRINT_DELIMINTER = "}";

    public CellContents(int size, int[] newData) throws TupleException
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