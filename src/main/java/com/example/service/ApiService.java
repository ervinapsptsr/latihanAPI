package com.example.service;
import com.example.service.ApiServiceRest;
import java.util.List;

import com.example.model.ApiModel;;

public interface ApiService 
{
	 List <ApiModel> selectAllApi();
	 ApiModel selectApi(String mode);
	  
}
