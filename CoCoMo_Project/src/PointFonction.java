import java.util.Scanner;

public class PointFonction {
//********* atributs
	Scanner sc = new Scanner(System.in);
	public int PF_di;
	public int PF_de;
	public int PF_in;
	public int PF_ex;
	public int PF_req;
	public double PF_brut;
	public double kloc;
	public double PF_ajuste;
//*******************************************
	public void Depot_Interne(){
		int PF_d=0;
		int nb_fichier;
		int nb_record_element;
		int nb_attributs ;
	    int a =1;
		System.out.println(" - Entrer le nombre de fichiers des Depots INTERNE : ");
		 nb_fichier = sc.nextInt();

			if (nb_fichier <0){System.out.println("**** Le nombre de fichier doit etre positif !! ****");Depot_Interne();}
			else if(nb_fichier ==0) System.out.println("  *PF depot iterne = 0 . ");
			else {

				 for (int i =1 ;i<=nb_fichier;i++){

					 							System.out.println(" ----- Entrer le nombre des 'records elements' de Depot "+a +":");
					                            nb_record_element= sc.nextInt();
					 if (nb_record_element<0) { System.out.println("S'il vous plait entrer un nombre positif " +
					 												" \n ***  vous devez recommencer à nouveau ");
					                            Depot_Interne();
					 }
					 else{
						 						System.out.println(" ----- Entrer le nombre des ' d'attributs' de Depot "+a +":");
						 						nb_attributs = sc.nextInt();
						 						if (nb_attributs <0){
						 							System.out.println("S'il vous plait entrer un nombre positif " +
						 													" \n ***  VOUS DEVEZ RECOMMENCER A NOUVEAU *** ");
						 							Depot_Interne();
						 							}
						 						if (nb_attributs>=1 && nb_attributs<=19)
							     				 {
							     					   			if(nb_record_element>=1&&nb_record_element<=5) PF_d=PF_d+7;
							     					   	   else if(nb_record_element>5) PF_d=PF_d+10;
							     				 }


							     				   else if (nb_attributs>=20&&nb_attributs<=50)
							     				 {
							     					   			 if(nb_record_element==1)PF_d=PF_d+7;
							     					   		else if(nb_record_element>=2&&nb_record_element<=5) PF_d=PF_d+10;
							     					        else if(nb_record_element>5)PF_d=PF_d+15;
							                      }

							     				   else if (nb_attributs>50)
							     				   {
							     					   			if(nb_record_element==1)  PF_d=PF_d+10;
							     					   		else if(nb_record_element>=2) PF_d=PF_d+15;
							     				   	}
							     						a=a+1;

					 }
				} // end for
				 this.PF_di=PF_d;
				 System.out.println("*PF depot iterne = "+this.PF_di +".");
			}//end else

	}// fin de depot interne

//*******************************************************************************************************************

