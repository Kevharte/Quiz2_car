import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Car_Payment_test {

	@Test
	void test() {
		Car_Payment new_car = new Car_Payment();
		new_car.setTotal_cost(35000);
		new_car.setDown_payment(10000);
		new_car.setInterest_rate(.08);
		new_car.setLoan_duration(60);
		System.out.println("Monthly payment is: " + new_car.monthly_payment());
		System.out.println("Total intrest to be paid is: " + new_car.total_interest());
		//Result should be 506.91 and 30414.59
	}

}
