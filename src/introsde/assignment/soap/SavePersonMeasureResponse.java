
package introsde.assignment.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePersonMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateHistory" type="{http://soap.assignment.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonMeasureResponse", propOrder = {
    "updateHistory"
})
public class SavePersonMeasureResponse {

    protected Person updateHistory;

    /**
     * Gets the value of the updateHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getUpdateHistory() {
        return updateHistory;
    }

    /**
     * Sets the value of the updateHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setUpdateHistory(Person value) {
        this.updateHistory = value;
    }

}
