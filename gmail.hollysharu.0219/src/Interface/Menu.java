package Interface;

//KoreaFood 인터페이스를 구현한 클래스
//인터페이스는 2개 이상 구현이 가능함 
public class Menu implements KoreaFood, ChinessFood {

	@Override
	public void jjajangmyeon() {
		System.out.printf("면과 춘장을 같이 볶은 음식\n");
	}

	@Override
	public void bulgoki() {
		System.out.printf("소고기에 국물이 있는 음식\n");
	}

}
