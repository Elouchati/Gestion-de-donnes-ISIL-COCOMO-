import java.util.Scanner;


public class mode {

    double nb_lignes ;
    double effort ;
    int SalairDeProg;
	int coutprog;
	double tdev;
	int nb_prog;
	int coutprog_i;
	double tdev_i;
	int nb_prog_i;
	double kloc;
	int PF;
	double PF_ajuste;

	double HMI;
	  public int menuMode(){
		  System.out.println("\n   *Entrer le mode de ton projet depuis la liste suivante : \n"+
	                                                      "            1-Le mode Oraganique . \n"+
                                                          "               2-Le mode Semi-Detché . \n"+
                                                          "                   3-Le mode Emberqué .\n"+
                                                          "                      0-Quitter  . ");

			Scanner var = new Scanner(System.in);
		    int a = var.nextInt();
		    return a ;
	  }
//-------------------------------------------------------------------------------------------------------------------------------------

	  public int menuAttributs(){



	 System.out.println("choisissez l'attributs necessaire :\n "+
			            "1-FIAB Fiabilité requise .\n"+
				        "2-DONN Volume des données manipulées .\n"+
				        "3-CPLX Complexité des produit .\n"+
				        "4-TEMP Contraintes de temps d'execution .\n"+
			            "5-ESPA Contrainte de taille memoire .\n"+
				        "6-VIRT Instabilité de la memoire .\n"+
				        "7-CSYS Contrainte du systeme de devloppement .\n"+
				        "8-APTA Aptitude de l'équipe .\n"+
				        "9-EXPA Experience de domaine .\n"+
				        "10-APTP Aptitude à la programation .\n"+
				        "11-EXPV Exprience de la machine virtuelle .\n"+
				        "12-EXPL Maitrise de langage .\n"+
				        "13-PMOD Paratique de developpement evoluées .\n"+
				        "14-OLOG Utilisation d'outils logiciel.\n"+
				        "15-DREQ Containte de délais .\n"
				  );
		  Scanner sc = new Scanner (System.in);
		  int v = sc.nextInt();
		  return v;
	  }

//-------------------------------------------------------------------------------------------------------------------------------------

	 public double lignes () {

			PointFonction a= new PointFonction();
			a.PF_brute();

		    a.nbKLOC();
		    this.PF_ajuste=a.PF_ajuste;
			return this.kloc=a.kloc;

		 }
//-------------------------------------------------------------------------------------------------------------------------------------


		public void  CalculEffort(double s ){

			}

//-------------------------------------------------------------------------------------------------------------------------------------


		public void coutEnprogrammeur(){

			System.out.println("entrer le cout mensuelle de programmeur:****DZD/mois");
			Scanner r = new Scanner(System.in);
			int sal = r.nextInt();
			if (sal<0){
				System.out.println("***** Entrer un nombre valide s'il vous plait !!! ****");
				coutEnprogrammeur();
			}

			else if (sal<1000)
		System.out.println("le salaire mensuelle d'un programmeur doit etre supperieur a 10.000 DZD/mois au au minimum monsieur !! ");

			else
			coutprog =(int) (sal *effort);
			this.SalairDeProg=sal;// pour la réutiliser dans la methode de CoutEnprogrammeur_int
		}

//-------------------------------------------------------------------------------------------------------------------------------------

	  public void  tempsDeDev(){

	  }
//-------------------------------------------------------------------------------------------------------------------------------------


