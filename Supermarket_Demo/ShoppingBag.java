import java.util.ArrayList;
import java.util.List;

public class ShoppingBag{
    private String id;
    private int quantity;
    private List<Item> shopppingBagList;

    public ShoppingBag(){
        shoppingBagList = new ArrayList<>();
        // this code may not work
        // this.shoppingBagList = shoppingBagList;
    }

    // set products
    public void setProduct(String id, int quantity){
        if(id.equals("")){
            System.out.println("商品番号が入力必須項目です。");
        }else{
            Item item = Item.getById(id);
            if(item == null){
                System.out.println("商品番号の商品を取り扱っていません。");
            }else{
                for(int i = 0; i < quantity; i++){
                    shoppingBagList.add(item);
                }
            }
        }
    }

    // output products
    public void printProduct(){
        for(Item item : shoppingBagList){
            System.out.println(item);
        }
    }

    // get shoppingBagList
    public List<Item> getShoppingBagList(){
        return shoppingBagList;
    }
}