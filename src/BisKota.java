import java.util.ArrayList;
public class BisKota {
    public static void main(String[] args) {
        ArrayList<int[]> StopGo = new ArrayList<>();  StopGo.add(new int[]{10,0}); StopGo.add(new int[]{3,5}); StopGo.add(new int[]{2,5}); System.out.println(GetPassenger(StopGo));}
    public static int GetPassenger(ArrayList<int[]> Biskota){
        return Biskota.get(0)[0]-Biskota.get(0)[1]+Biskota.get(1)[0]-Biskota.get(1)[1]+Biskota.get(2)[0]-Biskota.get(2)[1];
    }
}