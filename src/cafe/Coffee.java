package cafe;

public class Coffee {
	  private String name;
	    private String engName;
	    private int price;
	    
	    public Coffee(String name, String engName, int price) {
	        this.name = name;
	        this.engName = engName;
	        this.price = price;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getPrice() {
	        return price;
	    }
	    
	    @Override
	    public String toString() {
	        return "[" + name + ": " + price + "]";
	    }
}
