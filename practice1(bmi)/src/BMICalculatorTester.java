
public class BMICalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMICalculator bmiCalculator = new BMICalculator(75.5, 175.5);
		bmiCalculator.calculateBMI();
		
		System.out.println("The height input:"+ bmiCalculator.getheight()+ " cm.");
		System.out.println("The weight input:"+ bmiCalculator.getweight()+ " kg.");
		System.out.println(bmiCalculator.getSensibleBMIMessage());

}
}
