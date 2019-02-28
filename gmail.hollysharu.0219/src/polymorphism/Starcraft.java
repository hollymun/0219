package polymorphism;

//오버라이딩 하기 위해 만든 메소드기 때문에 
//인스턴스를 생성할 수 없도록 결과형 앞에 abstract 키워드 추가 
//추상 메소드는 추상 클래스나 인터페이스에만 존재할 수 있음 
public abstract class Starcraft {

	//이 메소드는 하위 클래스에서 반드시 오버라이딩 해야 함 
	public abstract void attack(); //내용 없기 때문에 {} 삭제 ; 
	//실제 사용하는 구문이 아니기 때문에 내용이 없는 메소드여도 실행됨 
	//System.out.printf("Starcraft의 공격\n");

}
