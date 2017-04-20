package com.example.eunhan.csc201_ch1511_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView iv = (ImageView)findViewById(R.id.imageView1);
        LinearLayout ll = (LinearLayout)findViewById(R.id.linearLayout1);
        ll.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        iv.setX(event.getX());
                        iv.setY(event.getY());
                        break;
                    case MotionEvent.ACTION_MOVE :
                        iv.setX(event.getX());
                        iv.setY(event.getY());
                        break;
                    case MotionEvent.ACTION_UP   :
                        // 이미지 뷰의 위치를 옮기기
                        iv.setX(event.getX());
                        iv.setY(event.getY());
                        break;
                }
                return true;
            }
        });
    } // end of onCreate
} // end of class