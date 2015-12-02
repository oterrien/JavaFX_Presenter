/**
 * Created by Olivier on 02/12/2015.
 */
public interface IPresenter<IV extends IView> {

    IV getView();
}
