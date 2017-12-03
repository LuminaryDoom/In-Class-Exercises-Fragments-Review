package nyc.c4q.fragmentsundaydec3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    View rootview;
    private EditText userText;
    private Button sendButton;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_main, container, false);

        userText = rootview.findViewById(R.id.ev_01);
        sendButton = rootview.findViewById(R.id.button_01);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextFragment textFragment = new TextFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Bundle bundle = new Bundle();
                String sent = userText.getText().toString();
                bundle.putString("Edit_text", sent);
                textFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.container_frame, textFragment);
                fragmentTransaction.addToBackStack("Next");
                fragmentTransaction.commit();
            }

        });
        return rootview;
    }

}
