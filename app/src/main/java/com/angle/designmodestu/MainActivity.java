package com.angle.designmodestu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.angle.builder.Computer;
import com.angle.designmodestu.utils.LogPrint;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builderTest();
    }

    /**建造者模式*/
    private void builderTest() {
        Computer computer = new Computer.Builder()
                .cpu("inter i9")
                .memory("32G")
                .screen("16寸")
                .mainBoard("华硕")
                .build();
        LogPrint.print(computer.toString());
    }
}
