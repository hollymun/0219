
public class ConstructorClass {
	//클래스를 만들면 기본적으로 제공되는 생성자가 있음
	//이 생성자는 다른 생성자를 만들면 자동으로 소멸됨 
/*
	public ConstructorClass() {
		super();
	}
*/
	//번호와 이름을 저장 
	//객체지향언어에서는 변수에 직접 접근하는 것을 금기시함 
	//getter와 setter를 이용해서 변수에 접근하는 것을 권장함 
	private int num;
	private String name;
	
	//매개변수가 없는 생성자 - default constructor
	public ConstructorClass() {
		System.out.printf("매개변수가 없는 생성자\n");
		/*this.*/num=1; //this.가 생략돼있음 
	}
	
	//생성자 Overloading
	//메소드 이름은 같고 매개변수의 개수와 자료형이 다른 경우 
	public ConstructorClass(int num, String name) {
		//매개변수가 없는 자신의 생성자를 호출함
		//일반처리구문보다 앞에 있어야 함 
		this();
		System.out.printf("매개변수가 있는 생성자\n");
		this.num=num;
		this.name=name;
	}
	
	//변수에 접근하기 위한 접근자 메소드 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
