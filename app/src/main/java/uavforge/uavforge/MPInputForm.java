package uavforge.uavforge;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;


public class MPInputForm extends Activity {

    Spinner Lat;
    Spinner Long;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpinput_form);

    }
}
