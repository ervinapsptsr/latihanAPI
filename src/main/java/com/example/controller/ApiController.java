package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.ApiServiceRest;
import com.example.model.ApiModel;


public class ApiController {

	  @Autowired
	  ApiServiceRest apiDAO;
	  
	    
	    @RequestMapping("/")
	    public String index ()
	    {
	        return "index";
	    }
	    
	    @RequestMapping("/api/viewall")
	    public String view (Model ApiModel)
	    {
	        List<ApiModel> api = apiDAO.selectAllApi();
	        ApiModel.addAttribute ("api", api);

	        return "viewall";
	    }

	    @RequestMapping("/api/view/{mode}")
	    public String viewPath (Model model,
	            @PathVariable(value = "mode") String mode)
	    {
	        ApiModel api = apiDAO.selectApi(mode);

	        if (api != null) {
	            model.addAttribute ("api", api);
	            return "view";
	        } else {
	            model.addAttribute ("api", api);
	            return "not-found";
	        }
	    }
	    
	    
}


