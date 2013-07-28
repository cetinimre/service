package com.tradespeople.json.response;

import com.tradespeople.common.api.BaseResponse;
import com.tradespeople.model.MockModel;

public class MockModelResponse extends BaseResponse {
	
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
