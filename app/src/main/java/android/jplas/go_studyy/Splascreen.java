package android.jplas.go_studyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splascreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splascreen);

        Thread loading = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(Splascreen.this, MainActivity.class));
                }
            }
        };
        loading.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
