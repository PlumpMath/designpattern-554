package study.insuk.singleton;

public class Main {

	public static void main(String[] args) {

		System.out.println("start.");
		Singleton obj1 = Singleton.getInsance();
		Singleton obj2 = Singleton.getInsance();
		
		if(obj1 == obj2){
			System.out.println("obj1 과 obj2 는 같은 인스턴스입니다.");
		}else{
			System.out.println("obj1 과 obj2 는 다른 인스턴스입니다.");
		}
		System.out.println("End. ");
	}

}
