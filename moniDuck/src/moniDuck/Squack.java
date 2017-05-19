package moniDuck;

public class Squack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("会吱吱叫");
	}
}
