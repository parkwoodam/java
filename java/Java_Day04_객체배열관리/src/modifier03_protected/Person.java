package modifier03_protected;

public class Person {
	
	//protected 같은 패키지 접근 가능, 다른 패키지에 존재하는 클래스는 기본적으로는 불가능하지만 상속관계라면 접근 가능
    protected String name;
    protected int age;
    
    public void info() {
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}
