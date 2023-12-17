package entities;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	private String ManufactureDate;

	public UsedProduct(String name, Double price, String manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}

	public String getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return "Name: " + getName() 
				+ " (USED) Price: $" 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ ManufactureDate.formatted(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}
