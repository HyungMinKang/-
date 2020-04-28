package genericsextends;


public class GenericPrinterTest {
	public static void main(String[] args)
	{
		GenericPrinter<Powder> powderPrinter= new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder=powderPrinter.getMaterial();
		powderPrinter.printring();
		
		GenericPrinter<Plastic> plasticPrinter= new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic=plasticPrinter.getMaterial();
		plasticPrinter.printring();
	}
}
