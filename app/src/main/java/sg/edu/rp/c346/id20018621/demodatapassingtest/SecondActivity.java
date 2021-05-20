package sg.edu.rp.c346.id20018621.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2
        tvAnswer1 = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        int value1 = intentReceived.getIntExtra("value", 1);
        tvAnswer1.setText("Integer value received is: " + value1);
    }
}