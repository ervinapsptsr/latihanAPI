package com.example.model;


import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiModel
{
	
	
    private String mode;
    private int limit;
    private int page;
    private String results;
    
	
}

