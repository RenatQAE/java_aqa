package player_service;

import java.util.Map;

public interface FileHelper {

    void save(Map<String, Integer> info);

    Map<String, Integer> load();

}
