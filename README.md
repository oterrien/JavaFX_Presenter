# JavaFX_Presenter

Show how implementing MVP pattern with JavaFX and how testing it

The class diagram is

![Class diagram](https://github.com/oterrien/JavaFX_Presenter/blob/master/class.diag.jpg)

The view interface provides the intention of the view.

For the given examplen that means:
* getting and setting text
* getting and setting result1
* getting and setting result2
* getting and setting event handler for the Add button

The concret view is created from FXML file.
Each field of the control is defined with **@FXML**.
The action to be triggered when the button is clicked is also a method and is prefixed by **@FXML**.

The concret view implements the interface by providing a mapping between **@FXML** fields and getting/setting methods. 
And the triggered method does just call the event handler.

The concret view is also responsible of creating the presenter (which refers itself as view).

That is the important point. The presenter acts upon the model and the view. It retrieves data from repositories (the model), and formats it for display in the view.

For that purpose, the presenter should be able to call the view in order to set data and retrieve data once updated by user. That is why, the presenter contains a reference of the view. 
But it should also provide action to be done when view's event handlers are called. 

When a user clicks on button "Add", the method which is bound with FXML is called. This method call the EventHandler which has been set by the presenter. 
In other words, the presenter is responsible of registering its own method to the view's EventHandler. 

Finally, testing the presenter just consists in creating a mock of the view.
