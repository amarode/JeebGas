package com.raneem.omer.jeebgas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //  MockData OBJECT
    MockData mockData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mockData = new MockData(getApplicationContext());
        mockData.populateMockData();

    }

    public void ClickJeebGas(View v){
        // do somthing when the "jeebgas" button is clicked go to pressjeebgas activity
        Intent jeebgasclicked = new Intent(this,PressJeebGasButton.class);
        startActivity(jeebgasclicked);
    }

    public void ClickOrderStatus(View v){
        Intent orderstatusclicked = new Intent(this,PressOrderStatus.class);
        startActivity(orderstatusclicked);
    }

    public void ClickUpdateAccount(View v){
        Intent updateaccountclicked = new Intent(this,PressUpdateAccount.class);
        startActivity(updateaccountclicked);
    }

   /* public void gotoMaps(View v) {

        Log.e("gotoMaps: ", "Clicked");
        // Navigate directly to maps activity
        Intent mapIntent = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(mapIntent);
    }*/
}
