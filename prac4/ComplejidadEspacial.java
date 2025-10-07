package prac4;

public class ComplejidadEspacial {
 // O(1) - Espacio constante
 public static int encontrarMaximo(int[] array) {
 if (array.length == 0) return -1;

 int maximo = array[0]; 
 // Solo una variable adicional
 for (int i = 1; i < array.length; i++) {
 if (array[i] > maximo) {
 maximo = array[i];
 }
 }
 return maximo;
 }
 // O(n) - Espacio lineal
 public static int[] duplicarArray(int[] array) {
 int[] copia = new int[array.length]; 
 // Nuevo array del mismo tamaño
 for (int i = 0; i < array.length; i++) {
 copia[i] = array[i] * 2;
 }
 return copia;
 }
 // O(n²) - Espacio cuadrático
 public static int[][] crearMatrizIdentidad(int n) {
 int[][] matriz = new int[n][n]; 
 // Matriz n x n
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 matriz[i][j] = (i == j) ? 1 : 0;
 }
 }
 return matriz;
 }
 // O(n) - Espacio para recursión
 public static int factorialRecursivo(int n) {
 if (n == 0 || n == 1) {
 return 1;
 }
 // Cada llamada recursiva añade un marco a la pila
 return n * factorialRecursivo(n - 1);
 }
 // O(1) - Factorial iterativo (mejor uso de espacio)
 public static int factorialIterativo(int n) {
 int resultado = 1;
 for (int i = 2; i <= n; i++) {
 resultado = i;
 }
 return resultado;
 }
}