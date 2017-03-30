/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.weight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class TonsConverterTest {
    TonsConverter converter = new TonsConverter();

    @Test
    public void toStandard() throws Exception {
        assertEquals(1000, converter.toStandard(1), 0.0001);
        assertEquals(1500, converter.toStandard(1.5), 0.0001);
    }

    @Test
    public void fromStandard() throws Exception {
        assertEquals(1, converter.fromStandard(1000), 0.0001);
        assertEquals(1.5, converter.fromStandard(1500), 0.0001);
    }

}