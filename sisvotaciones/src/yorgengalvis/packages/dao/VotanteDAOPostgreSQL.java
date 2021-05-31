package yorgengalvis.packages.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yorgengalvis.packages.models.Votante;
import yorgengalvis.packages.utils.ConexionPostgreSQL;

public class VotanteDAOPostgreSQL implements VotanteDAO {
	private ConexionPostgreSQL conexion;
	
	private static final String INSERT_VOTANTE_SQL = "INSERT INTO votante (nombre,email,documento,tipodocumento,eleccion) VALUES (?,?,?,?,?);";
	private static final String DELETE_VOTANTE_SQL = "DELETE FROM votante WHERE id = ?;";
	private static final String UPDATE_VOTANTE_SQL = "UPDATE votante SET nombre = ?, email= ?, documento = ?,tipodocumento=?,eleccion=? WHERE id = ?;";
	private static final String SELECT_VOTANTE_BY_ID = "SELECT * FROM votante WHERE id = ?;";
	private static final String SELECT_ALL_VOTANTES = "SELECT * FROM votante;";
	
	
	
	
	
	

	@Override
	public void insert(Votante votante) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Votante select(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Votante> selectAll() {
		List<Votante> votantes = new ArrayList<>();
		try {
			ResultSet rs = conexion.consultar(SELECT_ALL_VOTANTES);
			while (rs.next()){
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String email = rs.getString("email");
				String documento = rs.getString("documento");
				int tipodocumento=rs.getInt("tipodocumento");
				int eleccion=rs.getInt("eleccion");
				votantes.add(new Votante (id,nombre,email,documento,tipodocumento,eleccion));
			}
			
			
		} catch (SQLException e) {
			
		}
		return votantes;
	}

	@Override
	public void delete(int i) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Votante Votante) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
