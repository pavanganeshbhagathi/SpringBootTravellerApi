package com.traveller.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traveller.model.Places;
import com.traveller.service.PlacesService;

@RestController
@RequestMapping(path="/places")
public class PlaceController {

  @Autowired	
  private PlacesService placeService;

  


	

   @PostMapping(path="/createPlaces")
	public ResponseEntity<Places>  saveCrop(@Valid @RequestBody Places places)
	{
	  
      Places savePlace2 = placeService.savePlace(places);
		
		return new ResponseEntity<Places>(savePlace2, HttpStatus.CREATED);
	}
	
	@PostMapping(path="/createMultiplePlaces")
	public ResponseEntity<List<Places>> SaveCrops(@Valid @RequestBody List<Places> places)
	{
		List<Places> savePlaces = placeService.savePlaces(places);
		return new ResponseEntity<List<Places>>(savePlaces, HttpStatus.CREATED);
	}
	
	@GetMapping(path="/retrivePlaces")
	public ResponseEntity<List<Places>> getCrops()
	{
		List<Places> places = placeService.getPlaces();
		
		return new ResponseEntity<List<Places>>(places, HttpStatus.OK);
		
	}
	@GetMapping(path="/retrivePlaces/{placeName}")
	public ResponseEntity<List<Places>> getPlaceNames(@PathVariable String placeName)
	{
		List<Places> placeNames = placeService.getPlaceNames(placeName);
		
		return new ResponseEntity<List<Places>>(placeNames, HttpStatus.OK);
		
	}
	
	

	
	@GetMapping(path="/retrivePlacespackages/{placePakage}")
	public ResponseEntity<List<Places>> getplacePackages(@PathVariable double placePakage)
	{
		 List<Places> getplacePackage = placeService.getplacePackage(placePakage);
		
		return new ResponseEntity<List<Places>>(getplacePackage, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/retriveplacePackageGreaterThanEqual/{placePakage}")
	public ResponseEntity<List<Places>> getplacePackageGreaterThanEqual(@PathVariable double placePakage)
	{
		 List<Places> getplacePackageGreaterThanEqual = placeService.getplacePackageGreaterThanEqual(placePakage);
		
		return new ResponseEntity<List<Places>>(getplacePackageGreaterThanEqual, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/retriveplacePackageLessThanEqual/{placePakage}")
	public ResponseEntity<List<Places>> getplacePackageLessThanEqual(@PathVariable double placePakage)
	{
		List<Places> getplacePackageLessThanEqual = placeService.getplacePackageLessThanEqual(placePakage);
		
		return new ResponseEntity<List<Places>>(getplacePackageLessThanEqual, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/retriveRating/{rating}")
	public ResponseEntity<List<Places>> getplaceRating(@PathVariable int rating)
	{
		List<Places> getplaceRating = placeService.getplaceRating(rating);
		
		return new ResponseEntity<List<Places>>(getplaceRating, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/retriveBySeason")
	public ResponseEntity<List<Places>> getplaceSeason(String season)
	{
     List<Places> getplaceSeason = placeService.getplaceSeason(season);
		
		return new ResponseEntity<List<Places>>(getplaceSeason, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/retriveplaceType/{placeType}")
	public ResponseEntity<List<Places>> getplaceType(@PathVariable String placeType)
	{
    List<Places> getplaceType = placeService.getplaceType(placeType);
		
		return new ResponseEntity<List<Places>>(getplaceType, HttpStatus.OK);
		
	}
	@GetMapping(path="/retriveSubplaceType/{subplaceType}")
	public ResponseEntity<List<Places>> getSubplaceType(@PathVariable String subplaceType)
	{
          List<Places> subplaceType2 = placeService.getSubplaceType(subplaceType);
		
		return new ResponseEntity<List<Places>>(subplaceType2, HttpStatus.OK);
		
	}

	@GetMapping(path="/retrivebetweenpackage/start/{start}/between/end/{end}")
	public ResponseEntity<List<Places>> getplacePackageBetween(@PathVariable double start, @PathVariable double end)
	{
        
		List<Places> getplacePackageBetween = placeService.getplacePackageBetween(start, end);
		return new ResponseEntity<List<Places>>(getplacePackageBetween, HttpStatus.OK);
		
	}
	
	
	
}
