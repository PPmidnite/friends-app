package com.example.rael.frendsapp;

import android.app.Activity;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//public class MainActivity extends AppCompatActivity {

  /*  final Button b1=new Button("J'adore Mj");

    b1.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent evt)
        {
            b1.setText("j'aime l'opium");
        }
    });
*/

   /* final Button testButton = (Button) findViewById(R.id.button1);
    testButton.setTag(1);
    testButton.setText("Play");
    testButton.setOnClickListener( new View.OnClickListener()

    {

        @Override
        public void onClick (View v)
        {
            final int status = (Integer) v.getTag();
            if (status == 1)
            {
                mPlayer.start();
                testButton.setText("Pause");
                v.setTag(0); //pause
            }
            else
            {
                testButton.setText("Play");
                v.setTag(1); //pause
            }
        }
    }
            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/

   public class MainActivity extends Activity
   {
       //private View view;
       @Override
       protected void onCreate(Bundle saveInstanceState) {
           super.onCreate(saveInstanceState);
           setContentView(R.layout.activity_main);
       }

     /*  @Override
       public boolean onCreateOptionsMenu(Menu menu) {
           getMenuInflater().inflate(R.menu.activity_main, menu);
           return true;
       }*/

       public void OnButtonClickModifierTexte(View view)
       {
          // this.view = view;
           TextView textView = (TextView)findViewById(R.id.textView1);
           textView.setText("Friend's app vous permet transformer vos idées en application Et c'est gratuit");
       }
   }