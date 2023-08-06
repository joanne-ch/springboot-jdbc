package orderapp;

import lombok.Data;
import orderapp.Ingredient.Type;
@Data
public class IngredientRef {
 private final String ingredient;

 public IngredientRef(String ingredient) {
	 this.ingredient = ingredient;
 }
 
 public String getIngredient() {
	 return this.ingredient;
 }
 
}