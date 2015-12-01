import javafx.event.ActionEvent;
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
        getButtonCommand().accept(event);
    }

    /**
     * The command aims to handle the "executeAdd" action
     */
    private Command buttonCommand = new Command();

    public TextUserControlViewImpl() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("ButtonTextUserControl.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);
        fxmlLoader.load();

        new TextUserControlPresenter(this);
    }

    @Override
    public Command getButtonCommand() {
        return buttonCommand;
    }

    @Override
    public String getText() {
        return text.getText();
    }

    @Override
    public void setText(String text) {
        if (this.text.getText().isEmpty())
            this.text.setText(text);
        else
            this.text.appendText(text);
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


}
