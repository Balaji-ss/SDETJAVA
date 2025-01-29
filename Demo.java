public static void main(String[] args) {
    
    public class Singleton {
 
    // Private static instance variable to hold the single instance
    private static Singleton instance;
 
    // Private constructor to prevent instantiation
    private Singleton() {
    }
 
    // Public static method to access the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
 
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
 
    // Main method to demonstrate the Singleton pattern
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
}
