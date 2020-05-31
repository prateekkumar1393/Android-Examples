package prateek.gds.daggerexample.network;

import javax.inject.Inject;

import prateek.gds.daggerexample.basic.Constants;

public class NetworkConnection {
    private String mEndpoint;

    @Inject
    public NetworkConnection(){
        this.mEndpoint = Constants.ENDPOINT;
    }

    public String doReq() {
        return this.mEndpoint;
    }
}
