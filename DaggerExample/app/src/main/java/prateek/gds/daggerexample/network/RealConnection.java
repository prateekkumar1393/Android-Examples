package prateek.gds.daggerexample.network;

import javax.inject.Inject;

import prateek.gds.daggerexample.basic.Constants;

public class RealConnection implements NetworkConnection {
    private final String mEndpoint;

    @Inject
    public RealConnection() {
        this.mEndpoint = Constants.ENDPOINT;
    }

    @Override
    public String doReq() {
        return this.mEndpoint;
    }
}
