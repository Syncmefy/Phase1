package com.example.mohdosamah.syncmefy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Server theCreator;
    Channel theConnector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ServerB=(Button)findViewById(R.id.button2);
        Button serverSearch=(Button)findViewById(R.id.button);
        ServerB.setOnClickListener(this);
        serverSearch.setOnClickListener(this);



    }
    @Override
    void onClick(View v)
    {
        if(v.getId()==R.id.button2 ){
            if(theCreator!=NULL)return;
            /*code for pressing server button*/
            //TO-DO 1.set up a network
            
            //2.generate its ID
            long temp_id=(long)(Math.random()*100);
            //3.instantiate server object(theCreator) with that ID
            theCreator=new Server(temp_id);
            //if already istantiated ignore call
        }
        else{
            /*code to search for channels*/
            //make a client
            //call its connect to channel

        }
    }
}
