package prateek.gds.mvvm;

import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<List<BusModel>> buses;
    private MutableLiveData<Boolean> isUpdated;

    public void init(){
        isUpdated = new MutableLiveData<>();

        if(buses ==  null)
            buses = BusRepository.getInstance().getBuses();
    }

    public MutableLiveData<List<BusModel>> getBuses() {
        return buses;
    }

    public MutableLiveData<Boolean> getIsUpdated() {
        return isUpdated;
    }

    public void addNewValue(final BusModel busModel) {
        new AsyncTask<Void, Void, Void>(){

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                isUpdated.postValue(true);
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);

                List<BusModel> curr = buses.getValue();
                curr.add(busModel);
                buses.postValue(curr);
                isUpdated.postValue(false);
            }

            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute();
    }
}
