package expert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		
		// 자바에서 List 인터페이스를 구현하는 ArrayList 
		// 클래스의 제네릭 인스턴스를 생성하는 것
		// ArrayList 인스턴스는 Integer 타입의 요소를 저장하도록 지정
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		// List의 첫 번째 요소를 가져와서 
		// Integer로 캐스팅한 후에 int 변수 a에 할당하는 것
		int a = (Integer) list.get(0);
		int b =           list.get(1);

		System.out.println("list.size() : "+ list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "="+ list.get(i));
			
	
		}
		
		// K: 키 , V: 값
		// 키-값(key-value) 쌍으로 데이터를 저장하며, 
		// 키를 사용하여 값을 검색
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		
		String v1 = (String)map.get("key1");
		String v2 =         map.get("key1");
		
		System.out.println("v1 : "+ v1);
		System.out.println("v2 : "+ v2);
		
		/*
		# include <stdio.h>
		int main(int argc, char*argv[]){
		int a[2][2]={{11,22},{44,55}};
		int i, sum =0;
		int *p;
		p=a[0];
		for(i=1;i<4;i++)
		sum +=*(p+i)
		printf("%d",sum);
		return 0;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}

