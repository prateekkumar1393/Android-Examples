package prateek.gds.sqliteexample;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReadContactFragment extends Fragment {

    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_contact, container, false);
        textView = view.findViewById(R.id.txt_display);
        readContact();

        return view;
    }

    private void readContact(){
        ContactDbHelper contactDbHelper = new ContactDbHelper(getActivity());
        SQLiteDatabase db = contactDbHelper.getReadableDatabase();

        Cursor cursor = contactDbHelper.readContact(db);
        String info = "";

        while (cursor.moveToNext()){
            String id =Integer.toString(cursor.getInt(cursor.getColumnIndex(ContactContract.ContractEntry.CONTACT_ID)));
            String name = cursor.getString(cursor.getColumnIndex(ContactContract.ContractEntry.NAME));
            String email = cursor.getString(cursor.getColumnIndex(ContactContract.ContractEntry.EMAIL));

            info += "\n\nId : "+id+"\nName : "+name+"\nEmail : "+email;
        }

        textView.setText(info);
        contactDbHelper.close();
    }
}
