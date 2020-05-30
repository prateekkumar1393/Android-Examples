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
import prateek.gds.roomexample.repository.UserRepository;
import prateek.gds.roomexample.util.AppUtils;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateContactFragment extends Fragment {

    private EditText UpdateId, UpdateName, UpdateEmail;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_contact, container, false);

        UpdateId = view.findViewById(R.id.txt_update_id);
        UpdateName = view.findViewById(R.id.txt_update_name);
        UpdateEmail = view.findViewById(R.id.txt_update_email);
        button = view.findViewById(R.id.bn_update_save);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateUser();
            }
        });

        return view;
    }

    private void updateUser(){
        int id = AppUtils.toInt(UpdateId.getText().toString());
        String name = UpdateName.getText().toString();
        String email = UpdateEmail.getText().toString();

        UserRepository repository = new UserRepository(getContext());

        UpdateId.setText("");
        UpdateEmail.setText("");
        UpdateName.setText("");
        Toast.makeText(getActivity(), repository.updateUser(id, name, email), Toast.LENGTH_SHORT).show();
    }
}
