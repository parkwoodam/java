package java03_operator;

public class Op03_비교연산자 {

    public static void main(String[] args) {
        int a = 10;
        
//        System.out.println(a > 10); // f
//        System.out.println(a <= 10); // t
//        System.out.println(a >= 10); // t
//        System.out.println(a == 10); // t
//        System.out.println(a != 10); // f
        
        // 문자열은 어떻게 비교하는가?
        String c=  "Hi";
        String d = "Hi"; 
        String e = new String("Hi");
        
        System.out.println(c == d); // t
        System.out.println(c == e); // f : 참조값(주소값)이 다르기 때문
        System.out.println(c.equals(e)); // t : 값 비교를 할 때는 equals 사용!!
        System.out.println(d.equals(e)); // t
    }
}
