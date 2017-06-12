package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.londonappbrewery.destini.R.string.T1_Ans1;
import static com.londonappbrewery.destini.R.string.T2_Ans1;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView mStoryTextView;
    public Button mButtonTop;
    public Button mButtonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonTop.getText() == getResources().getString(R.string.T1_Ans1)){
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                } else if (mButtonTop.getText() == getResources().getString(R.string.T2_Ans1)) {
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                } else if (mButtonTop.getText() == getResources().getString(R.string.T3_Ans1)) {
                    mStoryTextView.setText(getResources().getString(R.string.T6_End));
                    hideButtons();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonBottom.getText() == getResources().getString(R.string.T1_Ans2)){
                    mButtonTop.setText(getResources().getString(R.string.T2_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T2_Ans2));
                    mStoryTextView.setText(getResources().getString(R.string.T2_Story));
                } else if (mButtonBottom.getText() == getResources().getString(R.string.T2_Ans2)) {
                    mStoryTextView.setText(getResources().getString(R.string.T4_End));
                    hideButtons();
                } else if (mButtonBottom.getText() == getResources().getString(R.string.T3_Ans2)) {
                    mStoryTextView.setText(getResources().getString(R.string.T5_End));
                    hideButtons();
                }
            }
        });
    }

    // Method to hide the buttons once you reach an ending to the story.
    public void hideButtons(){
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
}
