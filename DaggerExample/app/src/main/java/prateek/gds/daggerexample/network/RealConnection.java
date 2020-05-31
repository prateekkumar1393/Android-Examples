package prateek.gds.daggerexample.network;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import prateek.gds.daggerexample.basic.Constants;

public class RealConnection implements NetworkConnection {
    private final String mEndpoint;
    private String mUsername;
    private String mPassword;

    @Inject
    public RealConnection(@Named("endpoints") String endpoint, @Named("username") String mUsername, @Named("password") String mPassword) {
        this.mEndpoint = endpoint;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    @Override
    public String doReq() {
        Log.d(Constants.TAG, "doReq: Username: " + mUsername + " Password: " + mPassword);
        return this.mEndpoint;
    }
}
