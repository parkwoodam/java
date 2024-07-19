package modifier06_singleton;

public class ScoreTest {
    public static void main(String[] args) {
//    	ScoreManager sm = new ScoreManager(); // 생성자를 private으로 막아놨기 때문에 불가능
    	//객체를 생성해서 사용 불가
    	
    	//객체는 getInstance static 메서드를 이용해서 가져온다
    	
    	ScoreManager sm1 = ScoreManager.getInstance();
    	ScoreManager sm2 = ScoreManager.getInstance();
    	
    	System.out.println(sm1 ==sm2);
    	// 유일한 1개의 객체임을 보장할 수 있음  => 주소 동일 / 이름만 다른 것 

    }
}
