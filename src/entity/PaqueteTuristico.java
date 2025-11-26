package entity;

import java.util.*;

public abstract class PaqueteTuristico implements Comparable<PaqueteTuristico>, Calcular{

    private Integer identificador;
    private String titulo;
    private Double valorAdicional;
    private Double valorBase;
    private Integer cantidadDias;
    private Set<String> nombreExcursiones = new HashSet<>();
    private Guia guia;


    public PaqueteTuristico(Integer identificador, Integer cantidadDias,Double valorBase, Double valorAdicional, String titulo,Guia guia) {
        this.identificador = identificador;
        this.cantidadDias = cantidadDias;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.titulo = titulo;
        this.guia = guia;
    }


    public void agregarExcursion(String excursion){
        if (excursion != null && !excursion.trim().isEmpty()) {
            this.nombreExcursiones.add(excursion);
            System.out.println("Excursion agregada: " + excursion);
        } else {
            System.out.println("No se puedo agregar el nombre de la excursion");
        }
    }

    public void eliminarExcursion(String excursion){

        if (this.nombreExcursiones.remove(excursion)) {
            System.out.println("Excursion eliminada: " + excursion);
        } else {
            System.out.println("La excursion " + excursion + " no se encuentra en la lista");
        }

    }

    public Integer getExcursiones() {
        System.out.println("Nombre Excursiones:");

        for (String excursion : nombreExcursiones) {
            System.out.println(excursion);
        }
        return nombreExcursiones.size();
    }

    public Double getPrecioBase(){
        return valorBase;
    }

    public abstract Double calcularPrecioFinal();

    @Override
    public int compareTo(PaqueteTuristico p) {
        return Double.compare(this.calcularPrecioFinal(), p.calcularPrecioFinal());
    }

    @Override
    public String toString() {
        return "Paquete Turistico{" +
                "Identificador=" + identificador +
                ", Titulo='" + titulo + '\'' +
                ", Valor Adicional=" + valorAdicional +
                ", Valor Base=" + valorBase +
                ", Cantidad Dias=" + cantidadDias +
                ", Nombre Excursiones=" + nombreExcursiones +
                ", Guia=" + (guia != null ? guia.toString() : "Sin guia") +
                '}';
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    // Getters setters guia
    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

}
