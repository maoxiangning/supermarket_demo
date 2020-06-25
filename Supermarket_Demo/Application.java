import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Application{
    public static void main(String[] args){
        
        // state shoppingBag
        ShoppingBag shoppingBag = new ShoppingBag();

        // show product list
        System.out.println("Welcome!¥n");
        System.out.println("| Product ID | Product Name | Product Price |");
        System.out.println("---------------------------------------------");

        for(Item item : Item.values()){
            System.out.println("|     " + item.getId() + "     |     " + item.getName() + "     |      " + item.getPrice() + "      |");
        }
        boolean isContinue = true;
        while(isContinue){
            Scanner scannerIsContinue = new Scanner(System.in);
            System.out.println("購入商品番号を入力してください！：");
            String id = scannerIsContinue.nextLine();
            System.out.println("購入商品の個数を入力してください！：");
            int quantity = scannerIsContinue.nextInt();
            shoppingBag.setProduct(id, quantity);
            isContinue = isDone();
        }

        // show details of shoppingBag
        shoppingBag.printProduct();
        TotalPriceCases tpc = new TotalPriceCases();
        tpc.totalPriceCases(shoppingBag);

    }

    public static boolean isDone(){
        Scanner scannerIsDone = new Scanner(System.in);
        boolean done = false;
        System.out.print("¥n買い物続きますか? (y/n) => ");
        String result = scannerIsDone.nextLine();
        return result.equals("y");
    }
}