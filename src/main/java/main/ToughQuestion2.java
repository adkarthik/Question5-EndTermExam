package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	
                        	//call the function which calculate the calories for only bread
                        	//cal.calculateCalories(bread);
                        	System.out.printf("%.3f",cal.calculateEnergy(bread));
                            System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread)+" calories");
                        	
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	
                        	//call the function which calculate the calories for only bread & jam
                        	//cal.calculateCalories(bread,jam);
                        	System.out.printf("%.3f",cal.calculateEnergy(bread,jam));
                            System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread,jam)+" calories");
                        	
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	
                        	//call the function which calculate the calories for  bread,jam & butter
                        	//cal.calculateCalories(bread,jam,butter);
                        	System.out.printf("%.3f",cal.calculateEnergy(bread,jam,butter));
                            System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread,jam,butter)+" calories");
                        	
                        	System.out.println();
                        	break;
                        }
                       //System.out.printf("%.3f",cal.calculateEnergy());
                       //System.out.println(" kJ of energy generated from "+cal.returnCalories()+" calories");
            }
}

/*1 kcal=4.1868 kJ
Bread=74 calories
Butter=102 calories
Jam=26 calories*/

class Calories {
            
			//for bread only
            int calculateCalories(Integer bread) {
            //you have to overload this function for three parameters refer the question
            	int totalcal = bread*74;
            	float x = (float)4.1868 * totalcal;
            	float totalenergy = (x);
            	//System.out.println(totalenergy +" kJ of energy generated from "+totalcal+" calories");
            	return totalcal;
            }
            
            //for bread+jam
            int calculateCalories(Integer bread,Integer jam) {
                //you have to overload this function for three parameters refer the question
            	int totalcal = (bread*74)+(jam*26);
            	float x = (float)4.1868 * totalcal;
            	float totalenergy = (x);
            	//System.out.println(totalenergy +" kJ of energy generated from "+totalcal+" calories");
                	return totalcal;
                }
            
            //for bread+jam+butter
            int calculateCalories(Integer bread,Integer jam,Integer butter) {
                //you have to overload this function for three parameters refer the question
            	int totalcal = (bread*74)+(jam*26)+(butter*102);
            	float x = (float)4.1868 * totalcal;
            	float totalenergy = (x);
            	//System.out.println(totalenergy +" kJ of energy generated from "+totalcal+" calories");
                	return totalcal;
                }
            
            //for bread
            float calculateEnergy(Integer bread)
            {
            	int totalcal = bread*74;
            	float x = (float)4.1868 * totalcal;
            	return x;
            }
            
            //for bread+jam
            float calculateEnergy(Integer bread,Integer jam)
            {
            	int totalcal = (bread*74)+(jam*26);
            	float x = (float)4.1868 * totalcal;
            	return x;
            }
            
            //for bread+jam+butter
            float calculateEnergy(Integer bread,Integer jam,Integer butter)
            {
            	int totalcal = (bread*74)+(jam*26)+(butter*102);
            	float x = (float)4.1868 * totalcal;
            	return x;
            }
            
            
            
            
}