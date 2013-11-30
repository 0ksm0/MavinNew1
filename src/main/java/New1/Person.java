package New1;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 30.11.13
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */

@XmlType
@XmlRootElement
public class Person {
    String name;
    String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
