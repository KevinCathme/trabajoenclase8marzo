import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lluvia[]= new int[12];
        String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        for(int i=0;i<lluvia.length;i++){
            System.out.println("Ingrese el dato del mes de "+meses[i]);
            lluvia[i]=scanner.nextInt();
        }
    }
}
