package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		Weapon w1=new Weapon() {	
			@Override
			public void attack() {
				System.out.println("weapon 상속받은 익명의 클래스가 재정의");
			}
		};
		useWeapon(w1);
		
		//지역변수 만들지 않고 바로 익명클래스로 객체생성후 참조값 전달하기
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
