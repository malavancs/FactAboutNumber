package malavan.factaboutnumbers.root;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by malavan on 07/01/18.
 */
@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    public Application getApplication() {
        return application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }


}
