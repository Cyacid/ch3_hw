package test3_p14;


public class Sample6 {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}

class Car{
	int num;
	double gas;
	
	
	void setNum(int n) {
		this.num = n;
		System.out.println("將車號設為"+num);
	}
	void setGas(Double g) {
		this.gas = g;
		System.out.println("將汽油量設為"+gas);
	}
}
