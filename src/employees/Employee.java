package employees;
import java.util.Scanner;
import taxes.Emptaxes;

public class Employee {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Emptaxes emptaxes = new Emptaxes();
	
		
		System.out.println("nome: ");
			emptaxes.name = sc.nextLine(); 
		System.out.println("salario bruto: ");
			emptaxes.grossSalary = sc.nextDouble(); 
		System.out.println("imposto: ");
			emptaxes.tax = sc.nextDouble(); 

		System.out.println("Funcionario: " + emptaxes.name + ", " + emptaxes.netSalary());
		
		System.out.println("qual porcentagem de aumento?: ");
		emptaxes.percentage = sc.nextDouble(); 
		
		System.out.println("dados atualizados: " + emptaxes.name + ", " + emptaxes.increaseSalary());
		
		
		
	
		
		
		
		
		
		
		sc.close();
	}
}
