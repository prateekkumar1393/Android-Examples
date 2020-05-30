package prateek.gds.sqliteexample;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button bnSave, bnView, bnDelete, bnUpdate;
    OnDbOpListner dbOpListner;

    public interface OnDbOpListner{
        void dbOpPerformed(int method);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        bnSave = view.findViewById(R.id.bn_add_contact);
        bnSave.setOnClickListener(this);

        bnView = view.findViewById(R.id.bn_view_contact);
        bnView.setOnClickListener(this);

        bnDelete = view.findViewById(R.id.bn_delete_contact);
        bnDelete.setOnClickListener(this);

        bnUpdate = view.findViewById(R.id.bn_update_contact);
        bnUpdate.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bn_add_contact:
                dbOpListner.dbOpPerformed(0);
                break;
            case R.id.bn_view_contact:
                dbOpListner.dbOpPerformed(1);
                break;
            case R.id.bn_update_contact:
                dbOpListner.dbOpPerformed(2);
                break;
            case R.id.bn_delete_contact:
                dbOpListner.dbOpPerformed(3);
                break;
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try{
            dbOpListner = (OnDbOpListner) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+" must implements interface method.");
        }
    }
}
