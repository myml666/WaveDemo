package com.itfitness.wavedemo;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itfitness.wavedemo.widget.WaveView;

public class MainActivity extends AppCompatActivity {
    private WaveView wave;
    private EditText et;
    private Button bt,bt2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wave = (WaveView) findViewById(R.id.wave);
        et = (EditText) findViewById(R.id.et);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wave.setProgressWithAnim(Float.valueOf(et.getText().toString().trim()));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wave.setProgress(Float.valueOf(et.getText().toString().trim()));
            }
        });
    }
}
