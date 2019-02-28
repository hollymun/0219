package polymorphism;

public class Main {

	public static void main(String[] args) {
		//인스턴스는 3개 생성해야 함 
		Starcraft star=new Zerg();
		star.attack();
		
		star=new Terran();
		star.attack();
		
		star=new Protoss();
		star.attack();
		
		//Starcraft 클래스는 실제 사용하기 위해 생성한 클래스가 아니라
		//상속관계를 만들기 위해 생성한 클래스기 때문에
		//인스턴스 생성할 필요가 없음
		//인스턴스를 생성하지 못하도록 할 때는 
		//class 앞에 abstract를 추가해서 추상 클래스로 만들어주기
		//Starcraft 클래스 abstract 클래스로 만들면 메인에서 인스턴스 생성 불가능 
		//star=new Starcraft();
	}

}
