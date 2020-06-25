enum Item{
    Apple("01", "りんご", 100, "リンゴ"),
    Orange("02", "みかん", 40, "フルーツ"),
    Berry("03", "ぶどう", 150, "フルーツ"),
    GlueValue("04", "のり弁", 350, "弁当"),
    SalmonValue("05", "しゃけ弁",400, "弁当"),
    Cigarette("06", "タバコ", 420, "タバコ"),
    MentholSgarettes("07", "メンソールタバコ", 440, "タバコ"),
    Lighter("08", "ライター", 100, "ライター"),
    GreenTea("09", "お茶", 80, "飲み物"),
    Coffee("10", "コーヒー", 100, "飲み物");

    private String id;
    private String name;
    private int price;
    private String category;

    Item(String id. String name, int price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @override
    public String toString(){
        return "ID: " + id + ", " + "Name: " + name + ", " + "Price: " + price + ", " + "Category: " + category;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public String getCategory(){
        return this.category;
    }

    public int getPrice(){
        return this.price;
    }

    public static Item getById(String id){
        for(Item item : Item.values()){
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
}