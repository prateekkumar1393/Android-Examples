package prateek.gds.mvvm;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class BusRepository {
    private static BusRepository instance;
    private List<BusModel> buses;

    private BusRepository() {
        this.buses = new ArrayList<>();
    }

    public static BusRepository getInstance(){
        if(instance==null)
            instance = new BusRepository();

        return instance;
    }

    // Pretend to get data from a webservice or online source
    public MutableLiveData<List<BusModel>> getBuses(){
        setBuses();
        MutableLiveData<List<BusModel>> data = new MutableLiveData<>();
        data.setValue(buses);
        return data;
    }

    private void setBuses(){
        buses.add(new BusModel("SRS Travels", 600));
        buses.add(new BusModel("National Travels", 500));
        buses.add(new BusModel("KPN Travels", 550));
    }
}
