package modifier02_default;

//다른 클래스이지만 같은 패키지에 있는 클래스이므로 접근 가능
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
      p.name = "kim"; //같은 패키지에 존재하기 때문에 접근 가능
        
    }
}
