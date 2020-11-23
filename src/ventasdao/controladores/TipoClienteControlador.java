package ventasdao.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventasdao.dominio.Conexion;
import ventasdao.objetos.Cliente;
import ventasdao.objetos.TipoCliente;

public class TipoClienteControlador implements ICrud<TipoCliente> {

    private Connection connection;

    private Statement stmt;

    private PreparedStatement ps;

    private ResultSet rs;

    private String sql;

    @Override
    public boolean crear(TipoCliente entidad) throws SQLException, Exception {
        connection = Conexion.obtenerConexion();
        String sql = "INSERT INTO tipo_cliente (nombre,descripcion) VALUES (?,?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getDescripcion());
            ps.executeUpdate();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(TipoCliente entidad) throws SQLException, Exception {
        connection = Conexion.obtenerConexion();
        String sql = "DELETE FROM tipo_cliente WHERE id=?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(TipoClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public TipoCliente extraer(int id) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean modificar(TipoCliente entidad) throws SQLException, Exception {
        connection = Conexion.obtenerConexion();
        String sql = "UPDATE tipo_cliente SET nombre=?, descripcion=? WHERE id=?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getDescripcion());
            ps.setInt(3, entidad.getId());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public List<TipoCliente> listar() throws SQLException, Exception {
        
        connection = Conexion.obtenerConexion();
        try {

            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM tipo_cliente";
            this.rs = stmt.executeQuery(sql);
            connection.close();

            ArrayList<TipoCliente> tipoCientes = new ArrayList();

            while (rs.next()) {

                TipoCliente tipo_cliente = new TipoCliente();

                tipo_cliente.setNombre(rs.getString("nombre"));
                tipo_cliente.setDescripcion(rs.getString("descripcion"));
                tipo_cliente.setId(rs.getInt("id"));
           

                //System.out.println(cliente);
                tipoCientes.add(tipo_cliente);

            }
            //System.out.println(cont);
            return tipoCientes;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;

    }

}
