public class Main {

    public static void main(String[] args) {
        shouldWakeUp(true,8);
    }
    public static boolean shouldWakeUp(boolean barking, int houroftheday){
        if(barking){
            if(houroftheday >=0 && houroftheday <24){
                if(houroftheday<8 || houroftheday >22) {
                    return true;
                }
                return false;
            }else{
                return false;
            }
        }else
        {
            return false;
        }
    }
}
