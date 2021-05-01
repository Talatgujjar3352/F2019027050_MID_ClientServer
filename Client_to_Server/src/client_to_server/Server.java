
package client_to_server;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
     public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(6666);
            while (true){
            System.out.println("Going to Establish connection \n\n\n");
            Socket s = ss.accept();   
            System.out.println(" Connection Established \n\n\n");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            
            ss.close();
            break;
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
    
    
}
