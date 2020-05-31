package prateek.gds.daggerexample.utils;

import android.util.Log;

import prateek.gds.daggerexample.basic.Constants;

public class DataStorageHelper {
    private boolean mPermission;
    private Transaction mTransaction;

    //this class is not part of our own code
    //this class is from third party library
    //so we cannot change any code in this class

    public DataStorageHelper(Transaction mTransaction) {
        this.mTransaction = mTransaction;
    }

    public void storeData(String data) {
        if (mPermission)
            Log.d(Constants.TAG, "storeData: Storing data: " + data + ", at " + mTransaction);
        else
            Log.d(Constants.TAG, "storeData: Storage permission not granted");
    }

    public void setStoragePermission(boolean permission) {
        this.mPermission = permission;
        Log.d(Constants.TAG, "checkStoragePermission: Storage Permission: ? " + mPermission);
    }
}
