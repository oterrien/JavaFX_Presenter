
public interface ITextUserControlView extends IView{

    String getText();

    void setText(String text);

    String getResult1();

    void setResult1(String text);

    String getResult2();

    void setResult2(String text);

    Command getButtonCommand();
}
