package annikonenkov.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class SideCage {

	public SideCage() {

	}

	public SideCage(String name) {
		this.name = name;
	}

	public String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
