package com.ht.ceshi;

import com.impl.shi.IHello;
import com.impl.shi.WebApplicationContextUilt;

public class NameMathod {

	public static void main(String[] args) {
		IHello ihell = (IHello)WebApplicationContextUilt.XmlCreateService("hellospeaker");
		ihell.HellogetNewbie("你好！");
		
	}
}
