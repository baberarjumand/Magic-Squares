/**
 * - Project Description -
 * - Class Description -
 * Author: Baber Arjumand
 * Date:   Aug 08 2019
 * Time:   2:41 PM
 */

package com.baberarjumand.magic;

import com.baberarjumand.magic.puzzles.cubes.MagicCubeCharacteristicsTest;
import com.baberarjumand.magic.puzzles.cubes.MagicCubeTest;
import com.baberarjumand.magic.puzzles.cubes.adjacency.AdjacencyMatrixTest;
import com.baberarjumand.magic.tuple.TestTuplePrinting;
import com.baberarjumand.magic.tuple.TupleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses
        (
                {
                        TupleTest.class,
                        TestTuplePrinting.class,

                        AdjacencyMatrixTest.class,
                        MagicCubeCharacteristicsTest.class,
                        MagicCubeTest.class
                }
        )
public class MagicTestSuite
{
    MagicTestSuite()
    {

    }
}