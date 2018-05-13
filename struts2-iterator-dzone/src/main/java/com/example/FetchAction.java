package com.example;

import java.util.ArrayList;
import java.util.List;

public class FetchAction {

	private String username;
	private String message;
	private List documents = new ArrayList();

	public List getDocuments() {
		return documents;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute() {

		if (username != null) {
			// logic to fetch the document list (say from database)
			Document d1 = new Document();
			d1.setName("user.doc");
			Document d2 = new Document();
			d2.setName("office.doc");
			Document d3 = new Document();
			d3.setName("transactions.doc");

			documents.add(d1);
			documents.add(d2);
			documents.add(d3);

			return "success";
		} else {
			message = "Unable to fetch";
			return "failure";
		}
	}
}