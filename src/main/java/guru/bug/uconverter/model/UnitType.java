/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.model;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public enum UnitType {
    TEMPERATURE("Temperature"),
    LENGTH("Length"),
    WEIGHT("Weight");

    private final String label;

    UnitType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
