package annikonenkov.jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class MainClassForFirst {
	private static final String pathToXML = "C:\\\\utils\\\\XMLDocs\\\\Person.xml";

	public static void main(String[] args) {

		List<Adress> listAdress = new ArrayList<Adress>();
		listAdress.add(new Adress("FirstAdress"));
		listAdress.add(new Adress("SecondAdress"));
		listAdress.add(new Adress("ThirdAdress"));

		SideCage sideCage = new SideCage("Room");
		Pet pet = new Pet("Tom", sideCage);
		Person person = new Person(12, "Nic", "Alice", pet, listAdress);

		try {
			File xmlFile = new File(pathToXML);
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(person, xmlFile);
			System.out.println("Finished");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
