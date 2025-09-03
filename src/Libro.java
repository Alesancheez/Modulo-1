public class Libro {

    private String titulo;
    private String autor;
    private int stockDisponible;
    private double precioCosto;
    private double precioVenta;
    private String sector;

    public Libro (String titulo1,String autor1,int stockDisponible1,double precioCosto1,double precioVenta1,String sector1){
        this.titulo=titulo1;
        this.autor=autor1;
        this.stockDisponible=stockDisponible1;
        this.precioCosto=precioCosto1;
        this.precioVenta=precioVenta1;
        this.sector=sector1;

    }

    public String getAutor() {
        return this.autor;
    }

}
