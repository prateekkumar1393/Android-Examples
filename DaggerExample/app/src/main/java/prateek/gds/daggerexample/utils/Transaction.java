package prateek.gds.daggerexample.utils;

public class Transaction {
    //this class is not part of our own code
    //this class is from third party library
    //so we cannot change any code in this class

    private long mTime;

    public Transaction(long mTime) {
        this.mTime = mTime;
    }

    @Override
    public String toString() {
        return String.valueOf(mTime);
    }
}
