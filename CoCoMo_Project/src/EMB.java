
public class EMB extends mode {

	public void CalculEffort(double s ){

		effort =3.6*Math.pow(nb_lignes,1.2);
		effort= Math.floor(effort * 1000) / 1000;// math.floor pour ecrire le tdev_i avec trois chiffres apr�s la virgule
	}

	public void tempsDeDev(){

		tdev= 2.5*Math.pow(effort, 0.32);
		tdev= Math.floor(tdev * 100) / 100;// math.floor pour ecrire le tdev_i avec deux chiffres apr�s la virgule

	  }
	public void tempsDeDev_int(){

		tdev_i= 2.5*Math.pow(HMI, 0.32);
		tdev_i= Math.floor(tdev_i * 100) / 100;

	}
}
