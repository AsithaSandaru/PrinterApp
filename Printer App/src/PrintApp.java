
public class PrintApp {

	public static void main(String[] args) {
		String Creator = "Asitha";
		int number1 = 11;
		int number2 = 2;
		int multiplication = number1*number2;
		int addition = number1+number2;
		int subs = number1-number2;
		double divi = (double) number1;
		double divi2 = (double) number2;
		double division= (double) number1/(double) number2;
		System.out.println("This app is made by:"+Creator);
		//System.out.println(number1);
		System.out.println("Number 1 is "+number1);
		System.out.println("Number 1 is "+number2);
		System.out.println(number1+"* "+number2+"="+multiplication);
		System.out.println(number1+"+ "+number2+"="+addition);
		System.out.println(divi+"/ "+divi2+"="+division);
		System.out.println(number1+"- "+number2+"="+subs);
	}

}
