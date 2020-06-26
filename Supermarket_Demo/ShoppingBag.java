import java.util.Map;
import java.util.HashMap;

public class ShoppingBag{
    private Map<Item, Integer> ShoppingBagMap;

    public ShoppingBag{
        ShoppingBagMap = new HashMap<>();
    }

    public void setProduct(String id, int quantity) throws InputNumberExce@tion, NumberFormatException{
        if(quantity <= 0){
            throw new NumberFormatException("購入商品の個数を正数値を入力してください！");
        }
        if(id.equals("")){
            throw new InputNumberException("商品番号が入力必須項目です！");
        }else{
            Item item = Item.getById(id);
            if(item == null){
                throw new InputNumberException("商品" + id + "番号の商品を取り扱っていません！")
            }else{
                if(shoppingBagMap.containsKey(item)){
                    shoppingBagMap.put(item, shoppingBagMap.get((item) + quantity));
                }else{
                    shoppingBagMap.put(item, quantity);
                }
            }
        }
    }

    public void printProduct(){
        for(Map.Entry<item, Integer> entry : shoppingBagMap.entrySet()){
            System.out.println(entry.getKey().toString() + " : " + entry.getValue() + "個");
        }
    }
    
    public Map<Item, Integer> getShoppingBagMap(){
        return shoppingBagMap;
    }
}