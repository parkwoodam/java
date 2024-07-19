package modifier00_jvm_static;

public class PersonTest {
    public static void main(String[] args) {
    	// static변수는 클래스 이름으로 바로 접근 가능
    	System.out.println(Person.pCount);
    	
    	Person p = new Person();
    	p.pCount = 200; // static 변수는 모든 인스턴스가 공유된다.
    	System.out.println(p.pCount); // 노란줄 뜸 -> 인스턴스를 통해서도 접근은 가능하지만 클래스 이름으로 접근하는 것 권장
    	System.out.println(Person.pCount);
    }
}
