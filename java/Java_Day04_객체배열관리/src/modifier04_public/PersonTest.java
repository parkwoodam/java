package modifier04_public;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        //public은 모든 위치에서 접근 가능
        p.age = 10;
    }
}
