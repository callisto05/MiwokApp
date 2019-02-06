package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Currency;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColorResourceId = color;
    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);



        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        ImageView image = (ImageView) listItemView.findViewById(R.id.image_logo);


        miwokTextView.setText(currentWord.getMiwok_word());
        defaultTextView.setText(currentWord.getDefault_word());

        if(currentWord.hasImage()){
            image.setImageResource(currentWord.getImageResourceId());
        }
        else{
            image.setVisibility(View.GONE);
        }


        View text_container = listItemView.findViewById(R.id.textviewlayout);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        text_container.setBackgroundColor(color);

        return listItemView;
    }
}
