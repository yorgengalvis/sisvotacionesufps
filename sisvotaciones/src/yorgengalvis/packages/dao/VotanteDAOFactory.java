package yorgengalvis.packages.dao;

import yorgengalvis.packages.dao.*;

public class VotanteDAOFactory {
	public static VotanteDAOPostgreSQL getVotanteDao(String type){
		switch(type){
		case "postgre":
			return new VotanteDAOPostgreSQL();
		default:
			return new VotanteDAOPostgreSQL();
		}
	}
}
