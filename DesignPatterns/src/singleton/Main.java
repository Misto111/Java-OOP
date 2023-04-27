package singleton;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        DbInstance dbInstance = DbInstance.getInstance();
        dbInstance.createTable();

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        start = System.currentTimeMillis();

        DbInstance dbInstanceTwo = DbInstance.getInstance();
        dbInstanceTwo.createTable();
        end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
