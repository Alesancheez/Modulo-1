public class Libro {

    private String titulo;
    private String autor;
    private int stockDisponible;
    private double precioCosto;
    private double precioVenta;
    private String sector;
    private int codigo;

    public Libro (String titulo,String autor,int stockDisponible,double precioCosto,double precioVenta,String sector, int codigo){
        this.titulo=titulo;
        this.autor=autor;
        this.stockDisponible=stockDisponible;
        this.precioCosto=precioCosto;
        this.precioVenta=precioVenta;
        this.sector=sector;
        this.codigo=codigo;

    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String nuevoTitulo){
        if (nuevoTitulo.isEmpty()){
            System.out.println("Ingrese un titulo valido");
        }else{
            this.titulo = nuevoTitulo;}
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String nuevoAutor){
        if (nuevoAutor.isEmpty()){
            System.out.println("Ingrese un autor valido");
        }else{
            this.autor = nuevoAutor;}
    }


    public Double calcularGanancia(){
        return  precioVenta- precioCosto;
    }
    public Boolean hayStockDisponible(){
        return  stockDisponible > 0;
    }

    public String consultaDescuentoSector(){
        if (sector.equals("c")){
            System.out.println((10 / precioVenta)*100 );
        }else{
            System.out.println("no hay descuento");}
    }


}
