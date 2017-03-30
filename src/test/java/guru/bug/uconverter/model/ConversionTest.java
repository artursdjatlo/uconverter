/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class ConversionTest {

    @Test
    public void convertTest() throws Exception {
        Converter sourceConv = mock(Converter.class);
        Converter targetConv = mock(Converter.class);
        when(sourceConv.toStandard(1.0)).thenReturn(10.0);
        when(targetConv.fromStandard(10.0)).thenReturn(20.0);

        Conversion conversion = new Conversion(sourceConv, targetConv);

        assertEquals(20.0, conversion.convert(1.0), 0.001);
    }


    @Test
    public void getTargetValue() throws Exception {
        Converter src = mock(Converter.class);
        Converter trg = mock(Converter.class);
        when(src.fromStandard(1.0)).thenReturn(1.0);
        when(src.toStandard(1.0)).thenReturn(1.0);
        when(trg.fromStandard(1.0)).thenReturn(1.0);
        when(trg.toStandard(1.0)).thenReturn(1.0);
        Conversion conv = new Conversion(src, trg);
        conv.setSourceValue(1.0);
        assertEquals(1.0, conv.getTargetValue(), 0.001);
    }

}