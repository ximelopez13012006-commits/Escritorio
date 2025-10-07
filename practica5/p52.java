public class p52{
    public static int factorial(int numero){
        if (numero ==0){
            return 1;
        }else {
            return numero * factorial( numero-1);
        }
    
    }
    public static void main (String [] args) {
int numero =5;
int resultado = factorial( numero );
System.out.println("El factorial de " + numero + "es:"+ resultado);

    }
    
}