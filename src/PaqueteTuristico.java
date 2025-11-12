import java.util.*;

public abstract class PaqueteTuristico {

    private Integer identificador;
    private String titulo;
    private Double valorAdicional;
    private Double valorBase;
    private Integer cantidadDias;
    private Set<String> nombreExcursiones = new HashSet<>();


    public PaqueteTuristico(Integer identificador, Integer cantidadDias,Double valorBase, Double valorAdicional, String titulo) {
        this.identificador = identificador;
        this.cantidadDias = cantidadDias;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.titulo = titulo;
    }


    public void agregarExcursion(String excursion){
        if (excursion != null && !excursion.isEmpty()) {
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

    @Override
    public String toString() {
        return "PaqueteTuristico{" +
                "identificador=" + identificador +
                ", titulo='" + titulo + '\'' +
                ", valorAdicional=" + valorAdicional +
                ", valorBase=" + valorBase +
                ", cantidadDias=" + cantidadDias +
                ", nombreExcursiones=" + nombreExcursiones +
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
}
