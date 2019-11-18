package mohs.httpsgithub.mbaxter31mohs.mohsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button doctor1;
    private Button doctor2;
    private Button doctor3;
    private Button doctor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doctor1 = (Button) findViewById(R.id.btnBret);
        doctor2 = (Button) findViewById(R.id.btnMaggie);
        doctor3 = (Button) findViewById(R.id.btnMason);
        doctor4 = (Button) findViewById(R.id.btnNick);

        doctor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrayScreen.class));
            }
        });

        doctor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrayScreen.class));
            }
        });

        doctor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrayScreen.class));
            }
        });

        doctor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrayScreen.class));
            }
        });
    }
}
