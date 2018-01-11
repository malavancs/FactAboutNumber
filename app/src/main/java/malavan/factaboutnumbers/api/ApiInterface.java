package malavan.factaboutnumbers.api;



import java.util.Map;

import malavan.factaboutnumbers.factaboutnumber.FactResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;


/**
 * Created by malavan on 14/12/17.
 */

public interface ApiInterface {



//   @GET("/{number}/{option}")
//    Call<FactResult> getQueriedResult(@Path("num") String number);

   @Headers("Content-Type: application/json")
   @GET("/Random")
    Call<FactResult> getRandomResult();

}
