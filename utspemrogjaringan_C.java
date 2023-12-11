import java.net.InetAddress;
import java.net.UnknownHostException;

public class utspemrogjaringan_C {
    public static void main(String[] args) {
        InetAddress ip;
        String hostname;

        try{
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("IP Address : " + ip);
            System.out.println("HostName : " + hostname);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }

}