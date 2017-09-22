package com.impl.shi;

public class HelloSpeaker implements IHello{

	public void HellogetNewbie(Object obj) {
		System.out.println("调用了HellogetNewbie()方法。。。。。。"+obj);
	}

	public void HellosetMaster(Object obj) {
		System.out.println("调用了HellosetMaster()方法。。。。。。"+obj);
	}

}
