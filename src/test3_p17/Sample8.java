package test3_p17;

public class Sample8 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNumGas(1234,20.5);
		int number = car1.getNum();
		double gasline = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+number+"，汽油量是"+gasline);
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
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
}

