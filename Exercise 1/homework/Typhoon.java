// 아래의 클래스를 직접 작성해 보세요
// 1. 필드
// 2. 필요에 따라 getter/setter 함수 작성
// 3. 시나리오에 따라 속성변경 메소드 작성

// 2) 태풍
// 속성 : 이름, 번호, 현재위치(위도, 경도), 위도 , 경도, 이동속도
// 행동 : 이동 (위도, 경도 변경)

public class Typhoon
{
    private char name;
    private int cord;
    private int curtude;
    private int latitude;
    private int longtitude;
    private int speed;

    public int moving()
    {
        if (longtitude >= 0 )
        {
            longtitude++;
            if ( longtitude < 180 )
                longtitude--;
        }
        if ( latitude >= 0 )
        {
            latitude++;
            if ( latitude < 90 )
                latitude--;
        }
        return curtude;
    }


}
