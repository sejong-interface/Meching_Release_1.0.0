package test.com.a1team_meching;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.diagbutton).setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                LayoutInflater inflater=getLayoutInflater();
                final View dialogView= inflater.inflate(R.layout.activity_startsurvey_popup, null);



                new AlertDialog.Builder(MainActivity.this)


                        .setView(dialogView)

                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MainActivity.this, "진단을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity.this, firstsurvey.class);
                                startActivity(intent);
                            }

                        })

                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {



                            @Override

                            public void onClick(DialogInterface dialog, int which) {

                                // TODO Auto-generated method stub

                            }

                        })

                        // 뒤로가기 버튼이 작동하지 못하게 함

                        .setCancelable(false)

                        .show();
            }

        });


    }


    public void topic1B(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://post.naver.com/viewer/postView.nhn?volumeNo=10937133&memberNo=29931747&mainMenu=HEALTH"));
        startActivity(intent);
    }
    public void topic2B(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://post.naver.com/viewer/postView.nhn?volumeNo=10952061&memberNo=6289885&mainMenu=HEALTH"));
        startActivity(intent);
    }
    public void topic3B(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://post.naver.com/viewer/postView.nhn?volumeNo=10798190&memberNo=29949587&mainMenu=HEALTH"));
        startActivity(intent);
    }
    /*
    public void startsurvay(View v) {
        Intent intent = new Intent(this, startsurveyPopup.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
    */
    public void medicinemap(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/search/%EC%95%BD%EA%B5%AD"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void cstoremap(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/search/%ED%8E%B8%EC%9D%98%EC%A0%90"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
