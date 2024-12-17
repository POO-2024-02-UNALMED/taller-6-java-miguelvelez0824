package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int cantidad_vehiculos;
    protected static ArrayList<Vehiculo> listadoVehiculos = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.cantidad_vehiculos ++;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String newPlaca){
        this.placa = newPlaca;
    }

    public int getPuertas() {
        return this.puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidad){
        this.velocidadMaxima = velocidad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int newPrecio){
        this.precio = newPrecio;
    }

    public int getPeso(){
        return this.peso;
    }
    public void setPeso(int newPeso){
        this.peso = newPeso;
    }

    public String getTraccion(){
        return this.traccion;
    }
    public void setTraccion(String value){
        this.traccion = value;
    }

    public Fabricante getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(Fabricante value){
        this.fabricante = value;
    }

    public static int getCantidadVehiculos(){
        return Vehiculo.cantidad_vehiculos;
    }
    public static void setCantidadVehiculos(int newCantidad){
        Vehiculo.cantidad_vehiculos = newCantidad;
    }

    public static ArrayList<Vehiculo> getListaVehiculos(){
        return Vehiculo.listadoVehiculos;
    }
    public String vehiculosPorTipo(){
        return "Automoviles: "+ Automovil.list.size() + "\nCamionetas: " + Camioneta.list.size() + "\nCamiones: " + Camion.list.size();
    }
}
