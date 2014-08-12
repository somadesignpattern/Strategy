package com.java.strategy;

public class Hand {
	public static final int HANDVALUE_MUK = 0;
	public static final int HANDVALUE_CHI = 1;
	public static final int HANDVALUE_BBA = 2;

	public static final Hand[] hand = {
		new Hand(HANDVALUE_MUK),
		new Hand(HANDVALUE_CHI),
		new Hand(HANDVALUE_BBA)
	};
	
	private static final String[] name = {
		"주먹", "가위", "보"
	};
	
	private int handvalue;
	
	private Hand(int handvalue){
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int handvalue){
		return hand[handvalue];
	}
	
	public boolean isStrongerThan(Hand h){
		return fight(h) == 1;
	}
	
	public boolean isWeakerThan(Hand h){
		return fight(h) == -1;
	}
	
	private int fight(Hand h){
		if(this == h){	//비기는 경우
			return 0;
		}else if( (this.handvalue + 1) % 3 == h.handvalue){	//이기는 경우
			return 1;
		}else{	//지는 경우
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return name[handvalue];
	}
}
