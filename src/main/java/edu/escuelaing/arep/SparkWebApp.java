package edu.escuelaing.arep;

import static spark.Spark.*;
import edu.escuelaing.arep.calculator.*; 
import edu.escuelaing.arep.linkedList.*;
import spark.Request;
import spark.Response;

public class SparkWebApp {

	public static void main(String[] args) {
		port(getPort());
		get("/input", (req, res) -> inputPage(req, res));
		get("/output", (req, res) -> "Hello Heroku");
	}
		
		static int getPort() {
			if (System.getenv("PORT") != null) {
				return Integer.parseInt(System.getenv("PORT"));
			}
			return 4567; //returns default port if heroku-port isn't set	
		}
		
		private static String inputPage(Request req, Response rep) {
			String page ="<!DOCTYPE html>"
						+ "<html>"
			            + "<body>"
			            + "<h2>Calculation of the mean and standard deviation</h2>"
			            + "<form action=\"/results\">"
			            + "  Ingrese los numeros que desee que sean procesados, separados por comas <br>"
			            + "  <input type=\"text\" name=\"numbers\" >"
			            + "  <br><br>"
			            + "  <input type=\"submit\" value=\"Submit\">"
			            + "</form>"
			            + "<p>Si da click en el boton \"Submit\", se enviaran los datos a un pagina llamada \"/results\".</p>"
			            + "</body>"
			            + "</html>";
					
			return  page;
		}
}


