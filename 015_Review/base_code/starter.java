import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
	System.out.println("What's your name?");
	String name = sc.nextLine();
	System.out.println("Jerk yourself off, what is your grand title? i.e. Slayer of Nerds");
	String title = sc.nextLine();
	System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue?");
	String choice = sc.nextLine();
	if(choice.equals("Wizard"))
		{
		System.out.println (""+choice+"s are stupid");
		System.out.println("Alright you stupid "+choice+" you have 25 points to spend on random shit, go nuts");
	int Max = 25; 
			System.out.println("How many points do you want in your strength stat? You can only put up to ten");
			int strength = sc.nextInt();
			if((strength)<=10)
			{
				System.out.println("You have "+(Max - strength)+" points remaining");
				System.out.println("How many points do you want in your dexterity stat? you can only put up to ten");
				int dexterity = sc.nextInt();
				if((dexterity)<=10)
					{
						System.out.println("You have "+((Max - strength)-dexterity)+" points remaining");
						System.out.println("How many points do you want in your intelligence stat? you can only put up to ten");
						int intelligence = sc.nextInt();
						System.out.println("You have "+((((Max - strength)-dexterity))-intelligence)+" points remaining");
						if (((((Max - strength)-dexterity))-intelligence) < 0)
							{
								System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
							}
							else
							{
								System.out.println("How many points do you want in your Constitution stat? you can only put up to ten");
							}
								int Constitution = sc.nextInt();
								System.out.println("You have "+(((((Max - strength)-dexterity))-intelligence)-Constitution)+" points left");
								if ((((((Max - strength)-dexterity))-intelligence)-Constitution) < 0)
									{
										System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
									}
									else
									{
										System.out.println("How many points do you want in your Charisma stat? you can only put up to ten");
									}
										int Charisma = sc.nextInt();
										System.out.println("You have "+((((((Max - strength)-dexterity))-intelligence)-Constitution)-Charisma)+" points left.");
										if (((((((Max - strength)-dexterity))-intelligence)-Constitution)-Charisma) < 0)
											{
												System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
											}
											else
											{
												System.out.println ("Alright, you are "+name+","+title+" a "+choice+" who has "+strength+" points in strength, "+dexterity+" points in dexterity, "+intelligence+" points in intelligence, "+Constitution+" points in constitution, "+Charisma+" points in charisma. But most importantly, you are........... stupid for wasting your time reading this god awful start to an unfinished product you desperate bastard.");
											}
					}
						else 
						{
							System.out.println("GRADUATE PRESCHOOL THEN COME BACK AND READ THE DAMN QUESTION");
						}
			
			}
				else
			{	System.out.println("BRO CAN YOU READ?");
		}
		}
						
		else if (choice.equals("Warrior"))
	
		{
		System.out.println (""+choice+"s are stupid");
		System.out.println("Alright you stupid "+choice+" you have 25 points to spend on random shit, go nuts");
	int Max = 25; 
			System.out.println("How many points do you want in your strength stat? You can only put up to ten");
			int strength = sc.nextInt();
			if((strength)<=10)
			{
				System.out.println("You have "+(Max - strength)+" points remaining");
				System.out.println("How many points do you want in your dexterity stat? you can only put up to ten");
				int dexterity = sc.nextInt();
				if((dexterity)<=10)
					{
						System.out.println("You have "+((Max - strength)-dexterity)+" points remaining");
						System.out.println("How many points do you want in your intelligence stat? you can only put up to ten");
						int intelligence = sc.nextInt();
						System.out.println("You have "+((((Max - strength)-dexterity))-intelligence)+" points remaining");
						if (((((Max - strength)-dexterity))-intelligence) < 0)
							{
								System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
							}
							else
							{
								System.out.println("How many points do you want in your Constitution stat? you can only put up to ten");
							}
								int Constitution = sc.nextInt();
								System.out.println("You have "+(((((Max - strength)-dexterity))-intelligence)-Constitution)+" points left");
								if ((((((Max - strength)-dexterity))-intelligence)-Constitution) < 0)
									{
										System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
									}
									else
									{
										System.out.println("How many points do you want in your Charisma stat? you can only put up to ten");
									}
										int Charisma = sc.nextInt();
										System.out.println("You have "+((((((Max - strength)-dexterity))-intelligence)-Constitution)-Charisma)+" points left.");
										if (((((((Max - strength)-dexterity))-intelligence)-Constitution)-Charisma) < 0)
											{
												System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
											}
											else
											{
												System.out.println ("Alright, you are "+name+","+title+" a "+choice+" who has "+strength+" points in strength, "+dexterity+" points in dexterity, "+intelligence+" points in intelligence, "+Constitution+" points in constitution, "+Charisma+" points in charisma. But most importantly, you are........... stupid for wasting your time reading this god awful start to an unfinished product you desperate bastard.");
											}
					}
						else 
						{
							System.out.println("GRADUATE PRESCHOOL THEN COME BACK AND READ THE DAMN QUESTION");
						}
			
			}
				else
			{	System.out.println("BRO CAN YOU READ?");
		}
		}
						
			
					
		else if (choice.equals("Rogue"))
						{
		{
		System.out.println (""+choice+"s are stupid");
		System.out.println("Alright you stupid "+choice+" you have 25 points to spend on random shit, go nuts");
	int Max = 25; 
			System.out.println("How many points do you want in your strength stat? You can only put up to ten");
			int strength = sc.nextInt();
			if((strength)<=10)
			{
				System.out.println("You have "+(Max - strength)+" points remaining");
				System.out.println("How many points do you want in your dexterity stat? you can only put up to ten");
				int dexterity = sc.nextInt();
				if((dexterity)<=10)
					{
						System.out.println("You have "+((Max - strength)-dexterity)+" points remaining");
						System.out.println("How many points do you want in your intelligence stat? you can only put up to ten");
						int intelligence = sc.nextInt();
						System.out.println("You have "+((((Max - strength)-dexterity))-intelligence)+" points remaining");
						if (((((Max - strength)-dexterity))-intelligence) < 0)
							{
								System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
							}
							else
							{
								System.out.println("How many points do you want in your Constitution stat? you can only put up to ten");
							}
								int Constitution = sc.nextInt();
								System.out.println("You have "+(((((Max - strength)-dexterity))-intelligence)-Constitution)+" points left");
								if ((((((Max - strength)-dexterity))-intelligence)-Constitution) < 0)
									{
										System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
									}
									else
									{
										System.out.println("How many points do you want in your Charisma stat? you can only put up to ten");
									}
										int Charisma = sc.nextInt();
										System.out.println("You have "+((((((Max - strength)-dexterity))-intelligence)-Constitution)-Charisma)+" points left.");
										if (((((((Max - strength)-dexterity))-intelligence)-Constitution)-Charisma) < 0)
											{
												System.out.println("YOU WENT OVER THE LIMIT DICKWAD");
											}
											else
											{
												System.out.println ("Alright, you are "+name+","+title+" a "+choice+" who has "+strength+" points in strength, "+dexterity+" points in dexterity, "+intelligence+" points in intelligence, "+Constitution+" points in constitution, "+Charisma+" points in charisma. But most importantly, you are........... stupid for wasting your time reading this god awful start to an unfinished product you desperate bastard.");
											}
					}
						else 
						{
							System.out.println("GRADUATE PRESCHOOL THEN COME BACK AND READ THE DAMN QUESTION");
						}
			
			}
				else
			{	System.out.println("BRO CAN YOU READ?");
		}
		}
						}
		else 
		{
			System.out.println("Dumbass");
		}
						
	}

}
	




