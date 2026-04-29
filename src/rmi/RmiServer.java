package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * RMIサーバー。
 * レジストリを起動してリモートオブジェクトを登録し、クライアントからの呼び出しを待つ。
 */
public class RmiServer {

    public static void main(String[] args) throws Exception {
        // 1. ポート1099でRMIレジストリを起動する
        LocateRegistry.createRegistry(1099);

        // 2. リモートオブジェクトを生成する
        HelloRemoteImpl impl = new HelloRemoteImpl();

        // 3. 「HelloService」という名前でレジストリに登録する
        Naming.rebind("HelloService", impl);

        System.out.println("[Server] RMIサーバーが起動しました。クライアントを待っています...");
    }
}
