package yorgengalvis.packages.controller;

import yorgengalvis.packages.utils.ConexionPostgreSQL;

public class main {
	public static void main(String args[]) {
		ConexionPostgreSQL cps=new ConexionPostgreSQL();
		cps.conectar();
	}
}
