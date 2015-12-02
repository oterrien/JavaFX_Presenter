import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

/**
 * Created by Olivier on 30/11/2015.
 */
@SuppressWarnings("UnusedDeclaration")
public class TextUserControlViewImpl extends VBox implements ITextUserControlView {

    /**
     * <TextField fx:id="text" HBox.hgrow="SOMETIMES">
     */
    @FXML
    private TextField text;

    /**
     * <TextArea fx:id="result1" editable="false" prefHeight="200.0" prefWidth="200.0" VBox.vgrow="ALWAYS" />
     */
    @FXML
    private TextArea result1;

    /**
     * <TextArea fx:id="result2" editable="false" prefHeight="200.0" prefWidth="200.0" VBox.vgrow="ALWAYS" />
     */
    @FXML
    private TextArea result2;

    /**
     * Called when button is clicked --> delegate the handling of action to Command
     * <Button onAction="#executeAdd" mnemonicParsing="false" text="Add" />
     *
     * @param event
     */
    @FXML
    public void executeAdd(ActionEvent event) {
        if (buttonAction != null)
            buttonAction.handle(event);
    }

    /**
     * The command aims to handle the "executeAdd" action
     */
    private EventHandler<ActionEvent> buttonAction;

    /**
     * The presenter
     */
    private IPresenter<ITextUserControlView> presenter;

    public TextUserControlViewImpl() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("ButtonTextUserControl.fxml"));
            fxmlLoader.setController(this);
            fxmlLoader.setRoot(this);
            fxmlLoader.load();
            presenter = new TextUserControlPresenter(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getText() {
        return text.getText();
    }

    @Override
    public void setText(String text) {
        this.text.setText(text);
    }

    @Override
    public String getResult1() {
        return result1.getText();
    }

    @Override
    public void setResult1(String text) {
        this.result1.setText(text);
    }

    @Override
    public String getResult2() {
        return result2.getText();
    }

    @Override
    public void setResult2(String text) {
        this.result2.setText(text);
    }

    @Override
    public EventHandler<ActionEvent> getButtonAction() {
        return buttonAction;
    }

    @Override
    public void setButtonAction(EventHandler<ActionEvent> eventHandler) {
        this.buttonAction = eventHandler;
    }
}
