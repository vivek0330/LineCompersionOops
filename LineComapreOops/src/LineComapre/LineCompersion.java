package LineComapre;

public class LineCompersion {

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public LineCompersion(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	static void compareTo(int length1, int length2) {
		if (length1 == length2)
			System.out.println("length 1 is equal to length 2");
		else if (length1 > length2)
			System.out.println("length 1 is greater than length 2");
		else
			System.out.println("length 2 is greater than length 1");
	}

	static double calculate_length(LineCompersion obj) {
		double length = Math.sqrt(Math.pow(obj.x2 - obj.x1, 2) + Math.pow(obj.y2 - obj.y1, 2));
		return length;
	}

	public static void main(String[] args) {
		LineCompersion line1 = new LineCompersion(5, 3, 3, 4);
		LineCompersion line2 = new LineCompersion(8, 3, 3, 4);
		int length1 = (int) calculate_length(line1);
		int length2 = (int) calculate_length(line2);
		System.out.println("length 1: " + length1);
		System.out.println("length 2: " + length2);
		compareTo(length1, length2);
	}

}
