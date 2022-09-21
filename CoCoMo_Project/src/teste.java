import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		 int i =1 ;
	 while(i!=0){
		 System.out.println("Bonjour Monsieur !! \n Bon pour faire l'estimation de ton projet il faut : \n");
	        mode b = new mode();

		 double s = b.lignes();
		 int x = b.menuMode();

		switch (x){
		case 1:
	   mode a= new ORG();

		    a.CalculEffort(s);
	        a.coutEnprogrammeur();
	        a.tempsDeDev();
			a.nb_programeur();
			a.calculeHMI();
			a.coutEnprogrammeur_int();
			a.tempsDeDev_int();
			a.nb_programeur_int();
	//---------------------------------------------
			 System.out.println("\n        Points fonctions brut : "+a.PF+"PFbrute ."+
					            "\n        Points fonctions ajusté : "+a.PF_ajuste+"PFajusté ."+
					 		    "\n        le nombre de lignes :"+a.kloc+"."+
					 	"\n COCOMO Simple : "+
			 		                       "\n        l effort nécessaire à son devloppement : "+a.effort+" H-M ."+
	 	                                   "\n        Cout en programme :"+a.coutprog+" DZD ."+
	  	                                   "\n        temps de devloppement : "+a.tdev+" Mois ."+
	              	                       "\n        nombre de  programmeur :"+a.nb_prog+" Programmeur ."+
	  	                                   "\n --------------------------------------------------------"+
	  	                "\n COCOMO intermédiaire : "+
	  	                                   "\n        l effort nécessaire à son devloppement : "+a.HMI+" H-M . "+
	 	                                   "\n        Cout en programme :"+a.coutprog_i+" DZD ."+
	  	                                   "\n        temps de devloppement : "+a.tdev_i+" mois ."+
	              	                       "\n        nombre de  programmeur :"+a.nb_prog_i+" Programmeur ."+
	              	                       "\n ********************************************************"
	  	                                   );


		break ;
		case 2:
		 a= new SD();

		    a.CalculEffort(s);
	        a.coutEnprogrammeur();
	        a.tempsDeDev();
			a.nb_programeur();
			a.calculeHMI();
			a.coutEnprogrammeur_int();
			a.tempsDeDev_int();
			a.nb_programeur_int();
	//---------------------------------------------
			 System.out.println("Points fonctions brut : "+a.PF+"PF ."+
					 					 "\n        le nombre de lignes :"+a.kloc+"."+
				   "\n COCOMO Simple : "+
                                         "\n        l effort nécessaire à son devloppement : "+a.effort+" H-M ."+
                                         "\n        Cout en programme :"+a.coutprog+" DZD ."+
                                         "\n        temps de devloppement : "+a.tdev+" mois ."+
                                         "\n        nombre de  programmeur :"+a.nb_prog+" Programmeur ."+
                                         "\n --------------------------------------------------------"+
                   "\n COCOMO intermédiaire : "+
                                         "\n        l effort nécessaire à son devloppement : "+a.HMI+" H-M . "+
                                         "\n        Cout en programme :"+a.coutprog_i+" DZD ."+
                                         "\n        temps de devloppement : "+a.tdev_i+" Mois ."+
                                         "\n        nombre de  programmeur :"+a.nb_prog_i+" Programmeur ."+
                                         "\n ********************************************************"
                                       );

       	break;
		case 3:
		 a= new EMB();

		    a.CalculEffort(s);
	        a.coutEnprogrammeur();
	        a.tempsDeDev();
			a.nb_programeur();
			a.calculeHMI();
			a.coutEnprogrammeur_int();
			a.tempsDeDev_int();
			a.nb_programeur_int();
	//---------------------------------------------
			 System.out.println("Points fonctions brut : "+a.PF+"PF ."+
					 					"\n        le nombre de lignes :"+a.kloc+"."+
					"\n COCOMO Simple : "+
                                        "\n        l effort nécessaire à son devloppement : "+a.effort+" H-M ."+
                                        "\n        Cout en programme :"+a.coutprog+" DZD ."+
                                        "\n        temps de devloppement : "+a.tdev+" Mois ."+
                                        "\n        nombre de  programmeur :"+a.nb_prog+" Programmeur ."+
                                       "\n --------------------------------------------------------"+
                   "\n COCOMO intermédiaire : "+
                                        "\n        l effort nécessaire à son devloppement : "+a.HMI+" H-M . "+
                                        "\n        Cout en programme :"+a.coutprog_i+" DZD ."+
                                        "\n        temps de devloppement : "+a.tdev_i+" Mois ."+
                                        "\n        nombre de  programmeur :"+a.nb_prog_i+" Programmeur ."+
                                        "\n ********************************************************"
                       );
		break ;

	//--------------------------

		default :

			System.out.println("\n s'il vous plait fait ton choix avec les nombres proposès précédemment.. merci !");

		break ;

		}// end switch



		System.out.println("\n éstimation de ce projet est términé . \n " +
				"-------> TAPEZ '1' pour re-calculer un autre projet .\n " +
				"-------> TAPEZ '2' pour quiter le programme  . ");
		Scanner sc = new Scanner (System.in);
		int w = sc.nextInt();

		switch (w){
		case 1 :
			System.out.println("\n \n \n ||||| NOUVEAU PROJET : |||||  ");
			break ;
		case 2 :
			i=-1;
			b.msg();
			break ;
			default :
				i=-1;
			b.msg();
				break ;
		}

		i++;
	 }// end while



	}//end main
	}//end class

