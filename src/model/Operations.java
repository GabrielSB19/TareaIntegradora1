/*
Gabriel Suarez Baron
A00368589
*/

package model;

public class Operations{

  /**
  *Initialize the accountant for the execution of my codigo. <br>
  *<b>pre: </b> <br>
  *<b>post: </b> <br>
  */


  public static final int  DARK_WORK = 1300000;
	public static final int  WHITE_WORK = 2600000;
	public static final int  PAINT = 980000;

  /**
  *Method to find the total value to be a paid in Homecenter. <br>
  *<b>pre: </b> Must be initialized the methods called like as "registerLocation", "gaveNumsMateriasl" <br>
  *<b> "gaveNameMaterials", "gaveAmountMaterials", "gaveUtilMaterials" </b><br>
  *<b>post: </b> Finding the cost of products if you buy in Homecenter. <br>
  @param location ask for the location. location != "" and (location = Norte || location = Sur || location = Centro).
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @param priceHomecenter cost of the product on Homecenter. priceHomecenter != priceHomecenter lesser than 0.
  @return priceHomecenterTotal
  */
  public static int totalPriceWorkHomecenter(String location, int numMaterials, int [] priceHomecenter, int [] amountMaterials){
    int workForceH = DARK_WORK+WHITE_WORK+PAINT;
    int priceXAmountH = 0;
		int priceDomiH = 0;
    int priceHomecenterTotal = 0;
    for (int i =0; i<numMaterials; i++){
      priceXAmountH += priceHomecenter[i]*amountMaterials[i];
    }
    if (location.equalsIgnoreCase("Norte")){
			if (priceXAmountH<80000){
				priceDomiH = priceXAmountH+120000;
			}
			else if (priceXAmountH<300000){
				priceDomiH = priceXAmountH+28000;
			}
			else if (priceXAmountH>=300000){
				priceDomiH = priceXAmountH;
			}
    }
    else if (location.equalsIgnoreCase("Centro")){
      if (priceXAmountH<80000){
				priceDomiH = priceXAmountH+50000;
			}
			else {
				priceDomiH = priceXAmountH;
			}
    }
    else if (location.equalsIgnoreCase("Sur")){
      if (priceXAmountH<80000){
				priceDomiH = priceXAmountH+120000;
			}
			else if (priceXAmountH<300000){
				priceDomiH = priceXAmountH+55000;
			}
			else if (priceXAmountH>=300000){
				priceDomiH = priceXAmountH;
			}
    }
    priceHomecenterTotal = priceDomiH+workForceH;
    return priceHomecenterTotal;
  }

  /**
  *Method to find the total value to be a paid in Ferreteria del Centro. <br>
  *<b>pre: </b> Must be initialized the methods called like as "registerLocation", "gaveNumsMateriasl" <br>
  *<b> "gaveNameMaterials", "gaveAmountMaterials", "gaveUtilMaterials" </b><br>
  *<b>post: </b> Finding the cost of products if you buy in Ferreteria del centro. <br>
  @param location ask for the location. location != "" and (location = Norte || location = Sur || location = Centro).
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @param priceFerreteriaCentro cost of the product on Ferreteria centro. priceFerreteriaCentro != priceFerreteriaCentro lesser than 0.
  @return priceFerreteriaCentroTotal
  */
  public static int totalPriceWorkFerreteriaCentro(String location, int numMaterials, int [] priceFerreteriaCentro, int [] amountMaterials){
    int workForceFC = DARK_WORK+WHITE_WORK+PAINT;
    int priceXAmountFC = 0;
		int priceDomiFC = 0;
    int priceFerreteriaCentroTotal = 0;
    for (int i =0; i<numMaterials; i++){
      priceXAmountFC += priceFerreteriaCentro[i]*amountMaterials[i];
    }
    if (location.equalsIgnoreCase("Norte")){
			if (priceXAmountFC<80000){
				priceDomiFC = priceXAmountFC+120000;
			}
			else if (priceXAmountFC<300000){
				priceDomiFC = priceXAmountFC+28000;
			}
			else if (priceXAmountFC>=300000){
				priceDomiFC = priceXAmountFC;
			}
    }
    else if (location.equalsIgnoreCase("Centro")){
      if (priceXAmountFC<80000){
				priceDomiFC = priceXAmountFC+50000;
			}
			else {
				priceDomiFC = priceXAmountFC;
			}
    }
    else if (location.equalsIgnoreCase("Sur")){
      if (priceXAmountFC<80000){
				priceDomiFC = priceXAmountFC+120000;
			}
			else if (priceXAmountFC<300000){
				priceDomiFC = priceXAmountFC+55000;
			}
			else if (priceXAmountFC>=300000){
				priceDomiFC = priceXAmountFC;
			}
    }
    priceFerreteriaCentroTotal = priceDomiFC+workForceFC;
    return priceFerreteriaCentroTotal;
  }

