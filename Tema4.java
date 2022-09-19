package IntroProgramacion.Ejercicios;

public class Tema4 {
    public static void main(String[] args) {

        int i= -2;
        if(i>0) {
            System.out.println("Numero positivo");
        } else if(i<0){
            System.out.println("Numero negativo");
        } else{
            System.out.println("el numero es cero");
        }
    }} //----------------------------------------------------------------

class Tema4While{
    public static void main(String[] args) {
        int n = 0;

        while(n<3){
            System.out.println(n);
            n++;

        }

        do{
            System.out.println(n);
            n++;
        } while(n<3);
    }}//----------------------------------------------------------------

class Tema4For{
    public static void main(String[] args) {
        for(int a =0;a <=3;a++){
            System.out.println("numero" + a);
        }

    }}//----------------------------------------------------------------

class Tema4Switch{

    public static void main(String[] args) {

        String estacion = "verano";

        switch(estacion){
            case "Verano":
                System.out.println("Estamos en Verano y hace mucho calor!");
                break;
            case "otoño":
                System.out.println("Estamos en otoño y las hojas comienzan a caerse");
                break;
            case "primavera":
                System.out.println("Llegó la primavera y todas las plantas comienzan a florecer");
                break;

            case "invierno":
                System.out.println("Llegó el invierno y hace mucho frio!");
                break;

            default:
                System.out.println("No se reconoce la estacion");

    }
}}

