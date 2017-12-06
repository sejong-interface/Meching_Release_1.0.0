package test.com.a1team_meching;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class drug1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug1);
    }
    public void drugback(View v) {
        this.finish();
    }
}

