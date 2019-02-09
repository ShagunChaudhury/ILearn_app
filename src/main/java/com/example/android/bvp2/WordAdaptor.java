package com.example.android.bvp2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {

    public WordAdaptor(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //   return super.getView(position, convertView, parent);
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView questiontv = (TextView) listItemView.findViewById(R.id.q_tv);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        questiontv.setText(currentWord.getanswer());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView answertv = (TextView) listItemView.findViewById(R.id.ans_tv);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        answertv.setText(currentWord.getquestion());

        return listItemView;
    }
}
