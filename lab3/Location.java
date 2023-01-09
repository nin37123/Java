/**
 * Этот класс представляет определенное место на 2D-карте. Координаты являются целочисленными значениями
 **/
public class Location
{
    /**
     Координата X этого местоположения. **/
    public int xCoord;

    /** Координата Y этого местоположения.. **/
    public int yCoord;


    /**
     Создает новое местоположение с указанными целочисленными координатами **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Создает новую локацию с координатами (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    /**
     * Указывает, равен ли объект o этому..
     **/
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Location location = (Location) o;

        if (xCoord != location.xCoord)
            return false;
        return yCoord == location.yCoord;
    }

    /**
     Возвращает значение хэш-кода для этого объекта */
    @Override
    public int hashCode() {
        int result = 7;
        result = 31 * result + xCoord;
        result = 31 * result + yCoord;
        return result;
    }
}
