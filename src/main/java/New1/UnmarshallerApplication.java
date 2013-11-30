package New1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class UnmarshallerApplication {

    private static final String FILENAME = "test.xml";


    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        JAXBContext jc = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller =jc.createUnmarshaller();
        InputStream stream = new FileInputStream("C:\\Documents and Settings\\user\\IdeaProjects\\New1\\src\\test.xml");

        if (stream ==null){
            System.out.println("Error file not found");
        }

        Person person = (Person) unmarshaller.unmarshal(stream);
        System.out.println("person: "+person.getName() +", " +person.getAddress());
    }
}
