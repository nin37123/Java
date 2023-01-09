import java.util.Comparator;
import java.util.HashMap;

/**
 * Этот класс хранит базовое состояние, необходимое алгоритму A* для вычисления пути по карте.
 * Это состояние включает набор «открытых путевых точек» и другой набор «закрытых путевых точек».
 * Кроме того, этот класс предоставляет основные операции, необходимые алгоритму поиска пути A*
 * для выполнения своей обработки.
 **/
public class AStarState
{
    /** Это ссылка на карту, по которой перемещается алгоритм A*
     **/
    private Map2D map;
    private HashMap<Location, Waypoint> closedWaypoints;
    private HashMap<Location, Waypoint> openWaypoints;


    /**
     * Инициализировать новый объект состояния для использования алгоритмом поиска пути A*.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
        this.closedWaypoints = new HashMap<>();
        this.openWaypoints = new HashMap<>();
    }

    /** Возвращает карту, по которой перемещается навигатор A* **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     *
     * Этот метод сканирует все открытые путевые точки и возвращает путевую точку с минимальной общей стоимостью.
     * Если открытых путевых точек нет, этот метод возвращает <code>null</code>.
     **/
    public Waypoint getMinOpenWaypoint()
    {
        if (openWaypoints.isEmpty())
            return null;
        return openWaypoints.values().stream()
                .min((w1, w2) -> Float.compare(w1.getTotalCost(), w2.getTotalCost()))
                .get();
    }

    /**
     *
     * Этот метод добавляет путевую точку (или потенциально обновляет путевую точку, уже находящуюся в ней) в
     * коллекции «открытых путевых точек». Если в местоположении новой путевой точки еще нет открытой путевой точки,
     * новая путевая точка просто добавляется в коллекцию. Однако, если в местоположении новой путевой точки уже есть
     * путевая точка, новая путевая точка заменяет старую, <em>только если</em> значение «предыдущая стоимость» новой
     * путевой точки меньше, чем значение «предыдущая стоимость» текущей путевой точки.
     **/
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        Location loc = newWP.getLocation();
        if (!openWaypoints.containsKey(loc)) {
            openWaypoints.put(loc, newWP);
            return true;
        }

        Waypoint oldWP = openWaypoints.get(loc);
        if (Float.compare(newWP.getPreviousCost(), oldWP.getPreviousCost()) < 0) {
            openWaypoints.put(loc, newWP);
            return true;
        }
        return false;
    }


    /** Возвращает текущее количество открытых путевых точек **/
    public int numOpenWaypoints()
    {
        return openWaypoints.size();
    }


    /**
     * Этот метод перемещает путевую точку в указанном месте из открытого списка в закрытый список
     **/
    public void closeWaypoint(Location loc)
    {
        Waypoint wp = openWaypoints.remove(loc);
        closedWaypoints.put(loc, wp);
    }

    /**
     * Возвращает true, если коллекция закрытых путевых точек содержит путевую точку для указанного местоположения
     **/
    public boolean isLocationClosed(Location loc)
    {
        return closedWaypoints.containsKey(loc);
    }
}