	  public void  nb_programeur() {



		  double a =this.effort /this.tdev;
			int b =(int)Math.floor(a + 0.5);// pour ecrire le nombre de programmeurs en int
		  this.nb_prog= b ;

	  }
//-------------------------------------------------------------------------------------------------------------------------------------
public double calculeHMI (){
	System.out.print("\n - Combien de facteur ? ");
	Scanner ll = new Scanner (System.in);
	  int b = ll.nextInt();
	 double p =1;
	  for (int i =0;i<b;i++){

			int choix= this.menuAttributs();

	switch (choix){
		case 1:
			  System.out.println("choisissez la valeur : "+
        		      "\n 1-TB"+
        		      "\n 2-B "+
        		      "\n 3-M "+
        		      "\n 4-E "+
        		      "\n 5-TE"
        		      );

	  Scanner sc1 = new Scanner(System.in);
	  int choixV1=sc1.nextInt();


	            switch (choixV1){
	                         case 1:
	                        	 p=p*0.75;
	                        	 break;
	                         case 2:
	                        	 p=p*0.88;
	                        	 break;
	                         case 3:
	                        	 p=p*1;
	                        	 break;
	                         case 4:
	                        	 p=p*1.15;
	                        	 break;
	                         case 5:
	                        	 p=p*1.40;
	                        	 break;
	                         default :
	                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
	                        	 i=i-1;
	                             break ;
	                         }//end choixV
			break;
	        //*******************************
		case 2:
			System.out.println("choisissez la valeur : "+
      		      "\n 1-B "+
      		      "\n 2-M "+
      		      "\n 3-E "+
      		      "\n 4-TE"
      		      );
	  Scanner sc2 = new Scanner(System.in);
	  int choixV2=sc2.nextInt();
	            switch (choixV2){
	                         case 1:
	                        	 p=p*0.94;
	                        	 break;
	                         case 2:
	                        	 p=p*1;
	                        	 break;
	                         case 3:
	                        	 p=p*1.08;
	                        	 break;
	                         case 4:
	                        	 p=p*1.16;
	                        	 break;
	                         default:
	                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau  !"+"\n *************************");
                            	 i=i-1;

	                             break;
	                         }//end choixV

			break;
			//*******************************
		case 3:
			 System.out.println("choisissez la valeur : "+
				  "\n 1-TB"+
       		      "\n 2-B "+
       		      "\n 3-M "+
       		      "\n 4-E "+
       		      "\n 5-TE"+
       		      "\n 6-TTE"
       		      );

	  Scanner sc3 = new Scanner(System.in);
	  int choixV3=sc3.nextInt();


	            switch (choixV3){
	                         case 1:
	                        	 p=p*0.70;
	                        	 break;
	                         case 2:
	                        	 p=p*0.85;
	                        	 break;
	                         case 3:
	                        	 p=p*1;
	                        	 break;
	                         case 4:
	                        	 p=p*1.15;
	                        	 break;
	                         case 5:
	                        	 p=p*1.30;
	                        	 break;
	                         case 6:
	                        	 p=p*1.65;
	                        	 break;
	                         default:
	                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
	                             i=i-1;
	                             break;

	                         }//end choixV

			break;
			//*******************************
		case 4:
			 System.out.println("choisissez la valeur : "+

	       		      "\n 1-M "+
	       		      "\n 2-E "+
	       		      "\n 3-TE"+
	       		      "\n 4-TTE"
	       		      );

		  Scanner sc4 = new Scanner(System.in);
		  int choixV4=sc4.nextInt();


		            switch (choixV4){
		                         case 1:
		                        	 p=p*1;
		                        	 break;
		                         case 2:
		                        	 p=p*1.11;
		                        	 break;
		                         case 3:
		                        	 p=p*1.30;
		                        	 break;
		                         case 4:
		                        	 p=p*1.66;
		                        	 break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;
		                         }//end choixV
			break;
			//*******************************
		case 5:
			System.out.println("choisissez la valeur : "+

	       		      "\n 1-M "+
	       		      "\n 2-E "+
	       		      "\n 3-TE"+
	       		      "\n 4-TTE"
	       		      );

		  Scanner sc5 = new Scanner(System.in);
		  int choixV5=sc5.nextInt();


		            switch (choixV5){
		                         case 1:
		                        	 p=p*1;
		                        	 break;
		                         case 2:
		                        	 p=p*1.06;
		                        	 break;
		                         case 3:
		                        	 p=p*1.21;
		                        	 break;
		                         case 4:
		                        	 p=p*1.56;
		                        	 break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		case 6:
			System.out.println("choisissez la valeur : "+

	                		      "\n 1-B "+
	       		                  "\n 2-M "+
	       		                  "\n 3-E "+
	       		                  "\n 4-TE"

	       		                           );

		  Scanner sc6 = new Scanner(System.in);
		  int choixV6=sc6.nextInt();


		            switch (choixV6){
		                         case 1:
		                        	 p=p*0.87;
		                        	 break;
		                         case 2:
		                        	 p=p*1;
		                        	 break;
		                         case 3:
		                        	 p=p*1.15;
		                        	 break;
		                         case 4:
		                        	 p=p*1.30;
		                        	 break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
	                                 i=i-1;
                                     break;
		                         }//end choixV

			//*******************************
		case 7:
			 System.out.println("choisissez la valeur : "+

	       		      "\n 1-B "+
	       		      "\n 2-M "+
	       		      "\n 3-E "+
	       		      "\n 4-TE"
	       		      );

		  Scanner sc7 = new Scanner(System.in);
		  int choixV7=sc7.nextInt();


		            switch (choixV7){
		                         case 1:
		                        	 p=p*0.87;
		                        	 break;
		                         case 2:
		                        	 p=p*1;
		                        	 break;
		                         case 3:
		                        	 p=p*1.07;
		                        	 break;
		                         case 4:
		                        	 p=p*1.15;
		                        	 break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
	                                 i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		case 8:
			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "+
	       		      "\n 5-TE"
	       		      );

		  Scanner sc8 = new Scanner(System.in);
		  int choixV8=sc8.nextInt();


		            switch (choixV8){
		                         case 1:
		                        	 p=p*1.46;
		                        	 break;
		                         case 2:
		                        	 p=p*1.19;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*0.86;
		                        	 break;
		                         case 5:
		                        	 p=p*1.71;
		                             break ;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
	                                 i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		case 9:
			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "+
	       		      "\n 5-TE"
	       		      );

		  Scanner sc9 = new Scanner(System.in);
		  int choixV9=sc9.nextInt();


		            switch (choixV9){
		                         case 1:
		                        	 p=p*1.29;
		                        	 break;
		                         case 2:
		                        	 p=p*1.13;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*0.91;
		                        	 break;
		                         case 5:
		                        	 p=p*0.82;
		                             break ;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		case 10:
			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "+
	       		      "\n 5-TE"
	       		      );

		  Scanner sc10 = new Scanner(System.in);
		  int choixV10=sc10.nextInt();


		            switch (choixV10){
		                         case 1:
		                        	 p=p*1.42;
		                        	 break;
		                         case 2:
		                        	 p=p*1.17;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*0.86;
		                        	 break;
		                         case 5:
		                        	 p=p*0.70;
		                             break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;
		                         }//end choixV

			break;
			//*******************************
		case 11:
			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "
	       		      );

		  Scanner sc11 = new Scanner(System.in);
		  int choixV11=sc11.nextInt();


		            switch (choixV11){
		                         case 1:
		                        	 p=p*1.21;
		                        	 break;
		                         case 2:
		                        	 p=p*1.10;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*0.90;
		                        	 break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		case 12:

			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "
	       		      );

		  Scanner sc12 = new Scanner(System.in);
		  int choixV12=sc12.nextInt();


		            switch (choixV12){
		                         case 1:
		                        	 p=p*1.14;
		                        	 break;
		                         case 2:
		                        	 p=p*1.07;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*0.95;
		                        	 break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;

		                         }//end choixV
			break;
			//*******************************
		case 13:
			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "+
	       		      "\n 5-TE"
	       		      );

		  Scanner sc13 = new Scanner(System.in);
		  int choixV13=sc13.nextInt();


		            switch (choixV13){
		                         case 1:
		                        	 p=p*1.24;
		                        	 break;
		                         case 2:
		                        	 p=p*1.10;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*0.91;
		                        	 break;
		                         case 5:
		                        	 p=p*0.82;
		                             break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		case 14:
			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "+
	       		      "\n 5-TE"
	       		      );

		  Scanner sc14 = new Scanner(System.in);
		  int choixV14=sc14.nextInt();


		            switch (choixV14){
		                         case 1:
		                        	 p=p*1.24;
		                        	 break;
		                         case 2:
		                        	 p=p*1.10;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*0.91;
		                        	 break;
		                         case 5:
		                        	 p=p*1.83;
		                             break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		case 15:
			 System.out.println("choisissez la valeur : "+
					  "\n 1-TB"+
	       		      "\n 2-B "+
	       		      "\n 3-M "+
	       		      "\n 4-E "+
	       		      "\n 5-TE"
	       		      );

		  Scanner sc15 = new Scanner(System.in);
		  int choixV15=sc15.nextInt();


		            switch (choixV15){
		                         case 1:
		                        	 p=p*1.23;
		                        	 break;
		                         case 2:
		                        	 p=p*1.08;
		                        	 break;
		                         case 3:
		                        	 p=p*1;
		                        	 break;
		                         case 4:
		                        	 p=p*1.04;
		                        	 break;
		                         case 5:
		                        	 p=p*1.10;
		                             break;
		                         default:
		                        	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");
		                             i=i-1;
		                             break;

		                         }//end choixV

			break;
			//*******************************
		default:
       	 System.out.println("\n s'il vous plait entrer un nombre de la liste ... vous allez recommencer a nouveau !"+"\n *************************");

       	i=i-1;
			break;
	}// end choix
	  }// end for

	        HMI=p*effort;
           	HMI= Math.floor(HMI * 1000) / 1000;// math.floor pour ecrire le tdev_i avec trois chiffres aprés la virgule
        return HMI;
}//fin calculeHMI
//-------------------------------------------------------------------------------------------------------------------------------------
public void tempsDeDev_int(){

}

//-------------------------------------------------------------------------------------------------------------------------------------
public void  nb_programeur_int() {

	  double a= this.HMI / this.tdev_i ;
		int b =(int)Math.floor(a + 0.5);// pour ecrire le nombre de programmeurs en int
		this.nb_prog_i=b;
	  }
//-------------------------------------------------------------------------------------------------------------------------------------
public void coutEnprogrammeur_int(){
	this.coutprog_i= (int) HMI*this.SalairDeProg;
}
//-------------------------------------------------------------------------------------------------------------------------------------

public void msg (){
		 System.out.print("Programme terminé. \n \n \n Ouchtati Aboubakr Adil ...IZIL 2018.");
	 }
//-------------------------------------------------------------------------------------------------------------------------------------






}
