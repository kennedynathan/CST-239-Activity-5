package app;

 //MyNumbersArray class demonstrates use of generic methods for Number types.

public class MyNumberArray {

   
     //generic method that prints elements of Number array.
     //<E> Type of the elements in the array extending Number.
     //inputArray Array of type E to be printed.
    public <E extends Number> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    
     //main method to demonstrate the usage of the generic printArray method.
    public static void main(String[] args) {
        // Create arrays of Int, Double, and Float
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Float[] floatArray = {0.0f, 1.0f, 2.5f, 3.5f};

        //MyNumbersArray class
        MyNumberArray ma = new MyNumberArray();

        // Print arrays
        System.out.println("Array integerArray contains:");
        ma.printArray(intArray);  // Pass Int array

        System.out.println("\nArray doubleArray contains:");
        ma.printArray(doubleArray);  // Pass Double array

        System.out.println("\nArray floatArray contains:");
        ma.printArray(floatArray);  // Pass Float array
    }
}