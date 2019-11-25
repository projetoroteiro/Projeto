package br.ucsal.roteiro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.roteiro.dao.EnderecoDAO;
import br.ucsal.roteiro.dao.InstituicaoDAO;
import br.ucsal.roteiro.model.Endereco;
import br.ucsal.roteiro.model.Instituicao;

/**
 * Servlet implementation class InstituicaoSalvarServlet
 */
@WebServlet("/InstituicaoSalvar")
public class InstituicaoSalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public InstituicaoSalvarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		String bairro =request.getParameter("bairro");
		String cep=request.getParameter("cep");
		String cidade=request.getParameter("cidade");
		String rua=request.getParameter("rua");
		String numero=request.getParameter("numero");
		
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		endereco.setCep(cep);
		endereco.setCidade(cidade);
		endereco.setRua(rua);
		endereco.setNumero(Integer.parseInt(numero));
		
		Instituicao instituicao = new Instituicao();
		instituicao.setNome(nome);
		instituicao.setEndereco(endereco);
		endereco.setInstituicao(instituicao);
		
		EnderecoDAO.inserirEndereco(endereco);
		request.getRequestDispatcher("InstituicaoListar").forward(request, response);
		
	}

}
