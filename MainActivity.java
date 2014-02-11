package com.tirapedos2;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.webkit.WebView;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import java.util.Random;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        WebView adsDisplay = (WebView) findViewById(R.id.webView);
        adsDisplay.getSettings().setJavaScriptEnabled(true);
        adsDisplay.loadUrl("http://url.com/adsense");
        adsDisplay.setScrollbarFadingEnabled(true);

        ImageView culo = (ImageView) findViewById(R.id.imageView);

        culo.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Random r = new Random();
                int i1=r.nextInt(11-1) + 1;

                if(i1==1) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart1);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==2) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart2);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==3) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart3);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==4) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart4);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==5) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart5);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==6) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart6);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==7) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart7);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==8) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart8);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==9) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart9);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==10) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart10);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

                if(i1==11) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fart11);
                    mp.start();
                    mp.setOnCompletionListener(new OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
