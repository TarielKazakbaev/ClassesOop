public class Lavash extends Bread {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void zavernut(){
        System.out.println("Завернули!");
    }

    @Override
    public String toString() {
        return "Lavash : " + name  ;
    }

    void bake(){
        System.out.println("Я лаваш меня испекли!");
    }
}
