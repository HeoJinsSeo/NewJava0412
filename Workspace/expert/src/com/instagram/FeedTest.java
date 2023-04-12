package com.instagram;



// 주석만 보고 코드 다시 만들어 보기
public class FeedTest {

	public static void main(String[] args) {
	
	String id = "id123";
	String[] imgs = new String[2];
	imgs[0] = "1.jpg";
	imgs[1] = "2.jpg";
	
	//생성자 불러오기
	Feed feed = new Feed(id, imgs);
	String id2 = feed.id;
	System.out.println("id2 : "+ id2);

	
	// new 새로운 객체 	
	Feed feed2 = new Feed("id_abc", new String[]{"a.jpg"});
	System.out.println("feed2 id : "+feed2.id);

	// 필드를 직접 변경 후 출력
	feed2.id = "idid";
	System.out.println("feed2 id : "+feed2.id);
	
	// feed2의 hit 관리
	// 필드는 private으로 막고 getter와 setter를 이용
	// setter에서 음수는 반영하지 않도록 제어
	feed2.setHit(-1);
	System.out.println("feed2 hit : "+ feed2.getHit());
	
	feed2.setHit(3);
	long hit = feed2.getHit();
	System.out.println("feed2 hit : "+ hit);
	
	// 애자일 방법론
	// 요구사항 분석
	// 설계
	// 개발
	// 테스트
	
	// 로그인
	// 클래스명 : com.instagram.Login
	// 필드 
	// 1단계
	// id = "human", pw = "1234"
	// 2단계
	// 배열로 여러개 계정 관리
	// 메소드 :
	// 전달받은 계정과 저장되어있는 계정(들)과 일치하는게 있는지
	// 판단해서 결과를 돌려줌
	// boolean loginCheck(id, pw)
	// "메인 페이지 입니다" 출력만
    // void goMain()
	// 메소드 loginCheck를 호출해서
	// 결과에 따라
	// 참이면 goMain실행
	// 거짓이면 "계정이 없습니다"
	// void doLogin(id, pw)
	// main 메소드 보유
	// 클래스명 : com.instagram.LoginTest
	// id, pw를 Login에 있는 doLogin로 전달하면서 실행
	
	}

}
