package main;

public class Main {

	public static void main(String[] args) {

			try {
				System.out.println(new TimeDuration(3600).toString());
				System.out.println(new TimeDuration(-50).toString());
			} catch (BadBadValueException e) {}

	}

}
