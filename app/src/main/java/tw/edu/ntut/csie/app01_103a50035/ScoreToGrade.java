package tw.edu.ntut.csie.app01_103a50035;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class ScoreToGrade {
    public String letterGrade(int score){
        String grade;
        if(score > 100) grade = "X";
        else if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else if (score >= 60) grade = "D";
        else if (score >= 0) grade = "F";
        else  grade = "X";
        return grade;
    }

}
