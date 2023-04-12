package expert;

public class Exam1 {
		// 생성자, 메소드는 반드시 알아야함 !!
		Exam1() {
			a = -1;
		}
		Exam1(int a) {
			this.a = a;
		}
	
		// 필드에서는 선언과 동시에 초기화만 가능하다
		// 실행은 불가능
		// 필드
		int a = -1;
		Expert1 b = new Expert1();

		//                  전달인자       
		// 리턴타입 메소드이름 ([매개변수선언, ...])
	public static void main(String[] args) {
		
		
		/*1번.
		변수 두개에 3,4를 넣고
		출력결과 1 : "3 > 4의 결과는 false입니다"
		6,5로 바꾸고
		출력결과 2 : "6 > 5의 결과는 true입니다"
		*/

		int a = 3;
		int b = 4;
		// (a>b) --->true, false 
		System.out.println(a+">"+b+"의 결과는 "+(a>b) +"입니다.");
		// 변수값에 다른 숫자 바로 저장 가능 !!
		a = 6;
		b = 5;
		System.out.println(a+">"+b+"의 결과는 "+(a>b) +"입니다.");
	
		/*
		2번. 주관식: 저장할 수 있는 변수의 타입을 적기
		2-1. 나는 자동차를 소유하고 있다 : 참/거짓  --Boolean
		2-2. 우리집에 있는 스마트폰의 개수 : 21억 이하의 정수 -- int
		2-3. 내 이름 -- String
		2-4. 1평은 3.3제곱미터입니다. 몇 제곱미터인지 저장할 변수 -- double
		 */
		
		/*
		 15와 20이 주어졌을때 세번째값이 그 사이에 있는지 확인
		 
		 e는 15와 20사이
		 15 <= e <= 20
		 15 <= e && e <= 20
		 
		 */
		
		int c = 15;
		int d = 20;
		int e = -17;  // 세번째값
		if(15 <= e && e <= 20) {
			System.out.println("사이에 있습니다.");
	//  } else if (!(15 <= e && e <= 20)) {
		} else if ((15 > e || e > 20)) {
			System.out.println("사이에 없습니다.");
		}

		/*
		 * 	사각형의 한쪽 모서리 : x1:10, y1:20
			사각형의 다른쪽 모서리: x2:90, y2:100
			이 경우에 새로운 점 x3,y3가 사각형 안에 들어가는가?
		 */
		
		int x1 = 10, y1 = 20, x2 = 90, y2 = 100;
		int x3 = 50, y3 = 50;
		
		if( (x1 <= x3 && x3 <= x2) // x축 검사
			&& (y1 <= y3 && y3 <= y2)) { // y축 검사
			System.out.println("사각형에 포함됩니다.");
		} else {
			System.out.println("사각형에 포함되지 않습니다.");
		}
		
		// []배열 타입에 대한 선언
		int[] arr = null;
		// []크기를 지정하는 키워드
		arr = new int[3];
		// [] index를 뜻함
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 10;
		int[] arr_11 = new int[arr.length+1];
		
		
		int[][] arr2 = null;
		arr2 = new int[4][3];
		
		arr2[0][0] = 10;
	//	arr2.length == 4;
	//	arr2[0].length == 3;
		
		System.out.println(1);
		System.out.println("1");
		
		setInfo("id", "pwd", 10, "서울");

		setInfo("id1", "pwd", 0, "");
		setInfo("id2", "pwd", 0, "");
		
		
		
	}
	static void setInfo(String id, String pw) {
		setInfo(id, pw, 0, "");
	}
	static void setInfo(String id, String pw, int age, String addr1) {
		System.out.println();
	}
	void getInfo() {
		setInfo("id", "pw", 0, "");
	}
}