  /**
  *Method to find the total value to be a paid in Ferreteria del Barrio. <br>
  *<b>pre: </b> Must be initialized the methods called like as "registerLocation", "gaveNumsMateriasl" <br>
  *<b> "gaveNameMaterials", "gaveAmountMaterials", "gaveUtilMaterials" </b><br>
  *<b>post: </b> Finding the cost of products if you buy in Ferreteria del barrio. <br>
  @param location ask for the location. location != "" and (location = Norte || location = Sur || location = Centro).
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @param priceFerreteriaBarrio cost of the product on Ferreteria centro. priceFerreteriaBarrio != priceFerreteriaBarrio lesser than 0.
  @return priceFerreteriaBarrioTotal
  */
  public static int totalPriceWorkFerreteriaBarrio(String location, int numMaterials, int [] priceFerreteriaBarrio, int [] amountMaterials){
    int workForceFB = DARK_WORK+WHITE_WORK+PAINT;
    int priceXAmountFB = 0;
		int priceDomiFB = 0;
    int priceFerreteriaBarrioTotal = 0;
    for (int i =0; i<numMaterials; i++){
      priceXAmountFB += priceFerreteriaBarrio[i]*amountMaterials[i];
    }
    if (location.equalsIgnoreCase("Norte")){
			if (priceXAmountFB<80000){
				priceDomiFB = priceXAmountFB+120000;
			}
			else if (priceXAmountFB<300000){
				priceDomiFB = priceXAmountFB+28000;
			}
			else if (priceXAmountFB>=300000){
				priceDomiFB = priceXAmountFB;
			}
    }
    else if (location.equalsIgnoreCase("Centro")){
      if (priceXAmountFB<80000){
				priceDomiFB = priceXAmountFB+50000;
			}
			else {
				priceDomiFB = priceXAmountFB;
			}
    }
    else if (location.equalsIgnoreCase("Sur")){
      if (priceXAmountFB<80000){
				priceDomiFB = priceXAmountFB+120000;
			}
			else if (priceXAmountFB<300000){
				priceDomiFB = priceXAmountFB+55000;
			}
			else if (priceXAmountFB>=300000){
				priceDomiFB = priceXAmountFB;
			}
    }
    priceFerreteriaBarrioTotal = priceDomiFB+workForceFB;
    return priceFerreteriaBarrioTotal;
  }

  /**
  *Method to find the best place where you can buy the materials.
  *<b>pre: </b> Must be initialized the methods called like as "gaveNumsMateriasl", "valuesHomecenter",  <br>
  *<b> "gaveAmountMaterials", "valuesFerreteriaCentro", "valuesFerreteriaBarrio" </b><br>
  *<b>post: </b> Finding the best place to buy the product.<br>
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param priceFerreteriaBarrio value of the product in Ferreteria del barrio. priceFerreteriaBarrio != lesser than 0.
  @param priceFerreteriaCentro value of the product in Ferreteria del Centro. priceFerreteriaCentro != lesser than 0.
  @param priceHomecenter value of the product in Homecenter. priceHomecenter != lesser than 0.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @return bestPlace
  */
  public static String [] metBestPlace(int numMaterials, int [] priceFerreteriaBarrio, int [] priceFerreteriaCentro, int [] priceHomecenter, int [] amountMaterials){
    String [] bestPlace = new String [numMaterials];
    for (int i = 0; i<numMaterials; i++){
			if (amountMaterials[i]*priceHomecenter[i]<amountMaterials[i]*priceFerreteriaBarrio[i]){
				if (amountMaterials[i]*priceHomecenter[i]<amountMaterials[i]*priceFerreteriaCentro[i]){
					bestPlace[i] = "Homecenter";
				}
				else {
					bestPlace[i] = "Ferreteria del Centro";
				}
			}
			else if (amountMaterials[i]*priceFerreteriaBarrio[i]<amountMaterials[i]*priceFerreteriaCentro[i]){
				bestPlace[i] = "Ferreteria del Barrio";
 			}
			else {
				bestPlace[i] = "Ferreteria del Centro";
			}
		}
    return bestPlace;
  }

  /**
  *Method to find the best price of the product.
  *<b>pre: </b> Must be initialized the methods called like as "gaveNumsMateriasl", "valuesHomecenter"<br>
  *<b>"gaveAmountMaterials", "valuesFerreteriaCentro", "valuesFerreteriaBarrio" </b><br>
  *<b>post: </b> Finding the best price to buy the product.<br>
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param priceFerreteriaBarrio value of the product in Ferreteria del barrio. priceFerreteriaBarrio != lesser than 0.
  @param priceFerreteriaCentro value of the product in Ferreteria del Centro. priceFerreteriaCentro != lesser than 0.
  @param priceHomecenter value of the product in Homecenter. priceHomecenter != lesser than 0.
  @param amountMaterials amount of the number of the products. amountMaterials != amountMaterials lesser than 0.
  @return bestPrice
  */
  public static int [] metBestPrice(int numMaterials, int [] priceFerreteriaBarrio, int [] priceFerreteriaCentro, int [] priceHomecenter, int [] amountMaterials){
    int [] bestPrice = new int [numMaterials];
    for (int i = 0; i<numMaterials; i++){
			if (amountMaterials[i]*priceHomecenter[i]<amountMaterials[i]*priceFerreteriaBarrio[i]){
				if (amountMaterials[i]*priceHomecenter[i]<amountMaterials[i]*priceFerreteriaCentro[i]){
					bestPrice[i] = amountMaterials[i]*priceHomecenter[i];
				}
				else {
					bestPrice[i] = amountMaterials[i]*priceFerreteriaCentro[i];
				}
			}
			else if (amountMaterials[i]*priceFerreteriaBarrio[i]<amountMaterials[i]*priceFerreteriaCentro[i]){
				bestPrice[i] = amountMaterials[i]*priceFerreteriaBarrio[i];
 			}
			else {
				bestPrice[i] = amountMaterials[i]*priceFerreteriaCentro[i];
			}
		}
    return bestPrice;
  }

