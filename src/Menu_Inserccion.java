import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Inserccion {
    private JButton conectarALaBaseButton;
    JPanel form1;
    private JLabel Mensajetxt;
    private JTextField nombreTextF;
    private JTextField cedulaTxtF;
    private JTextField cal1Txt;
    private JTextField cal2Txt;
    private JLabel user;
    private JButton insertarButton;
    private JButton borrarCamposButton;

    public Menu_Inserccion() {
        conectarALaBaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConexionBaseDatos conexionBDD = new ConexionBaseDatos();
                conexionBDD.conexionLocal("jdbc:mysql://localhost:3306/estudiantes",
                        "root","Tsuki1904");

                Mensajetxt.setText(conexionBDD.getMensaje());
            }
        });
        borrarCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreTextF.setText("");
                cedulaTxtF.setText("");
                cal1Txt.setText("");
                cal2Txt.setText("");
            }
        });
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    InsertarDatos insert= new InsertarDatos();

                    insert.ingresdoDatos(nombreTextF.getText(),cedulaTxtF.getText(),
                            Integer.parseInt(cal1Txt.getText()),Integer.parseInt(cal2Txt.getText()));
                }catch (Exception ex){
                    Mensajetxt.setText("Datos ingresados incorrectos");
                    System.out.println(ex);
                }

            }
        });
    }
}

