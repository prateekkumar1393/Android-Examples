package prateek.gds.daggerexample.di;

import dagger.Module;
import dagger.Provides;
import prateek.gds.daggerexample.network.NetworkConnection;
import prateek.gds.daggerexample.network.RealConnection;

@Module
public class RealConnectionModule {
    private String mEndpoint;

    public RealConnectionModule(String mEndpoint) {
        this.mEndpoint = mEndpoint;
    }

    @Provides
    public NetworkConnection provideNetworkConnection(){
        return new RealConnection(mEndpoint);
    }
}
