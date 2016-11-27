package com.example.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import android.graphics.Point;

public class MainActivity extends Activity {

    private boolean isXTurn = true;

    private TicTacToeGrid _game;

    private class ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            ImageButton button = (ImageButton) view;
            int place = (Integer)(button.getTag());
            Point currPoint = new Point((place % 3), (place / 3) );
            // Check if this place is hold.
            if((_game.isEmpty(currPoint.x,currPoint.y))) {

                // Draw
                if (isXTurn)
                {
                    ((ImageButton) view).setImageResource(R.drawable.x);
                    _game.setX(currPoint.x,currPoint.y);
                }
                else
                {
                    ((ImageButton) view).setImageResource(R.drawable.o);
                    _game.setO(currPoint.x,currPoint.y);
                }

                // Check if game is done
                int Win = _game.checkWin();
                isXTurn = !isXTurn;
                ImageView downLabel =((ImageView)findViewById (R.id.image_label));
                switch (Win)
                {
                    case 1:
                    {
                        downLabel.setImageResource(R.drawable.xwin);
                        break;
                    }
                    case 2:
                    {
                        downLabel.setImageResource(R.drawable.owin);
                        break;
                    }
                    case 0:
                    {
                        downLabel.setImageResource(R.drawable.nowin);
                        break;
                    }
                    default:{
                        if (isXTurn){
                            downLabel.setImageResource(R.drawable.xplay);
                        }else {
                            downLabel.setImageResource(R.drawable.oplay);
                        }
                    }

                }
            }
        }
    }

    final ClickListener singleListener = new ClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button1 = (ImageButton)findViewById(R.id.square1);
        button1.setOnClickListener(singleListener);
        button1.setTag(0);
        ImageButton button2 = (ImageButton) findViewById(R.id.square2);
        button2.setOnClickListener(singleListener);
        button2.setTag(1);
        ImageButton button3 = (ImageButton) findViewById(R.id.square3);
        button3.setOnClickListener(singleListener);
        button3.setTag(2);
        ImageButton button4 = (ImageButton) findViewById(R.id.square4);
        button4.setOnClickListener(singleListener);
        button4.setTag(3);
        ImageButton button5 = (ImageButton) findViewById(R.id.square5);
        button5.setOnClickListener(singleListener);
        button5.setTag(4);
        ImageButton button6 = (ImageButton) findViewById(R.id.square6);
        button6.setOnClickListener(singleListener);
        button6.setTag(5);
        ImageButton button7 = (ImageButton) findViewById(R.id.square7);
        button7.setOnClickListener(singleListener);
        button7.setTag(6);
        ImageButton button8 = (ImageButton) findViewById(R.id.square8);
        button8.setOnClickListener(singleListener);
        button8.setTag(7);
        ImageButton button9 = (ImageButton) findViewById(R.id.square9);
        button9.setOnClickListener(singleListener);
        button9.setTag(8);
    }

}
