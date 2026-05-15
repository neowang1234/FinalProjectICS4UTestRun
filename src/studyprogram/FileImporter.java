/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author NeWan5443
 */
public class FileImporter {
    public String importStudyNotes(String filePath) throws FileNotFoundException{
        String output = "";
        File f = new File(filePath);
        Scanner s = new Scanner(f);
        while(s.hasNextLine()){
            output += s.nextLine() + System.lineSeparator();
        }
        return output;
    }
    
    public String[] importFeedback(String filePath) throws FileNotFoundException{
        String feedbacks[] = new String[10];
        File f = new File(filePath);
        Scanner s = new Scanner(f);
        for(int i = 0; i < feedbacks.length; i++){
            feedbacks[i] = s.nextLine();
        }
        return feedbacks;
    }
    
    public Question[] importQuestions(String filePath, String feedbacks[]) throws FileNotFoundException{
        Question questions[] = new Question[10];
        File f = new File(filePath);
        Scanner s = new Scanner(f);
        for(int i = 0; i < questions.length; i++){
            int questionNum = i+1;
            String questionText = s.nextLine();
            String choice1 = s.nextLine();
            String choice2 = s.nextLine();
            String choice3 = s.nextLine();
            String choice4 = s.nextLine();
            String correctAnswer = s.nextLine();
            String feedback = feedbacks[i];
            questions[i] = new Question(questionNum, questionText, choice1, choice2
            , choice3, choice4, correctAnswer, feedback);
        }
        return questions;
    }
}
