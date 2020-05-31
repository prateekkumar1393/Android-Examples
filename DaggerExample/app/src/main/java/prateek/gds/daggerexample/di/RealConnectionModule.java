package prateek.gds.daggerexample.di;

import dagger.Binds;
import dagger.Module;
import prateek.gds.daggerexample.network.NetworkConnection;
import prateek.gds.daggerexample.network.RealConnection;

@Module
public interface RealConnectionModule {

    @Binds
    NetworkConnection bindsNetworkConnection(RealConnection connection);
}
