package prateek.gds.roomexample.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import prateek.gds.roomexample.R;
import prateek.gds.roomexample.model.User;
import prateek.gds.roomexample.repository.UserRepository;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddContactFragment extends Fragment {

    private EditText UserName, UserEmail;
    private Button bnSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_contact, container, false);

        UserName = view.findViewById(R.id.txt_contact_name);
        UserEmail = view.findViewById(R.id.txt_contact_email);
        bnSave = view.findViewById(R.id.bn_save);

        bnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });

        return view;
    }

    private void addUser(){
        String name = UserName.getText().toString();
        String email = UserEmail.getText().toString();


        UserRepository repository = new UserRepository(getContext());
        repository.addUser(name, email);

        UserName.setText("");
        UserEmail.setText("");
        Toast.makeText(getActivity(), "User added successfully.", Toast.LENGTH_SHORT).show();
    }
}
