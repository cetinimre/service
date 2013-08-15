package com.tradespeople.common.api;

public class BaseModel {
    
    private Long Id;
    private Date createdDate;
	
	public BaseModel(Long id,Date createdDate){
		this.Id=id;
		this.createdDate=createdDate;
	}
	
	public BaseModel(Long id) {
		this(id,new Date());
	}
	
	public BaseModel(){
		createdDate=new Date();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public boolean isPersisted(){
		return Id!=null;
	}

}
