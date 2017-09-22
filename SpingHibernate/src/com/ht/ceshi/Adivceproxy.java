package com.ht.ceshi;

import com.aop.IHaivace;
import com.impl.shi.WebApplicationContextUilt;

public class Adivceproxy {
	public static void main(String[] args) throws Throwable {
		IHaivace iHai = (IHaivace)WebApplicationContextUilt.XmlCreateService("adivceproxy");
		iHai.add("小明");
	}
}
