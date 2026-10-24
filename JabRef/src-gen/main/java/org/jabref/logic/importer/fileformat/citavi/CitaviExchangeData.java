//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.10.24 um 11:06:09 AM CEST 
//


package org.jabref.logic.importer.fileformat.citavi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectSettings"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AttachmentsFolderPath" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ColorScheme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CustomFields"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CustomFieldSettings" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CompareType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="DropDownStyle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="IsUtc" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="LastChangeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectUserSettings"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LastReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ShowCategoryClassification" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="SortOrder"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SortProperty" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SortOrderImport"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SortProperty" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Categories"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Category" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CategoryCatgories"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImportGroups"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ImportGroup" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ImportGroupType" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                             &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImportGroupReferences"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Keywords"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Keyword" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Publishers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Publisher" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Persons"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Person" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="References"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Reference" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AbstractComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="AbstractSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="CitationKeyUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="CoverPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EvaluationComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="EvaluationSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="HasLabel1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="HasLabel2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="PageCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PageRangeNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                             &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="ReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ShortTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ShortTitleUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="StaticIDs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TableOfContentsComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="TableOfContentsSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Doi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Isbn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceAuthors"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceEditors"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceGroups"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceKeywords"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceOrganizations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferencePublishers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Locations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Location"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="PreviewBehaviour" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Annotations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Annotation" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Quads" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KnowledgeItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KnowledgeItem" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="CoreStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CoreStatementUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="KnowledgeItemType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PageRangeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="PageRangeNumeralSystem" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *                             &lt;element name="QuotationIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="QuotationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Relevance" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="StaticIDs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TextSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TextIsComplex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TextFormatted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KnowledgeItemCategories"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KnowledgeItemKeywords"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EntityLinks"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EntityLink" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="Indication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RelationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TargetID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TargetType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConnectionIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Changeset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "projectSettings",
    "projectUserSettings",
    "categories",
    "categoryCatgories",
    "importGroups",
    "importGroupReferences",
    "keywords",
    "publishers",
    "persons",
    "references",
    "referenceAuthors",
    "referenceEditors",
    "referenceGroups",
    "referenceKeywords",
    "referenceOrganizations",
    "referencePublishers",
    "locations",
    "annotations",
    "knowledgeItems",
    "knowledgeItemCategories",
    "knowledgeItemKeywords",
    "entityLinks"
})
@XmlRootElement(name = "CitaviExchangeData")
public class CitaviExchangeData {

