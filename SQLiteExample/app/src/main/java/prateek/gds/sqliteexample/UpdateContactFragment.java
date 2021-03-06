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

public class UpdateContactFragment extends Fragment {

    private Button update_bn;
    private EditText Id, Name, Email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_contact, container, false);
        Id = view.findViewById(R.id.txt_update_id);
        Name = view.findViewById(R.id.txt_update_name);
        Email = view.findViewById(R.id.txt_update_email);
        update_bn = view.findViewById(R.id.bn_update_save);

        update_bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateContact();
            }
        });
        return view;
    }

    private void updateContact() {
        String id = Id.getText().toString();
        String name = Name.getText().toString();
        String email = Email.getText().toString();

        ContactDbHelper contactDbHelper = new ContactDbHelper(getActivity());
        SQLiteDatabase db = contactDbHelper.getWritableDatabase();
        contactDbHelper.updateContact(Integer.parseInt(id), name, email, db);
        contactDbHelper.close();

        Id.setText("");
        Name.setText("");
        Email.setText("");
        Toast.makeText(getActivity(), "Contact updated...", Toast.LENGTH_SHORT).show();
    }
}
