package malavan.factaboutnumbers.root;

import android.app.Application;

import malavan.factaboutnumbers.factaboutnumber.FactModule;

/**
 * Created by malavan on 08/01/18.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .factModule(new FactModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
