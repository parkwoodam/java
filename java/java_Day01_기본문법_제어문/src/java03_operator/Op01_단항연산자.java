package java03_operator;

public class Op01_단항연산자 {

    public static void main(String[] args) {
       // 다음 중 올바른 값을 채워 넣으시오.
        int a = 5;
        System.out.println(a++); // 5 5를 출력한 뒤 1을 더함(후위형)
        System.out.println(++a); // 7 기존 6에서 1을 더한 뒤 출력(전위형)
        System.out.println(--a); // 6 기존 7에서 1을 뺀 뒤 출력
        System.out.println(a); // 6 기존 6 출력
        System.out.println(a--); // 6 기존 6 출력한 뒤 1 뺌
        System.out.println(a++); // 5 기존 5 출력한 뒤 1 더함
        
        System.out.println(-a); // -6 기존 6을 부호 변경 (양수->음수 / 음수->양수)
        System.out.println(~a); // -7 : 1의 보수로 바뀜 

        System.out.println(!false); // true : 논리 반전
        
    }
    
}
