
package entities;


public class client {
    int id;
    int DNI;
    String nombre;
    String nacionalidad;
    String sex;

    public int getId() {
      return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getnacionalidad() {
        return nacionalidad;
    }

    public void setnacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getsex() {
        return sex;
    }

    public void setsex(String sex) {
        this.sex=sex;
    }

  

    
    
}
