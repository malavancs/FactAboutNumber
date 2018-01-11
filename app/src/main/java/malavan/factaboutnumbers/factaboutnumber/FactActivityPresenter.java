package malavan.factaboutnumbers.factaboutnumber;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

public class FactActivityPresenter implements FactActivityMVP.Presenter {

    @Nullable
    FactActivityMVP.View view;
    FactActivityMVP.Model model;

    @Override
    public void setView(FactActivityMVP.View view) {
        this.view = view;
    }

    @Inject
    public FactActivityPresenter(FactActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void randombuttonClicked() {

        if (view!=null)
        {

                ApiInterface apiService =
                        ApiClient.getRetrofit().create(ApiInterface.class);


                Call<FactResult> factResultCall = apiService.getRandomResult();
                factResultCall.enqueue(new Callback<FactResult>() {
                    @Override
                    public void onResponse(@NonNull Call<FactResult> call, @NonNull Response<FactResult> response) {
//                        Log.d("succees",response.body().getText());
                        try {
                            String result = response.body().getText();


                            view.ShowResult(result);
                        }catch (NullPointerException e)
                        {
                            view.ShowResult("Boring day");
                        }
                    }

                    @Override
                    public void onFailure(Call<FactResult> call, Throwable t) {
                        Log.e("failed", "onFailure: ", t.getCause());
                    }
                });
            }
            else
            {
                view.showNumberMissingError();
            }


    }

    @Override
    public void searchButtonClicked() {

        if (view!= null)
        {
            if (!view.getNumber().equals(""))
            {
                ApiInterface apiService =
                        ApiClient.getRetrofit().create(ApiInterface.class);


                Call<FactResult> factResultCall = apiService.getRandomResult();
                factResultCall.enqueue(new Callback<FactResult>() {
                    @Override
                    public void onResponse(@NonNull Call<FactResult> call, @NonNull Response<FactResult> response) {
//                        Log.d("succees",response.body().getText());
                        try {
                            String result = response.body().getText();


                            view.ShowResult(result);
                        }catch (NullPointerException e)
                        {
                            view.ShowResult("Boring day");
                        }
                    }

                    @Override
                    public void onFailure(Call<FactResult> call, Throwable t) {
                        Log.e("failed", "onFailure: ", t.getCause());
                    }
                });
            }
        }

    }


}
