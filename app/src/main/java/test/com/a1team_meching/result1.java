package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class result1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
    }
    public void rr2(View v) {
        Intent intent = new Intent(this, drug2.class);
        startActivity(intent);
    }
    public void rr3(View v) {
        Intent intent = new Intent(this, drug3.class);
        startActivity(intent);
    }
    public void resultback(View v) {
        this.finish();
    }
}
