import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.CosNaming.*;

public class HelloServer {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            POA rootPoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPoa.the_POAManager().activate();

            HelloImpl helloImpl = new HelloImpl();
            org.omg.CORBA.Object ref = rootPoa.servant_to_reference(helloImpl);

            // Print the IOR string
            String ior = orb.object_to_string(ref);
            System.out.println("Server ready and waiting...\n" + ior);

            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
