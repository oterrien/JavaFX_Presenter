import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public final class Command implements Consumer<ActionEvent> {

    private final Collection<Consumer<ActionEvent>> delegatedConsumers = new ArrayList<>(10);

    /**
     * This method is called by presenter to register its method(s) to
     *
     * @param consumer
     * @return
     */
    public Command addDelegate(Consumer<ActionEvent> consumer) {

        delegatedConsumers.add(consumer);
        return this;
    }

    @Override
    public void accept(ActionEvent actionEvent) {

        if (delegatedConsumers.isEmpty())
            return;

        delegatedConsumers.stream().
                forEach(delegate -> delegate.accept(actionEvent));
    }
}
