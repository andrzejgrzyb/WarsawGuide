package pl.com.andrzejgrzyb.warsawguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Andrzej on 19.07.2017.
 */

public class AttractionArrayAdapter extends ArrayAdapter<AttractionObject> {

    public AttractionArrayAdapter(Context context, ArrayList<AttractionObject> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        AttractionObject tourItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title);
        TextView descriptionTextView = (TextView) convertView.findViewById(R.id.description);

        imageView.setImageResource(tourItem.getImage());
        titleTextView.setText(tourItem.getTitle());
        descriptionTextView.setText(tourItem.getDescription());

        return convertView;
    }
}
