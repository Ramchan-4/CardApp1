public class Game {
    private Card[] deck = new Card[52];
    private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public void mazemaze() {
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (String rank : ranks) {
                deck[index++] = new Card(rank);
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public void start() { 
        int pullCardIndex = (int) (Math.random() * deck.length);
        Card pullCard = deck[pullCardIndex];
        System.out.println("引いたカード: " + pullCard);

        Judge judge = new Judge();
        if (judge.isWinningCard(pullCard)) {
            System.out.println("勝ちです！");
        } else {
            System.out.println("負けです！");
        }
    }
}
