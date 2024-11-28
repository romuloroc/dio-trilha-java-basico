public class ExemploBreakContinue {
  // public static void main(String[] args) {
  //   for (int numero = 1; numero <= 5; numero++) {
  //     if (numero == 3)
  //       continue;
  //     System.out.println("Número: " + numero);
      
  //   }
  // }

  public static void main(String[] args) { 
    int num = 5;
  int count = 1; 
  do { num += count; 
    System.out.println(num); 
  } while (count <= 3);
  }

  
}
