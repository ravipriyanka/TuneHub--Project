package com.kodnest.rhytmvista.service;

import java.util.List;

import com.kodnest.rhytmvista.entity.Playlist;

public interface PlaylistService {

	public void addplaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();


}