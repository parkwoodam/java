package modifier02_default2;

import modifier02_default.Person;

// 다른 패키지에 있는 다른 클래스이므로 접근 불가능
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
//        p.name = "kim" // 다른 클래스이므로 접근 불가
    }
}
