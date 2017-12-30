package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Russ on 12/30/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<EarthquakeReport> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<EarthquakeReport> earthquakeReport) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakeReport);
}
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
// Get the {@link EarthquakeReport} object located at this position in the list
        EarthquakeReport currentEarthquakeReport = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        // Get the location rom the current EarthquakeReport object and
        // set this text on the name TextView
        nameTextView.setText(currentEarthquakeReport.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.mag_number);
        // Get the magnitude number from the current EarthquakeReport object and
        // set this text on the number TextView
        numberTextView.setText(currentEarthquakeReport.getMagNumber());

        // Find the TextView in the list_item.xml layout with the ID date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        // Get the date from the current EarthquakeReport object and
        // set this text on the number TextView
        dateTextView.setText(currentEarthquakeReport.getDate());

         // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }

}