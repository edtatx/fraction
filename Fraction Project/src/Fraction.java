
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		if (this.denominator == 0) {
			System.out.println("Illegal value for denominator");
		}
		if (this.denominator < 0){
			this.numerator = numerator * -1;
			this.denominator = Math.abs(denominator);
		}
	}
	
	public Fraction (int numerator){
		this.numerator = numerator;
		this.denominator = 1;	
	}
	
	public Fraction () {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public int getNumerator () {
		return this.numerator;
	}
	
	public int getDenominator () {
		return this.denominator;
	}
	
	public String toString () {
		return Integer.toString(this.numerator)+"/"+Integer.toString(this.denominator);
	}
	
	public Double toDouble() {
		return (double) this.numerator / (double) this.denominator;
	}
	
	
}
