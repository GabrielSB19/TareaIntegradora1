/*
Gabriel Suarez Baron
A00368589
*/

package ui;
import model.*;
import java.util.Scanner;
public class Main{

  /**
  *Registration of the location of the property.<br>
  *<b>pre: </b> <br>
  *<b>post: </b> The location has been registered. <br>
  @param sc ask for the location. sc != "" and (sc = "Norte" || sc = "Centro " || sc = "Sur")
  @return location
  */
  public static String registerLocation(Scanner sc){
    System.out.println ("Ingresa la ubicacion del inmueble donde se realizara la obra");
    String location = sc.nextLine();
    boolean correctLoc = false;
    while (correctLoc == false){
			if (location.equalsIgnoreCase("Norte")){
				correctLoc = true;
			}
			else if (location.equalsIgnoreCase("Centro")){
				correctLoc = true;
			}
			else if (location.equalsIgnoreCase("Sur")){
				correctLoc = true;
			}
			else {
				System.out.println ("Ingresa una localizacion valida");
				location = sc.nextLine();
			}
    }
    return location;
  }

  /**
  *Registration of the number of materials for the  realization of the work.
  *<b>pre: </b> <br>
  *<b>post: </b> The numbers of materials has been registered.
  @param sc ask for the numbers of the materials. sc != lesser than 0
  @return numMaterials
  */
  public static int gaveNumsMateriasl(Scanner sc){
    System.out.println("Ingresa el numero de productos necesarios para la realizacion de la obra");
    int numMaterials = sc.nextInt();
    sc.nextLine();
    return numMaterials;
  }

  /**
  *Registration of the name of the materials for the realization of the work <br>
  *<b>pre: </b> must be initialized the method called like as "gaveNumsMateriasl". <br>
  *<b>post: </b> The name of the materials has been registered.
  @param sc ask for the name of the materials. sc != null || sc! = "".
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @return nameMaterials
  */
  public static String [] gaveNameMaterials(Scanner sc, int numMaterials){
    String [] nameMaterials = new String [numMaterials];
    for (int i = 0; i<numMaterials; i++){
      System.out.println("Ingresa el nombre del producto "+(i+1));
      nameMaterials[i]=sc.nextLine();
    }
     return nameMaterials;
  }

  /**
  *Registration  of the amount of the materials for the realization of the work <br>
  *<b>pre: </b> must be initialized the method called like as "gaveNumsMateriasl", "gaveNameMaterials" <br>
  *<b>post: </b> The amount of the materials has been registered.
  @param sc ask for the amount of the materials. sc = sc greater than 0
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return amountMaterials
  */
  public static int [] gaveAmountMaterials(Scanner sc, int numMaterials, String [] nameMaterials){
    int [] amountMaterials = new int [numMaterials];
    for (int i = 0; i<numMaterials; i++){
      System.out.println("Ingresa la cantidad del producto " +nameMaterials[i]);
      amountMaterials[i] = sc.nextInt();
      sc.nextLine();
    }
    return amountMaterials;
  }

  /**
  *Registration  of the use of the materials for the realization of the work <br>
  *<b>pre: </b> must be initialized the method called like as "gaveNumsMateriasl", "gaveNameMaterials" <br>
  *<b>post: </b> The use of the materials has been registered.
  @param sc ask for the util of the materilas. sc != null || sc != "".
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return utilMaterials
  */
  public static String [] gaveUtilMaterials(Scanner sc, int numMaterials, String [] nameMaterials){
    boolean correctUtil = false;
    String [] utilMaterials = new String [numMaterials];
    for (int i = 0; i<numMaterials; i++){
      System.out.println("Ingresa la utilizacion del producto "+ nameMaterials[i] +" recuerda que debe de ser obra negra, obra blanca o pintura");
      utilMaterials[i] = sc.nextLine();
      while (correctUtil == false){
  			if (utilMaterials[i].equalsIgnoreCase("obra negra")){
  				correctUtil = true;
  			}
  			else if (utilMaterials[i].equalsIgnoreCase("obra blanca")){
  				correctUtil = true;
  			}
  			else if (utilMaterials[i].equalsIgnoreCase("pintura")){
  				correctUtil = true;
  			}
  			else {
  				System.out.println ("Ingresa una categoria valida");
          utilMaterials[i] = sc.nextLine();
  			}
  		}
  		correctUtil = false;
    }
    return utilMaterials;
  }

