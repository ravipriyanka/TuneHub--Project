package com.kodnest.rhytmvista.service;

import java.util.List;

import com.kodnest.rhytmvista.entity.Song;

public interface SongService {

	public void addSong(Song song);

	public List<Song> fetchAllSongs();

	public boolean songExists(String name);

	public void updateSong(Song s);

}