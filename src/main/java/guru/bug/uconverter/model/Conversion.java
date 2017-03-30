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
public class Conversion {
    private Converter source;
    private Converter target;
    private double sourceValue;

    public Conversion(Converter source, Converter target) throws IncompatibleConvertersException {
        if (source.getUnitType() != target.getUnitType()) {
            throw new IncompatibleConvertersException(source, target);
        }
        this.source = source;
        this.target = target;
    }

    double convert(double sourceValue) {
        double std = source.toStandard(sourceValue);
        return target.fromStandard(std);
    }

    public double getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(double sourceValue) {
        this.sourceValue = sourceValue;
    }

    public double getTargetValue() {
        return convert(sourceValue);
    }

    public String getFormattedSourceValue() {
        Formatter fmt = source.getFormatter();
        return fmt.format(sourceValue, source);
    }

    public String getFormattedTargetValue() {
        double trgValue = convert(sourceValue);
        Formatter fmt = target.getFormatter();
        return fmt.format(trgValue, target);
    }
}
