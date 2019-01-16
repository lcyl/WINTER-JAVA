// 학생
// 속성 : 학번, 나이, 이름
// 행동 : 공부

public class Student
{
    // 속성(private)로 작성 : 외부의 무분별한 접근 금지
    private int Sno;
    private int age;
    private String name;
    private int score;

    // getter
    public int getAge() {return age;}

    // getter/setter
    public int getScore()
    {
        return score;
    }
    public void setScore(int newScore)
    {
        if( newScore >= 0 && newScore <= 100 )
        score = newScore;
    }

    // 메소드(public)로 필드 접근
    public void study()
    {
        score++;
    }
}

public class main2 {
    public static void main (String[] args)
    {
        Student s = new Student();

    }
}
