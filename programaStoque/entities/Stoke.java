package programaStoque.entities;

public class Stoke {
    private String name;
    private double price;
    private int quantity;


    public Stoke() {
    }

    public Stoke(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int addProducts(int products){
        return quantity+=quantity;
    }
    public int removeProducts(int quantityRemove){
        return  quantity =quantity-quantityRemove;
    }

    @Override
    public String toString() {
        return "Stoke" +
                "Produto " + name + '\'' +
                ", R$" + price +
                ", Quantidade in stock=" + quantity +
                '}';
    }
}
