package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey1);
    }

    public void surveyback(View v) {
        this.finish();
    }
    public void b0b0(View v) {
        Intent intent = new Intent(this, result4.class);
        startActivity(intent);
    }
    public void b1b1(View v) {
        Intent intent = new Intent(this, result5.class);
        startActivity(intent);
    }
    public void b2b2(View v) {
        Intent intent = new Intent(this, result6.class);
        startActivity(intent);
    }
}
