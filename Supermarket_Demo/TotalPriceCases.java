import java.util.Map;
import java.util.HashMap;

public class TotalPrice{
    private final int PRODUCT_TAX = 8;
    private int total;
    private int totalDiscount;
    private int cigaretteTotalPrice;
    private int appleQuantity;
    private int salesOfApple;
    private int bentouQuantity;
    private int drinkQuantity;
    private int salesOfFood;

    public TotalPrice(){
        this.total = 0;
        this.totalDiscount = 0;
        this.cigaretteTotalPrice = 0;
    }

    // calculate total price
    public void totalPriceCases(ShoppingBag shoppingBag){
        int total = 0;
        int appleQuantity = 0;
        int appleTotalPrice = 0;
        int cigaretteTotalPrice= 0;

    }
}