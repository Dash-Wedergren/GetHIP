package com.gallup.gethip.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@XmlRootElement
@DatabaseTable(tableName="words")
public class Words {
	
	@DatabaseField(columnName = "word")
	private String word;
	
	@DatabaseField(columnName = "severity")
	private String severity;
	
	@DatabaseField(columnName = "category")
	private String category;
	
	public Words(){
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
