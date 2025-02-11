package java_code;



import outherclasses.SubElement;



/**
 * 
 * @version 1.0
 * @author Nour
 */
class Test{
    private SubElement var1 ;

    public Test(int a,float b){
        this.var1=new SubElement(a,b);
    }
    public static void main(String [] args){
        Test instance = new Test(22, 32f);
        System.err.println(instance.var1.toString());
    }
}