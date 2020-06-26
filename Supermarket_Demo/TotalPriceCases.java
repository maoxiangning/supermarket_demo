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
        this.appleQuantity = 0;
        this.salesOfApple = 0;
        this.bentouQuantity = 0;
        this.drinkQuantity = 0;
        this.saleOfFood = 0;
    }

    public void totalAmount(ShoppingBag shoppingBag){
        for(Map.Entry<Item, Integer> entry : shoppingBag.getShoppingBag().entrySet()){
            if(entry.getKey().getCategory().equals("タバコ")){
                cigaretteTotalPrice += entry.getKey().getPrice() * entry.getValue();
            }else{
                total += entry.getKey().getPrice() * entry.getValue();
            }
            if(entry.getKey().getCategory().equals("リンゴ")){
                appleQuantity = entry.getValue();
            }
            if(entry.getKey().getCategory().equals("弁当")){
                bentouQuantity = entry.getValue();
            }
            if(entry.getKey().getCategory().equals("飲み物")){
                drinkQuantity = entry.getValue();
            }
        }
    }    

    int numAppleSet = appleQuantity / 3;
    salesOfApple = 20 * numAppleSet;
    if(numAppleSet != 0){
        System.out.println("りんごの値引き金額は" + salesOfApple + "えんです！");
    }

    int numSetFood = Math.min(bentouQuantity, drinkQuantity);
    saleOfFood = 20 * numSetFood;
    if(numSetFood != 0){
        System.out.println("弁当と飲み物の値引き金額は" + saleOfFood + "円です");
    }

    totalDiscount = (total - saleOfFood - salesOfApple) * (100 + PRODUCT_TAX) / 100 + cigaretteTotalPrice;

    System.out.println("¥n----------------------------------");
    System.out.println("合計金額は" + totalDiscount + "円です💰");
    System.out.println("------------------------------------¥n");

    }
}