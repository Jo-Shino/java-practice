package rmi;

import java.rmi.Naming;

/**
 * RMIクライアント。
 * レジストリからリモートオブジェクトを取得して、メソッドを呼び出す。
 */
public class RmiClient {

    public static void main(String[] args) throws Exception {
        // 1. レジストリから「HelloService」を名前で検索してスタブを取得する
        HelloRemote hello = (HelloRemote) Naming.lookup("rmi://localhost/HelloService");

        // 2. リモートメソッドを呼び出す（実際の処理はサーバー側で実行される）
        String result = hello.sayHello("World");

        System.out.println("[Client] サーバーから受信: " + result);
    }
}
