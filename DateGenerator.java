import java.util.Date;

public class DateGenerator{
    public Date generateDate(int y, int m, int d){
        Date date;
        if (!isValidDate(y, m, d))
            date = null;
        else
            date = new Date(y-1900, m-1, d);

        return date;
    }

    // por motivos de no complicar el ejercicio estoy omitiendo años bisiestos
    private boolean isValidDate(int y, int m, int d){
        boolean validD = true, validM = true, validY = true;

        if (d < 1 || d > 31)
            validD = false;
        else if (m == 2 && d > 28)
            validD = false;
        else if (d == 31 && ( m == 4 || m == 6 || m == 9 || m == 11))
            validD = false;

        if (validD){
            if (m < 1 || m > 12)
                validM = false;
            else{
                if (y < 0 || y > 9999)
                    validY = false;
            }
        }

        return validD && validM && validY;
    }
}
