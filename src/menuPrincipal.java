import java.util.Scanner;
public class menuPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Genero rock=new Genero("rock",  "120bpm", 1950, "EU", "Chuck Berry", "festival de california");
        Genero hardrock=new Genero("Hard Rock",  "120bpm", 1973, "EU", "KISS", "Popcorn Club");
        System.out.println(rock.getAnio());
        System.out.println(rock.getArtista());
        System.out.println(rock.getAnio()+hardrock.getAnio());

        String opcion;
        String dato;
        System.out.println("Quiere ingresar el tipo de genero?");
        System.out.println("si        |        no");
        opcion = input.nextLine();
        if (opcion == "si" ) {
            System.out.println("Ingrese el tipo: ");
            dato = input.nextLine();
            rock.setTipo(dato);
            rock.imprimirDatos();
        }
        else{
            rock.imprimirDatos();
        }
    }
}
