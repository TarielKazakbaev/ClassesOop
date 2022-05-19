public class Baget extends Bread {
    private int length;
    private int countOfSliced;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Baget: " +
                name +
                "\nколичество продольных рубцов = " + countOfSliced +
                "\nдлина = " + length ;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCountOfSliced() {
        return countOfSliced;
    }

    public void setCountOfSliced(int countOfSliced) {
        this.countOfSliced = countOfSliced;
    }
    void rubcevat(){
        System.out.println("Рубцевано!");
    }
    void pack(){
        System.out.println("Только в экологический пакет!");
    }
}
