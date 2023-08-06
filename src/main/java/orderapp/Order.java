package orderapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import orderapp.Ingredient.Type;

//import lombok.Data;

//@Data
public class Order {
	
  private Long id;
  
  private Date placedAt;

  @NotBlank(message="Name is required")
  private String name;
   
  @NotBlank(message="Street is required")
  private String street;
   

  @NotBlank(message="City is required")
  private String city;
   

  @NotBlank(message="State is required")
  private String state;
   

  @NotBlank(message="Zip code is required")
  private String zip;
   

  @CreditCardNumber(message="Not a valid credit card number")
  private String ccNumber;
   

  @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
           message="Must be formatted MM/YY")
  private String ccExpiration;
   

  @Digits(integer=3, fraction=0, message="Invalid CVV")
  private String ccCVV;
  
  private List<Taco> tacos = new ArrayList<>();
  
  public void addTaco(Taco taco) {
	  this.tacos.add(taco);
  }
  
  public String getName() {
		return this.name;
	}
  
  public String getStreet() {
		return this.street;
	}
  
  public String getCity() {
		return this.city;
	}
  
  public String getState() {
		return this.state;
	}
  
  public String getZip() {
		return this.zip;
	}
  
  public String getCcNumber() {
		return this.ccNumber;
	}
  
  public String getCcExpiration() {
		return this.ccExpiration;
	}
  
  public String getCcCVV() {
		return this.ccCVV;
	}
  
  public List<Taco> getTacos() {
		return this.tacos;
	}
  
  public Long getId() {
		return this.id;
	}
  
  public Date getPlacedAt() {
		return this.placedAt;
	}
  
  public void setPlacedAt(Date date) {
	  this.placedAt = date;
  }
  
  public void setId(Long id) {
	  this.id = id;
  }
  

}