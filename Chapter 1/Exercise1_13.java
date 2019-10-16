class Exercise1_13 {
	public static void main(String[] args) {
		/*
		Author: John Lopez
		Date: 10/08/2019
		
		ax + by = e            ed-				af - ec
		cx + dy = f	   x = ----------      y = ----------
							ad - bc				ad - bc
		*/
		
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + .55y =  5.9");
		System.out.println(" ");
		System.out.println("x = (44.5 * .55) - (50.2 * 5.9)");
		System.out.println("    ---------------------------");
		System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
		System.out.println(" ");
		System.out.println((((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))));
		System.out.println(" ");
		System.out.println("y = (3.4 * 5.9) - (44.5 * 2.1)");
		System.out.println("    --------------------------");
		System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
		System.out.println(" ");
		System.out.println((((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1))));
	}
}