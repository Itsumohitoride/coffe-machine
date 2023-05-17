import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Util;

import java.util.ArrayList;
import java.util.List;

public class BodegaCentral {

    public static void main(String[] args) {
        List<String> extArgs = new ArrayList<>();
        try (Communicator communicator = Util.initialize(args, "Bodega.cfg", extArgs)) {
            com.zeroc.Ice.ObjectAdapter adapter = communicator.createObjectAdapter("Bodega");
            com.zeroc.Ice.Object object = new ServicesBG();
            adapter.add(object, com.zeroc.Ice.Util.stringToIdentity("Almacenar"));
            adapter.activate();
            communicator.waitForShutdown();
        }
    }
}
