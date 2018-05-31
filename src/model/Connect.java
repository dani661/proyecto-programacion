package model;

import supermercado.Stock;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Connect {
    public Connection conecta(){
        Connection c = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:prueba.db");
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      return c;
    }
     public void busca(Statement stmt) throws SQLException{
         String busc=(String)JOptionPane.showInputDialog(null,"dame o nome a buscar");
                        String tabsc=(String)JOptionPane.showInputDialog(null,"dame a taboa");
                            String consulta="SELECT * FROM "+tabsc+" WHERE nome='"+busc+"';";
                            ResultSet rs= stmt.executeQuery(consulta);
                                while ( rs.next() ) {
                                    System.out.println(rs.getString("nome"));
                                    System.out.println(rs.getString("idade"));
                                }
                                rs.close();
     }
     public String buscagrf(Statement stmt,String tabact,String busc) throws SQLException{
               String resultado=null;             
         String consulta="SELECT * FROM "+tabact+" WHERE nome='"+busc+"';";
                            ResultSet rs= stmt.executeQuery(consulta);
                                while ( rs.next() ) {
                                    resultado=rs.getString("nome")+" "+rs.getString("idade");
                                }
                                rs.close();
          return resultado;
     }
     public void comando(Statement stmt) throws SQLException{
         String cmd=(String)JOptionPane.showInputDialog(null,"dame o comando a insertar");
                        stmt.execute(cmd);
     }
     public void inserta(Statement stmt) throws SQLException{
         String val=(String)JOptionPane.showInputDialog(null,"dame o valor a insertar ('nome',idade)");
                        String tab=(String)JOptionPane.showInputDialog(null,"dame taboa");
                        stmt.execute("INSERT INTO "+tab+" VALUES ("+val+");");
     }
     public void insertagrf(Statement stmt, String val,String tab) throws SQLException{
            stmt.execute("INSERT INTO "+tab+" VALUES ("+val+");");
    }
     public void creaTabla(Statement stmt) throws SQLException{
         String tabn=(String)JOptionPane.showInputDialog(null,"dame o nome da taboa");
                        String tabvals=(String)JOptionPane.showInputDialog(null,"dame os valores da taboa (pKey,campos...)");
                        stmt.execute("CREATE TABLE "+tabn+"("+tabvals+");");
     }
     public void borra(Statement stmt) throws SQLException{
         String borr=(String)JOptionPane.showInputDialog(null,"dame a taboa");
                        String vborr=(String)JOptionPane.showInputDialog(null,"dame o nome a borrar");
                            String borra="DELETE FROM "+borr+" WHERE nome='"+vborr+"';";
                            stmt.execute(borra);
     }
     public void borragrf(Statement stmt,String tabact,String vborr) throws SQLException{
                String borra="DELETE FROM "+tabact+" WHERE nome='"+vborr+"';";
                    stmt.execute(borra);
                    JOptionPane.showMessageDialog(null,"Borrado o valor: "+vborr);
     }
     public void actualiza(Statement stmt) throws SQLException{
         String upval=(String)JOptionPane.showInputDialog(null,"dame a idade a actualizar");
                        String nome=(String)JOptionPane.showInputDialog(null,"dame o nome a actualizar");
                        String uptab=(String)JOptionPane.showInputDialog(null,"dame taboa");
                        stmt.execute("UPDATE "+uptab+" set idade="+upval+" WHERE nome='"+nome+"';");
     }
     
     public void actualizagrf(Statement stmt,String tabact, String valnom,String valnomf,String idade) throws SQLException{
         
         if(valnomf==null){
             stmt.execute("UPDATE "+tabact+" set idade="+idade+" WHERE nome='"+valnom+"';");
         }
         else if(idade==null){
             stmt.execute("UPDATE "+tabact+" set nome='"+valnomf+"' WHERE nome='"+valnom+"';");
         }
         else{
             stmt.execute("UPDATE "+tabact+" set idade="+idade+",nome='"+valnomf+"' WHERE nome='"+valnom+"';");
         }
     }
     public ArrayList getTabla(String tablaac) throws SQLException{
        Connection con = conecta();
        Statement stmt; 
        stmt = con.createStatement();
        ArrayList<Stock> tabla = new ArrayList();
         
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tablaac + ";");

                while (rs.next()) {
                    String producto = rs.getString("producto");
                    Float precio = rs.getFloat("precio");
                    int cantidad = rs.getInt("cantidad");
                    tabla.add(new Stock(producto,precio,cantidad));
                }
                rs.close();
                stmt.close();
                con.close();
         return tabla;
     }
}
