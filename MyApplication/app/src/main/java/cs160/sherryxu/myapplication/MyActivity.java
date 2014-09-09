
package cs160.sherryxu.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import junit.framework.TestCase;


public class MyActivity extends Activity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    private double MERCURY_TO_EARTH = 0.24;
    private double VENUS_TO_EARTH = 0.6;
    private double EARTH_TO_EARTH = 1;
    private double MARS_TO_EARTH = 1.9;
    private double JUPITER_TO_EARTH = 11.9;
    private double SATURN_TO_EARTH = 29.5;
    private double URANUS_TO_EARTH = 84.1;
    private double NEPTUNE_TO_EARTH = 164.8;
    private int IDChecker = -1;
    private int IDFruit = -1;
    RadioGroup currentplanet;
    RadioGroup newplanet;
    Button calculate;
    EditText currentage;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        currentplanet = (RadioGroup) findViewById(R.id.toggleplanet);
        newplanet = (RadioGroup) findViewById(R.id.resultplanet);
        calculate = (Button) findViewById(R.id.button);
        currentplanet.setOnCheckedChangeListener(this);
        newplanet.setOnCheckedChangeListener(this);
        calculate.setOnClickListener(this);
        currentage= (EditText) findViewById(R.id.editText3);
        result = (TextView) findViewById(R.id.editText);
    }

    public void onCheckedChanged(RadioGroup rg, int checkedId) {
        if (rg == currentplanet) {
            IDChecker = checkedId;
        }
        if (rg == newplanet){
            IDFruit = checkedId;

        }
    }
    public void onClick(View visual){
        if (visual.getId() == R.id.button) {
            String totalYears;
            double EarthTotal = 0;
            double FinalTotal = 0;
            totalYears = currentage.getText().toString();
            int raw = Integer.parseInt(totalYears);



            switch (IDChecker){
                case R.id.radioButton:
                    EarthTotal = raw * MERCURY_TO_EARTH;
                    break;
                case R.id.radioButton2:
                    EarthTotal = raw * VENUS_TO_EARTH;
                    break;
                case R.id.radioButton3:
                    EarthTotal = raw * EARTH_TO_EARTH;
                    break;
                case R.id.radioButton4:
                    EarthTotal = raw * MARS_TO_EARTH;
                    break;
                case R.id.radioButton5:
                    EarthTotal = raw * JUPITER_TO_EARTH;
                    break;
                case R.id.radioButton6:
                    EarthTotal = raw * SATURN_TO_EARTH;
                    break;
                case R.id.radioButton7:
                    EarthTotal = raw * URANUS_TO_EARTH;
                    break;
                case R.id.radioButton8:
                    EarthTotal = raw* NEPTUNE_TO_EARTH;
                    break;

            }

            switch (IDFruit){
                case R.id.radioButton9:
                    FinalTotal = EarthTotal * 1/MERCURY_TO_EARTH;
                    final String s1 = Double.toString(FinalTotal);
                    result.setText(s1);
                    break;
                case R.id.radioButton10:
                    FinalTotal = EarthTotal * 1/VENUS_TO_EARTH;
                    final String s2 = Double.toString(FinalTotal);
                    result.setText(s2);
                    break;
                case R.id.radioButton11:
                    FinalTotal = EarthTotal * 1/EARTH_TO_EARTH;
                    final String s3 = Double.toString(FinalTotal);
                    result.setText(s3);
                    break;
                case R.id.radioButton12:
                    FinalTotal = EarthTotal * 1/MARS_TO_EARTH;
                    final String s4 = Double.toString(FinalTotal);
                    result.setText(s4);
                    break;
                case R.id.radioButton13:
                    FinalTotal = EarthTotal * 1/JUPITER_TO_EARTH;
                    final String s5 = Double.toString(FinalTotal);
                    result.setText(s5);
                    break;
                case R.id.radioButton14:
                    FinalTotal = EarthTotal * 1/SATURN_TO_EARTH;
                    final String s6 = Double.toString(FinalTotal);
                    result.setText(s6);
                    break;
                case R.id.radioButton15:
                    FinalTotal = EarthTotal * 1/URANUS_TO_EARTH;
                    final String s7 = Double.toString(FinalTotal);
                    result.setText(s7);
                    break;
                case R.id.radioButton16:
                    FinalTotal = EarthTotal * 1/NEPTUNE_TO_EARTH;
                    final String s8 = Double.toString(FinalTotal);
                    result.setText(s8);
                    break;
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}