  /**
  *Method to ask the value of the materials in Homecenter
  *<b>pre: </b> must be initialized the method called like as "gaveNumsMateriasl", "gaveNameMaterials" <br>
  *<b>post: </b> The value of the materials that have been registered.
  @param sc ask for the value of the materilas. sc != null || sc != "" and sc != sc lesser than 0.
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return priceHomecenter
  */
  public static int [] valuesHomecenter(Scanner sc, int numMaterials, String [] nameMaterials){
    int [] priceHomecenter = new int [numMaterials];
    for (int i = 0; i<numMaterials; i++){
      System.out.println("Ingresa el valor del producto "+ nameMaterials[i] +" en Homecenter");
      priceHomecenter[i]=sc.nextInt();
    }
    return priceHomecenter;
  }

  /**
  *Method to ask the value of the materials in Ferreteria del Centro
  *<b>pre: </b> must be initialized the method called like as "gaveNumsMateriasl", "gaveNameMaterials" <br>
  *<b>post: </b> The value of the materials that have been registered.
  @param sc ask for the value of the materilas. sc != null || sc != "" and sc != sc lesser than 0.
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return priceFerreteriaCentro
  */
  public static int [] valuesFerreteriaCentro(Scanner sc, int numMaterials, String [] nameMaterials){
    int [] priceFerreteriaCentro = new int [numMaterials];
    for (int i = 0; i<numMaterials; i++){
      System.out.println("Ingresa el valor del producto "+ nameMaterials[i] +" en la Ferreteria del Centro");
      priceFerreteriaCentro[i]=sc.nextInt();
    }
    return priceFerreteriaCentro;
  }

  /**
  *Method to ask the value of the materials in Ferreteria del Barrio.
  *<b>pre: </b> must be initialized the methods called like as "gaveNumsMateriasl", "gaveNameMaterials" <br>
  *<b>post: </b> The value of the materials that have been registered.
  @param sc ask for the value of the materilas. sc != null || sc != "" and sc != sc lesser than 0.
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return priceFerreteriaBarrio
  */
  public static int [] valuesFerreteriaBarrio(Scanner sc, int numMaterials, String [] nameMaterials){
    int [] priceFerreteriaBarrio = new int [numMaterials];
    for (int i = 0; i<numMaterials; i++){
      System.out.println("Ingresa el valor del producto "+ nameMaterials[i] +" en la Ferreteria del Barrio");
      priceFerreteriaBarrio[i]=sc.nextInt();
    }
    return priceFerreteriaBarrio;
  }

  /**
  *Method to show the values in each hardware store.
  <b>pre: </b> must be initialized the methods called like as "totalPriceWorkHomecenter", "totalPriceWorkFerreteriaCentro", <br>
  <b> "totalPriceWorkFerreteriaBarrio" in the operations class. </b><br>
  *<b>post: </b> Showing the value to be to paid in each hardware store. <br>
  @param location ask for the location. location != "" and (location = Norte || location = Sur || location = Centro).
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param priceHomecenter cost of the product on Homecenter. priceHomecenter != priceHomecenter lesser than 0.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @param priceFerreteriaBarrio cost of the product on Ferreteria centro. priceFerreteriaBarrio != priceFerreteriaBarrio lesser than 0.
  @param priceFerreteriaCentro cost of the product on Ferreteria centro. priceFerreteriaCentro != priceFerreteriaCentro lesser than 0.
  */
  public static void showValuesFerreterias (String location, int numMaterials, int [] priceHomecenter, int [] amountMaterials, int [] priceFerreteriaBarrio, int [] priceFerreteriaCentro){
    System.out.println("El precio total de la obra si la realizas en homecenter es de " + Operations.totalPriceWorkHomecenter(location,  numMaterials, priceHomecenter, amountMaterials));
    System.out.println("El precio total de la obra si la realizas en la ferreteria del barrio es de "+ Operations.totalPriceWorkFerreteriaBarrio(location, numMaterials, priceFerreteriaBarrio, amountMaterials));
    System.out.println("El precio total de la obra si la realizas en la ferreteria del centro es de "+ Operations.totalPriceWorkFerreteriaCentro(location, numMaterials, priceFerreteriaCentro, amountMaterials));
  }

