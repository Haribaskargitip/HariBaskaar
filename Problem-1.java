import java.util.Scanner;
public class Calculator {
	
	double a;
	double b;
	String operation;
	
	public Calculator(double a, double b, String operation) {
		this.a = a;
		this.b = b;
		this.operation = operation;
	}
	public double calculate() {
		switch (operation.toLowerCase()){
			case "add":
			case "+":
				return a+b;
			case "substract":
			case "-":
				return a-b;
			case "multiply":
			case "*":
				return a*b;
			case "divide":
			case "/":
				if(b==0) {
					System.out.println("Erro: Division by zero");
					return 0;
				}
				return a/b;
				default:
					System.out.println("Invalid operation!");
					return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a=sc.nextInt();
		System.out.println("Enter value of b:");
		double b=sc.nextInt();
		System.out.println("Enter operation type");
		String op=sc.next();
		Calculator calc=new Calculator(a,b,op);
		double result=calc.calculate();
		System.out.println("Result:"+result);
		sc.close();
	}
}
