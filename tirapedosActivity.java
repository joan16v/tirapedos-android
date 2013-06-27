package com.tirapedos;

//import java.io.IOException;
import java.util.Random;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class TirapedosActivity extends Activity {
    /** Called when the activity is first created. */
    
    private ImageView culo;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        
        //setRequestedOrientation(TirapedosActivity.SCREEN_ORIENTATION_LANDSCAPE);
        
        culo = (ImageView) findViewById(R.id.imageView1);
        
        culo.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	
            	//this.setSoundEffectsEnabled(false);
            	
            	Random r = new Random();
                int i1=r.nextInt(5-1) + 1;
                
                if(i1==1) {
                	MediaPlayer mp = MediaPlayer.create(TirapedosActivity.this, R.raw.pedin);
                	mp.start();	
                	mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                	//mp.reset();
                }

                if(i1==2) {
                	MediaPlayer mp = MediaPlayer.create(TirapedosActivity.this, R.raw.pedo);
                	mp.start();
                	mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                	//mp.reset();
                }
                
                if(i1==3) {
                	MediaPlayer mp = MediaPlayer.create(TirapedosActivity.this, R.raw.pedon);
                	mp.start();
                	mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                	//mp.reset();
                }
                
                if(i1==4) {
                	MediaPlayer mp = MediaPlayer.create(TirapedosActivity.this, R.raw.torpedo);
                	mp.start();
                	mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                	//mp.reset();
                }
                
            }
        });
        
    }
    
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //here you can handle orientation change
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    
}