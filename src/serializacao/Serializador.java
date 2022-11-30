package serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class Serializador {
 
    public Serializador() {    }
     
    public void serializar(String path, Object obj) throws Exception {
        FileOutputStream outFile = new FileOutputStream(path);
	    ObjectOutputStream s = new ObjectOutputStream(outFile);
	    s.writeObject(obj);
	    s.close();
    } 
}