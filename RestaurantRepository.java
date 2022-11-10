package com.example.RestaurantApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.RestaurantApp.model.Restaurant;


@Repository
public interface  RestaurantRepository  extends JpaRepository<Restaurant, Integer>{

	@Query(value ="select u from Restaurant u where u.name=:n")
	public List<Restaurant> getbyKeywordd(@Param("n")String name);
	
	@Query(value ="select u from Restaurant u where u.name=:n and u.city=:c")
	public List<Restaurant> getbyKeywordCity(@Param("n")String name, @Param("c")String city);
	
	@Query(value ="select u from Restaurant u where u.name Like '%:n%' and u.city=:c and u.cusine=:cu")
	public List<Restaurant> getbyKeyword(@Param("n")String name, @Param("c")String city, @Param("cu") String cusine);
	
	@Query(value ="select u from Restaurant u where u.name LIKE %:n% " )
	public List<Restaurant> getbyonlyKeyword(@Param("n")String name);
	
	
	
}
