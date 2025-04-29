package player_service;

import java.util.Map;

 public class PlayerServiceImpl implements PlayerService{
    private Map<String, Integer> storage;
    private FileHelper fileHelper;


    @Override
    public int addPoints(int playerId, int points) {


        return 0;
    }

    @Override
    public int addPlayer(String name) {
        fileHelper.save(storage);
        return 0;
    }

    @Override
    public String removePlayer(int id) {
        return "";
    }

    @Override
    public Map<String, Integer> getLeaderBoard() {
        return Map.of();
    }
}
