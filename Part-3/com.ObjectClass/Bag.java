public class Bag {
	String color;
	String Brand;
	double Price;
	public Bag(String color, String brand, double price) {
		super();
		this.color = color;
		this.Brand = brand;
		this.Price = price;
	}
	//override
	public boolean eqals(Object args)
	{
		Bag ref=(Bag)args;
		return this.Price==ref.Price;
	}
	public static void main(String[] args) 
	{
		Bag b =new Bag("Black","Puma",3000);
		Bag b1 =new Bag("Blue","Sky",5000);
		System.out.println(b.toString());
		System.out.println(b.hashCode());
		System.out.println(b1.toString());
		System.out.println(b1.hashCode());
		System.out.println(b.equals(b1));
	}
	
}
