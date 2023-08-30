package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BikeService;
import com.example.demo.model.Bike;

@RestController
public class BikeController {

	@Autowired
	BikeService bs;
	
	@PostMapping("addbike")
	public Bike addcourseinfo(@RequestBody Bike ss) {
		return bs.savebike(ss);
	}
	
	@PostMapping("addnbike")
	public List<Bike> addn(@RequestBody List<Bike> ss) {
		return bs.savenbike(ss);
	}
	
//GETSTUDENT BY ID AND NAME USING SQL
	
		@GetMapping("showyearq/{bikeid}")
		public List<Bike> showbikeyear(@PathVariable int bikeid){
			return bs.getbikeyearinfo(bikeid);
		}
	
		@GetMapping("shownameq/{bikename}")
		public List<Bike> showbikename(@PathVariable String bikename){
			return bs.getbikenameinfo(bikename);
		}
		
		@GetMapping("showdetailsq/{bikeid}/{bikename}")
		public List<Bike> showbikedetails(@PathVariable int bikeid,@PathVariable String bikename){
			return bs.getbikedetailsinfo(bikeid, bikename);
		}
}
