import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by Olivier on 01/12/2015.
 */
public class TextUserControlViewMock implements ITextUserControlView {

    private String text;
    private String result1;
    private String result2;
    private EventHandler<ActionEvent> buttonCommand;
    private IPresenter<ITextUserControlView> presenter;

    public TextUserControlViewMock() {
        presenter = new TextUserControlPresenter(this);
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getResult1() {
        return result1;
    }

    @Override
    public void setResult1(String result1) {
        this.result1 = result1;
    }

    @Override
    public String getResult2() {
        return result2;
    }

    @Override
    public void setResult2(String result2) {
        this.result2 = result2;
    }

    @Override
    public EventHandler<ActionEvent> getButtonAction() {
        return buttonCommand;
    }

    @Override
    public void setButtonAction(EventHandler<ActionEvent> eventHandler) {
        this.buttonCommand = eventHandler;
    }
}
