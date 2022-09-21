
public class ORG extends mode {


	public void CalculEffort(double s ){

		effort =2.4*Math.pow(nb_lignes,1.05);
		effort= Math.floor(effort * 1000) / 1000;// math.floor pour ecrire le tdev_i avec trois chiffres aprés la virgule

	}

	public void tempsDeDev(){

		tdev= 2.5*Math.pow(effort, 0.38);
		tdev= Math.floor(tdev * 100) / 100;// math.floor pour ecrire le tdev_i avec deux chiffres aprés la virgule

	  }

	public void tempsDeDev_int(){

		tdev_i= 2.5*Math.pow(HMI, 0.38);
		tdev_i= Math.floor(tdev_i* 100) / 100;

	}
}
