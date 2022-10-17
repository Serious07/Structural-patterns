package facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.mult("10", "10"));
        System.out.println(bins.sum("1", "1"));
    }
}
