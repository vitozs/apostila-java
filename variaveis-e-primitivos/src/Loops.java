public class Loops {
    public static void imprimir150a300(){
        for(int i=150; i<=300; i++){
            System.out.println(i);
        }
    }

    public static void imprimir1a1000(){
        for(int i=1; i<=1000; i++){
            System.out.println(i);
        }
    }
    public static void imprimirMultiplosDe3(){
        for(int i=1;  i<=100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    public static void fatorial(){
        long fat = 1;
        for(int i=1; i<=10; i++){
            fat *= i;
            System.out.println(fat);
        }
    }
}
