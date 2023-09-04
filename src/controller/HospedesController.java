package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import factory.ConnectionFactory;
import dao.HospedesDAO;
import modelo.Hospedes;


public class HospedesController {
	 private HospedesDAO hospedesDAO;

	 public HospedesController() {
			Connection connection = new ConnectionFactory().recuperarConexao();
			this.hospedesDAO = new HospedesDAO(connection);
		}
	 
		public void salvar(Hospedes hospedes) {
			this.hospedesDAO.salvar(hospedes);
		}
		
		public List<Hospedes> listarHospedes() {
			return this.hospedesDAO.listarHospedes();
		}
		
		public List<Hospedes> listarHospedesId(String id) {
			return this.hospedesDAO.buscarId(id);
		}

		public void atualizar(String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone, Integer id) {
			this.hospedesDAO.atualizar(nome, sobrenome, dataNascimento, nacionalidade, telefone, id);
		}
		
		public void deletar(Integer id) {
			this.hospedesDAO.deletar(id);
		}
}