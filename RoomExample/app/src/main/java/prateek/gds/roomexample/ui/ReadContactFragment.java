package prateek.gds.roomexample.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import prateek.gds.roomexample.R;
import prateek.gds.roomexample.model.User;
import prateek.gds.roomexample.repository.UserRepository;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadContactFragment extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_contact, container, false);

        textView = view.findViewById(R.id.txt_display);

        UserRepository repository = new UserRepository(getContext());
        List<User> users = repository.getUsers();
        String info = "";

        for (User user : users){
            info += "\n\nId : "+user.getId()+"\nName : "+user.getName()+"\nEmail : "+user.getEmail();
        }

        if(!info.equals(""))
            textView.setText(info);

        return  view;
    }

}
