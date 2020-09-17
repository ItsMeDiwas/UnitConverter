package sunway.group.project.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Thread th=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(5000);

                }
                catch(Exception e)
                {
                    e.printStackTrace();

                }
                finally {
                    Intent i =new Intent(welcome.this,MainActivity.class);
                    startActivity(i);
                }


            }
        };th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}