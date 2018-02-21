package test.com.a1team_meching;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class startsurveyPopup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

        layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;

        layoutParams.dimAmount = 0.7f;

        getWindow().setAttributes(layoutParams);

        setContentView(R.layout.activity_startsurvey_popup);


        // TODO Auto-generated method stub

        //final View dialogView = LayoutInflater.from(this).inflate(R.layout.activity_startsurvey_popup,null,false);

*/



    }
    public void surveycancle(View v){
        Toast.makeText(startsurveyPopup.this, "취소 클릭", Toast.LENGTH_SHORT).show();
        //this.finish();
    }
    public void surveyok(View v) {
        Intent intent = new Intent(this, firstsurvey.class);
        startActivity(intent);
    }

}