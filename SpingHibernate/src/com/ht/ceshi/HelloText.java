package com.ht.ceshi;

import com.impl.shi.IHello;
import com.impl.shi.WebApplicationContextUilt;

public class HelloText {

	public static void main(String[] args) {
		IHello ihello= (IHello)WebApplicationContextUilt.XmlCreateService("some");
		ihello.HellogetNewbie("下密码");
		ihello.HellosetMaster("第三个");
//		  ApplicationContext context =
//              new ClassPathXmlApplicationContext(
//                      "applicationContext.xml");
//     
//      Some some = (Some) context.getBean("some");
//     
//      if(args.length > 0 && "run".equals(args[0])) {
//          some.helloEverybody();
//      }
//      else {
//          some.hello();
//      }
  }
}

