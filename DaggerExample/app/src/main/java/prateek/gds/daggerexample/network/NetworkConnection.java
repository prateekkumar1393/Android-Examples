package prateek.gds.daggerexample.network;

import prateek.gds.daggerexample.basic.Constants;

public class NetworkConnection {
    private String mEndpoint;

    public NetworkConnection(){
        this.mEndpoint = Constants.ENDPOINT;
    }

    public String doReq() {
        return this.mEndpoint;
    }
}
