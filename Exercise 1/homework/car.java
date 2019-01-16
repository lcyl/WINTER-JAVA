// ex) 자동차
//      속성 : 차량번호, 속도, 연료
//      행동 : Aceel, Break,

public class Car
{
    // 속성
    int CarNo;    // 차량번호
    int Maxspeed; // 최고 속도
    int Curspeed; // 현재 속도
    int MaxFuel;  // 연료통 크기
    int CurFuel;  // 현재 연료량

    // 행동
    int Accel()
    {
        if( CurFuel > 0)
        {
            CurFuel--;  // 연료감소
            if( Curspeed < Maxspeed)
                Curspeed++; // 속도증가
        }
        return Curspeed;
    }
    int Break()
    {
        return 0;
    }
}
