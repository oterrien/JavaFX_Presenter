package com.ote.app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by Olivier on 02/12/2015.
 */
public class ComponentFactory {

    private static ComponentFactory Instance = new ComponentFactory();

    public static ComponentFactory getInstance() {
        return Instance;
    }

    private ComponentFactory() {
    }

    public Parent createTextUserComponent() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("ButtonTextUserControl.fxml"));
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
