package test;

import java.util.Objects;

public class Test {

	public static void main(String[] args) {
		Food food1 = new Food("돈가스");	
		Food food2 = new Food("돈가스");
		Food food3 = new Food("제육덮밥");
		
		
		System.out.println(food1.toString());
		System.out.println(food2); // toString 생략가능
		
		System.out.println(food1.equals(food2)); // false =>(재정의 후) true
		System.out.println(food1.equals(food3)); // false
		
		
	}
}

class Food {
	private String name;

	public Food(String name) {
		this.name = name;
	}
	
	@Override // equals 재정의
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//1. Object가 나 자신과 같은지를 비교 -> 참조값이 같은지 비교
		if (this == obj ) {
			return true;
		}
		
		//2. 입력받은 인스턴스가 type이 같은지를 비교
		// instanceof
		if (!(obj instanceof Food)) {
			return false;
		}
		
		//확실하게 보장이 됨
		Food food = (Food) obj;
		
		//3. 내가 가진 이름과 외부에서 입력받은 이름이 같은지를 비교
		// 같으면 true / 틀리면 false
		return this.name.equals(food.name);
	}
	
	// 참조값으로 해시값을 뽑아내지 않고 문자열(name)을 기준으로 해시값을 뽑아내는 식으로 변경
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.name);
	}
	
}