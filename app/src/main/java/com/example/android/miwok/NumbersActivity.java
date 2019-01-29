/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mai_list_container);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Lutti","One"));
        words.add(new Word("otiiko","Two"));
        words.add(new Word("tolookosu","Three"));
        words.add(new Word("oyyisa","Four"));
        words.add(new Word("massokka","Five"));
        words.add(new Word("temmokka","Six"));
        words.add(new Word("kenekaku","Seven"));
        words.add(new Word("kawinta","Eight"));
        words.add(new Word("wo’e","Nine"));
        words.add(new Word("na’aacha","Ten"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
