package baz.com.mx.prestaprenda.doc.example;

import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.img;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloClass {

	public static void main(String []arg) {
		String estructura = body(h1("Reporte de la transaccion: "), img().withSrc("file:///E:/app/wks_eclipse/baz.com.mx.prestaprenda.doc/src/main/resources/img/descarga.png")).render();
		crearHtml(estructura);
	}
	
	
	public static void crearHtml(String estructura) {
		try  {
			FileWriter fileWriter = new FileWriter(new File("plantilla.html"));
			// escribiendo contenido
			fileWriter.write(estructura);
			fileWriter.flush();
			fileWriter.close();
			// creado file
			File htmlFile = new File("plantilla.html");
			
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
