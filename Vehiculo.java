
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (Luis Felipe) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
    private Fecha fechaInicio;
    private Fecha fechaFinal;
    private String ubicacion;
    private String modelo;
    private int año;
    private String placa;
    private double tarifa;
    private boolean disponibilidad;
    
    //Constructor
    public Vehiculo(Fecha fechaInicio, Fecha fechaFinal, String ubicacion, String modelo, int año, String placa, double tarifa, boolean disponibilidad) {
            this.fechaInicio = fechaInicio;
            this.fechaFinal = fechaFinal;
            this.ubicacion = ubicacion;
            this.modelo = modelo;
            this.año = año;
            this.placa = placa;
            this.tarifa = tarifa;
            this.disponibilidad = disponibilidad;
    }
    
    //Get and Set
    public Fecha getFechaInicio() {
            return fechaInicio;
    }

    public Fecha getFechaFinal() {
            return fechaFinal;
    }

    public String getUbicacion() {
            return ubicacion;
    }

    public String getModelo() {
            return modelo;
    }

    public int getAño() {
            return año;
    }

    public String getPlaca() {
            return placa;
    }

    public double getTarifa() {
            return tarifa;
    }

    public boolean isDisponibilidad() {
            return disponibilidad;
    }

    public void setFechaInicio(Fecha fechaInicio) {
            this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(Fecha fechaFinal) {
            this.fechaFinal = fechaFinal;
    }

    public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
    }

    public void setModelo(String modelo) {
            this.modelo = modelo;
    }

    public void setAño(int año) {
            this.año = año;
    }

    public void setPlaca(String placa) {
            this.placa = placa;
    }

    public void setTarifa(double tarifa) {
            this.tarifa = tarifa;
    }

    public void setDisponibilidad(boolean disponibilidad) {
            this.disponibilidad = disponibilidad;
    }
    
    //Operaciones 
    
}
