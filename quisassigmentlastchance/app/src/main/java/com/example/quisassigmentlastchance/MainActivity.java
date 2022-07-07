package com.example.quisassigmentlastchance;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageView image;
    Button opt1, opt2, opt3, score, reset;
    ArrayList<Quistions> questions;
    Random random;
    Quistions current;
    // Array to prevent from repetition of random values
    int ArrayCurrentPos[] = {15, 15, 15, 15, 15, 15, 15, 15, 15};
    int mark = 0, counter = 1, RandomValue, index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialization();
        getQuizQuestion();
        RandomValue = random.nextInt(questions.size());
        //Method to Check random values and store the Generating values in array
        Check(RandomValue);
        current = questions.get(RandomValue);
        textView.setText("Quistion " + counter);
        image.setImageResource(current.getImg());
        opt1.setText(current.getOpt1());
        opt2.setText(current.getOpt2());
        opt3.setText(current.getOpt3());
        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opt1.getText().toString().equalsIgnoreCase(current.getCorrectAnswer())) {
                    mark++;
                }
                if (counter == 8) {
                    score.setVisibility(View.VISIBLE);
                    score.setText(mark + "/8");
                    if (mark >= 6) {
                        score.setBackgroundColor(Color.GREEN);
                    } else {
                        score.setBackgroundColor(Color.RED);
                    }
                    opt1.setEnabled(false);
                    opt2.setEnabled(false);
                    opt3.setEnabled(false);
                } else {
                    // Force the program to generate unique  value
                    boolean flag1;
                    do {
                        RandomValue = random.nextInt(questions.size());
                        flag1 = Check(RandomValue);
                    } while (flag1 == true);
                    current = questions.get(RandomValue);
                    image.setImageResource(current.getImg());
                    opt1.setText(current.getOpt1());
                    opt2.setText(current.getOpt2());
                    opt3.setText(current.getOpt3());
                    counter++;
                    textView.setText("Quistion " + counter);
                }
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opt2.getText().toString().equalsIgnoreCase(current.getCorrectAnswer())) {
                    mark++;
                }
                if (counter == 8) {
                    score.setVisibility(View.VISIBLE);
                    score.setText(mark + "/8");
                    if (mark >= 6) {
                        score.setBackgroundColor(Color.GREEN);
                    } else {
                        score.setBackgroundColor(Color.RED);
                    }
                    opt1.setEnabled(false);
                    opt2.setEnabled(false);
                    opt3.setEnabled(false);
                } else {
                    boolean flag1;
                    do {
                        RandomValue = random.nextInt(questions.size());
                        flag1 = Check(RandomValue);
                    } while (flag1 == true);
                    current = questions.get(RandomValue);
                    image.setImageResource(current.getImg());
                    opt1.setText(current.getOpt1());
                    opt2.setText(current.getOpt2());
                    opt3.setText(current.getOpt3());
                    counter++;
                    textView.setText("Quistion " + counter);
                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opt3.getText().toString().equalsIgnoreCase(current.getCorrectAnswer())) {
                    mark++;
                }
                if (counter == 8) {
                    score.setVisibility(View.VISIBLE);
                    score.setText(mark + "/8");
                    if (mark >= 6) {
                        score.setBackgroundColor(Color.GREEN);
                    } else {
                        score.setBackgroundColor(Color.RED);
                    }
                    opt1.setEnabled(false);
                    opt2.setEnabled(false);
                    opt3.setEnabled(false);
                } else {
                    boolean flag1;
                    do {
                        RandomValue = random.nextInt(questions.size());
                        flag1 = Check(RandomValue);
                    } while (flag1 == true);
                    current = questions.get(RandomValue);
                    image.setImageResource(current.getImg());
                    opt1.setText(current.getOpt1());
                    opt2.setText(current.getOpt2());
                    opt3.setText(current.getOpt3());
                    counter++;
                    textView.setText("Quistion " + counter);
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            //To delete all previous random values from array
            public void onClick(View view) {
                for (int i = 0; i < ArrayCurrentPos.length; i++) {
                    ArrayCurrentPos[i] = 15;
                }
                counter = 1;
                mark = 0;
                index = 0;
                opt1.setEnabled(true);
                opt2.setEnabled(true);
                opt3.setEnabled(true);
                score.setText("");
                score.setVisibility(View.INVISIBLE);
                boolean flag1;
                do {
                    RandomValue = random.nextInt(questions.size());
                    flag1 = Check(RandomValue);
                } while (flag1 == true);
                current = questions.get(RandomValue);
                image.setImageResource(current.getImg());
                opt1.setText(current.getOpt1());
                opt2.setText(current.getOpt2());
                opt3.setText(current.getOpt3());
                textView.setText("Quistion " + counter);
            }
        });

    }
    public boolean Check(int RandomValue) {
        boolean flag = false;
        for (int i = 0; i < ArrayCurrentPos.length; i++) {
            if (ArrayCurrentPos[i] == RandomValue) {
                return true;
            }
        }
        ArrayCurrentPos[index] = RandomValue;
        index++;
        return flag;
    }

    public void getQuizQuestion() {
        questions.add(new Quistions(R.drawable.benzema, "الحكومة", "Benzema", "جميع ما سبق", "جميع ما سبق"));
        questions.add(new Quistions(R.drawable.ronaldo, "Messi", "Ronaldo", "XAVI", "Ronaldo"));
        questions.add(new Quistions(R.drawable.messi, "Ronaldo", "Messi", "Salah", "Messi"));
        questions.add(new Quistions(R.drawable.zidan, "Rooney", "Zidane", "Messi", "Zidane"));
        questions.add(new Quistions(R.drawable.diag, "Diego Costa", "Messi ", "Salah", "Diego Costa"));
        questions.add(new Quistions(R.drawable.pepe, "Pepe", "Messi ", "Ronaldo", "Pepe"));
        questions.add(new Quistions(R.drawable.muler, "فاشخ برشلونة", "Benzema ", "XAVI", "فاشخ برشلونة"));
        questions.add(new Quistions(R.drawable.ramos, "Ramos", "Rooney ", "XAVI", "Ramos"));
    }
    public void Initialization() {
        textView = findViewById(R.id.textView);
        image = findViewById(R.id.image);
        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        score = findViewById(R.id.Score);
        reset = findViewById(R.id.reset);
        questions = new ArrayList<>();
        random = new Random();
        index = 0;
    }
}