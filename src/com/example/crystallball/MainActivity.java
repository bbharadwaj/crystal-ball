package com.example.crystallball;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private CrystalBall mCrystalBall = new CrystalBall();
	private TextView mAnswerLabel;
	private Button mGetAnswerButton;
	private ImageView mCystalBallImage;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //assign view variables from the layout file
        mAnswerLabel = (TextView) findViewById(R.id.textView1);
        mGetAnswerButton = (Button)findViewById(R.id.button1);
        mCystalBallImage = (ImageView) findViewById(R.id.imageView1);
        
        mGetAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				//button was clicked, so give an answer
				
				String answer = mCrystalBall.getAnAnswer();
				mAnswerLabel.setText(answer);
				
				animateCrystalBall();
				animateAnswer();
				playSound();
				
			}
		});
        
        
    }
    
    private void animateCrystalBall(){
    	
    	mCystalBallImage.setImageResource(R.drawable.ball_animation);
    	AnimationDrawable ballAnimation = (AnimationDrawable) mCystalBallImage.getDrawable();
    	if (ballAnimation.isRunning()){
    		ballAnimation.stop();
    	}
    		ballAnimation.start();
    	
    }
    
    private void animateAnswer(){
    	AlphaAnimation fadeInAnimation = new AlphaAnimation (0,1);
    	fadeInAnimation.setDuration(1500);
    	fadeInAnimation.setFillAfter(true);
    	mAnswerLabel.setAnimation(fadeInAnimation);
    	
    	
    }
    
    private void playSound(){
    	MediaPlayer player = MediaPlayer.create(this, R.raw.crystal_ball);
    	player.start();
    	player.setOnCompletionListener(new OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				mp.release();
				
			}
		
    });
    		
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
