import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public interface ITextUserControlView extends IView{

    String getText();

    void setText(String text);

    String getResult1();

    void setResult1(String text);

    String getResult2();

    void setResult2(String text);

    EventHandler<ActionEvent> getButtonAction();

    void setButtonAction(EventHandler<ActionEvent> eventHandler);
}
