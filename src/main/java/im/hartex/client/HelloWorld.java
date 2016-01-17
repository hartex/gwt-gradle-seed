package im.hartex.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * Created on 17.01.16, by hartex.
 * Project: gwt-gradle-seed.
 */
public class HelloWorld implements EntryPoint {
    public void onModuleLoad() {
        RootLayoutPanel.get().add(new Label("Hello World"));
    }
}
