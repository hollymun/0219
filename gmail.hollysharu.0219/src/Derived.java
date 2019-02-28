
//Based 클래스로부터 상속 받은 Derived 클래스
public class Derived extends Based {
	
	public void subMethod() {

		System.out.printf("하위 클래스에만 존재하는 메소드\n");

		//this.a=10; //private이라서 안 보인다고 에러 
		//this.e=10; //없다고 에러
	/*	
		private int a;
		private int b;		
		private int c;
		private int d;
	*/		
	}
	
	//Method Overriding (메소드 재정의) 
	//상위 클래스에 있는 메소드 void commonMethod와 동일한 모양의 메소드를 새로 만듦 
	//overloading은 (자료형) || (매개변수)가 다름 
	public void commonMethod() {
		System.out.printf("하위 클래스에서 다시 정의한 메소드\n");
	}
	
}
