package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
    protected String nombre;
    protected Pais pais;

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public Pais getPais(){
        return this.pais;
    }
    public void setPais(Pais newPais){
        this.pais = newPais;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante MayorVendedor = null;
        ArrayList<Fabricante> fabricantes = new ArrayList<>();
        ArrayList<String> nombresFabricantes = new ArrayList<>();
        String Repetido = null;
        String Actual = null;
        int Max = 0;
        int act = 0;

        for(Vehiculo vehiculo : Vehiculo.getListaVehiculos()){
            fabricantes.add(vehiculo.getFabricante());
        }

        for(Fabricante nombre : fabricantes){
            nombresFabricantes.add(nombre.getNombre());
        }

        Collections.sort(nombresFabricantes);

        for(String EnLista : nombresFabricantes){
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

        for(Fabricante elemento : fabricantes){
            if (elemento.getNombre().equals(Repetido)){
                MayorVendedor = elemento;
                break;
            }
        }
        return MayorVendedor;
    }
}
