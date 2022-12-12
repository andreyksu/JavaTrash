package annikonenkov.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pet {
	public Pet() {
	}

	public Pet(String name, SideCage sideCage) {
		this.name = name;
		this.sideCage = sideCage;
	}

	@XmlAttribute
	public String name;
	public SideCage sideCage;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setSideCage(SideCage sideCage) {
		this.sideCage = sideCage;
		
	}
	
	public SideCage getSideCage() {
		return this.sideCage;
	}

}
