package prateek.gds.sqliteexample;


import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteContactFragment extends Fragment {

    private EditText Id;
    private Button delete_bn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_contact, container, false);
        Id = view.findViewById(R.id.txt_delete_id);
        delete_bn = view.findViewById(R.id.delete_contact_bn);

        delete_bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteContact();
            }
        });
        return view;
    }

    private void deleteContact(){
        String id = Id.getText().toString();

        ContactDbHelper contactDbHelper = new ContactDbHelper(getActivity());
        SQLiteDatabase db = contactDbHelper.getWritableDatabase();
        contactDbHelper.deleteContact(Integer.parseInt(id), db);
        contactDbHelper.close();

        Id.setText("");
        Toast.makeText(getActivity(), "Contact Removed Successfully...", Toast.LENGTH_SHORT).show();
    }
}
