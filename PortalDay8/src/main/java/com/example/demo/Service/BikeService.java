package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BikeRepo;
import com.example.demo.model.Bike;

@Service
public class BikeService {

	@Autowired
	BikeRepo br;
	
	public Bike savebike(Bike bb) {
		return br.save(bb);
		
	}
	
	public List<Bike>savenbike(List<Bike> bb){
		return (List<Bike>)br.saveAll(bb);
	}
	
//GETBYID AND NAME BY SQL
	
	public List<Bike> getbikeyearinfo(int i){
		return br.getBikeyear(i);
	}
	public List<Bike> getbikenameinfo(String s){
		return br.getBikename(s);
	}
	public List<Bike> getbikedetailsinfo(int i,String s){
		return br.getBikedetails(i, s);
	}
}
