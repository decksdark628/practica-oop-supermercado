import java.util.Date;

public interface IAlimento{
    void setCaducidad(Date d);
    Date getCaducidad();
    int getCalorias();
}