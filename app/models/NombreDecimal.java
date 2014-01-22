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
	String [] res = new String[20];
	res[0]="";
	res[1]="I";
	res[2]="II";
	res[3]="III";
	res[4]="IV";
	res[5]="V";
	res[6]="VI";
	res[7]="VII";
	res[8]="VIII";
	res[9]="IX";
	res[10]="X";
	res[11]="XX";
	res[12]="XXX";
	res[13]="XL";
	res[14]="L";
	res[15]="LX";
	res[16]="LXX";
	res[17]="LXXX";
	res[18]="XC";
	res[19]="C";


	if (valeur<=101)
	    return res[valeur/10+9]+res[valeur%10];
	else return "";
    }
}
