package com.example.tictactoe;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.id.button1;

public class MainActivity extends Activity {

    private int[][] grid = new int[3][3];
    private boolean isXTurn = true;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    private class ClickListener implements View.OnClickListener {
        public void onClick(View view) {
            ImageButton button = (ImageButton) view;
            int place = (Integer)(button.getTag());

            // Check if this place is hold.
            // if(place)

            if (isXTurn) {
                ((ImageButton) view).setImageResource(R.drawable.x);


            } else {


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
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

}
