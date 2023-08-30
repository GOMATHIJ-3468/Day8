package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer>{

	@Query(value="select * from Biketable where year=:s",nativeQuery=true)
	public List<Bike>getBikeyear(@Param("s") int year);
	
	@Query(value="select * from Biketable where bikename=:s",nativeQuery=true)
	public List<Bike>getBikename(@Param("s") String bikename);
	
	@Query(value="select * from Biketable where year=:s or bikename=:sn",nativeQuery=true)
	public List<Bike>getBikedetails(@Param("s") int id,@Param("sn") String bikename);
	
	
}
