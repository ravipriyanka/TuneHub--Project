package com.kodnest.rhytmvista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.rhytmvista.entity.Playlist;

public interface PlaylistRepository 
	extends JpaRepository<Playlist, Integer>{

}