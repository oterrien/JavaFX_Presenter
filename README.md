# JavaFX_Presenter

Show how implements MVP pattern with JavaFX and how testing it

The class diagram is

![Class diagram](https://github.com/oterrien/JavaFX_Presenter/blob/master/class.diag.png)

The view interface provides the intention of the view.

For example:
- getting and setting text
- getting and setting result1
- getting and setting result2
- getting command for the Add button

The concret view is created from FXML file.
Each field of the control is defined with @FXML.
The action to be triggered when clicking on the button is also a method and is prefixed by @FXML.

The concret view implements the interface by providing a mapping between @FXML fields and getting/setting methods. 

The concret view is also responsible of creating the presenter (which refers itself as view).

The button's action is delegated to a Command instance. 
The Command is a decorator of Consumer<ActionEvent> which delegates the execution to a list of other Consumer<ActionEvent>. 

The presenter is responsible to register its own method to the command. 

Thus, presenter's methods will be called when the view button will be clicked.

Testing the presenter consists in created a mock of the view.
