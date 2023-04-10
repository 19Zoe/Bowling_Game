package cn.edu.jnu.x2020100487;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCalculate=this.findViewById(R.id.button);
        EditText editTextScores=this.findViewById(R.id.editTextTextPersonName);
        TextView textViewScore=this.findViewById(R.id.textView2);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores=editTextScores.getText().toString();
                String []arrayScore=scores.split(",");
                BowlingGame game=new BowlingGame();
                for(int i=0;i< arrayScore.length;i++){
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textViewScore.setText("Total score is:"+game.score());
            }
        });
    }
}