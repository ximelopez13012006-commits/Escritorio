package practica5;

public class p51 {
    public static void saludo (String mensaje, int numero){
        if (numero <=10){
            System.out.println(numero + " "+ mensaje);
            saludo (mensaje+ "_" , numero + 1);

        }else {
            System.out.println("Fin de la recursividad");
        }
    }

    public static void main(String[] args) {
        saludo( "_", 1);
    }
}