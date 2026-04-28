import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> list = new ArrayList<>();
        /** 장르별 고유번호 */
        Map<String, List<SongPlays>> map = new HashMap<>();
        /** 장르별 재생 횟수 */
        Map<String, GenrePlays> playCount = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            if(!map.containsKey(genre)) {
                map.put(genre, new ArrayList<>());
            }
            if(!playCount.containsKey(genre)) {
                GenrePlays genrePlays = new GenrePlays(0, genre);
                playCount.put(genre, genrePlays);
            }
            SongPlays songPlays = new SongPlays(i, play);
            map.get(genre).add(songPlays);
            GenrePlays genrePlays = playCount.get(genre);
            genrePlays.addPlays(play);
            playCount.put(genre, genrePlays);
        }
        Integer[][] array = playCount.values()
                .stream()
                .sorted((a, b) -> (b.plays - a.plays))
                .map(genrePlays -> genrePlays.genre)
                .map(map::get)
                .map(songs -> {
                    return songs.stream().sorted((a, b) -> {
                                if (a.plays == b.plays) {
                                    return a.number - b.number; // number 오름차순
                                }
                                return b.plays - a.plays; // plays 내림차순
                            }).map(song -> song.number)
                            .toArray(Integer[]::new);
                }).toArray(Integer[][]::new);
        for(int i = 0; i < array.length; i++) {
            int size = array[i].length;
            int cnt = 0;
            for(int j = 0; j < size; j++) {
                if(cnt > 1){
                    break;
                }
                int number =  array[i][j];
                list.add(number);
                cnt++;
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

class GenrePlays{
    int plays;
    String genre;
    public GenrePlays(int plays, String genre) {
        this.plays = plays;
        this.genre = genre;
    }

    public void addPlays(int plays) {
        this.plays += plays;
    }
}

class SongPlays{
    int number;
    int plays;
    public SongPlays(int number, int plays) {
        this.number = number;
        this.plays = plays;
    }
}