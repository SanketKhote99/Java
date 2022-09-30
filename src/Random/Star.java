package Random;
class Star{
    public static void main(String[] args) {
        int i, j, k, rows=5;  
        for(i=1;i< rows+1 ;i++)  
        {  
        for(j=i; j < rows+1 ;j++)  
        {  
        System.out.print(  "*");  
        }  
        for(k=1; k < i ;k++)  
        {  
        System.out.print( "*");  
        }  
        System.out.println();  
        }  
        }  
}