package prateek.gds.daggerexample.network;

import javax.inject.Inject;

public class FakeConnection implements NetworkConnection {

    @Inject
    public FakeConnection() {
    }

    @Override
    public String doReq() {
        return "This is testing connection";
    }
}
