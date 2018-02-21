package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey4);
    }

    public void surveyback(View v) {
        this.finish();
    }
    public void e0e0(View v) {
        Intent intent = new Intent(this, result11.class);
        startActivity(intent);
    }
    public void e1e1(View v) {
        Intent intent = new Intent(this, result12.class);
        startActivity(intent);
    }
}
