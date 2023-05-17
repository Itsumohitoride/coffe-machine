import com.zeroc.Ice.Current;

public class ServicesBG implements servicios.Connection{
    @Override
    public void checkConnection(String ip, Current current) {
        System.out.println("Connection with coffee machine with ip direction "+ ip +" was established with the Bodega");
    }
}