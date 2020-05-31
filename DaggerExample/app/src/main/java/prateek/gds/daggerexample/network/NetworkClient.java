package prateek.gds.daggerexample.network;

public class NetworkClient {
    private NetworkConnection mConnection;

    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}
