package practice;
public class RockPaperScissors {
public static void main( String args[] )   
{  
int min = 1;  
int max = 3;
  
int a = (int)(Math.random()*(max-min+1)+min); 
if(a==1){
    System.out.println("Player 1 = Rock");
}else if (a==2) {
    System.out.println("Player 1 = Paper");
    
} else {
    System.out.println("Player 1 = scissors");
    
}

int b = (int)(Math.random()*(max-min+1)+min); 
if(b==1){
    System.out.println("Player 2 = Rock");
}else if (b==2) {
    System.out.println("Player 2 = Paper");
    
} else {
    System.out.println("Player 2 = scissors");
}

if(a==1&b==1 || a==2&b==2 || a==3&b==3){
    System.out.println("Match tie");
}else if(a==1&b==2 || a==3&b==1 || a==2&b==3){
    System.out.println("Player 2 Win");
}else if(a==1&b==3 || a==3&b==2 || a==2&b==1){
    System.out.println("Player 1 win");
}
}
}
