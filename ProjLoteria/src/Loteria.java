public class Loteria {
    public double num1;
    public double num2;
    public double num3;
    public double num4;
    public double num5;
    
    public double numsort1;
    public double numsort2;
    public double numsort3;
    public double numsort4;
    public double numsort5;
    
    public void Sortear(){
        this.numsort1 = Math.round(Math.random()*20-0);
        this.numsort2 = Math.round(Math.random()*20-0);
        this.numsort3 = Math.round(Math.random()*20-0);
        this.numsort4 = Math.round(Math.random()*20-0);
        this.numsort5 = Math.round(Math.random()*20-0);
    }
    
    public int CalcAcertos(){
        int cont = 0;
        if(this.num1 == this.numsort1 || this.num1 == this.numsort2 || this.num1 == this.numsort3 || this.num1 == this.numsort4 || this.num1 == this.numsort5){
            cont++;
        }
        if(this.num2 == this.numsort1 || this.num2 == this.numsort2 || this.num2 == this.numsort3 || this.num2 == this.numsort4 || this.num2 == this.numsort5){
            cont++;
        }
        if(this.num3 == this.numsort1 || this.num3 == this.numsort2 || this.num3 == this.numsort3 || this.num3 == this.numsort4 || this.num3 == this.numsort5){
            cont++;
        }
        if(this.num4 == this.numsort1 || this.num4 == this.numsort2 || this.num4 == this.numsort3 || this.num4 == this.numsort4 || this.num4 == this.numsort5){
            cont++;
        } 
        if(this.num5 == this.numsort1 || this.num5 == this.numsort2 || this.num5 == this.numsort3 || this.num5 == this.numsort4 || this.num5 == this.numsort5){
            cont++;
        }
        return cont++;
    }
    
    public double VerificaPremio(double numacerto){
        if(numacerto == 0){
            return 0;
        }
        
        else if (numacerto <=2){
            return 100;
        }
        
        else if(numacerto <=4){
            return 500;
        }
        
        else{
            return 1000;
        }
        
    }
    
}

/*
double numsort1 = Math.round(Math.random() *5);
        System.out.println(numsort1);

        double numsort2=Math.round(Math.random() *5);
        System.out.println(numsort2);

        double numsort3=Math.round(Math.random() *5);
        System.out.println(numsort1);
        
        double numsort4=Math.round(Math.random() *5);
        System.out.println(numsort4);
        
        double numsort5=Math.round(Math.random() *5);
        System.out.println(numsort5)
*/