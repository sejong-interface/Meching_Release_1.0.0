package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static test.com.a1team_meching.R.layout.activity_firstsurvey;

public class firstsurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_firstsurvey);
    }

    public void backbuttonS(View v) {
        this.finish();
    }

    public void survey0(View v) {
        Intent intent = new Intent(this, survey.class);
        startActivity(intent);
    }
    public void survey1(View v) {
        Intent intent = new Intent(this, survey1.class);
        startActivity(intent);
    }
    public void survey2(View v) {
        Intent intent = new Intent(this, survey2.class);
        startActivity(intent);
    }
    public void survey3(View v) {
        Intent intent = new Intent(this, survey3.class);
        startActivity(intent);
    }
    public void survey4(View v) {
        Intent intent = new Intent(this, survey4.class);
        startActivity(intent);
    }
    public void survey6(View v) {
        Intent intent = new Intent(this, survey6.class);
        startActivity(intent);
    }
    public void survey7(View v) {
        Intent intent = new Intent(this, survey7.class);
        startActivity(intent);
    }
    public void survey8(View v) {
        Intent intent = new Intent(this, survey8.class);
        startActivity(intent);
    }
}
