/*
 *
 * 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 *
 * I dont give a fuck about copyright - this code is free to use for everybody - EXCEPTION:
 *     - entities that support:
 *         > queer hostility
 *         > any kind of religion
 *         > authoritarianism
 *         > sexism
 *         > racism
 *         > ableism
 *     - (most) boomer
 *     - conservatives

 *     - nazis
 *     - TERFs
 *     - TWERFs
 *     - SWERFs
 *
 * -will be extended if necessary-
 */

//
//created by 0x1nbetw33n on 29/05/2022
//

package eidp.ws19.admission_tests.saegewerk2;


public class Saegewerk {

	public static void main(String[] args){
		//erzeugt 4 Balken mit Länge, Dicke, Bruchfestigkeit
		Balken[] balken = {new Balken(1., 1., 20.),
				new Balken(2., 1., 50.),
				new Balken(2., 2., 30.),
				new Balken(2., 1., 20.)
		};
		//erzeuge 6 Baumstämme bestimmter Holzart, Laenge, Dicke (Bruchfestigkeit ergibt sich implizit durch die Holzart)
		Baumstamm[] staemme = {new Eichenstamm(2., 2.),
				new Eichenstamm(3., 2.),
				new Buchenstamm(2., 2.),
				new Buchenstamm(2., 2.),
				new Fichtenstamm(2., 2.),
				new Fichtenstamm(2., 2.)
		};
		schneiden(balken, staemme);
	}

	@SuppressWarnings("LoopConditionNotUpdatedInsideLoop")
	public static void schneiden(Balken[] balken, Baumstamm[] staemme){
		double gewichtGeschnitten = 0;
		for (int i = 0; i < balken.length; i++){
			double dickeBalken = balken[i].dicke();
			double laengeBalken = balken[i].laenge();
			double festigkeitBalken = balken[i].bruchfestigkeit();
			//prüfe jeden Baumstamm, ob der i-te Balken hier rausgeschnitten werden kann
			for (int j = 0; i < staemme.length; j++){
				double dickeStamm = staemme[j].getDicke();
				double laengeStamm = staemme[j].getLaenge();
				double festigkeitStamm = staemme[j].getBruchfestigkeit();
				//teste, ob es passt
				if ((dickeBalken <= dickeStamm) && (laengeBalken <= laengeStamm) && (festigkeitBalken <= festigkeitStamm)){
					//j-ten Baum kürzen
					//Resultat ist Gewicht des geschnittenen Balkens
					double gewichtBalken = staemme[j].kuerzen(laengeBalken, dickeBalken);
					System.out.println("Gewicht abgeschnittener Balken ist " + gewichtBalken + " kg");
					gewichtGeschnitten += gewichtBalken;
					break;
				}
			}
		}
		System.out.println("Das Gewicht der Balken ist " + gewichtGeschnitten + " kg");
	}
}