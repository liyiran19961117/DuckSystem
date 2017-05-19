package moniDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.setQuackBehavior(new Quack());
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();
	}
}
