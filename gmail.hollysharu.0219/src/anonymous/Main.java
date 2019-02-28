package anonymous;

public class Main {

	public static void main(String[] args) {

		//Asia 클래스의 인스턴스를 생성하고 메소드 호출 
		Asia asia=new Asia();
		asia.food();
		asia.method();
		
		//1. 일반적으로 상속을 받아서 메소드를 재정의해서 사용하는 경우
		//1) 상위 클래스를 만들기 
		//2) 상속 받은 하위 클래스에서 메소드를 오버라이딩 하고 
		//3) 메인에서 인스턴스를 생성 -> 메소드를 호출
		
		
		//2. 익명 객체를 이용하는 방법 
		//1) 클래스를 만들기
		//2) 메인에서 인스턴스 생성하면서 Overriding한 뒤 메소드를 호출 
		//상속받는 클래스를 만들지 않고 
		//필요한 순간에 만들어졌다가 없어짐 
		new Korea() {

			@Override
			public void food() {
				System.out.printf("Anonymous class를 이용한 클래스 상속 \n");
				
			}
		}.food();
		//위처럼 변수에 저장하지 않고 바로 메소드를 호출하면 
		//메소드를 1번밖에 호출하지 못함 
		//여러 번 호출하려면? 변수에 내용을 저장하고 변수를 이용해서 메소드를 호출 
		Korea korea=new Korea() {

			@Override
			public void food() {
				System.out.printf("Anonymous class를 이용한 클래스 상속 - 변수에 저장함 \n");
				
			}
		};
		korea.food();
		
		//인터페이스를 구현한 anonymous class를 만들어서 해결 
/*		new 클래스이름 또는 인터페이스 이름 {
			메소드 재정의
		}.메소드이름();
*/		
		
		new Chiness() {
			@Override
			public void method() {
					System.out.printf("인터페이스 구현\n");
			}
		}.method();
		
		
		Chiness china=new Chiness() {

			@Override
			public void method() {
				System.out.printf("인터페이스 구현을 변수에 저장\n");	
			}
		};
		china.method();
		
		
		//여러 번 사용할 거면 클래스 생성 - 일반적인 방법으로 
		//한 번만 사용할 거면 익명 클래스로 구현 
		
	}

}
