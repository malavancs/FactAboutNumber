package malavan.factaboutnumbers.factaboutnumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import malavan.factaboutnumbers.R;
import malavan.factaboutnumbers.api.ApiClient;
import malavan.factaboutnumbers.api.ApiInterface;
import malavan.factaboutnumbers.root.App;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FactActivity extends AppCompatActivity implements FactActivityMVP.View{



    @Inject
    FactActivityPresenter presenter;
    @BindView(R.id.button_random)
    Button buttonRandom;
    @BindView(R.id.textview_result)
    TextView textviewResult;
    @BindView(R.id.radioButton_trivial)
    RadioButton radioButtonTrivial;
    @BindView(R.id.radioButton_math)
    RadioButton radioButtonMath;
    @BindView(R.id.radioButton_date)
    RadioButton radioButtonDate;
    @BindView(R.id.radioButton_year)
    RadioButton radioButtonYear;
    @BindView(R.id.radioGroup)
    RadioGroup radioGroupOptions;
    @BindView(R.id.editText_number)
    EditText editTextNumber;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fact);



        ((App)getApplication()).getComponent().inject(this);
        ButterKnife.bind(this);




    }

    @Override
    protected void onStart() {
        super.onStart();



    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    @OnClick({R.id.button_random, R.id.textview_result, R.id.radioButton_trivial, R.id.radioButton_math, R.id.radioButton_date, R.id.radioButton_year, R.id.radioGroup, R.id.editText_number})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.button_random:
                presenter.randombuttonClicked();
                break;
            case R.id.textview_result:
                break;
            case R.id.radioButton_trivial:
                break;
            case R.id.radioButton_math:
                break;
            case R.id.radioButton_date:
                break;
            case R.id.radioButton_year:
                break;
            case R.id.radioGroup:
                break;
            case R.id.editText_number:
                break;
        }
    }


    @Override
    public String getQuery() {
        return ((RadioButton)findViewById(radioGroupOptions.getCheckedRadioButtonId())).getText().toString();
    }

    @Override
    public String getNumber() {
        return editTextNumber.getText().toString();
    }

    @Override
    public void ShowResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showNumberMissingError() {
        Toast.makeText(this, "Number missing !", Toast.LENGTH_SHORT).show();
    }
}
