package com.kodnest.rhytmvista.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.rhytmvista.entity.Playlist;
import com.kodnest.rhytmvista.repository.PlaylistRepository;
import com.kodnest.rhytmvista.service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService{

	@Autowired
	PlaylistRepository playlistRepository;

	@Override
	public void addplaylist(Playlist playlist) {
		playlistRepository.save(playlist);
	}

	@Override
	public List<Playlist> fetchAllPlaylists() {
		List<Playlist> allplaylist = playlistRepository.findAll();
		return allplaylist;
	}

}