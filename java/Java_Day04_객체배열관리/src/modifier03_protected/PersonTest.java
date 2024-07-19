package modifier03_protected;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "kim" ;  //같은 패키지 이므로 접근 당연히 가능
    }
}
