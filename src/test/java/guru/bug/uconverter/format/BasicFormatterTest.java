/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.format;

import guru.bug.uconverter.model.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class BasicFormatterTest {
    private BasicFormatter formatter = new BasicFormatter();

    @Test
    public void format() throws Exception {
        Converter conv = mock(Converter.class);
        when(conv.getUnitAbbr()).thenReturn("X");

        when(conv.fromStandard(10)).thenReturn(0.0);
        when(conv.fromStandard(11)).thenReturn(100.0);

        String result = formatter.format(5.0, conv);
        String expected = String.format("%.2f X", 5.0);
        assertEquals(expected, result);
    }

}