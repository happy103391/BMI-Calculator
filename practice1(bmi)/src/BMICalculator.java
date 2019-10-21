import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.PrinterLocation;

public class BMICalculator {
	double weight;
	double height;
	double BMI;
	double result;
	
	public BMICalculator(double weight,double height) {
		this.height = height;
		this.weight = weight;
	}
	
	public void calculateBMI() {
		//double BMI = Math.round(Math.pow(Math.round(height/100),2)/weight);
		double oh = weight / Math.pow(height/100, 2);
	    this.BMI = oh;
	    		//Math.round(oh);
	}
	public double getweight() {
		return weight;
	}
	public double getheight() {
		return height;
	}
	public double getBMI() {
		return BMI;
	}
	public String getSensibleBMIMessage() {
		String answer1 = "Your BMI is：";
		double answer2 = getBMI();
		return answer1 + answer2;
	}

}
