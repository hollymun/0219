
public class Based {
/*	
	private int a; 		//현재 클래스 내부에서만 사용 가능 
	int b;				//package 내 public, 외 private  
	protected int c;	//현재 클래스의 내부 메소드, 상속 받은 클래스의 내부 메소드 
	public int d;		//인스턴스도 사용 가능 
*/
	
	public void superMethod() {
		System.out.printf("상위 클래스에만 존재하는 메소드\n");
	}
	
	public void commonMethod() {
		System.out.printf("상위 클래스에만 존재하는 메소드\n");
	}
	
	
	
}
