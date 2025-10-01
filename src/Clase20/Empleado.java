package Clase20;

public class Empleado {

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
    public Double calcularSueldoMensual (){
        return this.sueldoBase;
    }

    //CONSULTAR INFORMACION PERSONAL

    /*public void visualizarInformacionPersonal(){
        System.out.println(this.nombre + " " + this.apellido + " " + this.dni + " " + this.telefono);
    }*/

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre= " + nombre + '\'' +
                ", apellido= " + apellido + '\'' +
                ", dni= " + dni +
                ", telefono= " + telefono +
                '}';
    }
}
