public class BonusMilesService {
    /**
     * Метод для расчета бонусных миль
     * @param price стоимость билета в рублях
     * @return количество бонусных миль
     */
    public int calculate(int price) {
        // Расчет миль (1 миля за каждые 20 рублей)
        return price / 20;
    }
}
