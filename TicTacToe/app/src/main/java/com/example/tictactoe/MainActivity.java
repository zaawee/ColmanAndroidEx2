package com.example.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.R.id.button1;

public class MainActivity extends Activity {

    private int[][] grid = new int[3][3];
    private boolean isXTurn = true;

    private class ClickListener implements View.OnClickListener{
        public void onClick(View view){
            ImageButton button = (ImageButton)view;
            int place = button.getId();

            // Check if this place is hold.
            // if(place)

            if(isXTurn){
                ((ImageButton) view).setImageResource(R.drawable.x);



            }
            else
            {


            }

            // Check if game is done

            // Pass to opponent
            isXTurn = !isXTurn;
        }
    }

    final ClickListener singleListener = new ClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init the buttons
        ImageButton button1 = (ImageButton)findViewById(R.id.square1);
        button1.setOnClickListener(singleListener);
        // button1.setTag(1,1);
        ImageButton button2 = (ImageButton)findViewById(R.id.square2);
        button2.setOnClickListener(singleListener);
        ImageButton button3 = (ImageButton)findViewById(R.id.square3);
        button3.setOnClickListener(singleListener);
        ImageButton button4 = (ImageButton)findViewById(R.id.square4);
        button4.setOnClickListener(singleListener);
        ImageButton button5 = (ImageButton)findViewById(R.id.square5);
        button5.setOnClickListener(singleListener);
        ImageButton button6 = (ImageButton)findViewById(R.id.square6);
        button6.setOnClickListener(singleListener);
        ImageButton button7 = (ImageButton)findViewById(R.id.square7);
        button7.setOnClickListener(singleListener);
        ImageButton button8 = (ImageButton)findViewById(R.id.square8);
        button8.setOnClickListener(singleListener);
        ImageButton button9 = (ImageButton)findViewById(R.id.square9);
        button9.setOnClickListener(singleListener);
    }

}
