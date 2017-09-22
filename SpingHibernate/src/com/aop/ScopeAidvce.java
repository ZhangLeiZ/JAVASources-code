package com.aop;

import java.io.IOException;

public class ScopeAidvce implements IHaivace{

	public void add(Object obj)throws Throwable {
		System.out.println("增加"+obj);
	}

	public void del(Object obj) {
		System.out.println("删除"+obj);
		
	}

}
