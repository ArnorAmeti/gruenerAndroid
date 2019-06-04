package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int PointsTeamA = 0;
    int PointsTeamB = 0;
    int VarFor0 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ThreePointsTeamA(View view) {

        PointsTeamA = PointsTeamA + 3;
        showTeamA(PointsTeamA);
    }
    public void ThreePointsTeamB(View view) {

        PointsTeamB = PointsTeamB + 3;
        showTeamB(PointsTeamB);
    }

    public void TwoPointsTeamA(View view)
    {
        PointsTeamA = PointsTeamA + 2;
        showTeamA(PointsTeamA);
    }
    public void TwoPointsTeamB(View view)
    {
        PointsTeamB = PointsTeamB + 2;
        showTeamB(PointsTeamB);
    }

    public void FreeThrowA(View view)
    {
        PointsTeamA = PointsTeamA + 1;
        showTeamA(PointsTeamA);
    }
    public void FreeThrowB(View view)
    {
        PointsTeamB = PointsTeamB + 1;
        showTeamB(PointsTeamB);
    }

    public void resetButton (View view) {
        showTeamA(VarFor0);
        showTeamB(VarFor0);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void showTeamA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void showTeamB(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.quantity_text_view2);
        priceTextView.setText("" + number);
    }



}