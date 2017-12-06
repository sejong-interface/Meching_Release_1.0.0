package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
    }

    public void surveyback(View v) {
        this.finish();
    }
    public void a0a0(View v) {
        Intent intent = new Intent(this, result1.class);
        startActivity(intent);
    }
    public void a1a1(View v) {
        Intent intent = new Intent(this, result2.class);
        startActivity(intent);
    }
    public void a2a2(View v) {
        Intent intent = new Intent(this, result3.class);
        startActivity(intent);
    }
}
