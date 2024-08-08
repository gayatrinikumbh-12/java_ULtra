package Control_structures;

public class CastingConnoisseur {

	public static void main(String[] args) {

		double var_d = 98.56;
		int var_i = 45;

		int After_var_i;
		double After_var_d;
		After_var_i = (int) var_d;
		After_var_d = var_i;

		System.out.println("var before INT " + var_i);
		System.out.println("var before double " + var_d);

		System.out.println("var after INT " + After_var_i);
		System.out.println("var after double " + After_var_d);
	}

}
