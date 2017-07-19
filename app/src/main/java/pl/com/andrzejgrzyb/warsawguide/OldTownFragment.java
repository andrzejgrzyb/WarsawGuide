package pl.com.andrzejgrzyb.warsawguide;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
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
 * {@link OldTownFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OldTownFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OldTownFragment extends Fragment {

    public OldTownFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_old_town, container, false);

        ArrayList<AttractionObject> attractions = new ArrayList<>();
        Resources res = getResources();
        attractions.add(new AttractionObject(getString(R.string.oldtown_castle_title), getString(R.string.oldtown_castle_description), R.drawable.royal_castle_2008_3));
        attractions.add(new AttractionObject(getString(R.string.oldtown_stmartin_title), getString(R.string.oldtown_stmartin_description), R.drawable.marcin1));

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        AttractionArrayAdapter attractionArrayAdapter = new AttractionArrayAdapter(rootView.getContext(), attractions);
        listView.setAdapter(attractionArrayAdapter);

        return rootView;
    }

}
