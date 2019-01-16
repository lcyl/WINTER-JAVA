// static
//   --> 공용 (전역)
//   --> 공유 변수
//   --> 하나의 클래스로부터 만들어진 여러개의 객체들이 공유하는 변수
// 클래스 만드는 순서 !!
// 1. 필드 작성
//  1.1 적절한 타입과 이름으로 private 작성
//  1.2 final멤버 찾기 ( 상수 )  : setter,생성자 모양 영향
// 2. getter/setter 구현
// 3. 생성자 작성

class marin
{
    private static final int max_hp = 40;
    private int cur_hp;
    private static final int def = 7;
    private static final int att = 7;
    private static final int price = 50;
    private static int attup;
    private static int defup;
    private int kills;

    public void setCur_hp(int cur_hp) { this.cur_hp = cur_hp; }
    public static void setAttup(int attup) { marin.attup = attup; }
    public static void setDefup(int defup) { marin.defup = defup; }
    public void setKills(int kills) { this.kills = kills; }

    public static int getMax_hp() { return max_hp; }
    public int getCur_hp() { return cur_hp; }
    public static int getDef() { return def; }
    public static int getAtt() { return att; }
    public static int getPrice() { return price; }
    public static int getAttup() { return attup; }
    public static int getDefup() { return defup; }
    public int getKills() { return kills; }

    // 정적 생성자 : static 멤버 초기화 !!
    // 클래스가 만들어 질때 1번만 호출!!
    static
    {
        attup = 0;
        defup = 0;
        System.out.println("static {} 호출 ~~");
    }

    // 인스턴스 생성자: 객체당 1번 호출되서 객체 초기화 !!
    // 리턴없는 메소드
    // this 생략된 거임
    public marin()
    {
        cur_hp = 40;
        kills = 0;
        System.out.println("Marin() 호출");
    }
}

public class oops2
{
    public static void main (String args[])
    {
        marin m1 = new marin();
        marin m2 = new marin();
        marin m3 = new marin();
    }
}
