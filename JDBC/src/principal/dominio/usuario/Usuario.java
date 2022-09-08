
package principal.dominio.usuario;


public class Usuario {
    
    private int id;
    private String correoElectronico;
    private String clave;
    
    //CONSTRUCTOR VACIO

    public Usuario() {
    }
    //GETTER

    public int getId() {
        return id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getClave() {
        return clave;
    }
    
    //SETTER

    public void setId(int id) {
        this.id = id;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    //toString

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", correoElectronico=" + correoElectronico + ", clave=" + clave + '}';
    }
    
    
    
    
}//CORCHETE FINAL
