package uavforge.uavforge;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
public class MainWindow extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_window);
    }

    //Goes to the MapPlanning activity
    public void missionPlanningClicked(View view) {
        Intent intent = new Intent(this, MapPlanning.class);
        startActivity(intent);
    }

    //Goes to the MapExecution activity
    public void missionExecutionClicked(View view) {
        Intent intent = new Intent(this, MapExecution.class);
        startActivity(intent);
    }

    //Goes to the MissionRecap activity
    public void missionRecapClicked(View view) {
        Intent intent = new Intent(this, MissionRecap.class);
        startActivity(intent);
    }

    //Goes to the MissionTutorial activity
    public void missionTutorialClicked(View view) {
        Intent intent = new Intent(this, MissionTutorial.class);
        startActivity(intent);
    }

    public void dummyClicked(View view) {
        Intent intent = new Intent(this, MPInputForm.class);
        startActivity(intent);
    }

    // This is for ActionBarActivity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_window, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
