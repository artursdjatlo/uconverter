/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.length;

import guru.bug.uconverter.convert.AbstractConverter;
import guru.bug.uconverter.model.UnitType;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public abstract class AbstractLengthConverter extends AbstractConverter {
    @Override
    public UnitType getUnitType() {
        return UnitType.LENGTH;
    }
}
