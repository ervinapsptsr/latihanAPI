package com.example.service;

import java.util.List;

import com.example.model.ApiModel;

public interface ApiDAO {
	 List <ApiModel> selectAllApi();
	 ApiModel selectApi(String mode);
	

}