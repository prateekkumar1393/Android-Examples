package prateek.gds.daggerexample.basic;

import prateek.gds.daggerexample.network.NetworkClient;

public class MainViewModel {
    private NetworkClient mClient;

    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
