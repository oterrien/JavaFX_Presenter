package com.ote.app.impl;

import com.ote.app.ITextUserControlView;
import javafx.event.ActionEvent;

/**
 * Created by Olivier on 30/11/2015.
 */
public class TextUserControlPresenter {

    private ITextUserControlView view;

    public TextUserControlPresenter(ITextUserControlView view) {

        this.view = view;
        init();
    }

    private void init() {

        this.view.setResult1("result1");
        this.view.setResult2("result2");
        this.view.setText("test");

        this.view.setButtonAction(this::buttonAction);
    }

    private void buttonAction(ActionEvent actionEvent) {
        appendTextInRes1();
        appendTextInRes2();
    }

    private void appendTextInRes1() {

        StringBuilder sb = new StringBuilder(view.getResult1()).
                append("\r\n").
                append(view.getText());
        view.setResult1(sb.toString());
    }

    private void appendTextInRes2() {

        StringBuilder sb = new StringBuilder(view.getResult2()).
                append(";").
                append(view.getText());
        view.setResult2(sb.toString());
    }

}
