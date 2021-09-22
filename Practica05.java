import java.util.Scanner;
import java.util.*;

public class Practica05{
	public static void main (String [] args){
		
	LosBlues p1 = new LosBlues("Azul, ","Chico, ","Jay,Jake y Jim",", Separarse ");
	LosBlues p2 = new LosBlues("Amarilo, ","Mediano, ","Chuck, ","Aumentar su velocidad ");
	LosBlues p3 = new LosBlues("Negro, ","Grande, ","Bomb, ","Explosion");
	
	LosBlues[] AngryBirds = {p1,p2,p3};
	
	System.out.println("Pajaro: "+ AngryBirds[0].getColor()+AngryBirds[0].getTamano()+AngryBirds[0].getNombre()+AngryBirds[0].getPoder());
	System.out.println("Pajaro: "+ AngryBirds[1].getColor()+AngryBirds[1].getTamano()+AngryBirds[1].getNombre()+AngryBirds[1].getPoder());
	System.out.println("Pajaro: "+ AngryBirds[2].getColor()+AngryBirds[2].getTamano()+AngryBirds[2].getNombre()+AngryBirds[2].getPoder());
	}
}
