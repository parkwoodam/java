package modifier01_private;

public class Person {
	
	//자기 클래스에서만 접근가능
    private String name;
    private int age;
    
    //멤버 메서드 : 자기 자신
    public void info() {
    	name = "kim"; //자기자신의 것이므로 접근 가능
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}
