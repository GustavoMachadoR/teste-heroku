package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/enviar")
public class EnviarDados extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String tipo = req.getParameter("tipo");
		String tamanho = req.getParameter("tamanho");
		Provisionamento.tamanho = Integer.valueOf(tipo);
		Provisionamento.tipoProvisionamento = Integer.valueOf(tamanho);

		while (Provisionamento.tamanho != null
				&& Provisionamento.tipoProvisionamento != null) {
			System.out.print("");
			
		}
		PrintWriter out = resp.getWriter();
		out.print(true);
	}
}
