package ObjectPackage;

import MyPackage.Stock;
public class StockDemo {
	public static void main(String[] args) {
        Stock stock = new Stock("GOOGL", "Alphabet Inc.");
        stock.setPreviousClosingPrice(1500.00);
        stock.setCurrentPrice(1550.00);

        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}
