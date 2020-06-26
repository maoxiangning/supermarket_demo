/*
    おまけの数を計算
    何個でおまけを渡すか指定
    タバコ岳ライターもおまけに加える
*/

import java.util.Mao;
import java.util.HashMap;

public class Omake{
    private int omakeNum = 10;
    private Map<Item, Integer> omakeMap;
    
    public Omake(){
        this.omakeMap = new HashMap<>();
    }

    public void omakeQuantity(ShoppingBag shoppingBag){
        for(Map.Entry<Item, Integer> entry:shoppingBag.getShoppingMap().entrySet()){
            omakeMap.put(entry.getKey(),(int)(entry.getValue() / omakeNum));
        }

        for(Map.Entry<Item, Integer> entry : omakeMap.entrySet()){
            if(entry.getValue() != 0){
                Item item = entry.getKey();
                System.out.println(item.getEmoji() + " " + item.getName() + "を" + entry.getValue() + "個おまけします");

                if(item.getCategory().equals("タバコ")){
                    System.out.println("ライターを" + entry.getValue + "個おまけします");
                }
            }
        }
    }

}