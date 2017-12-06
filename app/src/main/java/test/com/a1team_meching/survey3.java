package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey3);
    }

    public void surveyback(View v) {
        this.finish();
    }
    public void d0d0(View v) {
        Intent intent = new Intent(this, result9.class);
        startActivity(intent);
    }
    public void d1d1(View v) {
        Intent intent = new Intent(this, result10.class);
        startActivity(intent);
    }
}