  /**
  *Method to show the best price and the best place to buy each material and also the best price to pay.
  <b>pre: </b> must be initialized the methods called like as "metBestPlace", "metBestPrice" and "bestPay" in the operations class .<br>
  *<b>post: </b> Showing the best place and price for each material. <br>
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param priceHomecenter cost of the product on Homecenter. priceHomecenter != priceHomecenter lesser than 0.
  @param priceFerreteriaBarrio cost of the product on Ferreteria centro. priceFerreteriaBarrio != priceFerreteriaBarrio lesser than 0.
  @param priceFerreteriaCentro cost of the product on Ferreteria centro. priceFerreteriaCentro != priceFerreteriaCentro lesser than 0.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @param bestPrice the best price for each material. bestPrice != "" and bestPrice != null.
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @param location ask for the location. location != "" and (location = Norte || location = Sur || location = Centro).
  */
  public static void showBestProduct (int numMaterials, int [] priceFerreteriaBarrio, int [] priceFerreteriaCentro, int [] priceHomecenter, int [] amountMaterials, int [] bestPrice, String [] nameMaterials, String location){
    String [] bestPlace = Operations.metBestPlace(numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials);
    int [] bestValue = Operations.metBestPrice(numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials);
    //*Note: I created a variable to give value to the Operations.<Name> because at the time of showing in the system.out.println I got strange letters and numbers.
    for (int i = 0; i<numMaterials; i++){
      System.out.println("El mejor lugar para comprar el producto "+ nameMaterials[i] +" es en "+ bestPlace[i] +" con un precio de "+ bestValue[i]);
    }
    System.out.println("Si realizas estas compras pagaras incluido el domicilio "+ (Operations.bestPay(numMaterials, bestPrice, location)-4880000));
    System.out.println("El valor total a pagar incluido la mano de obra es de "+Operations.bestPay(numMaterials, bestPrice, location));
  }

  /**
  *Method of displaying materials according to their use.
  <b>pre: </b> must be initialized the methods called like as "utilizationProductBlackWork", "utilizationProductWhiteWork" <br>
  <b> and "bestPay" in the operations class.</b><br>
  *<b>post: </b> Showing the material according to its use.<br>
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param utilMaterials use of the product. utilMaterials != "" and (utilMaterials = Obra negra || utilMaterials = Obra blanca || utilMaterials = Pintura).
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  */
  public static void showUtilization(int numMaterials, String [] utilMaterials, String [] nameMaterials){
    String [] blackWorkMaterials = Operations.utilizationProductBlackWork(numMaterials, utilMaterials, nameMaterials);
    String [] whiteWorkMaterials = Operations.utilizationProductWhiteWork(numMaterials, utilMaterials, nameMaterials);
    String [] paintMaterials = Operations.utilizationProductPaint(numMaterials, utilMaterials, nameMaterials);
    System.out.println("Los materiales segun su utilizacion son");
    for (int i = 0; i<numMaterials; i++){
      if (utilMaterials[i].equalsIgnoreCase("Obra Negra")){
        System.out.println("Para la obra negra");
        System.out.println(blackWorkMaterials[i]);
      }
      else if(utilMaterials[i].equalsIgnoreCase("Obra blanca")){
        System.out.println("Para la obra blanca");
        System.out.println(whiteWorkMaterials[i]);
      }
      else if(utilMaterials[i].equalsIgnoreCase("Pintura")){
        System.out.println("Para la pintura");
        System.out.println(paintMaterials[i]);
      }
    }
  }

