import java.util.Random;

public class Main {

	public static void main(String[] args) {
/*		//MethodClass의 instance 생성
		MethodClass instance=new MethodClass();
		//return이 없는 메소드 호출 - 여기서 흐름 중단 
		instance.addNoReturn(100, 200);
		
		//return이 있는 메소드 호출
		//결과를 변수에 저장해서 재이용 
		int r=instance.addReturn(100, 200);
		r=instance.addReturn(r, 900);
		System.out.printf("덧셈 결과:%d\n",r);
		//stack 1개 생성->값 저장->stack 사라짐 
		
		//메소드 안에서 메소드를 호출하는 것 - 가능하지만 사용하지 말기 
		System.out.printf("덧셈 결과:%d\n",instance.addReturn(instance.addReturn(1000, 3000), 10980));
		//stack 2개 생성됨
		
		//작은 연산을 수행할 때는 recursion이 별 문제가 없지만 
		//많은 연산을 수행하는 경우는 메모리가 부족해지거나 연산속도가 느려짐 
		System.out.printf("10000까지의 합: %d\n", instance.sumNoRecursion(1000));
		System.out.printf("10000까지의 합: %d\n", instance.sumRecursion(1000));

		System.out.printf("10번째 피보나치 수열의 : %d\n", instance.fibonacci(10));
		System.out.printf("11번째 피보나치 수열의 : %d\n", instance.fibonacci(11));
		System.out.printf("1번째 피보나치 수열의 : %d\n", instance.fibonacci(1));
		System.out.printf("2번째 피보나치 수열의 : %d\n", instance.fibonacci(2));
		System.out.printf("2번째 피보나치 수열의 : %d\n", instance.fibonacci(3));
		
		System.out.printf("========================\n");
		
		//static 메소드를 호출할 때는 클래스 이름으로 호출 
		MethodClass.staticMethod();
		//instance.staticMethod(); //static메소드는 클래스 이름으로 호출하라고 경고 뜸 
		instance.thisTest();
		
		System.out.printf("========================\n");
		
		//1. static double / random() 
		//0.0과 1.0 사이의 값 중 랜덤으로 1개 출력 
		double x1=Math.random();  //static이니까 인스턴스 생성 x
		System.out.printf("x1:%f\n",x1);
		
		//2. int / nextInt()    
		//java.util.Random 클래스의 메소드를 이용해서 랜덤한 정수 하나를 저장해서 출력 
		Random random=new Random();
		int x2=random.nextInt();
		System.out.printf("x2:%d\n", x2);
		
		//1) static 안 붙었으니까 인스턴스 생성해야 함 
		//2) 매개변수 자료형
		//3) 리턴 값 

		System.out.printf("========================\n");

		//인스턴스 생성
		//보이지 않는 최초 생성자가 있기 때문에 아래처럼 불러올 수 있음
		ConstructorClass obj1=new ConstructorClass();
		//obj1.setNum(1);
		obj1.setName("하루");
		System.out.printf("obj1:%d\n", obj1.getNum());		
		
		ConstructorClass obj2=new ConstructorClass();
		//obj2.setNum(1);
		obj2.setName("박시");
		System.out.printf("obj2:%d\n", obj2.getNum());	
		
		//Overloading해서 만든 생성자
		//매개변수를 직접 설정해서 인스턴스 생성 
		ConstructorClass obj3=new ConstructorClass(3, "후추");
		System.out.printf("obj3:%d & %s\n", obj3.getNum(),obj3.getName());			

		System.out.printf("========================\n");
		
		//Based b=new Based();
		//하위 클래스에서는 상위 클래스의 멤버를 전부 물려받음 
		Derived d=new Derived();
		
		d.superMethod();
		d.commonMethod();
		d.subMethod();
		d.subMethod();
*/
	
		Based b = new Based();
		//상위 클래스 타입으로 만들어진 참조형 변수에 
		//하위 클래스 타입의 인스턴스를 대입할 수 있음 
		Based x = new Derived();
		//나 상위 클래스인데 니 내가 갖고 있는 거 다 줄 수 있닝 - 웅 니가 다 물려줬자나 
		//x.commonMethod();
		
		//하위 클래스 타입으로 만들어진 참조형 변수에 
		//상위 클래스 타입의 인스턴스 참조를 대입할 수 없음 
		//이 때는 강제 형 변환을 해서 대입해야 함 
		//Derived d = new Based();
		//나 하위 클래스인데 니 내가 갖고 있는 거 다 줄 수 있닝 - 아니 모질라;;; 

		//강제 형 변환을 해도 "java.lang.ClassCastException" 에러 발생 
		//Derived d = (Derived) new Based();
		
		//인스턴스를 생성할 때 하위 클래스 타입으로 만든 경우는 
		//원래 자료형으로 형 변환해도 예외가 발생하지 않음 
		Derived d = (Derived)x; 
		
		//polymorplism(다형성)
		Based bb = new Based();
		bb.commonMethod();
		bb=new Derived();
		bb.commonMethod();
		
		System.out.printf("========================\n");

		//1. static double / random() 
		//0.0과 1.0 사이의 값 중 랜덤으로 1개 출력 
		double test=java.lang.Math.random();
		System.out.printf("test:%f\n",test);
				
		//2. int / nextInt()    
		//java.util.Random 클래스의 메소드를 이용해서 랜덤한 정수 하나를 저장해서 출력 
		java.util.Random random=new Random(); 
		int x2=random.nextInt();
		System.out.printf("x2:%d\n", x2);
		
	}
}
