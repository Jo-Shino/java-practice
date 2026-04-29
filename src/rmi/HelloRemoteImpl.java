package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * HelloRemote の実装クラス。
 * UnicastRemoteObject を継承することで、RMI経由で呼び出せるオブジェクトになる。
 */
public class HelloRemoteImpl extends UnicastRemoteObject implements HelloRemote {

    protected HelloRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        System.out.println("[Server] sayHello が呼ばれました。引数: " + name);
        return "Hello, " + name + "!";
    }
}
