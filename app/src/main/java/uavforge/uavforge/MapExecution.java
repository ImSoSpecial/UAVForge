package uavforge.uavforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;


public class MapExecution extends Activity {

    public WebView MEWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_execution);

        MEWebView = (WebView) findViewById(R.id.MEGoogleMapView);
        MEWebView.getSettings().setJavaScriptEnabled(true);
        String filepath = "file:///android_asset/maps.html";
        MEWebView.loadUrl(filepath);

    }

    //Goes back to main window
    public void onReturnHomeClicked(View view) {
        Intent intent = new Intent(this, MainWindow.class);
        startActivity(intent);
    }

    //Goes to mission recap
    public void onFinishClicked(View view) {
        Intent intent = new Intent(this, MissionRecap.class);
        startActivity(intent);
    }

    //Goes back to mission planning
    public void onBackClicked(View view) {
        Intent intent = new Intent(this, MapPlanning.class);
        startActivity(intent);
    }
}
