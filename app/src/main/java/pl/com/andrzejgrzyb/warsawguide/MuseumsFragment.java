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
 * {@link MuseumsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MuseumsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_museums, container, false);

        ArrayList<AttractionObject> attractions = new ArrayList<>();
        Resources res = getResources();
        attractions.add(new AttractionObject(getString(R.string.museum_chopin_title), getString(R.string.museum_chopin_desccription)));
        attractions.add(new AttractionObject(getString(R.string.museum_national_title), getString(R.string.museum_national_description)));

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        AttractionArrayAdapter attractionArrayAdapter = new AttractionArrayAdapter(rootView.getContext(), attractions);
        listView.setAdapter(attractionArrayAdapter);

        return rootView;
    }

}
