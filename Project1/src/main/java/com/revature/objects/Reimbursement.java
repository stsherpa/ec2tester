package com.revature.objects;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Time;

public class Reimbursement {
	private Integer ID;
	private Double Amount;
	private String Description;
	private Blob Receipt;
	private Date SubmittedDate;
	private Time SubmittedTime;
	private Date ResolvedDate;
	private Time ResolvedTime;	
	private String Author;
	private String Resolver;
	private String Type;
	private String Status;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Blob getReceipt() {
		return Receipt;
	}
	public void setReceipt(Blob receipt) {
		Receipt = receipt;
	}
	
	public Date getSubmittedDate() {
		return SubmittedDate;
	}
	public void setSubmittedDate(Date submittedDate) {
		SubmittedDate = submittedDate;
	}
	public Time getSubmittedTime() {
		return SubmittedTime;
	}
	public void setSubmittedTime(Time submittedTime) {
		SubmittedTime = submittedTime;
	}
	public Date getResolvedDate() {
		return ResolvedDate;
	}
	public void setResolvedDate(Date resolvedDate) {
		ResolvedDate = resolvedDate;
	}
	public Time getResolvedTime() {
		return ResolvedTime;
	}
	public void setResolvedTime(Time resolvedTime) {
		ResolvedTime = resolvedTime;
	}
	
		
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getResolver() {
		return Resolver;
	}
	public void setResolver(String resolver) {
		Resolver = resolver;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Reimbursement " + ID + "/" + Amount + "/" + Description + "/"
				+ Receipt + "/" + SubmittedDate + "/" + SubmittedTime + "/"
				+ ResolvedDate + "/" + ResolvedTime + "/" + Author + "/" + Resolver
				+ "/" + Type + "/" + Status;
	}
	
	public Reimbursement(Integer iD, Double amount, String description, Blob receipt, Date submittedDate,
			Time submittedTime, Date resolvedDate, Time resolvedTime, String author, String resolver, String type,
			String status) {
		super();
		ID = iD;
		Amount = amount;
		Description = description;
		Receipt = receipt;
		SubmittedDate = submittedDate;
		SubmittedTime = submittedTime;
		ResolvedDate = resolvedDate;
		ResolvedTime = resolvedTime;
		Author = author;
		Resolver = resolver;
		Type = type;
		Status = status;
	}
	
	
}
