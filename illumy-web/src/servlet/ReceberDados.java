package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/receber")
public class ReceberDados extends HttpServlet{
	
	Gson gson = new Gson();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		if(Provisionamento.tamanho == null || Provisionamento.tipoProvisionamento == null){
			out.print(false);
			out.flush();
		}
		else{
			Dados provisionamento = new Dados();
			String response = this.gson.toJson(provisionamento);
			out.print(response);
			out.flush();
		}
	}
}
