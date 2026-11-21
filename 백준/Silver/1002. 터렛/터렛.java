import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferedReader.readLine();
            for (int i = 0; i < Integer.parseInt(s); i++){
                print(bufferedReader);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void print(BufferedReader bufferedReader) throws IOException {
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        Turret t1 = new Turret(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
        Turret t2 = new Turret(Integer.parseInt(s1[3]), Integer.parseInt(s1[4]), Integer.parseInt(s1[5]));
        double v = Math.pow((t1.x - t2.x), 2) + Math.pow((t1.y - t2.y), 2);

        // 동일
        if(v == 0 && t1.getR() == t2.getR()){
            System.out.println(-1);
            return;
        }
        // 두 원이 겹치는 곳이 없을경우
        if(v > Math.pow(t1.getR() + t2.getR(), 2)){
            System.out.println(0);
            return;
        }
        //한 원이 다른원 안에 포함
        if(v < Math.pow(t1.r - t2.r, 2)){
            System.out.println(0);
            return;
        }
        // 외접, 내접
        if(v == Math.pow(t1.getR() + t2.getR(), 2) || v == Math.pow(t1.getR() - t2.getR(), 2)){
            System.out.println(1);
            return;
        }
        System.out.println(2);
    }
}
class Turret{
    int x;
    int y;
    int r;

    public String print(){
        return x+ " " + y + " " +r;
    }

    public Turret(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }
}