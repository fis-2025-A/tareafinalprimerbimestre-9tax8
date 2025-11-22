package ejercicio3;

public class FullAdder {

  
    private HalfAdder ha0;

    private HalfAdder ha1_top;
    private HalfAdder ha1_bottom;
    private OrGate or1;


    private HalfAdder ha2_top;
    private HalfAdder ha2_bottom;
    private OrGate or2;

    private HalfAdder ha3_top;
    private HalfAdder ha3_bottom;
    private OrGate or3;

 
    public FullAdder() {
     
        ha0 = new HalfAdder();


        ha1_top = new HalfAdder();
        ha1_bottom = new HalfAdder();
        or1 = new OrGate();

   
        ha2_top = new HalfAdder();
        ha2_bottom = new HalfAdder();
        or2 = new OrGate();

      
        ha3_top = new HalfAdder();
        ha3_bottom = new HalfAdder();
        or3 = new OrGate();
    }

    public int[] add(int[] inputA, int[] inputB) {
        
     
        int[] output = new int[5];

    
        ha0.setInput(inputA[0], inputB[0]);
        output[0] = ha0.getResult(); 
        int carry0 = ha0.getCarry(); 
  
        ha1_top.setInput(inputA[1], inputB[1]);
        int res1_top = ha1_top.getResult();
        int carry1_top = ha1_top.getCarry();
        
        ha1_bottom.setInput(res1_top, carry0);
        output[1] = ha1_bottom.getResult(); 
        int carry1_bottom = ha1_bottom.getCarry();
        int carry1 = or1.getOutput(carry1_top, carry1_bottom);  
        ha2_top.setInput(inputA[2], inputB[2]);
        int res2_top = ha2_top.getResult();
        int carry2_top = ha2_top.getCarry();

        ha2_bottom.setInput(res2_top, carry1);
        output[2] = ha2_bottom.getResult(); 
        int carry2_bottom = ha2_bottom.getCarry();

        int carry2 = or2.getOutput(carry2_top, carry2_bottom); 

        ha3_top.setInput(inputA[3], inputB[3]);
        int res3_top = ha3_top.getResult();
        int carry3_top = ha3_top.getCarry();

        ha3_bottom.setInput(res3_top, carry2);
        output[3] = ha3_bottom.getResult(); 
        int carry3_bottom = ha3_bottom.getCarry();

        int carry3 = or3.getOutput(carry3_top, carry3_bottom); 

        output[4] = carry3; 
        return output;
    }
}