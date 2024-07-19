package modifier01_private;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
//        p.name = "kim" // name이 private으로 설정되어있으므로 (다른 클래스) 접근 불가
    }
}
