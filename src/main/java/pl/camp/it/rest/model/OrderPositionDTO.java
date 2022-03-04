package pl.camp.it.rest.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPositionDTO  {
  
  @ApiModelProperty(value = "")
  private String book = null;

  @ApiModelProperty(value = "")
  private Integer id = null;

  @ApiModelProperty(value = "")
  private Integer positionQuantity = null;
 /**
   * Get book
   * @return book
  **/
  @JsonProperty("book")
  public String getBook() {
    return book;
  }

  public void setBook(String book) {
    this.book = book;
  }

  public OrderPositionDTO book(String book) {
    this.book = book;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderPositionDTO id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get positionQuantity
   * @return positionQuantity
  **/
  @JsonProperty("positionQuantity")
  public Integer getPositionQuantity() {
    return positionQuantity;
  }

  public void setPositionQuantity(Integer positionQuantity) {
    this.positionQuantity = positionQuantity;
  }

  public OrderPositionDTO positionQuantity(Integer positionQuantity) {
    this.positionQuantity = positionQuantity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPositionDTO {\n");
    
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    positionQuantity: ").append(toIndentedString(positionQuantity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

