package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey7);
    }

    public void surveyback(View v) {
        this.finish();
    }

    public void h0h0(View v) {
        Intent intent = new Intent(this, result16.class);
        startActivity(intent);
    }
    public void h1h1(View v) {
        Intent intent = new Intent(this, result17.class);
        startActivity(intent);
    }
    public void h2h2(View v) {
        Intent intent = new Intent(this, result18.class);
        startActivity(intent);
    }
    public void h3h3(View v) {
        Intent intent = new Intent(this, result13.class);
        startActivity(intent);
    }
}