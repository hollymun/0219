package Interface;

public class Main {

	public static void main(String[] args) {
		//인터페이스도 추상클래스처럼 인스턴스 생성을 못함
		//KoreaFood menu=new KoreaFood();
		
		//참조형 변수를 만들어서 
		//인터페이스를 implements한 클래스의 인스턴스 참조는 저장할 수 있음 
		//KoreaFood menu=new Menu();
		Menu menu=new Menu();
		
		//오버라이딩 된 메소드는 변수를 선언할 때의 자료형이 아니고 (KoreaFood)
		//인스턴스를 대입할 때의 '인스턴스의 자료형'을 가지고 호출함 
		menu.bulgoki();
		menu.jjajangmyeon();
		
		
	}

}
