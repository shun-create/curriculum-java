package check;
import constants.Constants;

public class Check {
	private static String firstName = "Miyahara";
	private static String lastName = "Shun";

	public static void main(String[] args) {
		Pet x = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet y = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);

		printName();
		x.introduce();
		y.introduce();
	}

	public static void printName() {
		System.out.println("printNameメゾット → " + firstName + lastName);
	}
}
