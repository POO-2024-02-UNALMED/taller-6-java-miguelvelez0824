package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
    protected String nombre;

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public static Pais paisMasVendedor(){
        Pais paisVendedor = null;
        ArrayList<Pais> paisesFabricantes = new ArrayList<>();
        ArrayList<String> nombrePaises = new ArrayList<>();
        String Repetido = null;
        String Actual = null;
        int Max = 0;
        int act = 0;

        for (Vehiculo vehiculo : Vehiculo.getListaVehiculos()){
            paisesFabricantes.add(vehiculo.fabricante.getPais());
        }

        for (Pais pais : paisesFabricantes){
            nombrePaises.add(pais.getNombre());
        }

        Collections.sort(nombrePaises);

        for (String EnLista : nombrePaises){
            if(EnLista.equals(Actual)){
                act ++;
                if(act > Max){
                    Max = act;
                    Repetido = EnLista;
                }
            }
            else{
                Actual = EnLista;
                act = 1;
            }
        }

        for (Pais elemento : paisesFabricantes){
            if (elemento.getNombre().equals(Repetido)){
                paisVendedor = elemento;
                break;
            }
        }
        return paisVendedor;
    }


}
