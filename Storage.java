package app;


//The Storage class provides generic way to store single item.
// <T> the type of item to be stored.

public class Storage<T> {

    //item to be stored
    private T s;
     //Constructs a new instance of the Storage class.
     // s the item to be stored.
    public Storage(T s) {
        this.s = s;
    }

    //Retrieves item.
    //return the stored item.
    public T getData() {
        return this.s;
    }

    //demonstrates storage class usage
    public static void main(String[] args) {
        Storage<String> storage1 = new Storage<String>("Mark Reha");
        System.out.println("This is the data: " + storage1.getData());

        Storage<Integer> storage2 = new Storage<Integer>(0); // I've added a sample integer value here.
        System.out.println("This is the data: " + storage2.getData());
    }
}