package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.ApiModel;



@Service 
public class ApiDAOImplementation implements ApiDAO {

	@Autowired
	private RestTemplate rest;

@Override
public ApiModel selectApi (String mode) {
	ApiModel api = rest.getForObject("http://api.justease.id/point_level/"+ mode, ApiModel.class);
	return api;
	
}


@Override
public List<ApiModel> selectAllApi () {
	return null;
}

}