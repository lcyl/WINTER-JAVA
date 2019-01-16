// 아래의 클래스를 직접 작성해 보세요
// 1. 필드
// 2. 필요에 따라 getter/setter 함수 작성
// 3. 시나리오에 따라 속성변경 메소드 작성

// 1) 상품
// 속성 : 가격, 상품명, 수량
// 행동 : 판매(수량 감소), 입고(수량 증가), 예약....

public class product
{
    private int price;
    private String prnm;
    private int quantity;

    private int maxqu;
    private int curqu;

    public int sell()
    {
        if (quantity < maxqu)
        {
            quantity--;
        }
        return curqu;
    }

    public int input()
    {
        if( curqu == 0 && curqu > 0 )
        {
            quantity++;
        }
        return curqu;
    }

    public void reservation( int reser)
    {
        if ( curqu != 0 )
        {
            curqu--;
            reser++;
        }
    }
}

