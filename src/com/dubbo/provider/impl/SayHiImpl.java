package com.dubbo.provider.impl;

import com.dubbo.provider.SayHi;

public class SayHiImpl implements SayHi {

	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return "Hi,"+name+"!";
	}

}
