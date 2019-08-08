/**
 * - Project Description -
 * - Class Description -
 * Author: Baber Arjumand
 * Date:   Aug 08 2019
 * Time:   2:14 PM
 */

package com.baberarjumand.magic.puzzles.cubes.pairs;

import com.baberarjumand.magic.tuple.contents.CellContents;
import com.baberarjumand.magic.tuple.coordinates.CellCoordinates;

public class CoordinatesContentsPair
{
    private CellCoordinates cellCoordinates;
    private CellContents cellContents;

    protected CoordinatesContentsPair ()
    {
        // used to display empty puzzle columns
    }

    /**
     * @throws Exception if any input parameter is null
     */
    public CoordinatesContentsPair(CellCoordinates cellCoordinates, CellContents cellContents) throws Exception
    {
        super();	// auto-generated

        if (null == cellCoordinates)
            throw new Exception ("cellCoordinates parameter is null");
        if (null == cellContents)
            throw new Exception ("cellContents parameter is null");

        this.cellContents = cellContents;
        this.cellCoordinates = cellCoordinates;
    }

    public CellCoordinates getCellCoordinates()
    {
        return cellCoordinates;
    }

    public CellContents getCellContents()
    {
        return cellContents;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((cellContents == null) ? 0 : cellContents.hashCode());
        result = prime * result
                + ((cellCoordinates == null) ? 0 : cellCoordinates.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof CoordinatesContentsPair))
            return false;
        CoordinatesContentsPair other = (CoordinatesContentsPair) obj;
        if (cellContents == null)
        {
            if (other.cellContents != null)
                return false;
        } else if (!cellContents.equals(other.cellContents))
            return false;
        if (cellCoordinates == null)
        {
            if (other.cellCoordinates != null)
                return false;
        } else if (!cellCoordinates.equals(other.cellCoordinates))
            return false;
        return true;
    }
}