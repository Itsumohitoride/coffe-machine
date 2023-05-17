import java.util.*;
import com.zeroc.Ice.*;

public class CmLogistics {
    public static void main(String[] args) {
        List<String> extArgs = new ArrayList<>();
        try (Communicator communicator = Util.initialize(args, "CmLogistic.cfg", extArgs)) {
            com.zeroc.Ice.ObjectAdapter adapter = communicator.createObjectAdapter("CmLogistic");
            com.zeroc.Ice.Object object = new Services();
            adapter.add(object, com.zeroc.Ice.Util.stringToIdentity("Logistic"));
            adapter.activate();
            communicator.waitForShutdown();
        }
    }
}
