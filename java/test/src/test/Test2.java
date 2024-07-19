package test;

public class Test2 {
	public static void main(String[] args) {
		Sky sky1 = new Sky();
		// instance는 Cloud가 생성되어있음
		Sky sky2 = new Cloud(); //자식 타입으로 선언가능 //object -> sky -> cloud
		// instance는 Airplane이 생성되어있음
		Sky sky3 = new Airplane(); //object -> sky -> airplane
		
		Sky[] skyArray = {sky1,sky2,sky3};
		
		// 실제 인스턴스에 생성된 메소드를 실해앟게 됨
		// 동적 바인딩
		for (Sky sky : skyArray) { 
			sky.fly();
		}
		
		Cloud cloud = (Cloud) sky2; //확장
		System.out.println(cloud.name);
		
		//instanceof를 활용해서 인스턴스영역에 어느데이터가 선언되어 있는지 확인해보자
		Airplane air2 = (Airplane) sky1;
		System.out.println(air2.door); //에러발생 스카이는 에어플레인 접근 불가능
	}
}

class Sky {
	public void fly() {
		System.out.println("푸른하늘");
	}
}

class Cloud extends Sky {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("구름이 뭉개뭉개 날아갑니다.");
	}
	
	public String name = "뭉게구름";
	
}

class Airplane extends Cloud {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 빠르게 날아갑니다.");
	}
	public String door = "문";
}