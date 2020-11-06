package com.example.qapp;

public class Question {
    public String questions[]={
            "Which of these is a standard interface for serial data transmission?",
            "Which of the following transmission directions listed is not a legitimate channel?",
            "Parity bits are used for which of the following purposes?",
            "The location of a resource on the internet is given by its?",
            "The term HTTP stands for?",
    };
    public String[] [] choices={
            {"ASCII","RS232C","2","Centronics"},
        {"Simplex","Half Duplex", "Full Duplex", "Double Duplex"},
    {"Encryption of data","To transmit faster" , "To detect errors", "To identify the user"},
    {"Protocol", "URL" ,"E-mail address","ICQ"},
    {"Hyper terminal tracing program" ,"Hypertext tracing protocol" ,"Hypertext transfer protocol","Hypertext transfer program"}
    };
    public String correctAnswers[]={
            "RS232C", "Double Duplex", "To detect errors", "URL", "Hypertext transfer protocol"
        };
    public String getQuestions(int a){
        String question=questions[a];
        return question;
    }
    public String getchoice1(int a) {
        String choice = choices[a][3];
        return choice;
    }
    public String getchoice2(int a) {
        String choice = choices[a][0];
        return choice;
    }
    public String getchoice3(int a) {
        String choice = choices[a][2];
        return choice;
    }
    public String getchoice4(int a) {
        String choice = choices[a][2];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer=correctAnswers[a];
        return answer;
    }



}
