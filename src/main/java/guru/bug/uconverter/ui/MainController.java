/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.ui;

import guru.bug.uconverter.model.UnitType;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class MainController {
    public TabPane unitTypeTabs;

    public void initialize() throws IOException {
        for (UnitType t : UnitType.values()) {
            Tab tab = new Tab(t.toString());
            tab.setClosable(false);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/converter-panel.fxml"));
            Pane converterRoot = loader.load();
            ConverterController conroller = loader.getController();

            conroller.initUnitType(t);

            tab.setContent(converterRoot);

            unitTypeTabs.getTabs().add(tab);
        }
    }
}
