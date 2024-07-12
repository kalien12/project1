package Lee.task.project1;

import java.util.*;



public class ProductManager {

    private List<ProductDTO> products = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addProduct(String name, String brand, int tag, int price) {

        ProductDTO product = new ProductDTO(name, brand, tag, price);
        products.add(product);
        System.out.println("[Add] Product added : " + product);

    }

    public void searchProduct(int tag) {
        if (products.isEmpty()) {
            System.out.println("No products are being shown...");
        } else {
            for (ProductDTO product : products) {
                System.out.println(product);
            }
        }
    }

    public void changeProduct(int tag, String newName, String newBrand, int newPrice) {
        for (ProductDTO product : products) {
            if (product.getTag() == tag) {

                System.out.println("Input your new name to change : ");
                String name = sc.nextLine();
                System.out.println("Input your new brand to change : ");
                String brand = sc.nextLine();
                System.out.println("Input your new price to change : ");
                int price = sc.nextInt();

                product.setName(name);
                product.setBrand(brand);
                product.setPrice(price);
                System.out.println("Product is changed correctly" + product);

                return;

            }
        }
        System.out.println("Product is not able to find, Try again!");
    }

    public void deleteProduct(int tag) {

        Iterator<ProductDTO> iterator = products.iterator();

        while (iterator.hasNext()) {
            ProductDTO product = iterator.next();
            if (product.getTag() == tag) {
                iterator.remove();
                System.out.println("Product removed: " + product);
                return;
            }
        }
        System.out.println("Product is not able to find, Try again!");
    }


}
