package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey2);
    }

    public void surveyback(View v) {
        this.finish();
    }
    public void c0c0(View v) {
        Intent intent = new Intent(this, result7.class);
        startActivity(intent);
    }
    public void c1c1(View v) {
        Intent intent = new Intent(this, result8.class);
        startActivity(intent);
    }
}
