import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {


        System.out.println("Здравствуйте! Какой хлеб вы предпочитаете?  \n 1)-Хлеб батон  \n 2)-Лепешка  " +
                "\n 3)-Лаваш \n 4)-Французский багет");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a==1) {

            Bread bread = new Bread();
            bread.setWeight(0.400);
            bread.setPrice(10);
            System.out.println(bread);
            bread.bake();
            bread.pack();

            System.out.println("");
        }
        else if(a==2) {
            Lepeshka lepeshka = new Lepeshka();
            lepeshka.setRadius(30);
            lepeshka.setWeight(0.200);
            lepeshka.setPrice(20);
            System.out.println(lepeshka);
            if (lepeshka.getWeight() <= 0) {
                lepeshka.fake();
            } else {
                System.out.println("weight : " + lepeshka.getWeight());
            }
            lepeshka.drawPrints();
            lepeshka.bake();
            lepeshka.varnish();
            System.out.println("price : 2"+lepeshka.getPrice());


            System.out.println("");
        }
        else if(a==3) {
            Lavash lavash = new Lavash();
            lavash.setName("Элитный лаваш из Дилижана");
            lavash.setPrice(15);
            System.out.println(lavash);
            lavash.bake();
            lavash.zavernut();
            System.out.println("price : "+lavash.getPrice());

            System.out.println("");
        }
        else if(a==4) {
            Baget baget = new Baget();
            baget.setName("Провансальский багет");
            baget.setLength(40);
            baget.setPrice(35);
            baget.setCountOfSliced(5);
            System.out.println(baget);
            baget.rubcevat();
            baget.pack();
            System.out.println("price: "+baget.getPrice());
        }
        else {
            System.out.println("Извините такого хлеба у нас нет :) Выберите один из вышеуказанных видов");
        }
    }
}
