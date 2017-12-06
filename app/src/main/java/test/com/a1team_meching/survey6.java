package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey6);
    }

    public void surveyback(View v) {
        this.finish();
    }
    public void g0g0(View v) {
        Intent intent = new Intent(this, result14.class);
        startActivity(intent);
    }
    public void g1g1(View v) {
        Intent intent = new Intent(this, result15.class);
        startActivity(intent);
    }
}
