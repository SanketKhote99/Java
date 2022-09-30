package Random;
public class Tabnine {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	Tabnine()
	{
		roll_no = last_roll;
		last_roll++;
	}

	// Overriding hashCode()
	@Override public int hashCode() { return roll_no; }

	// Driver code
	public static void main(String args[])
	{
		Tabnine s = new Tabnine();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}
}
