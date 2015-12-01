/**
 * Created by Olivier on 01/12/2015.
 */
public abstract class AdtPresenter<IV extends IView> {

    private IV view;

    protected AdtPresenter(IV view) {

        this.view = view;
        init();
    }

    protected abstract void init();

    public IV getView() {

        return this.view;
    }
}
