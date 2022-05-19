public class Bread {
    private int price;
    private double weight;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bread  \n" +
                "price = " + price + "\n"+
                "weight = " + weight;
    }

    void bake(){
        System.out.println("Хлеб готов!");
    }
    void pack(){
        System.out.println("Хлеб упакован!");
    }


}
