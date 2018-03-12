package com.company.demo.web.screens;

import com.company.demo.entity.Client;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.icons.Icons;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import com.vaadin.ui.ComboBox;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    private LookupField demoField;

    @Inject
    private Icons icons;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        demoField.setOptionIconProvider(Client.class,
                item -> icons.get(CubaIcon.ADJUST));

        demoField.unwrap(ComboBox.class)
                .setItemStyleGenerator((source, itemId) -> {
                    if (itemId == null) {
                        return null;
                    }

                    Client client = (Client) itemId;

                    if (client.getColor() != null) {
                        return "client-" + client.getColor();
                    }

                    return null;
                });
    }
}