public class KyotoCleaningShop implements CleaningService {
    private String ownerName; // 店主の名前
    private String address; // 住所
    private String phone; // 電話番号
    
    /* シャツを洗う */
    public Shirt washShirt(Shirt s) {
        // 大型洗濯機15分
        // 業務用乾燥機30分
        // スチームアイロン5分
        return s;
    }

    /* タオルを洗う */
    public Towl washTowl(Towl t) {
        return t;
    }

    /* コートを洗う */
    public Coat washCoat(Coat c) {
        return c;
    }

}
