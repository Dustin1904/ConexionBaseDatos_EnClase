import java.sql.*;
public class ConexionBaseDatos {
    String servidor, usuario, password, mensaje;

    public ConexionBaseDatos(String servidor, String usuario, String password) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.password = password;
    }

    public ConexionBaseDatos() {

    }

    public void conexionLocal(String servidor, String usuario, String password){
        try (Connection connection= DriverManager.getConnection(servidor,usuario,password)) {
            if (connection!=null){
                mensaje="conexion correcta";
                System.out.println(mensaje);
            }
        }catch (SQLException exception){
            mensaje="conexion fallida";
            System.out.println(mensaje);
            //exception.printStackTrace(); ---> imprime el mensaje especifico
        }
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
