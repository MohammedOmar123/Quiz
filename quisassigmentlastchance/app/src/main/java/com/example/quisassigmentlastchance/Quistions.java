package com.example.quisassigmentlastchance;

public class Quistions {
private  int img ;
private  String opt1 ;
private String opt2 ;
private String opt3 ;
private  String CorrectAnswer ;

public Quistions(int img, String opt1, String opt2, String opt3, String correctAnswer) {
        this.img = img;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        CorrectAnswer = correctAnswer;


    }
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }


}
