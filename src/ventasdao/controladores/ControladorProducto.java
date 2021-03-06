package ventasdao.controladores;

import ventasdao.objetos.Producto;

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

public class ControladorProducto implements ICrud<Producto> {

    private Connection connection;

    private Statement stmt;

    private PreparedStatement ps;

    private ResultSet rs;

    private String query;

    @Override
    public boolean crear(Producto entidad) throws SQLException, Exception {

        connection = Conexion.obtenerConexion();
        String sql = "INSERT INTO productos (nombre,descripcion,precio,categorias_id) VALUES (?,?,?,?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getDescripcion());
            ps.setFloat(3, entidad.getPrecio());
            ps.setInt(4, entidad.getCategoria().getId());
            ps.executeUpdate();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean eliminar(Producto entidad) throws SQLException, Exception {
        connection = Conexion.obtenerConexion();
        String sql = "DELETE FROM productos WHERE id=?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(ClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public Producto extraer(int id) {
        return null;
    }

    @Override
    public boolean modificar(Producto entidad) throws SQLException, Exception {
        connection = Conexion.obtenerConexion();
        String sql = "UPDATE clientes SET nombre=?, descripcion=?, precio=?, categorias_id=? WHERE id=?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getDescripcion());
            ps.setFloat(3, entidad.getPrecio());
            ps.setInt(4, entidad.getCategoria().getId());
            ps.setInt(5, entidad.getId());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    @Override
    public List<Producto> listar()throws SQLException, Exception {
        connection = Conexion.obtenerConexion();
        try {

            this.stmt = connection.createStatement();
            this.query = "SELECT * FROM clientes";
            this.rs = stmt.executeQuery(query);
            connection.close();

            ArrayList<Producto> productos = new ArrayList();

            while (rs.next()) {

                Producto producto = new Producto();

                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setId(rs.getInt("id"));
                producto.setPrecio(rs.getFloat("precio"));

                //System.out.println(cliente);
                productos.add(producto);

            }
            //System.out.println(cont);
            return productos;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
