package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey8);
    }

    public void surveyback(View v) {
        this.finish();
    }

    public void i0i0(View v) {
        Intent intent = new Intent(this, result19.class);
        startActivity(intent);
    }
    public void i1i1(View v) {
        Intent intent = new Intent(this, result20.class);
        startActivity(intent);
    }
    public void i2i2(View v) {
        Intent intent = new Intent(this, result21.class);
        startActivity(intent);
    }
}
