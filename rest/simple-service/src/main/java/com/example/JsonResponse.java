package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import business.UserInfo;

@Path("newresource") 
public class JsonResponse {
	
	private ObjectMapper mapper = new ObjectMapper();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getNewAnswer() {
		UserInfo user = new UserInfo();
		user.setName("Juan");
		user.setSurname("Perez");
		user.setAge(30);
		
		try {
			return mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return StringUtils.EMPTY;
	}
}
