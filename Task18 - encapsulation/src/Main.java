public class Main {

    public static void main(String[] args) {
        /*Player player = new Player();
        player.fullname = "Maciej";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());
        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());*/

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Maciej", 200, "Spear");
        System.out.println(enhancedPlayer.getHitPoints());

    }
}
