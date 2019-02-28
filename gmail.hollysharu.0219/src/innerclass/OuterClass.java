package innerclass;

public class OuterClass {
	//일반 내부 클래스 
	class InnerClass{
		public void innerMethod() {
			System.out.printf("이너 클래스의 메소드\n");
		}
	}

	//static 멤버를 가지고 있는 경우에는 
	//static inner class로 생성해서 하나만 생성되도록 해줘야 함 
	static class StaticInnerClass{
		public static int n;
		
	}
	
	//메소드를 >호출할 때< 이너클래스가 호출되게 하려고! 
	public void method() {
		class LocalInnerClass{
			public void innerMethod() {
				System.out.printf("이너 클래스의 메소드\n");
			}
		}
	}
	
	//로컬 내부 클래스는 해당 영역에서만 사용 
	//LocalInnerClass c =new LocalInnerClass();


}
