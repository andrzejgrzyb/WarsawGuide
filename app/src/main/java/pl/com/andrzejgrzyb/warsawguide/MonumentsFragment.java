package pl.com.andrzejgrzyb.warsawguide;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MonumentsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MonumentsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_monuments, container, false);

        ArrayList<AttractionObject> attractions = new ArrayList<>();
        Resources res = getResources();
        attractions.add(new AttractionObject(getString(R.string.monument_waza_title), getString(R.string.monument_waza_description)));
        attractions.add(new AttractionObject(getString(R.string.monument_mermaid_title), getString(R.string.monument_mermaid_description)));

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        AttractionArrayAdapter attractionArrayAdapter = new AttractionArrayAdapter(rootView.getContext(), attractions);
        listView.setAdapter(attractionArrayAdapter);

        return rootView;
    }

}
