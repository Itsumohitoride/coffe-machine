import com.zeroc.Ice.*;

import McControlador.ControladorMQ;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
import servicios.*;

public class CoffeeMach {
  public static void main(String[] args) {
    List<String> extPar = new ArrayList<>();
    try (Communicator communicator = Util.initialize(args, "coffeMach.cfg", extPar)) {

      AlarmaServicePrx alarmaS = AlarmaServicePrx.checkedCast(
          communicator.propertyToProxy("alarmas")).ice_twoway();
      VentaServicePrx ventas = VentaServicePrx.checkedCast(
          communicator.propertyToProxy("ventas")).ice_twoway();
      RecetaServicePrx recetaServicePrx = RecetaServicePrx.checkedCast(
          communicator.propertyToProxy("recetas")).ice_twoway();

      ConnectionPrx proxy = ConnectionPrx.checkedCast(
              communicator.propertyToProxy("logistica")).ice_twoway();

      ConnectionPrx logistic = ConnectionPrx.checkedCast(proxy);

      ObjectAdapter adapter = communicator.createObjectAdapter("CoffeMach");
      ControladorMQ service = new ControladorMQ();
      service.setAlarmaService(alarmaS);
      service.setVentas(ventas);
      service.setRecetaServicePrx(recetaServicePrx);

      service.run();
      adapter.add((ServicioAbastecimiento) service, Util.stringToIdentity("abastecer"));
      adapter.activate();
      logistic.checkConnection(InetAddress.getLocalHost().toString());
      communicator.waitForShutdown();
    } catch (UnknownHostException e) {
      throw new RuntimeException(e);
    }
  }
}
