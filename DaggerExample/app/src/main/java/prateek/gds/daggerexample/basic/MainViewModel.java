package prateek.gds.daggerexample.basic;

import javax.inject.Inject;

import prateek.gds.daggerexample.network.NetworkClient;
import prateek.gds.daggerexample.utils.DataStorageHelper;

public class MainViewModel {
    private NetworkClient mClient;
    private final DataStorageHelper mDataStorageHelper;

    @Inject
    public MainViewModel(NetworkClient networkClient, DataStorageHelper dataStorageHelper) {
        this.mClient = networkClient;
        this.mDataStorageHelper = dataStorageHelper;
    }

    public String fetchData(){
        String data = mClient.fetchData();
        mDataStorageHelper.storeData(data);
        return data;
    }
}
