import org.omg.CORBA.*;

public class HelloClient {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.string_to_object(
                    "IOR:000000000000001749444c3a48656c6c6f4170702f48656c6c6f3a312e300000000000010000000000000086000102000000000b3137322e31372e302e320000a94d000000000031afabcb0000000020ac49b98600000001000000000000000100000008526f6f74504f410000000008000000010000000014000000000000020000000100000020000000000001000100000002050100010001002000010109000000010001010000000026000000020002");
            HelloApp.Hello hello = HelloApp.HelloHelper.narrow(objRef);

            System.out.println(hello.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
