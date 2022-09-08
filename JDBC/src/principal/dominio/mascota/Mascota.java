
package principal.dominio.mascota;

import principal.dominio.usuario.Usuario;


public class Mascota {
    
    private int id;
    private String apodo;
    private String raza;
    private Usuario usuario;

    
    //CONSTRUCTOR VACIO
    public Mascota() {
    }

    //GETTER
    public int getId() {
        return id;
    }

    public String getApodo() {
        return apodo;
    }

    public String getRaza() {
        return raza;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    //SETTER
    public void setId(int id) {
        this.id = id;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //toString
    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", apodo=" + apodo + ", raza=" + raza + ", usuario=" + usuario + '}';
    }
    
    
    
    
    
}//CORCHETE FINAL
