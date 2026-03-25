package taxes;

public class Emptaxes {
	
	public Double grossSalary, tax, percentage;
	public String name;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary() {
		return grossSalary+ (grossSalary/100 * percentage);
	}
}
