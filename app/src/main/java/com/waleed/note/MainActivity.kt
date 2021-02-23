package com.waleed.note

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val notesList = ArrayList<Note>()
        notesList.add(Note(R.drawable.ic_item, "Hello note 1!!", "this is note 2"))
        notesList.add(Note(R.drawable.ic_item, "Hello note 1!!", "this is note 2"))
        notesList.add(Note(R.drawable.ic_item, "Hello note 1!!", "this is note 2"))
        notesList.add(Note(R.drawable.ic_item, "Hello note 1!!", "this is note 2"))
        notesList.add(Note(R.drawable.ic_item, "Hello note 1!!", "this is note 2"))

    }
}

