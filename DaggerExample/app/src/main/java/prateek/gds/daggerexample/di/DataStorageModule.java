package prateek.gds.daggerexample.di;

import dagger.Module;
import dagger.Provides;
import prateek.gds.daggerexample.utils.DataStorageHelper;
import prateek.gds.daggerexample.utils.Transaction;

@Module
public class DataStorageModule {

    @Provides
    public Transaction provideTransactions(){
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public DataStorageHelper provideDataStorageHelper(Transaction transaction){
        DataStorageHelper dataStorageHelper = new DataStorageHelper(transaction);
        dataStorageHelper.setStoragePermission(true);
        return dataStorageHelper;
    }
}
