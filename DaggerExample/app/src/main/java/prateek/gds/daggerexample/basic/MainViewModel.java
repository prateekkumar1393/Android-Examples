package prateek.gds.daggerexample.basic;

import javax.inject.Inject;

import prateek.gds.daggerexample.network.NetworkClient;

public class MainViewModel {
    private NetworkClient mClient;

    @Inject
    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
