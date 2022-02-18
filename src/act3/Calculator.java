package act3;

public class Calculator {
	public int first;
	public int second;
	
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public int plus(int first, int second) {
		return first + second;
	}
	
	public int minus(int first, int second) {
		return first - second;
	}

	public int multiply(int first, int second) {
		return first * second;
	}
	
	public int devide(int first, int second) {
		return first / second;
	}
	
	public int surplus(int first, int second) {
		return first % second;
	}
}
