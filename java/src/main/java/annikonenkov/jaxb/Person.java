package annikonenkov.jaxb;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchema;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

	@XmlAttribute
	int old;

	@XmlAttribute
	String name;

	@XmlElement
	String mother;

	@XmlElement
	Pet pet;

	@XmlElement
	List<Adress> listAdress;

	public Person() {
	}

	public Person(int old, String name, String mother, Pet pet, List<Adress> listAdress) {
		this.old = old;
		this.name = name;
		this.mother = mother;
		this.pet = pet;
		this.listAdress = listAdress;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public int getIld() {
		return this.old;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getMother() {
		return this.mother;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Pet getPet() {
		return this.pet;
	}

	public void setListAdress(List<Adress> listAdress) {
		this.listAdress = listAdress;
	}

	public List<Adress> getListAdress() {
		return this.listAdress;
	}

}
