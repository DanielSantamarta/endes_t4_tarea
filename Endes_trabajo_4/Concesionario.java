package Endes_trabajo_4;
import java.util.ArrayList;
/**
 * clase conceisonario
 * contiene el obejeto concesionario que nos permite alamcenar los autos para venderlos
 * @author Daniel Santamarta Reguera / Tunivers
 * @version 1.0,20/02/2024
 */
public class Concesionario {

    /**
     * ArrayList<Auto>
     *  Es un Array que servira para alamacenar posteriormente objetos Auto
     */
    private ArrayList<Auto> autos;

    /**
     * objeto concesionario
     * crea un Array en el que se agregaran objetos Auto atraves de un metodo
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * agregarAuto añade un objeto Auto a un Array
     * @param auto objeto de la clase Auto
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * listarAutos
     * devuelve un Array para permitirnos mostrar su contenido
     * @return autos que es un Array
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * imprimirAutos
     * Muestra por pantalla el contenido del Array
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
