public class Main {
    public static void main(String[] args) {
        int lluvia[][]= new int[12][3];
        lluvia[0][0] = 21; lluvia[0][1] = 25; lluvia[0][2] = 22;
        lluvia[1][0] = 24; lluvia[1][1] = 23; lluvia[1][2] = 26;
        lluvia[2][0] = 27; lluvia[2][1] = 20; lluvia[2][2] = 22;
        lluvia[3][0] = 26; lluvia[3][1] = 24; lluvia[3][2] = 23;
        lluvia[4][0] = 21; lluvia[4][1] = 22; lluvia[4][2] = 25;
        lluvia[5][0] = 20; lluvia[5][1] = 26; lluvia[5][2] = 27;
        lluvia[6][0] = 23; lluvia[6][1] = 25; lluvia[6][2] = 22;
        lluvia[7][0] = 24; lluvia[7][1] = 20; lluvia[7][2] = 21;
        lluvia[8][0] = 27; lluvia[8][1] = 23; lluvia[8][2] = 26;
        lluvia[9][0] = 22; lluvia[9][1] = 24; lluvia[9][2] = 20;
        lluvia[10][0] = 25; lluvia[10][1] = 26; lluvia[10][2] = 21;
        lluvia[11][0] = 22; lluvia[11][1] = 23; lluvia[11][2] = 27;
        String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String ciudad[]= {"Quito","Guayaquill","Cuenca"};
        int acumulada[]={0,0,0};
        for(int i=0;i<3;i++){
            for(int j=0;j<12;j++){
                System.out.println("En la ciudad de "+ciudad[i]+" el mes de "+meses[j]+" llovió "+lluvia[j][i]+" L/m2");
                acumulada[i]=acumulada[i]+lluvia[j][i];
            }
            System.out.println("La lluvia total de la ciudad "+ciudad[i]+" es de "+(acumulada[i])+"L/m2");
            System.out.println("El promedio de lluvia de la ciudad "+ciudad[i]+" es de "+(acumulada[i]/12)+"L/m2");
        }
    }
}
