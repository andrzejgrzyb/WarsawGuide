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
 * {@link HotelsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HotelsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);

        ArrayList<AttractionObject> attractions = new ArrayList<>();
        Resources res = getResources();
        attractions.add(new AttractionObject(getString(R.string.hotel_sleepwell_title), getString(R.string.hotel_sleepwell_description)));
        attractions.add(new AttractionObject(getString(R.string.hotel_metropol_title), getString(R.string.hotel_metropol_description)));

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        AttractionArrayAdapter attractionArrayAdapter = new AttractionArrayAdapter(rootView.getContext(), attractions);
        listView.setAdapter(attractionArrayAdapter);

        return rootView;
    }

}
