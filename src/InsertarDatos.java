import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarDatos {
    String nombre, cedula;
    int cal1, cal2;

    public InsertarDatos(String nombre, String cedula, int cal1, int cal2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cal1 = cal1;
        this.cal2 = cal2;
    }

    public InsertarDatos(){

    }
    public void ingresdoDatos(String nombre,String cedula, int cal1, int cal2){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes",
                "root","Tsuki1904")){
            String sql=("INSERT INTO calificaciones(Nombre, Cedula, Calificacion1, Calificacion2) VALUES(?,?,?,?) ");

            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2,cedula);
            statement.setInt(3,cal1);
            statement.setInt(4,cal2);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas>0){
                System.out.println("inserccion exitosa");
            }
            else {
                System.out.println("Inserccion fallida");
            }


        }catch (SQLException exception){
            System.out.println(exception);
        }
    }

}

