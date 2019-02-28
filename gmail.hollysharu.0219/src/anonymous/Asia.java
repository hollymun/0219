package anonymous;

//Korea	클래스를 상속받은 Asia 클래스 
public class Asia extends Korea implements Chiness{

	//상위 클래스의 메소드를 재정의(Override)
	@Override
	public void food() {
		System.out.printf("코리아 푸드 - 상위 클래스의 메소드 재정의 \n");
	}

	//인터페이스 형의 chiness는 abstract기 때문에 오버라이딩을 해야 사용 가능함 
	@Override
	public void method() {
		System.out.printf("인터페이스의 메소드 구현(implements)\n");
	}

}
