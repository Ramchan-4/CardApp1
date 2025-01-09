public class Judge {
    
    public boolean isWinningCard(Card card) {
        String rank = card.getRank();
        return rank.equals("10") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A");
    }
}
