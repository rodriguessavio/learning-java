public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock () {

        return quantity * price;

    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product data: " + name + ", $" + price + ", " + quantity + " units, Total: $" + TotalValueInStock ();
    }

    

}
