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
public class DeleteContactFragment extends Fragment {

    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_contact, container, false);

        editText = view.findViewById(R.id.txt_delete_id);
        button = view.findViewById(R.id.delete_contact_bn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteUser();
            }
        });

        return view;
    }

    private void deleteUser(){
        int id = AppUtils.toInt(editText.getText().toString());

        UserRepository repository = new UserRepository(getContext());

        editText.setText("");
        Toast.makeText(getActivity(), repository.deleteUser(id), Toast.LENGTH_SHORT).show();
    }
}
