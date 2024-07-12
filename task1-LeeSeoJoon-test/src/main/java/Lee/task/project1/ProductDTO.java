package Lee.task.project1;

public class ProductDTO {

    private String name;
    private String brand;
    private int tag;
    private int price;

    public ProductDTO(String name, String brand, int tag, int price) {
        this.name = name;
        this.brand = brand;
        this.tag = tag;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", tag=" + tag +
                ", price=" + price +
                '}';
    }
}
