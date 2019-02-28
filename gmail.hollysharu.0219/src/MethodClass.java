
public class MethodClass {
	

	
	
	private int age=53;
	
	//getter&setter 중 get은 있고 set은 없으면 읽기전용(값 변경 금지)
	//변수의 값을 리턴함 
	public int getAge() {
		return age;
	}

	//변수의 값을 변경함 
	public void setAge(int age) {
		this.age = age;
	}
	

	private boolean gender;

	//boolean은 판별하는 용도기 때문에 is가 붙음 
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	//static 메소드 -클래스 이름으로 호출할 수 있는 메소드 
	//인스턴스 변수를 사용할 수 없음- this가 없기 때문 
	public static void staticMethod() {
		//인스턴스 변수를 호출하면 에러 남 
		//age=10; static 필드에 없 
		System.out.printf("static method\n");
	}
		
	public void thisTest() {
		int age=47;
		System.out.printf("age: %d\n", age); //가장 가까운 것 호출 
		System.out.printf("this age: %d\n", this.age); //인스턴스 안에서 호출 
	}

	
	
	public void addNoReturn(int a, int b) {		
		int result=a+b;
		System.out.printf("덧셈 결과: %d\n", result);
		//return: 메소드의 수행을 종료하고 호출한 곳으로 이동하는 명령어 
		//return result; 하려면 return type을 데이터 자료형으로 변경해야 함 
		return;
		//System.out.printf("실행 안 되는 문장");

	}
	
	public int addReturn(int a, int b) {
		return a+b;
	}
	
	//재귀를 이용하지 않고 1부터 n까지의 합계
	public int sumNoRecursion(int n) {
		int sum = 0;
		for(int i=1; i<=n; i=i+1) {
			sum=sum+i;
		}
		return sum;
	}
	
	//재귀를 이용해서 1부터 n까지의 합계
	public int sumRecursion(int n) {

		if(n==1) {
			return 1;
		}else {
			return n + sumRecursion(n-1);
		}
	}
	
	//피보나치 수열 - 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
	//처음 2개의 항은 1 : 예외 
	//3번째 항부터는 이전 2개 항의 합
	//검색에 많이 이용되는 수열 
	public int fibonacci(int n) {
		if(n==1||n==2) {
			return 1;
		}//if문장의 마지막이 return이면
		//아래 조건은 이미 return값을 지나쳐 왔단 뜻이므로  
		//else 안 써도 자동으로 else 처리 됨  
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
