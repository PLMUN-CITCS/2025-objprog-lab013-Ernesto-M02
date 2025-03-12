public class ParametersAndArguments {
    public static void main(String[] args) {
        // Declare Variables
        int roomWidth = 10;
        int roomHeight = 15;

        // Call calculateArea
        int area = calculateArea(roomWidth, roomHeight);

        // Print the Result
        System.out.println("The calculated area is: " + area);
    }

    // Create the calculateArea Method
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }
}