public class BonusMilesService {
    public int calculate(int price) {
        // Пример простого правила: 1 миля за каждые 20 единиц цены
        return price / 20;
    }
}