  /**
  *Method to show a menu in which the user can choose the action to be executed.
  <b>pre: </b> all methods in the Main class must be initialized.<br>
  *<b>post: </b> show the method chosen by the user.<br>
  @param sc ask for the chosen option. sc = 1 || sc = 2 || sc = 3 || sc = 4
  @param numMaterials numbers of the products to buy. numMaterials != "" and numMaterials = greater than 0.
  @param priceHomecenter cost of the product on Homecenter. priceHomecenter != priceHomecenter lesser than 0.
  @param priceFerreteriaBarrio cost of the product on Ferreteria centro. priceFerreteriaBarrio != priceFerreteriaBarrio lesser than 0.
  @param priceFerreteriaCentro cost of the product on Ferreteria centro. priceFerreteriaCentro != priceFerreteriaCentro lesser than 0.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @param location ask for the location. location != "" and (location = Norte || location = Sur || location = Centro).
  @param utilMaterials use of the product. utilMaterials != "" and (utilMaterials = Obra negra || utilMaterials = Obra blanca || utilMaterials = Pintura).
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @param bestPrice the best price for each material. bestPrice != "" and bestPrice != null.
  */
  public static void showMenu(Scanner sc, int numMaterials, int [] priceFerreteriaBarrio, int [] priceFerreteriaCentro, int [] priceHomecenter, int [] amountMaterials, String location, String [] nameMaterials, String [] utilMaterials, int [] bestPrice){

    System.out.println("****************************************************************************************");
    System.out.println("");
    System.out.println("Opcion 1: Deseas saber el precio de la obra si la compras en cada una de las ferreteiras");
		System.out.println("Opcion 2: Saber donde es mejor comprar cada producto y el valor a pagar a total");
		System.out.println("Opcion 3: Desplegar cada producto por su utilizacion");
		System.out.println("Opcion 4: Salir");
    System.out.println("");
    System.out.println("****************************************************************************************");
		String op = sc.next();
    sc.nextLine();
    switch (op){
			case "1":
      showValuesFerreterias(location, numMaterials, priceHomecenter, amountMaterials, priceFerreteriaBarrio, priceFerreteriaCentro);
      showMenu(sc, numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials, location, nameMaterials, utilMaterials, bestPrice);
			break;
			case "2":
      showBestProduct (numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials, bestPrice, nameMaterials, location);
      showMenu(sc, numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials, location, nameMaterials, utilMaterials, bestPrice);
			break;
			case "3":
      showUtilization(numMaterials, utilMaterials, nameMaterials);
      showMenu(sc, numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials, location, nameMaterials, utilMaterials, bestPrice);
			break;
			case "4":
			System.exit(0);
			break;
			default:
			System.out.println("Por favor, digete una opcion valida");
			showMenu(sc, numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials, location, nameMaterials, utilMaterials, bestPrice);
		}
	}

  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String location = registerLocation(sc);
    int numMaterials = gaveNumsMateriasl(sc);
    String [] nameMaterials = gaveNameMaterials(sc, numMaterials);
    int [] amountMaterials = gaveAmountMaterials(sc, numMaterials, nameMaterials);
    String [] utilMaterials = gaveUtilMaterials(sc, numMaterials, nameMaterials);
    int [] priceHomecenter = valuesHomecenter(sc, numMaterials, nameMaterials);
    int [] priceFerreteriaCentro = valuesFerreteriaCentro(sc, numMaterials, nameMaterials);
    int [] priceFerreteriaBarrio = valuesFerreteriaBarrio(sc, numMaterials, nameMaterials);
    int [] bestPrice = Operations.metBestPrice(numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials);
    showMenu(sc, numMaterials, priceFerreteriaBarrio, priceFerreteriaCentro, priceHomecenter, amountMaterials, location, nameMaterials, utilMaterials, bestPrice);

  }

}
