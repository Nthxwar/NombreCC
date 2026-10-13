package Usuario;

public class MainUsuario {
    static void main() {
        Usuario u1=new Usuario();

        u1.setNombreUsuario("MrBombastic");
        u1.setCorreo("mr.bombastic@gmail.com");
        u1.setContrasenia("676767");

        u1.setNombreUsuario("Riot_SZ");
        u1.setCorreo("nthx.war@gmail.com");
        u1.setContrasenia("nathangu20201473");

        System.out.println("Datos del usuario");
        u1.mostrardatos();
    }
}