	public void Depot_Externe(){

		int nb_fichier;
		int nb_record_element;
		int nb_attributs ;

		System.out.println(" - Entrer le nombre de fichiers des DEPOTS EXTERNES : ");
		 nb_fichier = sc.nextInt();

			if (nb_fichier <0){System.out.println("**** Le nombre de fichier doit etre positif !! ****");Depot_Externe();}
			else {
				 int a =1; // cet variable est utilise pour juste afficher le nombre de fichier a ajouter dans le msg

				 for (int i =1 ;i<=nb_fichier;i++){

					 							System.out.println(" ----- Entrer le nombre des 'records elements' de Depot "+a +":");
					                            nb_record_element= sc.nextInt();
					 if (nb_record_element<0) { System.out.println("S'il vous plait entrer un nombre positif " +
					 												" \n ***  vous devez recommencer à nouveau ");
					                            Depot_Externe();
					 }
					 else{
						 						System.out.println(" ----- Entrer le nombre des ' d'attributs' de Depot "+a +":");
						 						nb_attributs = sc.nextInt();
						 						if (nb_attributs <0){
						 							System.out.println("S'il vous plait entrer un nombre positif " +
						 													" \n ***  VOUS DEVEZ RECOMMENCER A NOUVEAU *** ");
						 							Depot_Externe();
						 							}

						 					     else if (nb_attributs>=1&& nb_attributs<=19){
						 					    	 			if(nb_record_element>=1&&nb_record_element<=5) this.PF_de=PF_de+5;
						 					    	 	 else   if(nb_record_element>5)this.PF_de=PF_de+7;
						 					     									}
						 					     else if (nb_attributs>=20&&nb_attributs<=50){
						 					    	   if(nb_record_element==1)this.PF_de=PF_de+5;
						 					    	 if(nb_record_element>=2&&nb_record_element<=5) this.PF_de=PF_de+7;
						 				    	 	 else   if(nb_record_element>5)this.PF_de=PF_de+10;
						 					     }
						 					     else if (nb_attributs>50){
						 					    	 if(nb_record_element==1)this.PF_de=PF_de+7;
						 					    	 else  if(nb_record_element>=2) this.PF_de=PF_de+10;

						 					     }
							     						a=a+1;

					 }
				} // end for
				 this.PF_de=PF_de;
				 System.out.println("*PF depot Externe  = "+this.PF_de +".");
			}//end else

	}// fin de depot interne

//*******************************************************************************************************************
	public void Intrants(){
		 int a =1;
				System.out.println(" -Entrer le nombre des INTRANTS :");
					int nb_int= sc.nextInt();
	if (nb_int<0 ){
						System.out.println("**** Le nombre de fichier doit etre positif !! ****");
						Intrants();
		           }
	else {
			for (int i=0;i<nb_int;i++){
					System.out.println(" -Entrer le nombre de 'fichiers référencés' "+a +":");
			        int nb_fich =sc.nextInt();
			        if (nb_fich<0){
			        							System.out.println("S'il vous plait entrer un nombre positif " +
			        													" \n ***  vous devez recommencer à nouveau ");
			        							Intrants();
			        }
			        else {
			        							System.out.println("-Entrer le nombre 'attributs' "+a +":");
			        							int nb_att =sc.nextInt();
			        							if (nb_att<0){
				        							System.out.println("S'il vous plait entrer un nombre positif " +
				        													" \n ***  VOUS DEVEZ RECOMENCER A NOUVEAU ");
				        							Intrants();
			        								}

			 if (nb_att>=1&&nb_att<=4){

				 							if (nb_fich<=2)this.PF_in=PF_in+3;
				 					   else if (nb_fich>2)this.PF_in=PF_in+4;
			 							}

		else if (nb_att>=5&&nb_att<=15)	{
											if (nb_fich<2)this.PF_in=PF_in+3;
									   else if (nb_fich==2)this.PF_in=PF_in+4;
									   else if (nb_fich>2)this.PF_in=PF_in+6;
											}
		else if (nb_att>=16){
											if (nb_fich<2)this.PF_in=PF_in+4;
									   else if (nb_fich>=2)this.PF_in=PF_in+6;
			}
			        }
			        a++;
		}// end for
	}// end else
       System.out.println("PF Intrants : "+this.PF_in );
	}// fin Intrants


//*******************************************************************************************************************
	public void Extrants (){
		 int a =1;

		System.out.println(" -Entrer le nombre des EXTRANTS :");
		int nb_ext= sc.nextInt();
		if (nb_ext<0){
			System.out.println("**** Le nombre des extrants doit etre positif !! ****");
			Extrants();
			}

		else {
		for (int i=0;i<nb_ext;i++){
			System.out.println(" Entrer le nombre de 'fichiers référencés' "+a+":");
			int nb_fich =sc.nextInt();
				if (nb_fich<0){
															System.out.println("S'il vous plait entrer un nombre positif " +
																	" \n *** VOUS DEVEZ RECOMMENCER A NOUVEAU *** ");
																Extrants();
							}
		   else {
			   			System.out.println("Entrer le nombre de 'attributs' "+a+":");
			   			int nb_att =sc.nextInt();
			   			if (nb_att<0){						System.out.println("S'il vous plait entrer un nombre positif " +
			   														" \n *** VOUS DEVEZ RECOMMENCER A NOUVEAU *** ");
			   													Extrants();
			   													}
			   			else {
			   						if (nb_att>=1&&nb_att<=5){

			   														 if (nb_fich<=2)this.PF_ex=PF_ex+4;
			   													else if (nb_fich>=2&&nb_fich<=3)this.PF_ex=PF_ex+4;
			   													else this.PF_ex=PF_ex+5;
			   													}
			   						else if (nb_att>5&&nb_att<=19){
			   														if (nb_fich<2)this.PF_ex=PF_ex+4;
			   												   else if (nb_fich>=2&&nb_fich<=3)this.PF_ex=PF_ex+5;
			   												   else if (nb_fich>3)this.PF_ex=PF_ex+7;
			   													}
			   						else if (nb_att>=20){
			   														if (nb_fich<2)this.PF_ex=PF_ex+5;
			   												   else this.PF_ex=PF_ex+7;
			   													}
			   				}
		   		}
				  a++;
									}// end for

	       System.out.println("PF Extrants :"+this.PF_ex );

	}//end else
	}// fin Extrants

//*******************************************************************************************************************
	public void Requette (){

		PF_req=0 ;
		 int a =1;
		System.out.println("- Entrer le nombre de REAQUETTES INTRANTS  :");
		int nb_reqI=sc.nextInt();
				if ( nb_reqI<0 ) {
										System.out.println("**** Le nombre des extrants doit etre positif !! ****");
											Requette();
								}
			else {
									System.out.println("- Entrer le nombre de REAQUETTES EXTRANTS  :");
									int nb_reqE=sc.nextInt();
											if ( nb_reqE<0 ) {
																System.out.println("**** Le nombre des extrants doit etre positif !! ****"+
																	" \n  *** VOUS DEVEZ RECOMMENCER A NOUVEAU ***  ");
																					Requette();
																	}
											else  if (nb_reqE==0&& nb_reqI==0) {

											}

											else {

								if (nb_reqI<=nb_reqE){ // majotité Extrants .

										for (int i=0;i<nb_reqE;i++){
											System.out.println("-Entrer le nombre des 'fichiers' : "+a+" :");
											int nb_fich =sc.nextInt();
													if (nb_fich<0){
														System.out.println("**** Le nombre de fichiers doit etre positif !! ****"+
																			" \n  *** VOUS DEVEZ RECOMMENCER A NOUVEAU *** ");
																			Requette();
																			}
													else {
														System.out.println("-Entrer le nombre 'd'attributs' "+a+" :");
														int nb_att =sc.nextInt();
														if (nb_att<0){
															System.out.println("**** Le nombre d'attributs doit etre positif !! ****"+
																				" \n  *** VOUS DEVEZ RECOMMENCER A NOUVEAU ***  ");
																				Requette();
																				}

													else if (nb_att>=1&&nb_att<=5){

																					if (nb_fich<2) this.PF_req=PF_req+3;
																			   else if (nb_fich>=2&&nb_fich<=3)this.PF_req=PF_req+3;
																			   else this.PF_req=PF_req+4;
																					}
													else if (nb_att>5&&nb_att<=19){
																					if (nb_fich<2)this.PF_req=PF_req+3;
																			   else if (nb_fich>=2&&nb_fich<=3)this.PF_req=PF_req+4;
																			   else if (nb_fich>3)this.PF_req=PF_req+6;
																					}
													else if (nb_att>=20){
																					if (nb_fich<2)this.PF_req=PF_req+4;
																			   else this.PF_req=PF_req+6;
																			}

														}


													  a++;
										}

			                     } // end majorité Extrants

								else {
									for (int i=0;i<=nb_reqE;i++){
										System.out.println("-Entrer le nombre de 'fichiers' : "+a+" : ");
										int nb_fich =sc.nextInt();
												if (nb_fich<0){
													System.out.println("**** Le nombre de fichiers doit etre positif !! ****"+
																		" \n  *** VOUS DEVEZ RECOMMENCER A NOUVEAU *** ");
																		Requette();
																		}
												else {
													System.out.println("-Entrer le nombre 'd'attributs' "+a+" :");
													int nb_att =sc.nextInt();
													if (nb_att<0){
														System.out.println("**** Le nombre d'attributs doit etre positif !! ****"+
																			" \n  *** VOUS DEVEZ RECOMMENCER A NOUVEAU ***  ");
																			Requette();
																			}



												 if (nb_att>=1&&nb_att<=4){

													 							if (nb_fich<=2)this.PF_in=PF_in+3;
													 					   else if (nb_fich>2)this.PF_in=PF_in+4;
												 							}

											else if (nb_att>=5&&nb_att<=15)	{
																				if (nb_fich<2)this.PF_in=PF_in+3;
																		   else if (nb_fich==2)this.PF_in=PF_in+4;
																		   else if (nb_fich>2)this.PF_in=PF_in+6;
																				}
											else if (nb_att>=16){
																				if (nb_fich<2)this.PF_in=PF_in+4;
																		   else if (nb_fich>=2)this.PF_in=PF_in+6;
												}
												        }
												  a++;
								}





			}
			}
			}
				  System.out.println("PF Extrants :"+this.PF_ex );
	}// fin req

//*******************************************************************************************************************

