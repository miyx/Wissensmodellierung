//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.25 at 01:58:00 AM CET 
//


package org.w3._2002._07.owl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionalDataProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalDataProperty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2002/07/owl#}DataPropertyAxiom">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.w3.org/2002/07/owl#}DataPropertyExpression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalDataProperty", propOrder = {
    "dataProperty"
})
public class FunctionalDataProperty
    extends DataPropertyAxiom
{

    @XmlElement(name = "DataProperty", required = true)
    protected DataProperty dataProperty;

    /**
     * Gets the value of the dataProperty property.
     * 
     * @return
     *     possible object is
     *     {@link DataProperty }
     *     
     */
    public DataProperty getDataProperty() {
        return dataProperty;
    }

    /**
     * Sets the value of the dataProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProperty }
     *     
     */
    public void setDataProperty(DataProperty value) {
        this.dataProperty = value;
    }

}