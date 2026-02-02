public class BonusMilesService {
    public int calculate(int ticketPrice) {
        if (ticketPrice <= 0) {
            return 0;
        }
        // 1 миля за каждые 20 рублей
        return ticketPrice / 20;
    }
}