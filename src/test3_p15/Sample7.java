package test3_p15;

public class Sample7 {
	public static void main(String[] args) {
		Car car1 = new Car();
		int number = 1234;
		double gasline = 20.5;
		car1.setNumGas(number,gasline);
	}
}

class Car{
	int num;
	double gas;
	
	void setNumGas(int n,double g) {
		this.num = n;
		this.gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
}

