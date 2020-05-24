public class Main {
    public static void main(String[] args){
        AmazonStock amzStock = new AmazonStock("$", 1000);

        PrivateInvestor privateInvestor = new PrivateInvestor(amzStock);
        PublicInvestor publicInvestor = new PublicInvestor(amzStock);

        amzStock.set_price(1001);
        amzStock.set_price(1000);
        amzStock.detachInvestor(publicInvestor);

        amzStock.set_price(1002);
    }
}
