package com.example.myapplication87;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList choose = new ArrayList();
    int random;
    int i =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn_start = (Button) findViewById(R.id.btn_start);
        final TextView tv_re = (TextView) findViewById(R.id.tv_re);

        btn_start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){


                for(int i = 0; i < 6 ; i++) {

                    random =  (int)(Math.random()* 49+1);
                    while (choose .contains(random) == true)
                        random =  (int)(Math.random()* 49+1);
                    choose.add(random);
                }
                tv_re.setText(choose.get(0)+"/"+choose.get(1)+"/"+choose.get(2)+"/"+choose.get(3)+"/"+choose.get(4)+"/"+choose.get(5));
                choose.clear();
                i=0; }
        });
    }
}
