package atelier07;

import cours04.FigureGeometrique; // 假设 FigureGeometrique 是一个抽象类
import java.lang.Comparable;

public class Cercle extends FigureGeometrique implements Comparable<Cercle> {
   
	double rayon;
	
	// creation  d'une nouvelle instance de Cercle
	public Cercle (float x) {
		super("noir");
		rayon = x;
		
	}
	
	// calcul du perimetre d'un cercle rouge
	// @return perimetre
	public float perimetre() {return (float)(2.0*Math.PI*rayon);}
	// private double rayon; // 圆的半径  on ecrit pas double en cosierant la memoire
	
	
	//calcul de lq surfacr d'un cercle
	// @return surface
	public float surface() {return (Math.PI*rayon*rayon)}
	
	
	
	// implementation de la methode comareTo de l'interface Comparable
	public int compareTo(Object o) { //object "o" est un autre object que object "this"
		if (this.equals(o)} return 0;
		Cercle c = {Cercle o;
		if this.rayon < c.rayon) return -1;
		else return 1;
	}
	

    

  
   