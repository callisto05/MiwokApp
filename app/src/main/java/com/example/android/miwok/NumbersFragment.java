package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersFragment extends Fragment {

    private MediaPlayer mediaPlayer;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Lutti","One", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("otiiko","Two", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("tolookosu","Three", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("oyyisa","Four", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("massokka","Five", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("temmokka","Six", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("kenekaku","Seven", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("kawinta","Eight", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("wo’e","Nine", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("na’aacha","Ten", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(getActivity(), word.getmAudio());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        releaseMediaPlayer();
                    }
                });
            }
        });

        return rootView;
    }


    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        releaseMediaPlayer();
    }
}
