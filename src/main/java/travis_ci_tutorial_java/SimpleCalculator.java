package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide1(int a, int b) {
		return a / b;
	}
	
	public String divide2(int a, int b) {
		if(b == 0) {
			String response = "Error. Cannot divide by zero.";
			return response;
		}
		else {
			int result = a / b;
			String answer = Integer.toString(result);
			return answer;
		}
	}
}
