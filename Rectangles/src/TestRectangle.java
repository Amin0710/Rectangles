import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestRectangle {

	public static void main(String[] args) throws IOException {
		// creating instance of buffered reader
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// list for rectangles
		List<Rectangle> rectangles = new ArrayList<Rectangle>();

		// showing the menu
		System.out.println("## Rectangle Program ##");
		while (true) {
			System.out.println("\n1. Enter rectangle details");
			System.out.println("2. Show all rectangles");
			System.out.println("3. Exit program");

			// reading the choice to continue
			String choice = bufferedReader.readLine().trim();

			if (choice.equals("1")) {
				try {
					// reading the length and width
					System.out.print("Enter the length in centimetres: ");
					float length = Float.parseFloat(bufferedReader.readLine());

					if (length <= 0) {
						System.out.println("Length should not be zero or negative.");
						continue;
					}

					System.out.print("Enter the width in centimetres: ");
					float width = Float.parseFloat(bufferedReader.readLine());

					if (width <= 0) {
						System.out.println("Width should not be zero or negative.");
						continue;
					}

					rectangles.add(new Rectangle(length, width));
					System.out.println("\nRectangle Added Successfully!");

				} catch (NumberFormatException e) {
					System.out.println("Inputs should not be non-numberic.");
				}

			} else if (choice.equals("2")) {

				// checking the list is empty or not
				if (rectangles.size() > 0) {
					// sorting the list and displaying
					Collections.sort(rectangles);
					for (Rectangle rectangle : rectangles)
						System.out.println(rectangle);

				} else {
					System.out.println("No Rectangles Found!");
				}

			} else if (choice.equals("3")) {
				// terminating the application
				System.out.println("Application Terminated!");
				break;

			} else {
				// handling invalid inputs
				System.out.println("Invalid Option! Try Again!");
			}
		}

	}

}
