
package client_to_server;

import java.io.DataOutputStream;
import java.net.Socket;


public class Client {
     public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 6666);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("Hello Talat");
            
            dout.flush();
            dout.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    
     }
}