    @XmlElement(name = "ProjectSettings", required = true)
    protected CitaviExchangeData.ProjectSettings projectSettings;
    @XmlElement(name = "ProjectUserSettings", required = true)
    protected CitaviExchangeData.ProjectUserSettings projectUserSettings;
    @XmlElement(name = "Categories", required = true)
    protected CitaviExchangeData.Categories categories;
    @XmlElement(name = "CategoryCatgories", required = true)
    protected CitaviExchangeData.CategoryCatgories categoryCatgories;
    @XmlElement(name = "ImportGroups", required = true)
    protected CitaviExchangeData.ImportGroups importGroups;
    @XmlElement(name = "ImportGroupReferences", required = true)
    protected CitaviExchangeData.ImportGroupReferences importGroupReferences;
    @XmlElement(name = "Keywords", required = true)
    protected CitaviExchangeData.Keywords keywords;
    @XmlElement(name = "Publishers", required = true)
    protected CitaviExchangeData.Publishers publishers;
    @XmlElement(name = "Persons", required = true)
    protected CitaviExchangeData.Persons persons;
    @XmlElement(name = "References", required = true)
    protected CitaviExchangeData.References references;
    @XmlElement(name = "ReferenceAuthors", required = true)
    protected CitaviExchangeData.ReferenceAuthors referenceAuthors;
    @XmlElement(name = "ReferenceEditors", required = true)
    protected CitaviExchangeData.ReferenceEditors referenceEditors;
    @XmlElement(name = "ReferenceGroups", required = true)
    protected CitaviExchangeData.ReferenceGroups referenceGroups;
    @XmlElement(name = "ReferenceKeywords", required = true)
    protected CitaviExchangeData.ReferenceKeywords referenceKeywords;
    @XmlElement(name = "ReferenceOrganizations", required = true)
    protected CitaviExchangeData.ReferenceOrganizations referenceOrganizations;
    @XmlElement(name = "ReferencePublishers", required = true)
    protected CitaviExchangeData.ReferencePublishers referencePublishers;
    @XmlElement(name = "Locations", required = true)
    protected CitaviExchangeData.Locations locations;
    @XmlElement(name = "Annotations", required = true)
    protected CitaviExchangeData.Annotations annotations;
    @XmlElement(name = "KnowledgeItems", required = true)
    protected CitaviExchangeData.KnowledgeItems knowledgeItems;
    @XmlElement(name = "KnowledgeItemCategories", required = true)
    protected CitaviExchangeData.KnowledgeItemCategories knowledgeItemCategories;
    @XmlElement(name = "KnowledgeItemKeywords", required = true)
    protected CitaviExchangeData.KnowledgeItemKeywords knowledgeItemKeywords;
    @XmlElement(name = "EntityLinks", required = true)
    protected CitaviExchangeData.EntityLinks entityLinks;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "ConnectionIdentifier", required = true)
    protected String connectionIdentifier;
    @XmlAttribute(name = "Changeset", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short changeset;

    /**
     * Ruft den Wert der projectSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ProjectSettings }
     *     
     */
    public CitaviExchangeData.ProjectSettings getProjectSettings() {
        return projectSettings;
    }

    /**
     * Legt den Wert der projectSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ProjectSettings }
     *     
     */
    public void setProjectSettings(CitaviExchangeData.ProjectSettings value) {
        this.projectSettings = value;
    }

    /**
     * Ruft den Wert der projectUserSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ProjectUserSettings }
     *     
     */
    public CitaviExchangeData.ProjectUserSettings getProjectUserSettings() {
        return projectUserSettings;
    }

    /**
     * Legt den Wert der projectUserSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ProjectUserSettings }
     *     
     */
    public void setProjectUserSettings(CitaviExchangeData.ProjectUserSettings value) {
        this.projectUserSettings = value;
    }

    /**
     * Ruft den Wert der categories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.Categories }
     *     
     */
    public CitaviExchangeData.Categories getCategories() {
        return categories;
    }

    /**
     * Legt den Wert der categories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.Categories }
     *     
     */
    public void setCategories(CitaviExchangeData.Categories value) {
        this.categories = value;
    }

    /**
     * Ruft den Wert der categoryCatgories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.CategoryCatgories }
     *     
     */
    public CitaviExchangeData.CategoryCatgories getCategoryCatgories() {
        return categoryCatgories;
    }

    /**
     * Legt den Wert der categoryCatgories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.CategoryCatgories }
     *     
     */
    public void setCategoryCatgories(CitaviExchangeData.CategoryCatgories value) {
        this.categoryCatgories = value;
    }

    /**
     * Ruft den Wert der importGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ImportGroups }
     *     
     */
    public CitaviExchangeData.ImportGroups getImportGroups() {
        return importGroups;
    }

    /**
     * Legt den Wert der importGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ImportGroups }
     *     
     */
    public void setImportGroups(CitaviExchangeData.ImportGroups value) {
        this.importGroups = value;
    }

    /**
     * Ruft den Wert der importGroupReferences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ImportGroupReferences }
     *     
     */
    public CitaviExchangeData.ImportGroupReferences getImportGroupReferences() {
        return importGroupReferences;
    }

    /**
     * Legt den Wert der importGroupReferences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ImportGroupReferences }
     *     
     */
    public void setImportGroupReferences(CitaviExchangeData.ImportGroupReferences value) {
        this.importGroupReferences = value;
    }

    /**
     * Ruft den Wert der keywords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.Keywords }
     *     
     */
    public CitaviExchangeData.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Legt den Wert der keywords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.Keywords }
     *     
     */
    public void setKeywords(CitaviExchangeData.Keywords value) {
        this.keywords = value;
    }

    /**
     * Ruft den Wert der publishers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.Publishers }
     *     
     */
    public CitaviExchangeData.Publishers getPublishers() {
        return publishers;
    }

    /**
     * Legt den Wert der publishers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.Publishers }
     *     
     */
    public void setPublishers(CitaviExchangeData.Publishers value) {
        this.publishers = value;
    }

    /**
     * Ruft den Wert der persons-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.Persons }
     *     
     */
    public CitaviExchangeData.Persons getPersons() {
        return persons;
    }

    /**
     * Legt den Wert der persons-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.Persons }
     *     
     */
    public void setPersons(CitaviExchangeData.Persons value) {
        this.persons = value;
    }

    /**
     * Ruft den Wert der references-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.References }
     *     
     */
    public CitaviExchangeData.References getReferences() {
        return references;
    }

    /**
     * Legt den Wert der references-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.References }
     *     
     */
    public void setReferences(CitaviExchangeData.References value) {
        this.references = value;
    }

    /**
     * Ruft den Wert der referenceAuthors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ReferenceAuthors }
     *     
     */
    public CitaviExchangeData.ReferenceAuthors getReferenceAuthors() {
        return referenceAuthors;
    }

    /**
     * Legt den Wert der referenceAuthors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ReferenceAuthors }
     *     
     */
    public void setReferenceAuthors(CitaviExchangeData.ReferenceAuthors value) {
        this.referenceAuthors = value;
    }

    /**
     * Ruft den Wert der referenceEditors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ReferenceEditors }
     *     
     */
    public CitaviExchangeData.ReferenceEditors getReferenceEditors() {
        return referenceEditors;
    }

    /**
     * Legt den Wert der referenceEditors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ReferenceEditors }
     *     
     */
    public void setReferenceEditors(CitaviExchangeData.ReferenceEditors value) {
        this.referenceEditors = value;
    }

    /**
     * Ruft den Wert der referenceGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ReferenceGroups }
     *     
     */
    public CitaviExchangeData.ReferenceGroups getReferenceGroups() {
        return referenceGroups;
    }

    /**
     * Legt den Wert der referenceGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ReferenceGroups }
     *     
     */
    public void setReferenceGroups(CitaviExchangeData.ReferenceGroups value) {
        this.referenceGroups = value;
    }

    /**
     * Ruft den Wert der referenceKeywords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ReferenceKeywords }
     *     
     */
    public CitaviExchangeData.ReferenceKeywords getReferenceKeywords() {
        return referenceKeywords;
    }

    /**
     * Legt den Wert der referenceKeywords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ReferenceKeywords }
     *     
     */
    public void setReferenceKeywords(CitaviExchangeData.ReferenceKeywords value) {
        this.referenceKeywords = value;
    }

    /**
     * Ruft den Wert der referenceOrganizations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ReferenceOrganizations }
     *     
     */
    public CitaviExchangeData.ReferenceOrganizations getReferenceOrganizations() {
        return referenceOrganizations;
    }

    /**
     * Legt den Wert der referenceOrganizations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ReferenceOrganizations }
     *     
     */
    public void setReferenceOrganizations(CitaviExchangeData.ReferenceOrganizations value) {
        this.referenceOrganizations = value;
    }

    /**
     * Ruft den Wert der referencePublishers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.ReferencePublishers }
     *     
     */
    public CitaviExchangeData.ReferencePublishers getReferencePublishers() {
        return referencePublishers;
    }

    /**
     * Legt den Wert der referencePublishers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.ReferencePublishers }
     *     
     */
    public void setReferencePublishers(CitaviExchangeData.ReferencePublishers value) {
        this.referencePublishers = value;
    }

    /**
     * Ruft den Wert der locations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.Locations }
     *     
     */
    public CitaviExchangeData.Locations getLocations() {
        return locations;
    }

    /**
     * Legt den Wert der locations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.Locations }
     *     
     */
    public void setLocations(CitaviExchangeData.Locations value) {
        this.locations = value;
    }

    /**
     * Ruft den Wert der annotations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.Annotations }
     *     
     */
    public CitaviExchangeData.Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Legt den Wert der annotations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.Annotations }
     *     
     */
    public void setAnnotations(CitaviExchangeData.Annotations value) {
        this.annotations = value;
    }

    /**
     * Ruft den Wert der knowledgeItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.KnowledgeItems }
     *     
     */
    public CitaviExchangeData.KnowledgeItems getKnowledgeItems() {
        return knowledgeItems;
    }

    /**
     * Legt den Wert der knowledgeItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.KnowledgeItems }
     *     
     */
    public void setKnowledgeItems(CitaviExchangeData.KnowledgeItems value) {
        this.knowledgeItems = value;
    }

    /**
     * Ruft den Wert der knowledgeItemCategories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.KnowledgeItemCategories }
     *     
     */
    public CitaviExchangeData.KnowledgeItemCategories getKnowledgeItemCategories() {
        return knowledgeItemCategories;
    }

    /**
     * Legt den Wert der knowledgeItemCategories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.KnowledgeItemCategories }
     *     
     */
    public void setKnowledgeItemCategories(CitaviExchangeData.KnowledgeItemCategories value) {
        this.knowledgeItemCategories = value;
    }

    /**
     * Ruft den Wert der knowledgeItemKeywords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.KnowledgeItemKeywords }
     *     
     */
    public CitaviExchangeData.KnowledgeItemKeywords getKnowledgeItemKeywords() {
        return knowledgeItemKeywords;
    }

    /**
     * Legt den Wert der knowledgeItemKeywords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.KnowledgeItemKeywords }
     *     
     */
    public void setKnowledgeItemKeywords(CitaviExchangeData.KnowledgeItemKeywords value) {
        this.knowledgeItemKeywords = value;
    }

    /**
     * Ruft den Wert der entityLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CitaviExchangeData.EntityLinks }
     *     
     */
    public CitaviExchangeData.EntityLinks getEntityLinks() {
        return entityLinks;
    }

    /**
     * Legt den Wert der entityLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CitaviExchangeData.EntityLinks }
     *     
     */
    public void setEntityLinks(CitaviExchangeData.EntityLinks value) {
        this.entityLinks = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der connectionIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionIdentifier() {
        return connectionIdentifier;
    }

    /**
     * Legt den Wert der connectionIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionIdentifier(String value) {
        this.connectionIdentifier = value;
    }

    /**
     * Ruft den Wert der changeset-Eigenschaft ab.
     * 
     */
    public short getChangeset() {
        return changeset;
    }

    /**
     * Legt den Wert der changeset-Eigenschaft fest.
     * 
     */
    public void setChangeset(short value) {
        this.changeset = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Annotation" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Quads" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annotation"
    })
    public static class Annotations {

        @XmlElement(name = "Annotation", required = true)
        protected List<CitaviExchangeData.Annotations.Annotation> annotation;

        /**
         * Gets the value of the annotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the annotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.Annotations.Annotation }
         * 
         * 
         */
        public List<CitaviExchangeData.Annotations.Annotation> getAnnotation() {
            if (annotation == null) {
                annotation = new ArrayList<CitaviExchangeData.Annotations.Annotation>();
            }
            return this.annotation;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Quads" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "locationID",
            "quads",
            "visible"
        })
        public static class Annotation {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "LocationID", required = true)
            protected String locationID;
            @XmlElement(name = "Quads", required = true)
            protected String quads;
            @XmlElement(name = "Visible")
            protected boolean visible;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der locationID-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationID() {
                return locationID;
            }

            /**
             * Legt den Wert der locationID-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationID(String value) {
                this.locationID = value;
            }

            /**
             * Ruft den Wert der quads-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuads() {
                return quads;
            }

            /**
             * Legt den Wert der quads-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuads(String value) {
                this.quads = value;
            }

            /**
             * Ruft den Wert der visible-Eigenschaft ab.
             * 
             */
            public boolean isVisible() {
                return visible;
            }

            /**
             * Legt den Wert der visible-Eigenschaft fest.
             * 
             */
            public void setVisible(boolean value) {
                this.visible = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Category" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "category"
    })
    public static class Categories {

        @XmlElement(name = "Category")
        protected List<CitaviExchangeData.Categories.Category> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.Categories.Category }
         * 
         * 
         */
        public List<CitaviExchangeData.Categories.Category> getCategory() {
            if (category == null) {
                category = new ArrayList<CitaviExchangeData.Categories.Category>();
            }
            return this.category;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "name"
        })
        public static class Category {

            @XmlElement(name = "CreatedBy")
            protected String createdBy;
            @XmlElement(name = "CreatedOn")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy")
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "id")
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class CategoryCatgories {

        @XmlElement(name = "OnetoN")
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EntityLink" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="Indication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="RelationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TargetID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TargetType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entityLink"
    })
    public static class EntityLinks {

        @XmlElement(name = "EntityLink", required = true)
        protected List<CitaviExchangeData.EntityLinks.EntityLink> entityLink;

        /**
         * Gets the value of the entityLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the entityLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntityLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.EntityLinks.EntityLink }
         * 
         * 
         */
        public List<CitaviExchangeData.EntityLinks.EntityLink> getEntityLink() {
            if (entityLink == null) {
                entityLink = new ArrayList<CitaviExchangeData.EntityLinks.EntityLink>();
            }
            return this.entityLink;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="Indication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="RelationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TargetID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TargetType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "indication",
            "relationType",
            "sourceID",
            "sourceType",
            "targetID",
            "targetType"
        })
        public static class EntityLink {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "Indication", required = true)
            protected String indication;
            @XmlElement(name = "RelationType")
            @XmlSchemaType(name = "unsignedByte")
            protected short relationType;
            @XmlElement(name = "SourceID", required = true)
            protected String sourceID;
            @XmlElement(name = "SourceType", required = true)
            protected String sourceType;
            @XmlElement(name = "TargetID", required = true)
            protected String targetID;
            @XmlElement(name = "TargetType", required = true)
            protected String targetType;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der indication-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndication() {
                return indication;
            }

            /**
             * Legt den Wert der indication-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndication(String value) {
                this.indication = value;
            }

            /**
             * Ruft den Wert der relationType-Eigenschaft ab.
             * 
             */
            public short getRelationType() {
                return relationType;
            }

            /**
             * Legt den Wert der relationType-Eigenschaft fest.
             * 
             */
            public void setRelationType(short value) {
                this.relationType = value;
            }

            /**
             * Ruft den Wert der sourceID-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceID() {
                return sourceID;
            }

            /**
             * Legt den Wert der sourceID-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceID(String value) {
                this.sourceID = value;
            }

            /**
             * Ruft den Wert der sourceType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceType() {
                return sourceType;
            }

            /**
             * Legt den Wert der sourceType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceType(String value) {
                this.sourceType = value;
            }

            /**
             * Ruft den Wert der targetID-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetID() {
                return targetID;
            }

            /**
             * Legt den Wert der targetID-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetID(String value) {
                this.targetID = value;
            }

            /**
             * Ruft den Wert der targetType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetType() {
                return targetType;
            }

            /**
             * Legt den Wert der targetType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetType(String value) {
                this.targetType = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class ImportGroupReferences {

        @XmlElement(name = "OnetoN")
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ImportGroup" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ImportGroupType" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *                   &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "importGroup"
    })
    public static class ImportGroups {

        @XmlElement(name = "ImportGroup")
        protected List<CitaviExchangeData.ImportGroups.ImportGroup> importGroup;

        /**
         * Gets the value of the importGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the importGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImportGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.ImportGroups.ImportGroup }
         * 
         * 
         */
        public List<CitaviExchangeData.ImportGroups.ImportGroup> getImportGroup() {
            if (importGroup == null) {
                importGroup = new ArrayList<CitaviExchangeData.ImportGroups.ImportGroup>();
            }
            return this.importGroup;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ImportGroupType" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
         *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "importGroupType",
            "source"
        })
        public static class ImportGroup {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "ImportGroupType")
            protected byte importGroupType;
            @XmlElement(name = "Source")
            protected String source;
            @XmlAttribute(name = "id")
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der importGroupType-Eigenschaft ab.
             * 
             */
            public byte getImportGroupType() {
                return importGroupType;
            }

            /**
             * Legt den Wert der importGroupType-Eigenschaft fest.
             * 
             */
            public void setImportGroupType(byte value) {
                this.importGroupType = value;
            }

            /**
             * Ruft den Wert der source-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Legt den Wert der source-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Keyword" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "keyword"
    })
    public static class Keywords {

        @XmlElement(name = "Keyword", required = true)
        protected List<CitaviExchangeData.Keywords.Keyword> keyword;

        /**
         * Gets the value of the keyword property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the keyword property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyword().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.Keywords.Keyword }
         * 
         * 
         */
        public List<CitaviExchangeData.Keywords.Keyword> getKeyword() {
            if (keyword == null) {
                keyword = new ArrayList<CitaviExchangeData.Keywords.Keyword>();
            }
            return this.keyword;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "name",
            "_protected",
            "sortFullName",
            "uniqueFullName"
        })
        public static class Keyword {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Protected")
            protected boolean _protected;
            @XmlElement(name = "SortFullName", required = true)
            protected String sortFullName;
            @XmlElement(name = "UniqueFullName", required = true)
            protected String uniqueFullName;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der protected-Eigenschaft ab.
             * 
             */
            public boolean isProtected() {
                return _protected;
            }

            /**
             * Legt den Wert der protected-Eigenschaft fest.
             * 
             */
            public void setProtected(boolean value) {
                this._protected = value;
            }

            /**
             * Ruft den Wert der sortFullName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSortFullName() {
                return sortFullName;
            }

            /**
             * Legt den Wert der sortFullName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSortFullName(String value) {
                this.sortFullName = value;
            }

            /**
             * Ruft den Wert der uniqueFullName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueFullName() {
                return uniqueFullName;
            }

            /**
             * Legt den Wert der uniqueFullName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueFullName(String value) {
                this.uniqueFullName = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class KnowledgeItemCategories {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class KnowledgeItemKeywords {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="KnowledgeItem" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="CoreStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CoreStatementUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="KnowledgeItemType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PageRangeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="PageRangeNumeralSystem" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
     *                   &lt;element name="QuotationIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="QuotationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Relevance" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="StaticIDs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TextSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TextIsComplex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TextFormatted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "knowledgeItem"
    })
    public static class KnowledgeItems {

        @XmlElement(name = "KnowledgeItem", required = true)
        protected List<CitaviExchangeData.KnowledgeItems.KnowledgeItem> knowledgeItem;

        /**
         * Gets the value of the knowledgeItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the knowledgeItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKnowledgeItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.KnowledgeItems.KnowledgeItem }
         * 
         * 
         */
        public List<CitaviExchangeData.KnowledgeItems.KnowledgeItem> getKnowledgeItem() {
            if (knowledgeItem == null) {
                knowledgeItem = new ArrayList<CitaviExchangeData.KnowledgeItems.KnowledgeItem>();
            }
            return this.knowledgeItem;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="CoreStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CoreStatementUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="KnowledgeItemType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PageRangeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="PageRangeNumeralSystem" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
         *         &lt;element name="QuotationIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="QuotationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Relevance" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="StaticIDs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TextSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TextIsComplex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TextFormatted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "coreStatement",
            "coreStatementUpdateType",
            "knowledgeItemType",
            "pageRange",
            "pageRangeNumber",
            "pageRangeNumeralSystem",
            "quotationIndex",
            "quotationType",
            "referenceID",
            "relevance",
            "sortFullName",
            "staticIDs",
            "textSourceTextFormat",
            "text",
            "textIsComplex",
            "textFormatted"
        })
        public static class KnowledgeItem {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "CoreStatement")
            protected String coreStatement;
            @XmlElement(name = "CoreStatementUpdateType")
            @XmlSchemaType(name = "unsignedByte")
            protected short coreStatementUpdateType;
            @XmlElement(name = "KnowledgeItemType")
            @XmlSchemaType(name = "unsignedByte")
            protected short knowledgeItemType;
            @XmlElement(name = "PageRange")
            protected String pageRange;
            @XmlElement(name = "PageRangeNumber")
            protected int pageRangeNumber;
            @XmlElement(name = "PageRangeNumeralSystem")
            @XmlSchemaType(name = "unsignedByte")
            protected Short pageRangeNumeralSystem;
            @XmlElement(name = "QuotationIndex")
            @XmlSchemaType(name = "unsignedByte")
            protected short quotationIndex;
            @XmlElement(name = "QuotationType")
            @XmlSchemaType(name = "unsignedByte")
            protected short quotationType;
            @XmlElement(name = "ReferenceID", required = true)
            protected String referenceID;
            @XmlElement(name = "Relevance")
            @XmlSchemaType(name = "unsignedByte")
            protected short relevance;
            @XmlElement(name = "SortFullName", required = true)
            protected String sortFullName;
            @XmlElement(name = "StaticIDs", required = true)
            protected String staticIDs;
            @XmlElement(name = "TextSourceTextFormat")
            @XmlSchemaType(name = "unsignedByte")
            protected short textSourceTextFormat;
            @XmlElement(name = "Text")
            protected String text;
            @XmlElement(name = "TextIsComplex", required = true)
            protected String textIsComplex;
            @XmlElement(name = "TextFormatted")
            protected String textFormatted;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der coreStatement-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoreStatement() {
                return coreStatement;
            }

            /**
             * Legt den Wert der coreStatement-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoreStatement(String value) {
                this.coreStatement = value;
            }

            /**
             * Ruft den Wert der coreStatementUpdateType-Eigenschaft ab.
             * 
             */
            public short getCoreStatementUpdateType() {
                return coreStatementUpdateType;
            }

            /**
             * Legt den Wert der coreStatementUpdateType-Eigenschaft fest.
             * 
             */
            public void setCoreStatementUpdateType(short value) {
                this.coreStatementUpdateType = value;
            }

            /**
             * Ruft den Wert der knowledgeItemType-Eigenschaft ab.
             * 
             */
            public short getKnowledgeItemType() {
                return knowledgeItemType;
            }

            /**
             * Legt den Wert der knowledgeItemType-Eigenschaft fest.
             * 
             */
            public void setKnowledgeItemType(short value) {
                this.knowledgeItemType = value;
            }

            /**
             * Ruft den Wert der pageRange-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPageRange() {
                return pageRange;
            }

            /**
             * Legt den Wert der pageRange-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPageRange(String value) {
                this.pageRange = value;
            }

            /**
             * Ruft den Wert der pageRangeNumber-Eigenschaft ab.
             * 
             */
            public int getPageRangeNumber() {
                return pageRangeNumber;
            }

            /**
             * Legt den Wert der pageRangeNumber-Eigenschaft fest.
             * 
             */
            public void setPageRangeNumber(int value) {
                this.pageRangeNumber = value;
            }

            /**
             * Ruft den Wert der pageRangeNumeralSystem-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getPageRangeNumeralSystem() {
                return pageRangeNumeralSystem;
            }

            /**
             * Legt den Wert der pageRangeNumeralSystem-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setPageRangeNumeralSystem(Short value) {
                this.pageRangeNumeralSystem = value;
            }

            /**
             * Ruft den Wert der quotationIndex-Eigenschaft ab.
             * 
             */
            public short getQuotationIndex() {
                return quotationIndex;
            }

            /**
             * Legt den Wert der quotationIndex-Eigenschaft fest.
             * 
             */
            public void setQuotationIndex(short value) {
                this.quotationIndex = value;
            }

            /**
             * Ruft den Wert der quotationType-Eigenschaft ab.
             * 
             */
            public short getQuotationType() {
                return quotationType;
            }

            /**
             * Legt den Wert der quotationType-Eigenschaft fest.
             * 
             */
            public void setQuotationType(short value) {
                this.quotationType = value;
            }

            /**
             * Ruft den Wert der referenceID-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceID() {
                return referenceID;
            }

            /**
             * Legt den Wert der referenceID-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceID(String value) {
                this.referenceID = value;
            }

            /**
             * Ruft den Wert der relevance-Eigenschaft ab.
             * 
             */
            public short getRelevance() {
                return relevance;
            }

            /**
             * Legt den Wert der relevance-Eigenschaft fest.
             * 
             */
            public void setRelevance(short value) {
                this.relevance = value;
            }

            /**
             * Ruft den Wert der sortFullName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSortFullName() {
                return sortFullName;
            }

            /**
             * Legt den Wert der sortFullName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSortFullName(String value) {
                this.sortFullName = value;
            }

            /**
             * Ruft den Wert der staticIDs-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaticIDs() {
                return staticIDs;
            }

            /**
             * Legt den Wert der staticIDs-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaticIDs(String value) {
                this.staticIDs = value;
            }

            /**
             * Ruft den Wert der textSourceTextFormat-Eigenschaft ab.
             * 
             */
            public short getTextSourceTextFormat() {
                return textSourceTextFormat;
            }

            /**
             * Legt den Wert der textSourceTextFormat-Eigenschaft fest.
             * 
             */
            public void setTextSourceTextFormat(short value) {
                this.textSourceTextFormat = value;
            }

            /**
             * Ruft den Wert der text-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Legt den Wert der text-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * Ruft den Wert der textIsComplex-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextIsComplex() {
                return textIsComplex;
            }

            /**
             * Legt den Wert der textIsComplex-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextIsComplex(String value) {
                this.textIsComplex = value;
            }

            /**
             * Ruft den Wert der textFormatted-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextFormatted() {
                return textFormatted;
            }

            /**
             * Legt den Wert der textFormatted-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextFormatted(String value) {
                this.textFormatted = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Location"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="PreviewBehaviour" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location"
    })
    public static class Locations {

        @XmlElement(name = "Location", required = true)
        protected CitaviExchangeData.Locations.Location location;

        /**
         * Ruft den Wert der location-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CitaviExchangeData.Locations.Location }
         *     
         */
        public CitaviExchangeData.Locations.Location getLocation() {
            return location;
        }

        /**
         * Legt den Wert der location-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CitaviExchangeData.Locations.Location }
         *     
         */
        public void setLocation(CitaviExchangeData.Locations.Location value) {
            this.location = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="PreviewBehaviour" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "address",
            "locationType",
            "previewBehaviour",
            "referenceID"
        })
        public static class Location {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "Address", required = true)
            protected String address;
            @XmlElement(name = "LocationType")
            @XmlSchemaType(name = "unsignedByte")
            protected short locationType;
            @XmlElement(name = "PreviewBehaviour")
            @XmlSchemaType(name = "unsignedByte")
            protected short previewBehaviour;
            @XmlElement(name = "ReferenceID", required = true)
            protected String referenceID;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der address-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Legt den Wert der address-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Ruft den Wert der locationType-Eigenschaft ab.
             * 
             */
            public short getLocationType() {
                return locationType;
            }

            /**
             * Legt den Wert der locationType-Eigenschaft fest.
             * 
             */
            public void setLocationType(short value) {
                this.locationType = value;
            }

            /**
             * Ruft den Wert der previewBehaviour-Eigenschaft ab.
             * 
             */
            public short getPreviewBehaviour() {
                return previewBehaviour;
            }

            /**
             * Legt den Wert der previewBehaviour-Eigenschaft fest.
             * 
             */
            public void setPreviewBehaviour(short value) {
                this.previewBehaviour = value;
            }

            /**
             * Ruft den Wert der referenceID-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceID() {
                return referenceID;
            }

            /**
             * Legt den Wert der referenceID-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceID(String value) {
                this.referenceID = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Person" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "person"
    })
    public static class Persons {

        @XmlElement(name = "Person", required = true)
        protected List<CitaviExchangeData.Persons.Person> person;

        /**
         * Gets the value of the person property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the person property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.Persons.Person }
         * 
         * 
         */
        public List<CitaviExchangeData.Persons.Person> getPerson() {
            if (person == null) {
                person = new ArrayList<CitaviExchangeData.Persons.Person>();
            }
            return this.person;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "firstName",
            "lastName",
            "middleName",
            "_protected",
            "sex",
            "sortFullName",
            "uniqueFullName"
        })
        public static class Person {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "FirstName", required = true)
            protected String firstName;
            @XmlElement(name = "LastName", required = true)
            protected String lastName;
            @XmlElement(name = "MiddleName", required = true)
            protected String middleName;
            @XmlElement(name = "Protected")
            protected boolean _protected;
            @XmlElement(name = "Sex")
            @XmlSchemaType(name = "unsignedByte")
            protected short sex;
            @XmlElement(name = "SortFullName", required = true)
            protected String sortFullName;
            @XmlElement(name = "UniqueFullName", required = true)
            protected String uniqueFullName;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der firstName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Legt den Wert der firstName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Ruft den Wert der lastName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Legt den Wert der lastName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Ruft den Wert der middleName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMiddleName() {
                return middleName;
            }

            /**
             * Legt den Wert der middleName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMiddleName(String value) {
                this.middleName = value;
            }

            /**
             * Ruft den Wert der protected-Eigenschaft ab.
             * 
             */
            public boolean isProtected() {
                return _protected;
            }

            /**
             * Legt den Wert der protected-Eigenschaft fest.
             * 
             */
            public void setProtected(boolean value) {
                this._protected = value;
            }

            /**
             * Ruft den Wert der sex-Eigenschaft ab.
             * 
             */
            public short getSex() {
                return sex;
            }

            /**
             * Legt den Wert der sex-Eigenschaft fest.
             * 
             */
            public void setSex(short value) {
                this.sex = value;
            }

            /**
             * Ruft den Wert der sortFullName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSortFullName() {
                return sortFullName;
            }

            /**
             * Legt den Wert der sortFullName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSortFullName(String value) {
                this.sortFullName = value;
            }

            /**
             * Ruft den Wert der uniqueFullName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueFullName() {
                return uniqueFullName;
            }

            /**
             * Legt den Wert der uniqueFullName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueFullName(String value) {
                this.uniqueFullName = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AttachmentsFolderPath" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ColorScheme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CustomFields"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CustomFieldSettings" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CompareType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="DropDownStyle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IsUtc" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="LastChangeTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attachmentsFolderPath",
        "colorScheme",
        "customFields",
        "description",
        "isUtc",
        "lastChangeTime"
    })
    public static class ProjectSettings {

        @XmlElement(name = "AttachmentsFolderPath", required = true)
        protected Object attachmentsFolderPath;
        @XmlElement(name = "ColorScheme", required = true)
        protected String colorScheme;
        @XmlElement(name = "CustomFields", required = true)
        protected CitaviExchangeData.ProjectSettings.CustomFields customFields;
        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlElement(name = "IsUtc")
        protected boolean isUtc;
        @XmlElement(name = "LastChangeTime", required = true)
        protected String lastChangeTime;

        /**
         * Ruft den Wert der attachmentsFolderPath-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAttachmentsFolderPath() {
            return attachmentsFolderPath;
        }

        /**
         * Legt den Wert der attachmentsFolderPath-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAttachmentsFolderPath(Object value) {
            this.attachmentsFolderPath = value;
        }

        /**
         * Ruft den Wert der colorScheme-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColorScheme() {
            return colorScheme;
        }

        /**
         * Legt den Wert der colorScheme-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColorScheme(String value) {
            this.colorScheme = value;
        }

        /**
         * Ruft den Wert der customFields-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CitaviExchangeData.ProjectSettings.CustomFields }
         *     
         */
        public CitaviExchangeData.ProjectSettings.CustomFields getCustomFields() {
            return customFields;
        }

        /**
         * Legt den Wert der customFields-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CitaviExchangeData.ProjectSettings.CustomFields }
         *     
         */
        public void setCustomFields(CitaviExchangeData.ProjectSettings.CustomFields value) {
            this.customFields = value;
        }

        /**
         * Ruft den Wert der description-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Legt den Wert der description-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Ruft den Wert der isUtc-Eigenschaft ab.
         * 
         */
        public boolean isIsUtc() {
            return isUtc;
        }

        /**
         * Legt den Wert der isUtc-Eigenschaft fest.
         * 
         */
        public void setIsUtc(boolean value) {
            this.isUtc = value;
        }

        /**
         * Ruft den Wert der lastChangeTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastChangeTime() {
            return lastChangeTime;
        }

        /**
         * Legt den Wert der lastChangeTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastChangeTime(String value) {
            this.lastChangeTime = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CustomFieldSettings" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CompareType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="DropDownStyle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "customFieldSettings"
        })
        public static class CustomFields {

            @XmlElement(name = "CustomFieldSettings", required = true)
            protected List<CitaviExchangeData.ProjectSettings.CustomFields.CustomFieldSettings> customFieldSettings;

            /**
             * Gets the value of the customFieldSettings property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the customFieldSettings property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomFieldSettings().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CitaviExchangeData.ProjectSettings.CustomFields.CustomFieldSettings }
             * 
             * 
             */
            public List<CitaviExchangeData.ProjectSettings.CustomFields.CustomFieldSettings> getCustomFieldSettings() {
                if (customFieldSettings == null) {
                    customFieldSettings = new ArrayList<CitaviExchangeData.ProjectSettings.CustomFields.CustomFieldSettings>();
                }
                return this.customFieldSettings;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="CompareType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="DropDownStyle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "compareType",
                "defaultValue",
                "dropDownStyle",
                "propertyName"
            })
            public static class CustomFieldSettings {

                @XmlElement(name = "CompareType", required = true)
                protected String compareType;
                @XmlElement(name = "DefaultValue", required = true)
                protected Object defaultValue;
                @XmlElement(name = "DropDownStyle", required = true)
                protected String dropDownStyle;
                @XmlElement(name = "PropertyName", required = true)
                protected String propertyName;

                /**
                 * Ruft den Wert der compareType-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompareType() {
                    return compareType;
                }

                /**
                 * Legt den Wert der compareType-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompareType(String value) {
                    this.compareType = value;
                }

                /**
                 * Ruft den Wert der defaultValue-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getDefaultValue() {
                    return defaultValue;
                }

                /**
                 * Legt den Wert der defaultValue-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setDefaultValue(Object value) {
                    this.defaultValue = value;
                }

                /**
                 * Ruft den Wert der dropDownStyle-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDropDownStyle() {
                    return dropDownStyle;
                }

                /**
                 * Legt den Wert der dropDownStyle-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDropDownStyle(String value) {
                    this.dropDownStyle = value;
                }

                /**
                 * Ruft den Wert der propertyName-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPropertyName() {
                    return propertyName;
                }

                /**
                 * Legt den Wert der propertyName-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPropertyName(String value) {
                    this.propertyName = value;
                }

            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LastReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ShowCategoryClassification" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="SortOrder"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SortProperty" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SortOrderImport"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SortProperty" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lastReferenceId",
        "showCategoryClassification",
        "sortOrder",
        "sortOrderImport"
    })
    public static class ProjectUserSettings {

        @XmlElement(name = "LastReferenceId", required = true)
        protected String lastReferenceId;
        @XmlElement(name = "ShowCategoryClassification")
        protected boolean showCategoryClassification;
        @XmlElement(name = "SortOrder", required = true)
        protected CitaviExchangeData.ProjectUserSettings.SortOrder sortOrder;
        @XmlElement(name = "SortOrderImport", required = true)
        protected CitaviExchangeData.ProjectUserSettings.SortOrderImport sortOrderImport;

        /**
         * Ruft den Wert der lastReferenceId-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastReferenceId() {
            return lastReferenceId;
        }

        /**
         * Legt den Wert der lastReferenceId-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastReferenceId(String value) {
            this.lastReferenceId = value;
        }

        /**
         * Ruft den Wert der showCategoryClassification-Eigenschaft ab.
         * 
         */
        public boolean isShowCategoryClassification() {
            return showCategoryClassification;
        }

        /**
         * Legt den Wert der showCategoryClassification-Eigenschaft fest.
         * 
         */
        public void setShowCategoryClassification(boolean value) {
            this.showCategoryClassification = value;
        }

        /**
         * Ruft den Wert der sortOrder-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CitaviExchangeData.ProjectUserSettings.SortOrder }
         *     
         */
        public CitaviExchangeData.ProjectUserSettings.SortOrder getSortOrder() {
            return sortOrder;
        }

        /**
         * Legt den Wert der sortOrder-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CitaviExchangeData.ProjectUserSettings.SortOrder }
         *     
         */
        public void setSortOrder(CitaviExchangeData.ProjectUserSettings.SortOrder value) {
            this.sortOrder = value;
        }

        /**
         * Ruft den Wert der sortOrderImport-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CitaviExchangeData.ProjectUserSettings.SortOrderImport }
         *     
         */
        public CitaviExchangeData.ProjectUserSettings.SortOrderImport getSortOrderImport() {
            return sortOrderImport;
        }

        /**
         * Legt den Wert der sortOrderImport-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CitaviExchangeData.ProjectUserSettings.SortOrderImport }
         *     
         */
        public void setSortOrderImport(CitaviExchangeData.ProjectUserSettings.SortOrderImport value) {
            this.sortOrderImport = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="SortProperty" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sortProperty"
        })
        public static class SortOrder {

            @XmlElement(name = "SortProperty", required = true)
            protected List<CitaviExchangeData.ProjectUserSettings.SortOrder.SortProperty> sortProperty;

            /**
             * Gets the value of the sortProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the sortProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSortProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CitaviExchangeData.ProjectUserSettings.SortOrder.SortProperty }
             * 
             * 
             */
            public List<CitaviExchangeData.ProjectUserSettings.SortOrder.SortProperty> getSortProperty() {
                if (sortProperty == null) {
                    sortProperty = new ArrayList<CitaviExchangeData.ProjectUserSettings.SortOrder.SortProperty>();
                }
                return this.sortProperty;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "referencePropertyId",
                "sortDirection"
            })
            public static class SortProperty {

                @XmlElement(name = "ReferencePropertyId", required = true)
                protected String referencePropertyId;
                @XmlElement(name = "SortDirection", required = true)
                protected String sortDirection;

                /**
                 * Ruft den Wert der referencePropertyId-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReferencePropertyId() {
                    return referencePropertyId;
                }

                /**
                 * Legt den Wert der referencePropertyId-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReferencePropertyId(String value) {
                    this.referencePropertyId = value;
                }

                /**
                 * Ruft den Wert der sortDirection-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSortDirection() {
                    return sortDirection;
                }

                /**
                 * Legt den Wert der sortDirection-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSortDirection(String value) {
                    this.sortDirection = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="SortProperty" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sortProperty"
        })
        public static class SortOrderImport {

            @XmlElement(name = "SortProperty", required = true)
            protected List<CitaviExchangeData.ProjectUserSettings.SortOrderImport.SortProperty> sortProperty;

            /**
             * Gets the value of the sortProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the sortProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSortProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CitaviExchangeData.ProjectUserSettings.SortOrderImport.SortProperty }
             * 
             * 
             */
            public List<CitaviExchangeData.ProjectUserSettings.SortOrderImport.SortProperty> getSortProperty() {
                if (sortProperty == null) {
                    sortProperty = new ArrayList<CitaviExchangeData.ProjectUserSettings.SortOrderImport.SortProperty>();
                }
                return this.sortProperty;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ReferencePropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="SortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "referencePropertyId",
                "sortDirection"
            })
            public static class SortProperty {

                @XmlElement(name = "ReferencePropertyId", required = true)
                protected String referencePropertyId;
                @XmlElement(name = "SortDirection", required = true)
                protected String sortDirection;

                /**
                 * Ruft den Wert der referencePropertyId-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReferencePropertyId() {
                    return referencePropertyId;
                }

                /**
                 * Legt den Wert der referencePropertyId-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReferencePropertyId(String value) {
                    this.referencePropertyId = value;
                }

                /**
                 * Ruft den Wert der sortDirection-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSortDirection() {
                    return sortDirection;
                }

                /**
                 * Legt den Wert der sortDirection-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSortDirection(String value) {
                    this.sortDirection = value;
                }

            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Publisher" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publisher"
    })
    public static class Publishers {

        @XmlElement(name = "Publisher", required = true)
        protected List<CitaviExchangeData.Publishers.Publisher> publisher;

        /**
         * Gets the value of the publisher property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the publisher property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublisher().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.Publishers.Publisher }
         * 
         * 
         */
        public List<CitaviExchangeData.Publishers.Publisher> getPublisher() {
            if (publisher == null) {
                publisher = new ArrayList<CitaviExchangeData.Publishers.Publisher>();
            }
            return this.publisher;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="SortFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="UniqueFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "name",
            "notes",
            "_protected",
            "sortFullName",
            "uniqueFullName"
        })
        public static class Publisher {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Notes", required = true)
            protected String notes;
            @XmlElement(name = "Protected")
            protected boolean _protected;
            @XmlElement(name = "SortFullName", required = true)
            protected String sortFullName;
            @XmlElement(name = "UniqueFullName", required = true)
            protected String uniqueFullName;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der notes-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotes() {
                return notes;
            }

            /**
             * Legt den Wert der notes-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotes(String value) {
                this.notes = value;
            }

            /**
             * Ruft den Wert der protected-Eigenschaft ab.
             * 
             */
            public boolean isProtected() {
                return _protected;
            }

            /**
             * Legt den Wert der protected-Eigenschaft fest.
             * 
             */
            public void setProtected(boolean value) {
                this._protected = value;
            }

            /**
             * Ruft den Wert der sortFullName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSortFullName() {
                return sortFullName;
            }

            /**
             * Legt den Wert der sortFullName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSortFullName(String value) {
                this.sortFullName = value;
            }

            /**
             * Ruft den Wert der uniqueFullName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueFullName() {
                return uniqueFullName;
            }

            /**
             * Legt den Wert der uniqueFullName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueFullName(String value) {
                this.uniqueFullName = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class ReferenceAuthors {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class ReferenceEditors {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class ReferenceGroups {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class ReferenceKeywords {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class ReferenceOrganizations {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OnetoN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onetoN"
    })
    public static class ReferencePublishers {

        @XmlElement(name = "OnetoN", required = true)
        protected List<String> onetoN;

        /**
         * Gets the value of the onetoN property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the onetoN property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnetoN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOnetoN() {
            if (onetoN == null) {
                onetoN = new ArrayList<String>();
            }
            return this.onetoN;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Reference" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AbstractComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="AbstractSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="CitationKeyUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="CoverPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EvaluationComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="EvaluationSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="HasLabel1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="HasLabel2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="PageCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PageRangeNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *                   &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="ReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ShortTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ShortTitleUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="StaticIDs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TableOfContentsComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="TableOfContentsSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Doi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Isbn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reference"
    })
    public static class References {

        @XmlElement(name = "Reference", required = true)
        protected List<CitaviExchangeData.References.Reference> reference;

        /**
         * Gets the value of the reference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the reference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CitaviExchangeData.References.Reference }
         * 
         * 
         */
        public List<CitaviExchangeData.References.Reference> getReference() {
            if (reference == null) {
                reference = new ArrayList<CitaviExchangeData.References.Reference>();
            }
            return this.reference;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AbstractComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="AbstractSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="CitationKeyUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="CoverPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EvaluationComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="EvaluationSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="HasLabel1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="HasLabel2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="PageCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PageRangeNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
         *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="ReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ShortTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ShortTitleUpdateType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="StaticIDs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TableOfContentsComplexity" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="TableOfContentsSourceTextFormat" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Doi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Isbn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createdBy",
            "createdOn",
            "modifiedBy",
            "modifiedOn",
            "_abstract",
            "abstractComplexity",
            "abstractSourceTextFormat",
            "citationKeyUpdateType",
            "coverPath",
            "evaluationComplexity",
            "evaluationSourceTextFormat",
            "hasLabel1",
            "hasLabel2",
            "pageCount",
            "pageRange",
            "pageRangeNumber",
            "rating",
            "referenceType",
            "shortTitle",
            "shortTitleUpdateType",
            "staticIDs",
            "tableOfContentsComplexity",
            "tableOfContentsSourceTextFormat",
            "title",
            "year",
            "doi",
            "isbn",
            "volume"
        })
        public static class Reference {

            @XmlElement(name = "CreatedBy", required = true)
            protected String createdBy;
            @XmlElement(name = "CreatedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createdOn;
            @XmlElement(name = "ModifiedBy", required = true)
            protected String modifiedBy;
            @XmlElement(name = "ModifiedOn", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modifiedOn;
            @XmlElement(name = "Abstract", required = true)
            protected String _abstract;
            @XmlElement(name = "AbstractComplexity")
            @XmlSchemaType(name = "unsignedByte")
            protected short abstractComplexity;
            @XmlElement(name = "AbstractSourceTextFormat")
            @XmlSchemaType(name = "unsignedByte")
            protected short abstractSourceTextFormat;
            @XmlElement(name = "CitationKeyUpdateType")
            @XmlSchemaType(name = "unsignedByte")
            protected short citationKeyUpdateType;
            @XmlElement(name = "CoverPath", required = true)
            protected String coverPath;
            @XmlElement(name = "EvaluationComplexity")
            @XmlSchemaType(name = "unsignedByte")
            protected short evaluationComplexity;
            @XmlElement(name = "EvaluationSourceTextFormat")
            @XmlSchemaType(name = "unsignedByte")
            protected short evaluationSourceTextFormat;
            @XmlElement(name = "HasLabel1")
            protected boolean hasLabel1;
            @XmlElement(name = "HasLabel2")
            protected boolean hasLabel2;
            @XmlElement(name = "PageCount", required = true)
            protected String pageCount;
            @XmlElement(name = "PageRange", required = true)
            protected String pageRange;
            @XmlElement(name = "PageRangeNumber")
            protected byte pageRangeNumber;
            @XmlElement(name = "Rating")
            @XmlSchemaType(name = "unsignedByte")
            protected short rating;
            @XmlElement(name = "ReferenceType", required = true)
            protected String referenceType;
            @XmlElement(name = "ShortTitle", required = true)
            protected String shortTitle;
            @XmlElement(name = "ShortTitleUpdateType")
            @XmlSchemaType(name = "unsignedByte")
            protected short shortTitleUpdateType;
            @XmlElement(name = "StaticIDs", required = true)
            protected String staticIDs;
            @XmlElement(name = "TableOfContentsComplexity")
            @XmlSchemaType(name = "unsignedByte")
            protected short tableOfContentsComplexity;
            @XmlElement(name = "TableOfContentsSourceTextFormat")
            @XmlSchemaType(name = "unsignedByte")
            protected short tableOfContentsSourceTextFormat;
            @XmlElement(name = "Title", required = true)
            protected String title;
            @XmlElement(name = "Year", required = true)
            protected String year;
            @XmlElement(name = "Doi", required = true)
            protected String doi;
            @XmlElement(name = "Isbn", required = true)
            protected String isbn;
            @XmlElement(name = "Volume", required = true)
            protected String volume;
            @XmlAttribute(name = "id", required = true)
            protected String id;

            /**
             * Ruft den Wert der createdBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedBy() {
                return createdBy;
            }

            /**
             * Legt den Wert der createdBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedBy(String value) {
                this.createdBy = value;
            }

            /**
             * Ruft den Wert der createdOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreatedOn() {
                return createdOn;
            }

            /**
             * Legt den Wert der createdOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreatedOn(XMLGregorianCalendar value) {
                this.createdOn = value;
            }

            /**
             * Ruft den Wert der modifiedBy-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifiedBy() {
                return modifiedBy;
            }

            /**
             * Legt den Wert der modifiedBy-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifiedBy(String value) {
                this.modifiedBy = value;
            }

            /**
             * Ruft den Wert der modifiedOn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModifiedOn() {
                return modifiedOn;
            }

            /**
             * Legt den Wert der modifiedOn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModifiedOn(XMLGregorianCalendar value) {
                this.modifiedOn = value;
            }

            /**
             * Ruft den Wert der abstract-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbstract() {
                return _abstract;
            }

            /**
             * Legt den Wert der abstract-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbstract(String value) {
                this._abstract = value;
            }

            /**
             * Ruft den Wert der abstractComplexity-Eigenschaft ab.
             * 
             */
            public short getAbstractComplexity() {
                return abstractComplexity;
            }

            /**
             * Legt den Wert der abstractComplexity-Eigenschaft fest.
             * 
             */
            public void setAbstractComplexity(short value) {
                this.abstractComplexity = value;
            }

            /**
             * Ruft den Wert der abstractSourceTextFormat-Eigenschaft ab.
             * 
             */
            public short getAbstractSourceTextFormat() {
                return abstractSourceTextFormat;
            }

            /**
             * Legt den Wert der abstractSourceTextFormat-Eigenschaft fest.
             * 
             */
            public void setAbstractSourceTextFormat(short value) {
                this.abstractSourceTextFormat = value;
            }

            /**
             * Ruft den Wert der citationKeyUpdateType-Eigenschaft ab.
             * 
             */
            public short getCitationKeyUpdateType() {
                return citationKeyUpdateType;
            }

            /**
             * Legt den Wert der citationKeyUpdateType-Eigenschaft fest.
             * 
             */
            public void setCitationKeyUpdateType(short value) {
                this.citationKeyUpdateType = value;
            }

            /**
             * Ruft den Wert der coverPath-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoverPath() {
                return coverPath;
            }

            /**
             * Legt den Wert der coverPath-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoverPath(String value) {
                this.coverPath = value;
            }

            /**
             * Ruft den Wert der evaluationComplexity-Eigenschaft ab.
             * 
             */
            public short getEvaluationComplexity() {
                return evaluationComplexity;
            }

            /**
             * Legt den Wert der evaluationComplexity-Eigenschaft fest.
             * 
             */
            public void setEvaluationComplexity(short value) {
                this.evaluationComplexity = value;
            }

            /**
             * Ruft den Wert der evaluationSourceTextFormat-Eigenschaft ab.
             * 
             */
            public short getEvaluationSourceTextFormat() {
                return evaluationSourceTextFormat;
            }

            /**
             * Legt den Wert der evaluationSourceTextFormat-Eigenschaft fest.
             * 
             */
            public void setEvaluationSourceTextFormat(short value) {
                this.evaluationSourceTextFormat = value;
            }

            /**
             * Ruft den Wert der hasLabel1-Eigenschaft ab.
             * 
             */
            public boolean isHasLabel1() {
                return hasLabel1;
            }

            /**
             * Legt den Wert der hasLabel1-Eigenschaft fest.
             * 
             */
            public void setHasLabel1(boolean value) {
                this.hasLabel1 = value;
            }

            /**
             * Ruft den Wert der hasLabel2-Eigenschaft ab.
             * 
             */
            public boolean isHasLabel2() {
                return hasLabel2;
            }

            /**
             * Legt den Wert der hasLabel2-Eigenschaft fest.
             * 
             */
            public void setHasLabel2(boolean value) {
                this.hasLabel2 = value;
            }

            /**
             * Ruft den Wert der pageCount-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPageCount() {
                return pageCount;
            }

            /**
             * Legt den Wert der pageCount-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPageCount(String value) {
                this.pageCount = value;
            }

            /**
             * Ruft den Wert der pageRange-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPageRange() {
                return pageRange;
            }

            /**
             * Legt den Wert der pageRange-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPageRange(String value) {
                this.pageRange = value;
            }

            /**
             * Ruft den Wert der pageRangeNumber-Eigenschaft ab.
             * 
             */
            public byte getPageRangeNumber() {
                return pageRangeNumber;
            }

            /**
             * Legt den Wert der pageRangeNumber-Eigenschaft fest.
             * 
             */
            public void setPageRangeNumber(byte value) {
                this.pageRangeNumber = value;
            }

            /**
             * Ruft den Wert der rating-Eigenschaft ab.
             * 
             */
            public short getRating() {
                return rating;
            }

            /**
             * Legt den Wert der rating-Eigenschaft fest.
             * 
             */
            public void setRating(short value) {
                this.rating = value;
            }

            /**
             * Ruft den Wert der referenceType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceType() {
                return referenceType;
            }

            /**
             * Legt den Wert der referenceType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceType(String value) {
                this.referenceType = value;
            }

            /**
             * Ruft den Wert der shortTitle-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortTitle() {
                return shortTitle;
            }

            /**
             * Legt den Wert der shortTitle-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortTitle(String value) {
                this.shortTitle = value;
            }

            /**
             * Ruft den Wert der shortTitleUpdateType-Eigenschaft ab.
             * 
             */
            public short getShortTitleUpdateType() {
                return shortTitleUpdateType;
            }

            /**
             * Legt den Wert der shortTitleUpdateType-Eigenschaft fest.
             * 
             */
            public void setShortTitleUpdateType(short value) {
                this.shortTitleUpdateType = value;
            }

            /**
             * Ruft den Wert der staticIDs-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaticIDs() {
                return staticIDs;
            }

            /**
             * Legt den Wert der staticIDs-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaticIDs(String value) {
                this.staticIDs = value;
            }

            /**
             * Ruft den Wert der tableOfContentsComplexity-Eigenschaft ab.
             * 
             */
            public short getTableOfContentsComplexity() {
                return tableOfContentsComplexity;
            }

            /**
             * Legt den Wert der tableOfContentsComplexity-Eigenschaft fest.
             * 
             */
            public void setTableOfContentsComplexity(short value) {
                this.tableOfContentsComplexity = value;
            }

            /**
             * Ruft den Wert der tableOfContentsSourceTextFormat-Eigenschaft ab.
             * 
             */
            public short getTableOfContentsSourceTextFormat() {
                return tableOfContentsSourceTextFormat;
            }

            /**
             * Legt den Wert der tableOfContentsSourceTextFormat-Eigenschaft fest.
             * 
             */
            public void setTableOfContentsSourceTextFormat(short value) {
                this.tableOfContentsSourceTextFormat = value;
            }

            /**
             * Ruft den Wert der title-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Legt den Wert der title-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Ruft den Wert der year-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYear() {
                return year;
            }

            /**
             * Legt den Wert der year-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYear(String value) {
                this.year = value;
            }

            /**
             * Ruft den Wert der doi-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoi() {
                return doi;
            }

            /**
             * Legt den Wert der doi-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoi(String value) {
                this.doi = value;
            }

            /**
             * Ruft den Wert der isbn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsbn() {
                return isbn;
            }

            /**
             * Legt den Wert der isbn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsbn(String value) {
                this.isbn = value;
            }

            /**
             * Ruft den Wert der volume-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVolume() {
                return volume;
            }

            /**
             * Legt den Wert der volume-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVolume(String value) {
                this.volume = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

        }

    }

}
