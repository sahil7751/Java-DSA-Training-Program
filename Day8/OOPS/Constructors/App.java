public class App {
    public static void main(String[] args) {

        HDFC c1 = new HDFC();// Default construtor
        c1.name = "Pankaj";
        c1.AccNo = 101201;
        c1.balance = 500.25;
        c1.PrintCustomerDetails();

        HDFC c2 = new HDFC("Sahil", 85296, 1000500.9);
        c2.PrintCustomerDetails();

        HDFC c3 = new HDFC();
        c3.PrintCustomerDetails();
        
    }
}
