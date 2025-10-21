package Clase20;

import java.util.Objects;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer telefono;
    protected static Double sueldoBase = 800000.0;

    //CONSTRUCTOR
    public Empleado (String nombre,String apellido, Integer dni,Integer telefono,Double sueldoBase){
      this.nombre=nombre;
      this.apellido=apellido;
      this.dni=dni;
      this.telefono=telefono;
      this.sueldoBase=sueldoBase;
    }

    //CALCULAR SUELDO MENSUAL
    public abstract Double calcularSueldoMensual ();

    //CONSULTAR INFORMACION PERSONAL

    @Override
    public String toString() {
        return "Empleado " +
                "Nombre= " + nombre  +
                ", Apellido= " + apellido +
                ", Dni= " + dni +
                ", Telefono= " + telefono +
                ", Hashcode=" + hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    //REGISTRAR ENTRADA DE LOS EMPLEADOS
    public final String registrarEntrada(String hora) {
        return nombre + " " + apellido + " " + "registro su entrada a las: " + hora;}

    //REGISTRAR SALIDA DE LOS EMPLEADOS
    public final String registrarSalida(String hora){
        return nombre + " " + apellido + " " + "registro su salida a las: " + hora;}


}