  /**
  *Method to find the payment value with the best prices.
  *<b>pre: </b> Must be initialized the methods called like as "gaveNumsMateriasl", "metBestPlace"<br>
  *<b>"metBestPrice"</b><br>
  *<b>post: </b> Finding the best value to pay.<br>
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param bestPrice best price of the products. bestPrice != "" || bestPrice != null and bestprice != bestprice lesser than 0
  @param location ask for the location. location != "" and (location = Norte || location = Sur || location = Centro).
  @return pricePay
  */
  public static int bestPay(int numMaterials, int [] bestPrice, String location){
    int pricePay = 0;
    for (int i = 0; i<numMaterials; i++){
			pricePay += bestPrice[i];
		}
    if (location.equalsIgnoreCase("Norte")){
			if (pricePay<80000){
				pricePay = pricePay+120000;
			}
			else if (pricePay<300000){
				pricePay = pricePay+28000;
			}
			else if (pricePay>=300000){
				pricePay = pricePay;
			}
		}
		else if (location.equalsIgnoreCase("Centro")){
			if (pricePay<80000){
				pricePay = pricePay+50000;
			}
			else {
				pricePay = pricePay;
			}
		}
		else if (location.equalsIgnoreCase("Sur")){
			if (pricePay<80000){
				pricePay = pricePay+120000;
			}
			else if (pricePay<300000){
				pricePay = pricePay+55000;
			}
			else if (pricePay>=300000){
				pricePay = pricePay;
			}
		}
    pricePay = pricePay;
    return pricePay;
  }

  /**
  *Method to find the products of the black work
  **<b>pre: </b> Must be initialized the methods called like as "gaveNumsMateriasl", "gaveUtilMaterials",<br>
  *<b> "gaveNameMaterials"</b><br>
  *<b>post: </b> Finding the products of the black work.<br>
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param utilMaterials use of the product. utilMaterials != "" and (utilMaterials = Obra negra || utilMaterials = Obra blanca || utilMaterials = Pintura).
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return blackWorkMaterials
  */
  public static String [] utilizationProductBlackWork(int numMaterials, String [] utilMaterials, String [] nameMaterials){
		String [] blackWorkMaterials = new String [numMaterials];
		for (int i = 0; i<numMaterials; i++){
      if (utilMaterials[i].equalsIgnoreCase("Obra Negra")){
  				blackWorkMaterials[i]=nameMaterials[i];
  		}
    }
    return blackWorkMaterials;
  }

  /**
  *Method to find the products of the white work
  **<b>pre: </b> Must be initialized the methods called like as "gaveNumsMateriasl", "gaveUtilMaterials",<br>
  *<b> "gaveNameMaterials"</b><br>
  *<b>post: </b> Finding the products of the white work.<br>
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param utilMaterials use of the product. utilMaterials != "" and (utilMaterials = Obra negra || utilMaterials = Obra blanca || utilMaterials = Pintura).
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return whiteWorkMaterials
  */
  public static String [] utilizationProductWhiteWork(int numMaterials, String [] utilMaterials, String [] nameMaterials){
		String [] whiteWorkMaterials = new String [numMaterials];
		for (int i = 0; i<numMaterials; i++){
      if (utilMaterials[i].equalsIgnoreCase("Obra Blanca")){
          whiteWorkMaterials[i]=nameMaterials[i];
      }
    }
    return whiteWorkMaterials;
  }

  /**
  *Method to find the products of the pintura
  **<b>pre: </b> Must be initialized the methods called like as "gaveNumsMateriasl", "gaveUtilMaterials",<br>
  *<b> "gaveNameMaterials"</b><br>
  *<b>post: </b> Finding the products of the pintura.<br>
  @param numMaterials amount of the products. numMaterials != numMaterials lesser than 0 and the method gaveNumsMateriasl must be initialize.
  @param utilMaterials use of the product. utilMaterials != "" and (utilMaterials = Obra negra || utilMaterials = Obra blanca || utilMaterials = Pintura).
  @param nameMaterials name of the product for the work. nameMaterials != null || nameMaterials != "".
  @return paintMaterials
  */
  public static String [] utilizationProductPaint(int numMaterials, String [] utilMaterials, String [] nameMaterials){
		String [] paintMaterials = new String [numMaterials];
		for (int i = 0; i<numMaterials; i++){
      if (utilMaterials[i].equalsIgnoreCase("Pintura")){
        paintMaterials[i]=nameMaterials[i];
      }
		}
    return paintMaterials;
  }
}
