package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMIで公開するメソッドを定義するインターフェース。
 * Remote を継承し、すべてのメソッドに RemoteException を宣言する。
 */
public interface HelloRemote extends Remote {

    String sayHello(String name) throws RemoteException;
}
