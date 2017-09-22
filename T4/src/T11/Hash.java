package T11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;





public class Hash {

	public static void main(String[] args) {
	 Hashtable<String, Orders2> ha = new Hashtable<String, Orders2>();	
	 Orders2 ord1 = new Orders2("2001","OPPOA3",2430,"忽见地上一钱包");
	 Orders2 ord2 = new Orders2("2002","OPPOR9",2500,"忽见一钱包");
	 Orders2 ord3 = new Orders2("2003","OPPO2",2400,"忽见地上一钱包");
	 Orders2 ord4 = new Orders2("2004","OPPOA7",2130,"忽见地钱包");
	 Orders2 ord5 = new Orders2("2005","OPPOA5",1230,"忽见地上一钱包");
	 ha.put("2001", ord1);
	 ha.put("2002", ord2);
	 ha.put("2003", ord3);
	 ha.put("2004", ord4);
	 ha.put("2005", ord5);
	 Set<String> orr = ha.keySet();
	 System.out.println("kay集合中的元素："+orr);
	 Iterator<String> it =orr.iterator();
	
	 while(it.hasNext()){
		
		 String key = (String)it.next();
		 System.out.println("元素"+key);
			Orders2 ord = ha.get(key);
		
			System.out.println("订单ID："+ord.getOrderId()+"订单名称："+ord.getOrderName()+"订单价格："+ord.getPrice()+"订单地址："+ord.getAddress());
	 }
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 list.add(2);
	 list.add(3);
	 list.add(4);
	 list.add(6);
	 list.add(5);
	 list.add(1);
	 Collections.sort(list);
	 for(int i=0;i<list.size();i++){
		 System.out.println("元素："+list.get(i));
	 }
	
	}
}
