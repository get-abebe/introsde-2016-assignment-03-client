
package introsde.assignment.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePersonMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateMeasure" type="{http://soap.assignment.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonMeasureResponse", propOrder = {
    "updateMeasure"
})
public class UpdatePersonMeasureResponse {

    protected Person updateMeasure;

    /**
     * Gets the value of the updateMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getUpdateMeasure() {
        return updateMeasure;
    }

    /**
     * Sets the value of the updateMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setUpdateMeasure(Person value) {
        this.updateMeasure = value;
    }

}
