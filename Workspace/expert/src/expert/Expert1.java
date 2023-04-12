package expert;


// 한줄씩 주석달기--> 뭘 해야 하는지 --> 예측값을 일단 주석으로 --> 결과값비교
//1. main 안에서 해결
//2. 메소드 만들어서 main 에서 호출
//3. 다른 클래스를 만들고 main에서 호출

// public : 공용패키지   <-->  private
// class로 정의한다. 
// 클래스명이 파일명과 동일할 때에만 선언이 가능하다. 
// { } 내용이 local (지역) class의 역활을 설명한다.

// 클래스 선언 --> class가 적혀있으면 클래스라고 선언!!!
public class Expert1 {

	// public 다른 클래스에서 사용가능, 공용
	// static 
	// ()괄호가 있으면 메소드 , 없으면 변수
	// ()괄호앞은 메소드 명, void 리턴타입 내보내는 값
	// main 메소드 이름, String 배열, args 전달인자로 받음
	// args대신 다른 이름도 가능 
	
	// 메소드 선언         // String은 대문자로 시작하므로 클래스
	public static void main(String[] args) {
		
		
		// System --> 대문자로 시작 class
		System.out.println("Hello World");
		
		int a = 10;
		System.out.println("a : "+ a);
		
		{   // 지역은 중괄호 블럭 안에서만 가능 
			// 지역변수
			int b = 20;
			b = a;
			double c = 20;
			// 자동 형변환
			// 형변환: 큰 수를 작은 수로 형변환시킴
			a = (int)c;  
			c = a;
			
			System.out.println("a2 : "+ a);
			
			int d = 30;
			d = (d * -30) + (3 * 4 / 4) + 2;
			System.out.println(d);
			
			int e = 1;
			e++;
			// 2
			++e;
			// 3
			System.out.println(e++);
			// 4
			System.out.println(++e);
			// 5
			int f = e++ + ++e - --e - e--;
			// f = 5 + 6 -4 - 5    -->2
			
		}
		{	// 지역은 중괄호 블럭 안에서만 가능하므로 b변수를 
			// 중복해서 정의할 수 있다. 
			int b = 30;
			
			// 이미 선언된 a에 영향을 받아서 다시 a 변수를 선언하지 못함
			/*	int a = 50; */
			String g = ""+ 3 + 3 + "번";
			
		}
		
		
		
	// System.out.println("b : "+ b);
	// bit --> 1 0
		
	// 8 bit == 1 byte
	// 0000 0000
	// 0000 0001 == 1
	// 0000 0010 == 2
	// 1111 1111 == 255	
	// 10진수 --> 0 ~ 9 10
	// 16진수 --> 0 ~ 9 a ~ f	
		
		boolean h = 30 > 40; // t/f
		if( h ) {
			System.out.println("크다");
		} else if ( !h ) {
			System.out.println("작다");
		} else {
			System.out.println("같다");
		}
		// if 와 else if의 차이는 실행 속도의 차이가 있음
		// else if가 실행 속도가 빠를 수 있음
		if( 30 > 40 ) {
			System.out.println("크다");
		}
		if( 30 < 40 ) {
			System.out.println("작다");
		}
		
		
		int j = 10;
		if(j == 9) {
			System.out.println();
		} else if (j == 10) {
			System.out.println();
		}
		
		switch(j) {
		case 9:
			System.out.println();
			break;
		case 10:
			System.out.println();
			break;
		}
		
		int k = 10;
		int l = -k;
		l = k * -1; // 부호를 바꿨다!! 꼭 봐라!!
		
		// 반응형 
		// 300px 이하에서는 width값을 300px로 고정
		// 300~700px 사이에서는 width값을 500px로 고정
		// 700이상 1000px
		int vw = 500;
		int width = 0;
		switch(vw) {
		case 200:
		case 250:
		case 300:
			width = 300;
			break;
		case 750:
		case 800:
		case 850:	
			width = 500;
			break;
		case 1000:
			width = 1000;
			break;
		}
		
		// 반복문
		// 1단계 : 몇개만 적어보기
		System.out.println("2x1=2");
		System.out.println("2x2=4");
		System.out.println("2x3=6");
		System.out.println("2x4=8");
		System.out.println("2x5=10");
		
		// 2단계 : 반복되는 것 / 반복되지 않는 것 파악
		// 3단계 : 반복되지 않는 것의 패턴을 파악
		// 4단계 : 시작조건,종료조건 (종료조건을 정하기 어렵다)
		// 종료조건이 명확하면(숫자) : for
		// while
		
		// i = i + 1;   i += 1;  i++;
		// 2단
		for (int i = 1; i <= 9; i=i+1) {
			System.out.println(2+"x"+i+"="+(2*i));
		}
		
		for (int i = 1; i <= 9; i=i+1) {
			System.out.println(3+"x"+i+"="+(3*i));
		}
		
		for (int i = 1; i <= 9; i=i+1) {
			System.out.println(4+"x"+i+"="+(4*i));
		}
		
		System.out.println("------------------------------");
		for (int j1 = 2; j1 <= 9; j1++) {
			System.out.println(j1+"단");
			for (int i = 1; i <= 9; i=i+1) {
				System.out.println(j1+"x"+i+"="+(j1*i));
			}
			System.out.println("==============");
			System.out.println();
		}
		
		// 0 <= x < 1
	double x =	Math.random();
		// 로또 : 1 ~ 45
		// 0 * 45 <= x * 45 < 1 * 45
		// 0<= x*45 < 45
		// 1 <= x*45+1 < 45+1
		// 1 <= x*45+1 <46
		int lotto1 = (int)((x * 45) + 1);
		System.out.println("lotto1 : "+ lotto1);
		
		int lotto2 = (int)(x * 1000);
		lotto2 = (lotto2 % 45) + 1;
		System.out.println("lotto2 : " + lotto2);
		
		String aa = "휴먼";
		String bb = "서울";
		String cc = "";
		cc = aa;
		aa = bb;
		bb = cc;
		// aa에 bb의 내용이 들어가게
		// bb에 aa의 내용이 들어가게
		System.out.println("aa : "+ aa); // 서울
		System.out.println("bb : "+ bb); // 휴먼
	
	
	}
	
	
	
	/*
	int isBig(int x, int y) {
		if(x>y) {
			return 1;
		}
	}
	*/
	
}
