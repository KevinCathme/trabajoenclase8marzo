public class Main {
    public static void main(String[] args) {
        int lluvia[]= {23,24,20,21,26,22,23,23,22,25,22,20};
        String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int acumulada=0;

        for(int i=0;i<lluvia.length;i++){
                    System.out.print("El mes de "+meses[i]);
                    System.out.print(" llovió "+lluvia[i]);
                    System.out.println(" L/m2");
        }
        for(int i=0;i<lluvia.length;i++){
            acumulada=acumulada+lluvia[i];
        }
        System.out.print("La lluvia total acumulada es de "+acumulada+" L/m2");
    }
}
