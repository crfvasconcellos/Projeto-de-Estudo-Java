import java.util.Locale;

public class MainProduct {
    public static void main(String[] args) {

        Product produtos = new Product();
        Locale.setDefault(Locale.US);
        produtos.setData();
        produtos.showData();

        produtos.addProducts();

        produtos.removeProducts();



    }
}
