package test3_p12;


public class Sample5 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.Carshow();
	}
}

class Car{
	int num;
	double gas;
	
	
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	void Carshow() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
}