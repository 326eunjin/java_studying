package week5.ex02;

public class Player {
    Player() {
        level = new BeginnerLevel();
    }

    private PlayerLevel level;

    public PlayerLevel getLevel() {
        return this.level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int jumpCount) {
        level.go(jumpCount);
    }
}
