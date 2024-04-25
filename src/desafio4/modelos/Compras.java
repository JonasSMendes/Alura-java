package desafio4.modelos;

public class Compras {

    private String name;

    private int price;

    public Compras(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return  name + " - " + price + "R$";
    }
}
