package jp.kirin3.newtogglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // トグルボタンを生成
        ToggleButton toggle = new ToggleButton(this);
        toggle.setTextOff("OFF");
        toggle.setTextOn("ON");

        // レイアウトのトグルボタンを追加
        LinearLayout layout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        // どうやら動的なレイアウトでないと右に寄らない
        params.gravity = Gravity.RIGHT;

        layout.addView(toggle,params);

        setContentView(layout);

        /*
        ViewGroup.MarginLayoutParams mparams = (ViewGroup.MarginLayoutParams)params;
        mparams.setMargins(0, 0, 100, 0);
        layout.addView(toggle,mparams);
        */
    }
}
