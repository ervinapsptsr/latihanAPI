package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.model.ApiModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class ApiServiceRest implements ApiService {
	
	@Autowired
	private ApiDAO apiDAO;
	
	@Override
	public List<ApiModel> selectAllApi() {
		log.info("REST - select all api");
		return apiDAO.selectAllApi();
	}
	
	@Override
	public ApiModel selectApi (String mode) {
		log.info("REST - select point level{}", mode);
		return apiDAO.selectApi(mode);
		
	}
}