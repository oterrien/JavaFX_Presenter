import javafx.event.ActionEvent;

/**
 * Created by Olivier on 30/11/2015.
 */
public class TextUserControlPresenter extends AdtPresenter<ITextUserControlView> {

    public TextUserControlPresenter(ITextUserControlView view) {
        super(view);
    }

    @Override
    protected void init() {

        this.getView().setResult1("result1");
        this.getView().setResult2("result2");

        this.getView().getButtonCommand().
                addDelegate(this::appendTextInRes1).
                addDelegate(this::appendTextInRes2);
    }

    public void appendTextInRes1(ActionEvent e) {

        StringBuilder sb = new StringBuilder(getView().getResult1()).
                append("\r\n").
                append(getView().getText());
        getView().setResult1(sb.toString());
    }

    public void appendTextInRes2(ActionEvent e) {

        StringBuilder sb = new StringBuilder(getView().getResult2()).
                append(";").
                append(getView().getText());
        getView().setResult2(sb.toString());
    }

}
