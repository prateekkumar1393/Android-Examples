package prateek.gds.roomexample.ui;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import prateek.gds.roomexample.R;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button bnSave, bnView, bnUpdate, bnDelete;
    OnDbOpListener dbOpListener;

    public interface OnDbOpListener{
        void dbOpPerformed (int method);
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

        bnUpdate = view.findViewById(R.id.bn_update_contact);
        bnUpdate.setOnClickListener(this);

        bnDelete = view.findViewById(R.id.bn_delete_contact);
        bnDelete.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bn_add_contact:
                dbOpListener.dbOpPerformed(0);
                break;
            case R.id.bn_view_contact:
                dbOpListener.dbOpPerformed(1);
                break;
            case R.id.bn_update_contact:
                dbOpListener.dbOpPerformed(2);
                break;
            case R.id.bn_delete_contact:
                dbOpListener.dbOpPerformed(3);
                break;
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            dbOpListener = (OnDbOpListener) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+" must implement the interface method...");
        }
    }
}
