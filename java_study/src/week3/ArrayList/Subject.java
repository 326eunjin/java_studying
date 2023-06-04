package week3.ArrayList;

public class Subject {
    String subject_name;
    int score;
    Subject(String subject_name, int score)
    {
        this.subject_name=subject_name;
        this.score=score;
    }
    public void showInfo()
    {
        System.out.println(subject_name+" 과목 성적은 "+score+"입니다.");
    }
}
