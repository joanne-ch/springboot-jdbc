package orderapp;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import orderapp.Ingredient.Type;

@Data
public class Taco {
	
	  private Long id;
	  
	  private Date createdAt;

@NotNull
@Size(min=5, message="Name must be at least 5 characters long")
private String name;

@Size(min=1, message="You must choose at least 1 ingredient")
private List<Ingredient> ingredients;

public List<Ingredient> getIngredients() {
		return this.ingredients;
	}

public String getName() {
	return this.name;
}

public Long getId() {
	return this.id;
}

public Date getCreatedAt() {
	return this.createdAt;
}

public void setCreatedAt(Date date) {
	this.createdAt = date;
}

public void setId(Long id) {
	this.id = id;
}




}
