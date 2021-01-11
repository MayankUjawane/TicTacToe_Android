package com.example.tictactoe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int count = 0;
    private TextView tv_winner;
    private ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9;
    private Button start;
    public int[] arr = {0,0,0,0,0,0,0,0,0};
    public int[][] winingPositions = {{0,3,6},{1,4,7},{2,5,8},
                      {0,1,2},{3,4,5},{6,7,8},
                      {0,4,8},{0,4,8}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib1 = findViewById(R.id.imageButton1);
        ib2 = findViewById(R.id.imageButton2);
        ib3 = findViewById(R.id.imageButton3);
        ib4 = findViewById(R.id.imageButton4);
        ib5 = findViewById(R.id.imageButton5);
        ib6 = findViewById(R.id.imageButton6);
        ib7 = findViewById(R.id.imageButton7);
        ib8 = findViewById(R.id.imageButton8);
        ib9 = findViewById(R.id.imageButton9);
        start = findViewById(R.id.bt_start);
        tv_winner = findViewById(R.id.tv_winner);

        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);
        ib4.setOnClickListener(this);
        ib5.setOnClickListener(this);
        ib6.setOnClickListener(this);
        ib7.setOnClickListener(this);
        ib8.setOnClickListener(this);
        ib9.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imageButton1:

                    count++;
                    if (count % 2 == 0) {
                        ib1.setImageResource(R.drawable.zero);
                        arr[0] = 1;
                    } else {
                        ib1.setImageResource(R.drawable.cross);
                        arr[0] = 2;
                    }
                    ib1.setEnabled(false);
                checkWinner();
                break;
            case R.id.imageButton2:

                    count++;
                    if (count % 2 == 0) {
                        ib2.setImageResource(R.drawable.zero);
                        arr[1] = 1;
                    } else {
                        ib2.setImageResource(R.drawable.cross);
                        arr[1] = 2;
                    }
                    ib2.setEnabled(false);
                checkWinner();
                break;
            case R.id.imageButton3:
                    count++;
                    if (count % 2 == 0) {
                        ib3.setImageResource(R.drawable.zero);
                        arr[2] = 1;
                    } else {
                        ib3.setImageResource(R.drawable.cross);
                        arr[2] = 2;
                    }
                    ib3.setEnabled(false);
                checkWinner();
                break;
            case R.id.imageButton4:

                    count++;
                    if (count % 2 == 0) {
                        ib4.setImageResource(R.drawable.zero);
                        arr[3] = 1;
                    } else {
                        ib4.setImageResource(R.drawable.cross);
                        arr[3] = 2;
                    }
                    ib4.setEnabled(false);
                checkWinner();
                break;
            case R.id.imageButton5:

                    count++;
                    if (count % 2 == 0) {
                        ib5.setImageResource(R.drawable.zero);
                        arr[4] = 1;
                    } else {
                        ib5.setImageResource(R.drawable.cross);
                        arr[4] = 2;
                    }
                    ib5.setEnabled(false);
                checkWinner();
                break;
            case R.id.imageButton6:

                    count++;
                    if (count % 2 == 0) {
                        ib6.setImageResource(R.drawable.zero);
                        arr[5] = 1;
                    } else {
                        ib6.setImageResource(R.drawable.cross);
                        arr[5] = 2;
                    }
                    ib6.setEnabled(false);
                checkWinner();
                break;
            case R.id.imageButton7:

                    count++;
                    if (count % 2 == 0) {
                        ib7.setImageResource(R.drawable.zero);
                        arr[6] = 1;
                    } else {
                        ib7.setImageResource(R.drawable.cross);
                        arr[6] = 2;
                    }
                    ib7.setEnabled(false);
                checkWinner();
                break;
            case R.id.imageButton8:

                    count++;
                    if (count % 2 == 0) {
                        ib8.setImageResource(R.drawable.zero);
                        arr[7] = 1;
                    } else {
                        ib8.setImageResource(R.drawable.cross);
                        arr[7] = 2;
                    }
                    ib8.setEnabled(false);
                    checkWinner();
                break;
            case R.id.imageButton9:

                    count++;
                    if (count % 2 == 0) {
                        ib9.setImageResource(R.drawable.zero);
                        arr[8] = 1;
                    } else {
                        ib9.setImageResource(R.drawable.cross);
                        arr[8] = 2;
                    }
                    ib9.setEnabled(false);
                    checkWinner();
                break;
        }

    }


    private void checkWinner() {
        if(arr[0] == arr[1] && arr[0] == arr[2] && arr[0] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[0] == arr[1] && arr[0] == arr[2] && arr[0] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
        if(arr[3] == arr[4] && arr[5] == arr[4] && arr[4] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[3] == arr[4] && arr[5] == arr[4] && arr[4] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
        if(arr[6] == arr[7] && arr[7] == arr[8] && arr[8] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[6] == arr[7] && arr[7] == arr[8] && arr[8] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
        if(arr[0] == arr[4] && arr[4] == arr[8] && arr[8] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[0] == arr[4] && arr[4] == arr[8] && arr[8] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
        if(arr[2] == arr[4] && arr[6] == arr[4] && arr[4] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[2] == arr[4] && arr[6] == arr[4] && arr[4] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
        if(arr[0] == arr[3] && arr[3] == arr[6] && arr[6] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[0] == arr[3] && arr[3] == arr[6] && arr[6] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
        if(arr[1] == arr[4] && arr[4] == arr[7] && arr[7] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[1] == arr[4] && arr[4] == arr[7] && arr[7] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
        if(arr[2] == arr[5] && arr[5] == arr[8] && arr[8] == 2){
            tv_winner.setText("First Player Is Winner");
            disableButton();
        }
        if(arr[2] == arr[5] && arr[5] == arr[8] && arr[8] == 1){
            tv_winner.setText("Second Player Is Winner");
            disableButton();
        }
    }
    public void disableButton(){
        ib1.setEnabled(false);
        ib2.setEnabled(false);
        ib3.setEnabled(false);
        ib4.setEnabled(false);
        ib5.setEnabled(false);
        ib6.setEnabled(false);
        ib7.setEnabled(false);
        ib8.setEnabled(false);
        ib9.setEnabled(false);
    }
    public void enableButton(){
        ib1.setEnabled(true);
        ib2.setEnabled(true);
        ib3.setEnabled(true);
        ib4.setEnabled(true);
        ib5.setEnabled(true);
        ib6.setEnabled(true);
        ib7.setEnabled(true);
        ib8.setEnabled(true);
        ib9.setEnabled(true);
    }

    public void startButton(View view){
        tv_winner.setText("");
        ib1.setImageResource(0);
        ib2.setImageResource(0);
        ib3.setImageResource(0);
        ib4.setImageResource(0);
        ib5.setImageResource(0);
        ib6.setImageResource(0);
        ib7.setImageResource(0);
        ib8.setImageResource(0);
        ib9.setImageResource(0);
        enableButton();
        count = 0;
        for(int i=0; i<arr.length; i++ ){
            arr[i]=0;
        }
    }

}