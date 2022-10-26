import java.util.Formatter;
import java.util.Scanner;

public class KundeProfil
{
    private static String _Navn ="";
    private static String _Telefon="";
    private static String _Email ="";
    private static int _ID =0;
    public static void kundeInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Indtast kundens navn:\n");
        _Navn = in.nextLine();
        System.out.printf("Indtast kundens Telefon nr:\n");
        _Telefon = in.nextLine();
        System.out.printf("Indtast kundens Email adresse:\n");
        _Email = in.nextLine();
        System.out.printf("Indtast kundens ID:\n"); // ændre til autonummer
        _ID = in.nextInt();

        DB.insertSQL("INSERT INTO tblKunde(fldNavn,fldTelefon,fldEmail,fldKundeId)\nVALUES('"+_Navn+"', '"+_Telefon+"', '"+_Email+"', "+_ID+")");


    }
    public static void s ()
    {

    }
}
