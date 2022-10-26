

/**
 *
 * @author tha
 */
public class DBTester {
    
    public static void main (String [] args){
        
        DB.insertSQL("Insert into project values('g42','Moon',23456);");
        DB.selectSQL("Select * from project");
        
        do{
           String data = DB.getDisplayData();
           if (data.equals(DB.NOMOREDATA)){
               break;
           }else{
               System.out.print(data);
           }   
        } while(true);
        
        
        DB.deleteSQL("Delete from project where project_no like 'g%';");
        
        DB.selectSQL("Select project_name from project");
        
        System.out.println("numberOfColumns="+DB.getNumberOfColumns());
        do{
           String data = DB.getData();
           if (data.equals(DB.NOMOREDATA)){
               break;
           }else{
               System.out.print(data);
           }   
        } while(true);
       
    }
    
}
