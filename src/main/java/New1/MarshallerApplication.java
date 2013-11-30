package New1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallerApplication {
    public static void main(String[] args) throws JAXBException {
        Person person = new Person();
        person.setName("Vasa");
        person.setAddress("Beralusia");

        JAXBContext jc =JAXBContext.newInstance(Person.class);
        Marshaller m =jc.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        m.marshal(person, System.out);


    }
}
