package com.headfirst.strategy.pattern;


public class Strategy{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new RedHeadDuck();
		duck.setFlyBehavior(new FlyWithWings());
		duck.fly();
	}
}

class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior behavior){
		flyBehavior = behavior;
	}
	
	public void setQuackBehavior(QuackBehavior behavior){
		quackBehavior = behavior;
	}
	
	public void quack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		
	}
	
	public void display() {
		
	}
	
	/* 새로 추*/
	public void fly(){
		flyBehavior.fly();
	}
}

class MallardDuck extends Duck{
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display(){
		// 적당하게...
	}

}

class RedHeadDuck extends Duck{
	
	public RedHeadDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	
	@Override
	public void display(){
		// Red 적당하게...
	}
	
	// not fly.....
}

class RubberDuck extends Duck{
	@Override
	public void quack(){
		
	}
	
	
	@Override
	public void display(){
		// Red 적당하게...
	}
}


interface FlyBehavior {
	public void fly();
}
class FlyWithWings implements FlyBehavior{
	public void fly(){
		// 날개로 
	}
}

class FlyNoWay implements FlyBehavior{
	public void fly(){
		// 아무것도 안함.. 
	}
}


interface QuackBehavior{
	public void quack();
}

class Quack implements QuackBehavior{
	public void quack(){
		// 꽥꽥 
	}
}

class Squeak implements QuackBehavior{
	public void quack(){
		// 꽥꽥 
	}
}