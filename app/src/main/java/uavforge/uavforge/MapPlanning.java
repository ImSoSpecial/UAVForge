package uavforge.uavforge;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MapPlanning extends Activity {

    public WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_planning);

        myWebView = (WebView) findViewById(R.id.GoogleMapView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        String filepath = "file:///android_asset/maps.html";
        myWebView.loadUrl(filepath);

    }

  }
