package com.example.mynotes;

import androidx.cardview.widget.CardView;

import com.example.mynotes.Models.Notes;

public interface NotesClickListener {
    void onCLick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
