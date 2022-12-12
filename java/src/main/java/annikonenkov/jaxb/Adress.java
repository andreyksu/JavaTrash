package annikonenkov.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Adress {

	public Adress() {

	}

	public Adress(String name) {
		this.name = name;
	}

	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String name() {
		return this.name;
	}

}
