// 아래의 클래스를 직접 작성해 보세요
// 1. 필드
// 2. 필요에 따라 getter/setter 함수 작성
// 3. 시나리오에 따라 속성변경 메소드 작성

// 5) 사람
// 속성 : 나이, 몸무게, 혈압, 체온, 혈당, 맥박
// 행동 : 생일, 운동, 밥먹기

public class Human
{
    private int age;
    private int weight;
    private int pres;
    private int temp;
    private int dang;

    public int birth( int curage)
    {
        age++;
        return curage;
    }

    public void exersice( int curweight)
    {
        weight--;
        pres++;
    }

    public void eat()
    {
        weight++;
        temp++;
        dang++;
    }
}
