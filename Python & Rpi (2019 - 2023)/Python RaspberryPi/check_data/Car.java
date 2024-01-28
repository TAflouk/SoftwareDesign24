//package lectures;

public class Car {
	void brand() {
		System.out.print("the brand is Toyota");
		}
	public static void main(String [] args){
		Car camry = new Car();
		Car landcruiser = new Car();
		Car corola = new Car();
		Car charger = new Car() {
			@Override
			void brand() {
				//super.brand();
				System.out.println(" the brand is Dodge");
			}
		};
		camry.brand();
		landcruiser.brand();
		corola.brand();
		charger.brand();


	}
}

