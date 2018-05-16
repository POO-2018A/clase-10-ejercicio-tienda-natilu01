package ejerciciotienda;

public class EjercicioTienda {
        private String nombre;
        private String direccion;
        private String RUC;
                
        public EjercicioTienda(String nombre, String direccion, String RUC) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public static void main(String[] args) {
        
    }
    
}
