public class Class1 {

	public static void main(String[] args) {
		
		monthsOfYear();
		monthVocation();
		
	}
	//conditional logic avoiding the "efeito flecha" 
	private static void monthsOfYear() {

		int mes = 20;

		if (mes == 1) {
			System.out.println("january");
		} else if (mes == 2) {
			System.out.println("february");
		} else if (mes == 3) {
			System.out.println("march");
		} else if (mes == 4) {
			System.out.println("april");
		} else if (mes == 5) {
			System.out.println("may");
		} else if (mes == 6) { 
			System.out.println("june");
		} else if (mes == 7) {
			System.out.println("july");
		} else if (mes == 8) {
			System.out.println("august");
		} else if (mes == 9) {
			System.out.println("september");
		} else if (mes == 10) {
			System.out.println("october");
		} else if (mes == 11) {
			System.out.println("november");
		} else if (mes == 12) {
			System.out.println("december");
		} else {
			System.out.println("not defined");
		}
	}

	private static void monthVocation() {
		
		String month = "april";
		
		switch (month) {
		case "december":
		case "july":
		case "january":
			System.out.println("vocation");
			break;
		default:
			System.out.println("month of work");
			break;
		}
	}

}
