package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class result16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result16);
    }
    public void rr8(View v) {
        Intent intent = new Intent(this, drug8.class);
        startActivity(intent);
    }
    public void rr9(View v) {
        Intent intent = new Intent(this, drug9.class);
        startActivity(intent);
    }
    public void resultback(View v) {
        this.finish();
    }
    public void resultbutton(View v) {
        Intent intent = new Intent(this, h_popup.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

}
