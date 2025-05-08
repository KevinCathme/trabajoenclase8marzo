import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double lluvia[]= new double[12];
        for(int i=0;i<lluvia.length;i++){
            System.out.println("Ingrese el dato del mes: "+(i+1));
            lluvia[i]=scanner.nextDouble();
        }
    }
}
