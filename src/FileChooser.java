
import javax.swing.JFileChooser;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;



public class FileChooser {

public String lanzarSeleccion(){
String ruta=null;
//Creamos selector de apertura

JFileChooser chooser = new JFileChooser();

chooser.setCurrentDirectory(new java.io.File("."));

//Titulo que llevara la ventana

chooser.setDialogTitle("Seleccione su archivo XLS");

//Elegiremos archivos del directorio

chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//FILES_AND_DIRECTORIES);

chooser.setAcceptAllFileFilterUsed(false);

chooser.addChoosableFileFilter(new FileNameExtensionFilter("S�lo documentos de Excel 2003", "XLS"));





//Si seleccionamos alg�n archivo retornaremos su directorio

if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

System.out.println("Directorio: " + chooser.getSelectedFile());
 
//Si no seleccionamos nada retornaremos No seleccion

} else {

System.out.println("No seleccion ");

}
return chooser.getSelectedFile().toString();

}

}