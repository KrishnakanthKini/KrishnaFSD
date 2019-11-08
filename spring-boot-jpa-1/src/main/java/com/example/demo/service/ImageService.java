package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Album;
import com.example.demo.model.Image;

public interface ImageService {
	public List<Image> getAllImages();
	
	public Optional<Image> getImageById(int theId);

	void createImage(Image Image);
}
