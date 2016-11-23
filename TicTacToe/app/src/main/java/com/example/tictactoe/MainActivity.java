package com.example.tictactoe;

import android.app.Activity;
import android.graphics.Point;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
public class MainActivity extends Activity {

    private int[][] grid = new int[3][3];
    private boolean isXTurn = true;
    private TicTacToeGrid _game;


    private class ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            ImageButton button = (ImageButton) view;
            int place = (Integer)(button.getTag());
            Point currPoint = new Point(place % 3, place / 3 );
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

                switch (Win)
                {
                    case 1:
                    {
                        ((ImageView)findViewById (R.id.image_label)).setImageResource(R.drawable.xwin);
                        break;
                    }
                    case 2:
                    {
                        ((ImageView)findViewById (R.id.image_label)).setImageResource(R.drawable.owin);
                        break;
                    }
                    case 0:
                    {
                        ((ImageView)findViewById (R.id.image_label)).setImageResource(R.drawable.nowin);
                        break;
                    }

                }



                // Pass to opponent
                isXTurn = !isXTurn;
            }
        }
    }

    final ClickListener singleListener = new ClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create board game
        this._game = new TicTacToeGrid();

        // Init the buttons with places
        ImageButton button1 = (ImageButton) findViewById(R.id.square1);
        button1.setOnClickListener(singleListener);
        button1.setTag(1);
        ImageButton button2 = (ImageButton) findViewById(R.id.square2);
        button2.setOnClickListener(singleListener);
        button2.setTag(2);
        ImageButton button3 = (ImageButton) findViewById(R.id.square3);
        button3.setOnClickListener(singleListener);
        button3.setTag(3);
        ImageButton button4 = (ImageButton) findViewById(R.id.square4);
        button4.setOnClickListener(singleListener);
        button4.setTag(4);
        ImageButton button5 = (ImageButton) findViewById(R.id.square5);
        button5.setOnClickListener(singleListener);
        button5.setTag(5);
        ImageButton button6 = (ImageButton) findViewById(R.id.square6);
        button6.setOnClickListener(singleListener);
        button6.setTag(6);
        ImageButton button7 = (ImageButton) findViewById(R.id.square7);
        button7.setOnClickListener(singleListener);
        button7.setTag(7);
        ImageButton button8 = (ImageButton) findViewById(R.id.square8);
        button8.setOnClickListener(singleListener);
        button8.setTag(8);
        ImageButton button9 = (ImageButton) findViewById(R.id.square9);
        button9.setOnClickListener(singleListener);
        button9.setTag(9);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }

}
