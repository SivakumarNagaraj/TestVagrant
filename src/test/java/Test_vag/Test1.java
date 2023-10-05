package Test_vag;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void maxGSTamount() {
		String product[]= {"Leather wallet", "Umbrella", "Cigarette", "Honey"};
		int price[]= {1100,900,200,100};
		int gst[]= {18,12,28,0};
		int quantity[]= {1,4,3,2};
		int maxgst=0;
		String gstproduct = null;
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();

		for (int i = 0; i < quantity.length; i++) {
			int maxgstamount=(price[i]*gst[i]/100)*quantity[i];
				map.put(product[i], maxgstamount);
		}
		System.out.println(map);
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			if ( maxgst<entry.getValue() ){
				maxgst=entry.getValue();
				gstproduct=entry.getKey();
			} else {
				continue;
			}
		}
		System.out.println(gstproduct+"--> "+maxgst);
	}
}
