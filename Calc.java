import java.util.Scanner; 
class Calc{

    public static void main(String args[]){
        Processes p = new Processes();
        Scanner in = new Scanner(System.in); 
        String[] operand;
        int op1,op2;
        String inputString = "";
        
        do{
            inputString = in.nextLine();        
            inputString = inputString.trim();
            if(inputString.indexOf('+') != -1){            
                operand = inputString.split("\\+");            
                if(inputString.charAt(0) != '+'){       //first character is not operator                
                    op1 = Integer.parseInt(operand[0]);
                    op2 = Integer.parseInt(operand[1]);                                
                    Display.print(p.addition(op1,op2));
                    
                }else{                
                    op1 = Integer.parseInt(operand[1]);             
                    Display.print(p.addition(op1));
                }
            }else if(inputString.indexOf('-') != -1){            
                operand = inputString.split("\\-");
                if(inputString.charAt(0) != '-'){       //first character is not operator                
                    op1 = Integer.parseInt(operand[0]);
                    op2 = Integer.parseInt(operand[1]);                                
                    Display.print(p.subtract(op1,op2));
                }else{                
                    op1 = Integer.parseInt(operand[1]);
                    Display.print(p.subtract(op1));                
                }
            }else if(inputString.indexOf('*') != -1){                         
                operand = inputString.split("\\*");
                if(inputString.charAt(0) != '*'){       //first character is not operator                
                    op1 = Integer.parseInt(operand[0]);
                    op2 = Integer.parseInt(operand[1]);                
                    Display.print(p.multiply(op1,op2));
                }else{                
                    op1 = Integer.parseInt(operand[1]);
                    Display.print(p.multiply(op1));
                }
            }else if(inputString.indexOf('/') != -1){            
                operand = inputString.split("\\/");
                if(inputString.charAt(0) != '/'){  //first character is not operator                
                    op1 = Integer.parseInt(operand[0]);
                    op2 = Integer.parseInt(operand[1]);                
                    Display.print(p.divide(op1,op2));
                }else{                
                    op1 = Integer.parseInt(operand[1]);
                    Display.print(p.divide(op1));
                }
            }else{
                System.out.println("incorrect input!");
            }
        }while(inputString.charAt(0) != 'q');
    }
}

class Processes{
    int intermediat_value = 0;
    // addition
    int addition(int o1, int o2){
        intermediat_value = o1+o2;
        return intermediat_value;
    }    

    //addition method overloading
    int addition(int o1){
        intermediat_value = intermediat_value+o1;
        return intermediat_value;
    }

    // subtract
    int subtract(int o1, int o2){
        intermediat_value = o1-o2;
        return intermediat_value;
    }    

    //subtract method overloading
    int subtract(int o1){
        intermediat_value = intermediat_value - o1;
        return intermediat_value;
    }
    // multiply
    int multiply(int o1, int o2){
        intermediat_value = o1*o2;
        return intermediat_value;
    }    

    //multiply method overloading
    int multiply(int o1){
        intermediat_value = intermediat_value * o1;
        return intermediat_value;
    }
    // divide
    int divide(int o1, int o2){
        intermediat_value = o1/o2;
        return intermediat_value;
    }    

    //divide method overloading
    int divide(int o1){
        intermediat_value = intermediat_value / o1;
        return intermediat_value;
    }
}
class Display{
    public static void print(int value){
        System.out.print(value);
    }
}