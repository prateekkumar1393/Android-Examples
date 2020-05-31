package prateek.gds.daggerexample.network;

import android.util.Log;

import javax.inject.Inject;

import prateek.gds.daggerexample.basic.Constants;

public class NetworkTester {

    @Inject
    public NetworkTester() {
    }

    public void attachToNetwork(NetworkClient client){
        Log.d(Constants.TAG, "attachToNetwork: attached to network");
    }
}
