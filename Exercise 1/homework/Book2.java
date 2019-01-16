// 5) 책
// 속성 : 저자, 제목, 가격
// 행동 : 펼치기, 덮기, 다음장 이동, 이전장 이동

//접근지정자   이름
public class Book2
{
    //속성 : 필드(Field), 멤버 변수
    String title; //제목
    String writer;//저자,ㅏ
    int price; //가격
    int totalpage;
    int curpage;
    //행동 : 메소드(Method), 멤버 함수
    int open( int page ) // 책 펼치기
    {
        if ( 0 < page && page < totalpage)
              curpage = page;
        return curpage;
    }
    int nextpage()
    {
        if( curpage < totalpage )
        curpage++;
        return curpage;
    }
    int prevpage()
    {
        if (curpage < totalpage)
        curpage--;
        return curpage;
    }
}

