package prac3;

public class MemoriaEstatica {
    private int[] memoria;
    private int contador;

    public MemoriaEstatica(int tamaño){
        memoria = new int [tamaño];
        contador = 0;
    }
    public boolean agregar (int valor){
        if (contador < memoria.length){
            memoria[contador++] = valor;
            return true;
        }
        return false;
    }
    public boolean eliminar(){
        if (contador > 0 ){
            contador--;
            memoria [contador] = 0;
            return true;
        }
        return false;
    }
    public void mostrar(){
        System.out.print("[");
        for (int i = 0; i < contador; i++){
            System.out.print(memoria[i]+ "");           
        }
        System.out.println("]");
    }
    public int buscar(int valor) {
        for (int i = 0; i < contador; i++){
            if (memoria[i] == valor){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[]args){
        MemoriaEstatica memoria = new MemoriaEstatica(5);

        memoria.agregar(10);
        memoria.agregar(20);
        memoria.agregar(30);
        memoria.mostrar(); 

        System.out.println("Indice de 20: " + memoria.buscar(20));
        System.out.println("Indice de 40: " + memoria.buscar(40));

        memoria.eliminar();
        memoria.mostrar();
    }
}
