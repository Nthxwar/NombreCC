package Usuario;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasenia;

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public void setContrasenia(String contrasenia){
        if(contrasenia.length()>=8){
            this.contrasenia=contrasenia;
            System.out.println("Contraseña guardada :) ");
        }else {
            System.out.println("La contraseña es muy corta >:( ");
        }

    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getCorreo(){
        return correo;
    }
    public String getContrasenia(){
        return contrasenia;
    }

    public void mostrardatos(){
        System.out.println("Nombre de usuario: "+ nombreUsuario);
        System.out.println("Correo Electronico: "+correo);
    }
}
