
public class Car_Payment {
	
	private int down_payment;
	private int loan_duration;
	private double interest_rate;
	private int total_cost;
	private int amount_borrowed;
	private double monthly_payment;
	private double x;
	private double y;
	
	public Car_Payment() {}
	
	public double monthly_payment() {
		
		this.amount_borrowed = this.total_cost - this.down_payment;
		this.x = (this.interest_rate/12) * this.amount_borrowed;
		this.y = 1 - (1 / (Math.pow((1 + (this.interest_rate / 12)), this.loan_duration)));
		this.monthly_payment = (this.x / this.y);
		return Math.round(this.monthly_payment*100)/100.0;
	}
	public double total_interest() {
		
		return Math.round((this.monthly_payment * this.loan_duration)*100)/100.0;
	}

	public void setDown_payment(int down_payment) {
		this.down_payment = down_payment;
	}

	public void setLoan_duration(int loan_duration) {
		this.loan_duration = loan_duration;
	}

	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
}
