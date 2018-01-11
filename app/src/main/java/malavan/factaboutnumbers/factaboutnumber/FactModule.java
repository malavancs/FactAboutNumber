package malavan.factaboutnumbers.factaboutnumber;

import dagger.Module;
import dagger.Provides;

/**
 * Created by malavan on 08/01/18.
 */
@Module
public class FactModule {


    @Provides
    public FactActivityMVP.Presenter provideFactActivityPresenter(FactActivityMVP.Model model)
    {
        return new FactActivityPresenter(model);
    }
    @Provides
    public FactActivityMVP.Model provideFactModel(FactRepository repository)
    {
        return new FactModel(repository);
    }


    @Provides
    public  FactRepository provideFactRepository()
    {
        return new MemoryRepository();
    }
}
