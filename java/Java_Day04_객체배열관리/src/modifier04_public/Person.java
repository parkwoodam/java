package modifier04_public;

public class Person {
	//public 나자신 뿐아니라 같은 패키지 다른 패키지까지 모두 접근 가능
    public String name;
    public int age;
    
    public void info() {
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}
