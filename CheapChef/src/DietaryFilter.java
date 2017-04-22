
public class DietaryFilter {
	ingredients restrictions;
	ingredients mandatory;
	int priceMin;
	int priceMax;
	
	public ingredients getRestrictions() {
		return restrictions;
	}
	public void setRestrictions(ingredients restrictions) {
		this.restrictions = restrictions;
	}
	public ingredients getMandatory() {
		return mandatory;
	}
	public void setMandatory(ingredients mandatory) {
		this.mandatory = mandatory;
	}
	public int getPriceMin() {
		return priceMin;
	}
	public void setPriceMin(int priceMin) {
		this.priceMin = priceMin;
	}
	public int getPriceMax() {
		return priceMax;
	}
	public void setPriceMax(int priceMax) {
		this.priceMax = priceMax;
	}
}
