package com.traveller.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traveller.model.Places;
import com.traveller.repository.PlaceRepository;


@Service
public class PlacesService {

	@Autowired
	private PlaceRepository placeRepository;
	
	
	 // Create Places
    @Transactional
    public Places savePlace(Places place) {
        return placeRepository.save(place);
    }
    
    @Transactional
    public List<Places> savePlaces(List<Places> place) {
        return placeRepository.saveAll(place);
    }
    
    
    public List<Places> getPlaces() {
        return placeRepository.findAll();
    }
    

    public List<Places> getPlaceNames(String name)
    {
    	return placeRepository.findByPlaceName(name);
    }

    public List<Places> getplaceSeason(String name)
    {
    	return placeRepository.findByPlaceSeason(name);
    }

    public List<Places> getplaceType(String name)
    {
    	return placeRepository.findByPlaceType(name);
    }
    public List<Places> getSubplaceType(String name)
    {
    	return placeRepository.findByPlaceSubtype(name);
    }
 
    
    public List<Places> getplacePackage(double price)
    {
    	return placeRepository.findByPlacePackage(price);
    }
    public List<Places> getplaceRating(int rating)
    {
    	return placeRepository.findByRating(rating);
    }
    
    

    public List<Places> getplacePackageGreaterThanEqual(double price)
    {
    	return placeRepository.findByPlacePackageGreaterThanEqual(price);
    }
  
    public List<Places> getplacePackageLessThanEqual(double price)
    {
    	return placeRepository.findByPlacePackageLessThanEqual(price);
    }
    
    
    //Between
    public List<Places> getplacePackageBetween(double start,double end)
    {
    	return placeRepository.findByPlacePackageBetween(start,end);
    }
    

    
}
