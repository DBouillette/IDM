package main;

public class TimeDuration {
	
	private int duration;
	private int hour;
	private int min;
	private int sec;
	
	//Constructeur du convertisseur et lancement de l'exception si valeur négative
	public TimeDuration(int duration)
		throws BadBadValueException
		{
			if (duration <0)
			{
				throw new BadBadValueException();
			}
			else
			{
				this.duration = duration;
			}
		
	}

	//Calcul et conversion de la durée donnée par l'utilisateur
	public String toString(){
		hour =duration/3600;
		min = duration/60%60;
		sec= duration%60;
			
		String strDuration = hour+"h "+min+"m "+sec+"s "; 
		return strDuration;
	}
	
}
