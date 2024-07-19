package java02_variable;

public class Var02_TypeCasting {
    public static void main(String[] args) {
        
        // 형변환 : 자료형을 바꾸는 것
    	
    	//1. 묵시적 형 변환
    	// 범위가 작은 자료형 -> 범위가 큰 자료형으로 이사
    	int n1 = 100; //데이터 값이 아닌 형에 주목
    	long n2 = n1; //묵시적 형 변환
    	
    	
    	//2. 명시적 형 변환
        // 범위가 큰 자료형 -> 범위가 작은 자료형으로 이사
    	long n3 = 100; //100L 이었어야 했지만 묵시적 형 변환 일어남
//    	int n4 = n3; //불가능
    	//프로그래머가 명시적으로 바꿔줘야 함 -> 형변환 연산자 사용 : (바꾸고 싶은 자료형)
    	int n4 = (int) n3; //가능
    	
    	//리터럴 - 값을 소스 코드 상에 적어 놓은 것
    	//데이터 자료형에 따라서 값의 표기 방법이 다름
    	//100 => int 형의 숫자 100
    	//100L => long 형의 숫자 100
    	//12.321 => double형
    	//12.321f =>  float형
    	//"Hello World!!" => String형의 문자열 
    	
//    	int n5 = 12345678901324; // 숫자가 너무 커서 불가능
    	int n5 = (int) 12345678901324L; //가능
    	long n6 = 12345678901234L; //가능

    }
}
