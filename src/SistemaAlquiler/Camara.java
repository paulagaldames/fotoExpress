package SistemaAlquiler;

public class Camara{
    private String marca;
    private String modelo;
    private Boolean soporteFlash;

    public Camara(String marca, String modelo, Boolean soporteFlash) {
        this.marca = marca;
        this.modelo = modelo;
        this.soporteFlash = soporteFlash;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Boolean getSoporteFlash(){
        return soporteFlash;
    }
}
