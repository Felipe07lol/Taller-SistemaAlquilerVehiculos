
/**
 * Write a description of class Cliente here.
 * 
 * @author (Luis Felipe) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private int numTelefono;
    private String correoElect;
    
    //Constructor
    public Cliente(String nombre, String direccion, int numTelefono, String correoElectr){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.correoElect = correoElect;       
    }
    
    //Get and Set
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public int getNumTelefono(){
        return numTelefono;
    }
    
    public String getcorreoElect(){
        return correoElect;
    }
    
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    
    public void setDireccion(String newDireccion){
        this.direccion = newDireccion;
    }
    
    public void setNumTelefono(int newNumTelefono){
        this.numTelefono = newNumTelefono;
    }
    
    public void setCorreoElect(String newCorreoElect){
        this.correoElect = newCorreoElect;
    }
    
    //Operaciones
    public void buscarVehiculo()
    {
        
    }
    
    public void reservaVehiculo()
    {
        
    }
}
