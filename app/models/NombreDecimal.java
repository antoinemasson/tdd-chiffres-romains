package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;
//import 

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
	static String[] res = {
		"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
	
		

	if (valeur<=101)
	    return res[valeur/10+9]+res[valeur%10];
	else return "";
    }
}
