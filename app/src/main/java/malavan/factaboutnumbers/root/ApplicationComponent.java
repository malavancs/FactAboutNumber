package malavan.factaboutnumbers.root;

import javax.inject.Singleton;

import dagger.Component;
import malavan.factaboutnumbers.factaboutnumber.FactActivity;
import malavan.factaboutnumbers.factaboutnumber.FactModule;

/**
 * Created by malavan on 07/01/18.
 */

@Singleton
@Component(modules = {ApplicationModule.class, FactModule.class})
public interface ApplicationComponent {

 void inject(FactActivity targer);

}
