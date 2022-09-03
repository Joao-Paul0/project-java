import java.util.*;

public class ExemploDoisHashMap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Map<String, infopessoa> caracteristicas = new HashMap<String, infopessoa>();

		System.out.print("Enter your name: ");
		String name = input.nextLine();

		System.out.print("Enter your weight: ");
		Double weight = Double.parseDouble(input.nextLine());

		System.out.print("Enter your age: ");
		Integer age = Integer.parseInt(input.nextLine());

		System.out.print("Enter you height: ");
		Double height = Double.parseDouble(input.nextLine());

		caracteristicas.put(name, new infopessoa(age, weight, height));

		System.out.print(caracteristicas);

	}

}

class infopessoa {

	Integer age;
	Double weight, height;

	public infopessoa(Integer age, Double weight, Double height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public String toString() {
		return "\nAge: " + age + "\nWeigh: " + weight + "\nHeight: " + height;
	}
}
