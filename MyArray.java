package app;

//MyArray class, demonstrating generic methods.
//generic method printArray which prints any type of array
public class MyArray {

    //generic method that prints all the elements of an array.
    //<E> the type of the elements in the array
    //inputArray an array of type E
    public <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // main method, demonstrates the use of generic printArray
    public static void main(String[] args) {
        // Create arrays of Int, Double, and Char
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        // Instantiate the MyArray class
        MyArray ma = new MyArray();

        // Print each array out
        System.out.println("Array integerArray contains:");
        ma.printArray(intArray);  // pass Int array
        
        System.out.println("\nArray doubleArray contains:");
        ma.printArray(doubleArray);  // pass Double array
        
        System.out.println("\nArray characterArray contains:");
        ma.printArray(charArray);  // pass Char array
    }
}