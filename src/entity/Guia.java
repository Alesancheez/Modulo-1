package entity;

public class Guia {

    private String nombreGuia;
    private Integer dniGuia;
    private Integer numeroMatricula;

    public Guia(Integer numeroMatricula, Integer dniGuia, String nombreGuia) {
        this.numeroMatricula = numeroMatricula;
        this.dniGuia = dniGuia;
        this.nombreGuia = nombreGuia;
    }

    public Integer getDniGuia() {
        return dniGuia;
    }

    public void setDniGuia(Integer dniGuia) {
        this.dniGuia = dniGuia;
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombreGuia='" + nombreGuia + '\'' +
                ", dniGuia=" + dniGuia +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }


}
