package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.entity.Album;


public class AlbumServiceImpl implements AlbumService {
	private AlbumRepository albumRepository;

	public AlbumServiceImpl(AlbumRepository albumRepository) {
		super();
		this.albumRepository = albumRepository;
	}

	@Override
	public void createAlbum(Album album) {
		albumRepository.save(album);

	}
	
	@Override
	@Transactional
	public List<Album> getAllAlbum() {
		// TODO Auto-generated method stub
		return albumRepository.findAll();
	}

}
