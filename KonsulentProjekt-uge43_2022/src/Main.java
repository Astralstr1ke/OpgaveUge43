import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean run = true;
        Scanner in = new Scanner(System.in);
        while (run)
     {
         System.out.printf("Welcome to Konsulenters Hus internal menu system\nPlease enter a key to continue");
         String menuKey = in.nextLine();
         switch (menuKey)
         {
             case  "1":
                DB.selectSQL("SELECT fldNavn FROM tblKonsulent");
                System.out.print(DB.getDisplayData());
                 break;
             case  "2":
                 KundeProfil.kundeInput();
                 break;
             case  "3":
                 break;
             case  "4":
                 break;
             case  "5":
                 break;
             case  "6":
                 break;
             case  "7":
                 break;
             case  "8":
                 break;
             case  "q":
                 run = false;
                 break;
         }
     }
    }
}
