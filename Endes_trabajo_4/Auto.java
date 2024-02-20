package Endes_trabajo_4;
import java.util.ArrayList;

/**
 * clase auto
 * contiene el objeto auto que utilizaremos durante todo el programa
 * @author Daniel Santamarta Reguera / Tunivers
 * @version 1.0,20/02/2024
 */
public class Auto {

    /**
     * marca
     * Es quien es el fabricante del auto
     */
    private String marca;
    /**
     * modelo
     * Es el diseño o la gamma del vehiculo
     */
    private String modelo;

    /**
     * objeto Auto, parte principal del programa
     * constructor Auto que nos permite agregar el modelo y la marca
     * @param marca La marca de un auto es el fabricante
     * @param modelo El modelo de un auto es su diseño o gamma
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * getMarca
     * nos permite saber la marca del auto
     * @return la variable marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * setMarca
     * nos permite cambiar la marca del auto
     * @param marca La marca de un auto es el fabricante
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * getModelo
     * nos permite saber el modelo del auto
     * @return la variable modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * setModelo
     * nos permite cambiar el modelo del auto
     * @param modelo El modelo de un auto es su diseño o gamma
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * toString
     * @return un String con el formato para mostrar los datos del auto por pantalla de manera ordenada
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}