/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.temperature;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class KelvinConverterTest {
    private KelvinConverter converter = new KelvinConverter();

    @Test
    public void getUnitNameTest() throws Exception {
        assertEquals("Kelvin", converter.getUnitName());
    }

    @Test
    public void toStandardTest() throws Exception {
        assertEquals(100.0, converter.toStandard(100.0), 0.0001);
    }

}