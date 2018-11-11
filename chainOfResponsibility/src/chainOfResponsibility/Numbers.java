package chainOfResponsibility;

public class Numbers {
	
	private double num1, num2;
	private String calculationWanted;
	
	public Numbers(double num1, double num2, String calculationWanted) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.calculationWanted = calculationWanted;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}

	public String getCalculationWanted() {
		return calculationWanted;
	}
	
}
