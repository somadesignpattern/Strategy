package com.headfirst.strategy.old;


public class Strategy{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new RedHeadDuck();
		//duck.setFlyBehavior(new FlyWithWings());
		duck.fly();
	}
}

class Duck {
	void quack(){
		
	}
	
	void swim(){
		
	}
	
	void display() {
		
	}
	
	/* 새로 추*/
	void fly(){
		
	}
}

class MallardDuck extends Duck{
	@Override
	void display(){
		// 적당하게...
	}
	

}

class RedHeadDuck extends Duck{
	@Override
	void display(){
		// Red 적당하게...
	}
	
	// not fly.....
}

class RubberDuck extends Duck{
	@Override
	void quack(){
		
	}
	
	
	@Override
	void display(){
		// Red 적당하게...
	}
}