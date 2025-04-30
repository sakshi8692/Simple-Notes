package com.example.demo.service;


import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    // Create or Update Note
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    // Get all Notes
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    // Get a Note by ID
    public Optional<Note> getNoteById(Long id) {
        return noteRepository.findById(id);
    }

    // Delete a Note by ID
    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }
}
