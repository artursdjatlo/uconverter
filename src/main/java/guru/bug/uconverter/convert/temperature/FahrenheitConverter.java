/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.temperature;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class FahrenheitConverter extends AbstractTemperatureConverter {

    @Override
    public String getUnitName() {
        return "Fahrenheit";
    }

    @Override
    public double toStandard(double fahrenheit) {
        return (fahrenheit - 32.0) / 1.8 + 273.15;
    }

    @Override
    public double fromStandard(double kelvin) {
        return (kelvin - 273.15) * 1.8 + 32.0;
    }
}
