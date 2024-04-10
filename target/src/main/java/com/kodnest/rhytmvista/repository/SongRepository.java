package com.kodnest.rhytmvista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.rhytmvista.entity.Song;

public interface SongRepository 
extends JpaRepository<Song, Integer>{

	public Song findByName(String name);

}