	public void PF_brute(){
			Depot_Interne();
			Depot_Externe();
			Intrants();
			Extrants();
			Requette();

		this.PF_brut=PF_de+PF_di+PF_ex+PF_in+PF_req;

		   System.out.println("PF bute = "+PF_di +"+"+PF_de+"+"+PF_ex+"+"+PF_in+"+"+PF_req +" = "+ PF_brut +"PFs.");

	}
//*******************************************************************************************************************

public void PF_ajuste (){
 int nb =1;
 int b ;
 int di=0;
 double facteur=0 ;

	System.out.println("\n Combien de facteurs vous allez entrer "  +
			"               \n  -*-*-*-* Liste des facteur d'ajustement des points de fonction : *-*-*-*- "+
       	    "\n---* Télecomunication " +
			"\n---*  Traitement distibué " +
			"\n---* Performance " +
			"\n---* Charge de l'équipement " +
			"\n---* Taux de transaction " +
			"\n---* Saisie de donnée en direct " +
			"\n---* Convivialité " +
			"\n---* Mise a jour en direct " +
			"\n---* Complexité traitement " +
			"\n---* Réutilisabilité " +
			"\n---* Facilité d'implantation " +
			"\n---* Utilisabilité  "
			);
	int a=sc.nextInt();
	   for (int i=0;i<a;i++){

	        System.out.println("entrer le degré d'influence DIc de 0 (aucune influence) à 5 (très grande influence) pour le facteur numéro "+nb);
	        b=sc.nextInt();
	        if (b>=0&&b<=5){
	        di=di+b;
	        nb++;
	        }
	        else {
	        	System.out.println("------->  entrer un nombre valide de 1 à 5 s'il vous plait !!");
	        	i--;
	        }
	   }//fi  boucle
	facteur = 0.65 + di*0.01 ;
	this.PF_ajuste=facteur*PF_brut ;

	System.out.println("le PFajuste est : " +PF_ajuste );

}
//*******************************************************************************************************************

public void nbKLOC (){
	System.out.println("Langage utilisé ?? "
			  +"\n 1- C ."
			  +"\n 2- C++ ."
			  +"\n 3- java . ");
int s = sc.nextInt();

switch (s){
case 1 :
	PF_ajuste ();
	this.kloc=PF_ajuste*128*0.001;
System.out.println("le nombre de ligne en langage C est : " + kloc);

	break;
case 2 :
	PF_ajuste ();
	this.kloc=PF_ajuste*27*0.001;
	System.out.println("le nombre de ligne en langage C++ est : " + kloc);

	break;
case 3 :
	PF_ajuste ();
	this.kloc=PF_ajuste*21*0.001;
	System.out.println("le nombre de ligne en langage JAVA est : " + kloc);

	break;
default :
	System.out.println("*entrer un choix valide !! *");
	nbKLOC();
	break;
}

}

}
