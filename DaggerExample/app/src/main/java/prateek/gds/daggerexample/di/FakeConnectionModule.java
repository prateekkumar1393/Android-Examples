package prateek.gds.daggerexample.di;

import dagger.Module;
import dagger.Provides;
import prateek.gds.daggerexample.network.FakeConnection;
import prateek.gds.daggerexample.network.NetworkConnection;

@Module
public class FakeConnectionModule {

    @Provides
    public static NetworkConnection provideNetworkConnection(FakeConnection connection){
        return connection;
    }
}
