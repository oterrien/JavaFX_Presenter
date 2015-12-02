import javafx.event.ActionEvent;

/**
 * Created by Olivier on 30/11/2015.
 */
public class TextUserControlPresenter extends AdtPresenter<ITextUserControlView> {

    public TextUserControlPresenter(ITextUserControlView view) {
        super(view);
    }

    protected void init() {

        this.getView().setResult1("result1");
        this.getView().setResult2("result2");
        this.getView().setText("test");

        this.getView().setButtonAction(this::buttonAction);
    }

    private void buttonAction(ActionEvent actionEvent) {
        appendTextInRes1();
        appendTextInRes2();
    }

    private void appendTextInRes1() {

        StringBuilder sb = new StringBuilder(getView().getResult1()).
                append("\r\n").
                append(getView().getText());
        getView().setResult1(sb.toString());
    }

    private void appendTextInRes2() {

        StringBuilder sb = new StringBuilder(getView().getResult2()).
                append(";").
                append(getView().getText());
        getView().setResult2(sb.toString());
    }

}
