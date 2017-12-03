package nyc.c4q.fragmentsundaydec3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {

    View rootView;
    TextView textView;


    public TextFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String s  = getArguments().getString("Edit_text");
        rootView = inflater.inflate(R.layout.fragment_text, container, false);
        textView = rootView.findViewById(R.id.tv_01);
        textView.setText(s);
        return rootView;
    }

}
