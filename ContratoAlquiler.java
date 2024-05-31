
/**
 * Write a description of class Alquiler here.
 * 
 * @author (Luis Felipe) 
 * @version (a version number or a date)
 */
public class ContratoAlquiler
{
    private Cliente cliente;
    private Estado estado;
    private Vehiculo vechiculo;
    private double costoTotal;
    
    //Constructor
    public ContratoAlquiler(Cliente cliente, Estado estado, Vehiculo vechiculo, double costoTotal) {
        this.cliente = cliente;
        this.estado = estado;
        this.vechiculo = vechiculo;
        this.costoTotal = costoTotal;
    }
    
    //Get and Set
    public Cliente getCliente(){
        return cliente;
    }
    
    public Estado getEstado() {
        return estado;
    }

    public Vehiculo getVechiculo() {
        return vechiculo;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setVechiculo(Vehiculo vechiculo) {
        this.vechiculo = vechiculo;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    //Operaciones
    
}
