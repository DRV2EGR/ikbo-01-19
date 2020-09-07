package Furniture;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop myShop = new FurnitureShop(1365.54);

        Bed bed = new Bed(0, 100.0, false, "Beda", 200, 2);
        Chiar chiar = new Chiar(0, 98, true, "Haird", 652.25, 8);
        Shkaf shkaf = new Shkaf(2, 99, false, "---", "USA", 521);

        myShop.add_item(bed);
        myShop.add_item(chiar);
        myShop.add_item(shkaf);

        myShop.list_items();
    }
}
