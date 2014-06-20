package com.ty.groovy.testwtich;

public enum NetType {
	CMNET(1),CMWAP(2),CTNET(3),CTWAP(4);
	Integer value;
	NetType(int value){
		this.value=value;
	}
}
