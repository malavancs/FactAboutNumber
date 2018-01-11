package malavan.factaboutnumbers.factaboutnumber;

/**
 * Created by malavan on 08/01/18.
 */

public interface FactActivityMVP {

    interface View
    {


        String getQuery();
        String getNumber();
        void ShowResult(String result);

        void showNumberMissingError();


    }
    interface Presenter
    {

        void setView(FactActivityMVP.View view);

        void randombuttonClicked();
        void searchButtonClicked();



    }
    interface Model
    {
        FactResult getQueryFactResult(String query,String Number);
        FactResult getRandomFactResult();

    }
}
