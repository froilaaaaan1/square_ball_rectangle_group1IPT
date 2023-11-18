package com.example.squareballrectangle_group_1_ipt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton squareRadioButton = (RadioButton) findViewById(R.id.squareRadioButton);
        RadioButton pieceOfCakeRadioButton = (RadioButton) findViewById(R.id.pieceOfCakeRadioButton);
        RadioButton triangleRadioButton = (RadioButton) findViewById(R.id.triangleRadioButton);
        RadioButton ballRadioButton = (RadioButton) findViewById(R.id.ballRadioButton);
        RadioGroup radioButtonWrapper = (RadioGroup) findViewById(R.id.radioButtonWrapper);
        ImageView iconToShowImageView = (ImageView) findViewById(R.id.iconToShow);
        Drawable squareDrawable = ResourcesCompat.getDrawable(getResources(), R.drawable.square_svgrepo_com, null);
        Drawable pieceOfCakeDrawable = ResourcesCompat.getDrawable(getResources(), R.drawable.cake_svgrepo_com, null);
        Drawable ballDrawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ball_tennis_svgrepo_com, null);
        Drawable triangleDrawable = ResourcesCompat.getDrawable(getResources(), R.drawable.triangle_svgrepo_com, null);

        radioButtonWrapper.setOnCheckedChangeListener((group, checkedId) -> {
            if (squareRadioButton.isChecked())
                iconToShowImageView.setImageDrawable(squareDrawable);
            else if (pieceOfCakeRadioButton.isChecked())
                iconToShowImageView.setImageDrawable(pieceOfCakeDrawable);
            else if (ballRadioButton.isChecked())
                iconToShowImageView.setImageDrawable(ballDrawable);
            else if (triangleRadioButton.isChecked())
                iconToShowImageView.setImageDrawable(triangleDrawable);
        });

    }
}