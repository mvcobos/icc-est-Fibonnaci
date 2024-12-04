public class Recursividad {
    public int fibonacci(int n){
        //Casos base
        if(n == 0) return 0; 
        if(n == 1) return 1;//no va a ningun else ya que si entra a este if no se hace  nada mas por el return
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
