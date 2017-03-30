/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.ui;

import guru.bug.uconverter.Registry;
import guru.bug.uconverter.model.Conversion;
import guru.bug.uconverter.model.Converter;
import guru.bug.uconverter.model.UnitType;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class ConverterController {
    public ComboBox<Converter> sourceCombo;
    public ComboBox<Converter> targetCombo;
    public TextField sourceValue;
    public TextField targetValue;

    public void initUnitType(UnitType unitType) {
        for (Converter c : Registry.getAllConverters()) {
            if (c.getUnitType() == unitType) {
                sourceCombo.getItems().add(c);
                targetCombo.getItems().add(c);
            }
        }
    }

    public void convert(ActionEvent actionEvent) {
        Converter sourceConverter = sourceCombo.getValue();
        Converter targetConverter = targetCombo.getValue();
        Conversion conversion = new Conversion(sourceConverter, targetConverter);
        double src = Double.parseDouble(sourceValue.getText());
        conversion.setSourceValue(src);
        String ftrg = conversion.getFormattedTargetValue();
        targetValue.setText(ftrg);
    }
}
