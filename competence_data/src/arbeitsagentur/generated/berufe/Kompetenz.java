//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.07 at 02:27:00 PM CET 
//


package arbeitsagentur.generated.berufe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ausbildung" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="gruppenkompetenz" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="idref" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="matrix" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "kompetenz")
public class Kompetenz {

    @XmlAttribute(name = "ausbildung", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ausbildung;
    @XmlAttribute(name = "gruppenkompetenz", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String gruppenkompetenz;
    @XmlAttribute(name = "idref", required = true)
    protected BigInteger idref;
    @XmlAttribute(name = "matrix", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String matrix;

    /**
     * Gets the value of the ausbildung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAusbildung() {
        return ausbildung;
    }

    /**
     * Sets the value of the ausbildung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAusbildung(String value) {
        this.ausbildung = value;
    }

    /**
     * Gets the value of the gruppenkompetenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGruppenkompetenz() {
        return gruppenkompetenz;
    }

    /**
     * Sets the value of the gruppenkompetenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGruppenkompetenz(String value) {
        this.gruppenkompetenz = value;
    }

    /**
     * Gets the value of the idref property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdref() {
        return idref;
    }

    /**
     * Sets the value of the idref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdref(BigInteger value) {
        this.idref = value;
    }

    /**
     * Gets the value of the matrix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrix() {
        return matrix;
    }

    /**
     * Sets the value of the matrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrix(String value) {
        this.matrix = value;
    }

}