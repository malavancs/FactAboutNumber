package malavan.factaboutnumbers.factaboutnumber;

import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;
import malavan.factaboutnumbers.api.ApiClient;
import malavan.factaboutnumbers.api.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by malavan on 08/01/18.
 */

public class FactModel implements FactActivityMVP.Model {


    private FactRepository repository;


    public FactModel(FactRepository repository) {
        this.repository = repository;
    }


    @Override
    public FactResult getQueryFactResult(String query, String Number) {
        return null;
    }

    @Override
    public FactResult getRandomFactResult() {
      return null;


    }
}
