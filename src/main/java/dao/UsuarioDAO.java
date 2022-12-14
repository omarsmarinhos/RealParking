package dao;

import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Rol;

public class UsuarioDAO extends DAO<Usuario> {

    private final String SELECT = "SELECT u.*, r.descripcion, r.estado FROM usuarios AS u INNER JOIN rol AS r ON r.id_rol = u.id_rol ORDER BY u.id_usuario";
    private String INSERT = "INSERT INTO usuarios (usuario, pass, nombre_completo, estado, id_rol) VALUES (?, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE usuarios SET usuario = ?, pass = ?, nombre_completo = ?, estado = ?, id_rol = ? WHERE id_usuario = ?";
    private final String FINDBY = "SELECT u.*, r.descripcion, r.estado FROM rol AS r INNER JOIN usuarios AS u ON r.id_rol = u.id_rol WHERE usuario = '";
    private final String FILTER = "SELECT u.*, r.descripcion, r.estado FROM rol AS r INNER JOIN usuarios AS u ON r.id_rol = u.id_rol where u.usuario like";

    private Connection getConnection() throws SQLException {
        return Conexion.getInstance();
    }

    @Override
    public void create(Usuario usuario) {
        if (usuario.getRutaFoto()!= null) {
            INSERT = "INSERT INTO usuarios (usuario, pass, nombre_completo, estado, id_rol, foto) VALUES (?, ?, ?, ?, ?, ?)";
        }

        try (PreparedStatement stmt = getConnection().prepareStatement(INSERT)) {

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPass());
            stmt.setString(3, usuario.getNombreCompleto());
            stmt.setString(4, usuario.getEstado());
            stmt.setInt(5, usuario.getRol().getId());

            if (usuario.getRutaFoto()!= null) {
                File imageFile = new File(usuario.getRutaFoto());
                FileInputStream fis = new FileInputStream(imageFile);
                stmt.setBinaryStream(6, fis, imageFile.length());
            }

            stmt.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Usuario ya existe");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Usuario findBy(String user) {
        Usuario usuario = null;
        try (PreparedStatement stmt = getConnection().prepareCall(FINDBY + user + "'");
                ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                usuario = new Usuario();
                usuario = crearUsuario(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    @Override
    public void update(Usuario usuario) {
        try (PreparedStatement stmt = getConnection().prepareStatement(UPDATE)) {

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPass());
            stmt.setString(3, usuario.getNombreCompleto());
            stmt.setString(4, usuario.getEstado());
            stmt.setInt(5, usuario.getRol().getId());
            stmt.setInt(6, usuario.getId());

            stmt.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Usuario ya existe");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Usuario> filter(String buscar) {
        List<Usuario> usuarios = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(FILTER + " '" + buscar + "%' ORDER BY u.id_usuario");) {

            while (rs.next()) {
                Usuario usuario = crearUsuario(rs);
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    @Override
    public List<Usuario> getList() {
        List<Usuario> usuarios = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(SELECT);) {

            while (rs.next()) {
                Usuario usuario = crearUsuario(rs);
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    private Usuario crearUsuario(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(rs.getInt("id_usuario"));
        usuario.setUsuario(rs.getString("usuario"));
        usuario.setPass(rs.getString("pass"));
        usuario.setNombreCompleto(rs.getString("nombre_completo"));
        usuario.setEstado(rs.getString(5));
        Rol rol = new Rol();
        rol.setId(rs.getInt("id_rol"));
        rol.setDescripcion(rs.getString("descripcion"));
        rol.setEstado(rs.getString(8));
        usuario.setRol(rol);
        usuario.setImagen(rs.getBlob("foto"));
        return usuario;
    }

    @Override
    public void delete(int id) {
    }

}
