package Test_vag;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void totalAmount() {
		String product[]= {"Leather wallet", "Umbrella", "Cigarette", "Honey"};
		int price[]= {1100,900,200,100};
		int gst[]= {18,12,28,0};
		int quantity[]= {1,4,3,2};
		int totalprice=0;

		for (int i = 0; i < product.length; i++) {
			totalprice+=((price[i]*gst[i]/100)+price[i])*quantity[i];
		}
		System.out.println(totalprice);
	}
}
