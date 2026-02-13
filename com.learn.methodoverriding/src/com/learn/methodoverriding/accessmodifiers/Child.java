package com.learn.methodoverriding.accessmodifiers;

public class Child extends Parent {

	@Override
//	void display() {
	
//	Rull 1
//	if parent class method  having access modifiers 
//	then child class overriden method must  have same access modifiers 
//	
	public void display() {
		
		
//		Rull 2
		
//		IF parent class method and child overriden method wants to have different access modifiers 
//		Then it is possible provided, child class overridden method is having more accessible access modifier.
		
//		Means we can increase the visibility in method overriding but we can not reduce the visibility in method overriding
		
	System.out.println("Inside Child display");
	}
	
}
