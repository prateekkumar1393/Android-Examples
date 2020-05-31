package prateek.gds.daggerexample.network;

import javax.inject.Inject;

public class NetworkClient {
    private NetworkConnection mConnection;

    @Inject
    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}
