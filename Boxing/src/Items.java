public enum Items {
    COMPUTER,
    TABLET,
    PHONE,
    PENCIL;

    public double getPrice(){
        return switch(this){
            case COMPUTER -> 1000.54;
            case TABLET -> 1500.54;
            case PHONE -> 800.88;
            case PENCIL -> 12.56;
            default -> 0.0;
        };
    }
}
