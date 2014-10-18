package com.example.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends FragmentActivity {

	ImageView img0;
	ImageView img1;
	ImageView img2;
	ImageView img3;
	Button[] bid = new Button[4];
	Button frag;
	//int change = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
        findViewById();
        init();
    }

   private void findViewById(){
	   img0 = (ImageView) findViewById(R.id.image1);
	   img1 = (ImageView) findViewById(R.id.image2);
	   img2 = (ImageView) findViewById(R.id.image3);
	   img3 = (ImageView) findViewById(R.id.image4);
	   bid[0] = (Button) findViewById(R.id.button1);
   		bid[1] = (Button) findViewById(R.id.button2);
   		bid[2] = (Button) findViewById(R.id.button3);
   		bid[3] = (Button) findViewById(R.id.button4);
   		frag = (Button)findViewById(R.id.start_frag);
	   
   }
   
   private void init(){

	   bid[0].setOnClickListener(changer1);
	   bid[1].setOnClickListener(changer2);
	   bid[2].setOnClickListener(changer3);
	   bid[3].setOnClickListener(changer4);
	   frag.setOnClickListener(fragment);
		 
		
   }

   
   private OnClickListener changer1 = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			img0.setVisibility(View.VISIBLE);
			img1.setVisibility(View.INVISIBLE);
			img2.setVisibility(View.INVISIBLE);
			img3.setVisibility(View.INVISIBLE);
			
			
		}
   };
    
   private OnClickListener changer2 = new OnClickListener() {
		
 		@Override
 		public void onClick(View v) {
 			img0.setVisibility(View.INVISIBLE);
			img1.setVisibility(View.VISIBLE);
			img2.setVisibility(View.INVISIBLE);
			img3.setVisibility(View.INVISIBLE);
 			
 			
 		}
    };
    
    private OnClickListener changer3 = new OnClickListener() {
		
  		@Override
  		public void onClick(View v) {
  			img0.setVisibility(View.INVISIBLE);
			img1.setVisibility(View.INVISIBLE);
			img2.setVisibility(View.VISIBLE);
			img3.setVisibility(View.INVISIBLE);
  			
  		}
     };
     
     private OnClickListener changer4 = new OnClickListener() {
 		
 		@Override
 		public void onClick(View v) {
 			img0.setVisibility(View.INVISIBLE);
			img1.setVisibility(View.INVISIBLE);
			img2.setVisibility(View.INVISIBLE);
			img3.setVisibility(View.VISIBLE);
 			
 		}
    };
    private OnClickListener fragment = new OnClickListener(){
    	@Override
    	public void onClick(View v){
    
    		 setContentView(R.layout.news_articles);
  
    	}
    };
}
