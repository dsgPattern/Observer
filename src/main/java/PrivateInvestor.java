public class PrivateInvestor implements IInvestor {
    private Stock _stock;

    public PrivateInvestor(Stock stock)
    {
        _stock = stock;
        stock.attachInvestor(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + " has been notified that the new stock price is "+_stock.getStockInfo());
    }
}
