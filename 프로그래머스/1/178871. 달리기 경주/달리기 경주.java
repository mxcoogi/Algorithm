import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            String player = players[i];
            map.put(player, i);
        }

        for(String player : callings){
            int idx = map.get(player);
            String prePlayer = players[idx-1];
            players[idx-1] = player;
            players[idx] = prePlayer;
            map.put(player , idx-1);
            map.put(prePlayer, idx);
        }


        return players;
    }
}