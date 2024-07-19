package modifier03_protected2;

import modifier03_protected.Person;

//다른 패키지에 있는 다른 클래스 = 불가능
//상속을 받은 것 : PersonTest2가 상속을 받음
public class PersonTest2 extends Person { // extends를 하면 상속
	public static void main(String[] args) {
		Person p = new Person();
		// 다른 클래스에 있으면 기본적으로는 불가능
//		p.name = "lee";
		
		PersonTest2 p2 = new PersonTest2();
		p2.age = 10; //상속됐기 때문에 접근 가능
	}
}
