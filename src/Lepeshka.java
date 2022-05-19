public class  Lepeshka extends Bread{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    void drawPrints(){
        System.out.println("Нанесли узоры!");
    }

    @Override
    public String toString() {
        return "Lepeshka \n" +
                "radius = " + radius ;
    }

    void varnish(){
        System.out.println("Лакирован!");
    }
    void fake(){
        System.out.println("Подделка!");
    }
}
