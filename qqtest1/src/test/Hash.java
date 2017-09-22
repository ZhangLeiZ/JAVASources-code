package test;

import java.util.Hashtable;

public class Hash {
	public static void main(String[] args) {
		Hashtable<String, te>a=new Hashtable<String, te>();
		te o1=new te("1001","华为手机",3000,"江西赣州");
		te o2=new te("1002","万科地产",4000,"上海");
		te o3=new te("1003","腾讯科技",4500,"广东深圳");
		te o4=new te("1004","阿里巴巴",3800,"浙江杭州");
		a.put("1001", o1);
		a.put("1002", o2);
		a.put("1003", o3);
		a.put("1004", o4);
	}
}
