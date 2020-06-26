import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Shop{
    private ShoppingBag shoppingBag;

    public Shop(){
        ShoppingBag shoppingBag = new ShoppingBag();
    }

    public void startShopping(){
        System.out.println("いらっしゃいませ！¥n");
        System.out.println("| 商品番号 | 商品名 |");
        System.out.println("-------------------");
        for(Item item : Item.values()){
            System.out.println("| " + item.getId() + " | " + item.getEmoji() + " " + item.getName() + "(" + item.getPrice() + "円)");
        }
        System.out.println("-------------------¥n");

        boolean isContinue = true;
        while(isContinue){
            Scanner scanner_isContinue = new Scanner(System.in);
            System.out.println("購入商品番号を入力してください！：");
            String id = scanner_isContinue.nextLine();
            System.out.println("購入商品の個数を入力してください！：");
            int quantity = scanner_isContinue.nextInt();
            try{
                shoppingBag.setProduct(id ,quantity);
            }catch (InputNumberException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("数値を入力してください！");
            }
            isContinue = isDone();
        }

        shoppingBag.printProduct;
        Omake omake = new Omake();
        omake.omakeQuantity(shoppingBag);

        TotalPrice total = new TotalPrice();
        total.totalAmount(ShoppingBag);

        System.out.println("¥nありがとうございました！");
    }

    public static boolean isDone(){
        Scanner scanner_isDone = new Scanner(System.in);
        boolean done = true;
        System.out.print("¥n買い物続きますか？ [y/n] ==> ¥n");
        String result = scanner_isDone.nextLine();
        return result.equals("y");
    }
}