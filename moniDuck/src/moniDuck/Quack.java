package moniDuck;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("会呱呱叫");
	}
}
