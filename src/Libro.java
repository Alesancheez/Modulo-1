public class Libro {

    /*private final Double COMISION_AUTOR=6;



    public Double getCOMISION_AUTOR() {
        return COMISION_AUTOR;
    }*/


    private String titulo;
    private String autor;
    private int stockDisponible;
    private double precioCosto;
    private double precioVenta;
    private String sector;
    private int codigo;


    public Libro (String titulo, String autor, int stockDisponible, double precioCosto, double precioVenta, String sector, int codigo){
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


    //DESCUENTO SECTOR
    public Boolean consultaDescuentoSector() {return sector.equals("c");}

    //CODIGO DE OCHO DIGITOS
    public String getparteCodigo(){
        String codigoTexto= Integer.toString(this.codigo);
        String cuatroDigitos=codigoTexto.substring(4);
    return "****" + cuatroDigitos;
    }

    //CALCULAR PRECIO FINAL
    public double calcularPrecioFinal(){
        if (consultaDescuentoSector()){
            double descuentoDinero = this.precioVenta * 0.10;
            System.out.println("El descuento en dinero es de: " + descuentoDinero);
            return this.precioVenta - descuentoDinero;
        }else{
            return this.precioVenta;
        }
    }



}
