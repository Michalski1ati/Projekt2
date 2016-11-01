package Z3;

import java.util.Random;

public class Gra {

	private static final int WIDTH = 21;
	private static final int HEIGHT = 21;

	public static void main(String[] args) throws InterruptedException {

		Random random = new Random();
		int a,b,c,d,e,f,g,h,k,l,option1,option2;

		int x = random.nextInt(WIDTH);
		int y = random.nextInt(HEIGHT);

		UzytkownikDrogi ru1 = new Pieszy(x,y);

		x = random.nextInt(WIDTH);
		y = random.nextInt(HEIGHT);

		UzytkownikDrogi ru2 = new Pieszy(x,y);

        String[][] points = new String[WIDTH][HEIGHT];


        x = randomX(random, x);
        y = randomY(random, y);
		points[x][y] = "R";
		a = randomX(random, x);
        b = randomY(random, y);
		points[a][b] = "R";
		c = randomX(random, x);
        d = randomY(random, y);
		points[c][d] = "R";
		e = randomX(random, x);
        f = randomY(random, y);
		points[e][f] = "A";
		g = randomX(random, x);
        h = randomY(random, y);
		points[g][h] = "A";
		k = randomX(random, x);
        l = randomY(random, y);
		points[k][l] = "A";


        do {
	        Thread.sleep(500);

	        clearScreen();

	        	option1 = random.nextInt(4);

	        	if(option1 == 0){
		        	ru1.addX(ru1);
		        	if(ru1.getX() > 20)
		        		ru1.minusX(ru1);
		        } else if(option1 == 1){
		        	ru1.addY(ru1);
		        	if(ru1.getY() > 20)
		        		ru1.minusY(ru1);
		        } else if(option1 == 2){
		        	ru1.minusX(ru1);
		        	if(ru1.getX() < 0)
		        		ru1.addX(ru1);
		        } else if(option1 == 3){
		        	ru1.minusY(ru1);
		        	if(ru1.getY() < 0)
		        		ru1.addY(ru1);
		        }
		        option2 = random.nextInt(4);
		        if(option2 == 0){
		        	ru2.addX(ru2);
		        	if(ru2.getX() > 20)
		        		ru2.minusX(ru2);
		        } else if(option2 == 1){
		        	ru2.addY(ru2);
		        	if(ru2.getY() > 20)
		        		ru2.minusY(ru2);
		        } else if(option2 == 2){
		        	ru2.minusX(ru2);
		        	if(ru2.getX() < 0)
		        		ru2.addX(ru2);
		        } else if(option2 == 3){
		        	ru2.minusY(ru2);
		        	if(ru2.getY() < 0)
		        		ru2.addY(ru2);
		        }
	    		points[ru2.getX()][ru2.getY()] = "&";
	    		points[ru1.getX()][ru1.getY()] = "@";
		        for(int i=0; i<WIDTH; i++) {
		        	System.out.print("\n");
		        	for(int j=0; j<HEIGHT; j++) {
		        		System.out.print(" ");
		        		if(i==x && j==y){
		        			System.out.print(points[x][y]);
		        		}
		        		if(i==a && j==b) {
		        			System.out.print(points[a][b]);
		        		}
		        		if(i==c && j==d) {
		        			System.out.print(points[c][d]);
		        		}
		        		if(i==e && j==f){
		        			System.out.print(points[e][f]);
		        		}
		        		if(i==g && j==h) {
		        			System.out.print(points[g][h]);
		        		}
		        		if(i==k && j==l) {
		        			System.out.print(points[k][l]);
		        		}
	        			if((i==ru1.getX()) && j==(ru1.getY())){
	        				if(i==x && j==y || i==a && j==b || i==c && j==d){
	        					ru1 = new Rower(ru1.getX(), ru1.getY());
	        					points[ru1.getX()][ru1.getY()] = "R";
	        				}
	        				if(i==e && j==f || i==g && j==h || i==k && j==l){
	        					ru1 = new Auto(ru1.getX(), ru1.getY());
	        					points[ru1.getX()][ru1.getY()] = "A";
	        				}
	        			System.out.print(points[ru1.getX()][ru1.getY()]);

	        			}
	        			if((i==ru2.getX()) && j==(ru2.getY())){
	        				if(i==x && j==y || i==a && j==b || i==c && j==d){
	        					ru2 = new Rower(ru2.getX(), ru2.getY());
	        					points[ru2.getX()][ru2.getY()] = "R";
	        				}
	        				if(i==e && j==f || i==g && j==h || i==k && j==l){
	        					ru2 = new Auto(ru2.getX(), ru2.getY());
	        					points[ru2.getX()][ru2.getY()] = "A";
	        				}
	        			System.out.print(points[ru2.getX()][ru2.getY()]);

	        			}
		        	}
		        }
		        System.out.print("\n[@/&]Persons | [R]-Rower | [A]-Auto");
        } while(ru1.getX() != ru2.getX() && ru1.getY() != ru2.getY());
        clearScreen();
        for(int i=0; i<WIDTH; i++) {
        	System.out.print("\n");
        	for(int j=0; j<HEIGHT; j++) {
        		System.out.print(" ");
    			if((i==ru1.getX()) && j==(ru1.getY())){

    				  points[ru2.getX()][ru2.getY()] = "Zderzenie";
    			        System.out.print(points[ru2.getX()][ru2.getY()]);
    			        System.out.print("\nWypadek!");

    			}
        	}
        }
	}

	public static void clearScreen() {
		for(int i=0; i<WIDTH; i++){
        	for(int j=0; j<WIDTH; j++) {
            System.out.println();
        	}
        }
	}

	public static int randomX(Random random, int x){
		x = random.nextInt(WIDTH);
		return x;
	}

	public static int randomY(Random random, int y){
		y = random.nextInt(HEIGHT);
		return y;
	}
}

