package com.example.android.quizapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity_test extends AppCompatActivity {

    //Answers of Questions 1 to 10
    //Question 1
    RadioButton part1_question1_choice2;

    //Question 2
    RadioButton part1_question2_choice1;

    //Question 3
    RadioButton part1_question3_choice1;

    //Question 4
    RadioButton part1_question4_choice2;

    //Question 5
    CheckBox part2_question1_choice1;
    CheckBox part2_question1_choice2;
    CheckBox part2_question1_choice3;
    CheckBox part2_question1_choice4;
    CheckBox part2_question1_choice5;

    //Question 6
    EditText part2_question2_answer;

    //Question 7
    EditText part2_question3_answer;

    //Question 8
    RadioButton part3_question1_choice2;

    //Question 9
    RadioButton part3_question2_choice1;

    //Question 10
    RadioButton part3_question3_choice3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_test);
    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;

        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int total_score;

        // Question 1 - The Answer
        Boolean answer1;

        part1_question1_choice2 = (RadioButton) this.findViewById(R.id.part1_question1_choice2);
        answer1 = part1_question1_choice2.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        // Question 2 - The Answer
        Boolean answer2;

        part1_question2_choice1 = (RadioButton) this.findViewById(R.id.part1_question2_choice1);
        answer2 = part1_question2_choice1.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        // Question 3 - The Answer
        Boolean answer3;

        part1_question3_choice1 = (RadioButton) this.findViewById(R.id.part1_question3_choice1);
        answer3 = part1_question3_choice1.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        // Question 4 - The Answer
        Boolean answer4;

        part1_question4_choice2 = (RadioButton) this.findViewById(R.id.part1_question4_choice2);
        answer4 = part1_question4_choice2.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //Question 5 - The Answer
        Boolean answer5_choice1;
        Boolean answer5_choice2;
        Boolean answer5_choice3;
        Boolean answer5_choice4;
        Boolean answer5_choice5;

        part2_question1_choice1 = (CheckBox) this.findViewById(R.id.part2_question1_choice1);
        part2_question1_choice2 = (CheckBox) this.findViewById(R.id.part2_question1_choice2);
        part2_question1_choice3 = (CheckBox) this.findViewById(R.id.part2_question1_choice3);
        part2_question1_choice4 = (CheckBox) this.findViewById(R.id.part2_question1_choice4);
        part2_question1_choice5 = (CheckBox) this.findViewById(R.id.part2_question1_choice5);

        answer5_choice1 = part2_question1_choice1.isChecked();
        answer5_choice2 = part2_question1_choice2.isChecked();
        answer5_choice3 = part2_question1_choice3.isChecked();
        answer5_choice4 = part2_question1_choice4.isChecked();
        answer5_choice5 = part2_question1_choice5.isChecked();

        if (!answer5_choice2 && !answer5_choice4 && answer5_choice1 && answer5_choice3 && answer5_choice5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }


        //Question 6 - The Answer
        String answer6;

        part2_question2_answer = (EditText) this.findViewById(R.id.part2_question2_answer);
        answer6 = part2_question2_answer.getText().toString().toUpperCase();
        if (answer6.equals("ACCRA") ) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }


        //Question 7 - The Answer
        String answer7;

        part2_question3_answer = (EditText) this.findViewById(R.id.part2_question3_answer);
        answer7 = part2_question3_answer.getText().toString().toUpperCase();
        if (answer7.equals("NAIROBI")) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // Question 8 - The Answer
        Boolean answer8;

        part3_question1_choice2 = (RadioButton) this.findViewById(R.id.part3_question1_choice2);
        answer8 = part3_question1_choice2.isChecked();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        // Question 9 - The Answer
        Boolean answer9;

        part3_question2_choice1 = (RadioButton) this.findViewById(R.id.part3_question2_choice1);
        answer9 = part3_question2_choice1.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        // Question 10 - The Answer
        Boolean answer10;

        part3_question3_choice3 = (RadioButton) this.findViewById(R.id.part3_question3_choice3);
        answer10 = part3_question3_choice3.isChecked();
        if (answer10) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        //For the calculation of the total scores
        total_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (total_score == 10) {
            resultsDisplay = "Great, You Answered 10 Questions Correctly";
        } else {
            resultsDisplay = "You scored " + total_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}