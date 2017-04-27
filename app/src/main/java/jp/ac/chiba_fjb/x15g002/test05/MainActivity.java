package jp.ac.chiba_fjb.x15g002.test05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //インスタンスの取得
        final TextView text1 = (TextView) findViewById(R.id.textView);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        //テキストの操作
        text1.setText("あいうえお");
        text2.setText("かきくけこ");//インスタンスの取得

//        text1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                text1.setText("タップされました");
//            }
//        });
//        text2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                text1.setText("ふぉふぉふぉ");
//            }
//        });
        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {
            //型の変換
            TextView text = (TextView)v;
            text.setText("タップされました");
        
    }
}

