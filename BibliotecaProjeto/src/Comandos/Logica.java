package Comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;

}
