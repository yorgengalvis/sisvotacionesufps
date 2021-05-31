package yorgengalvis.packages.dao;

import java.sql.SQLException;
import java.util.List;

import yorgengalvis.packages.models.*;

public interface VotanteDAO {
	public void insert(Votante votante) throws SQLException;
	public Votante select(int id);
	public List <Votante> selectAll();
	public void delete(int i) throws SQLException;
	public void update(Votante Votante) throws SQLException;
}
