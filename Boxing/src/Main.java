public class Main {
    public static void main(String[] args) {
        //Manually boxing
        Integer number = Integer.valueOf(15);

        //Autoboxing
        int randomNumber = 14;

        //Unboxing
        int otherRandomNumber = number.intValue();

        int superNumber = 14;
        System.out.println(number);
        System.out.println(superNumber);
        System.out.println(randomNumber);
        System.out.println(otherRandomNumber);

        Items phone = Items.PHONE;

        System.out.println(phone);

        for(Items items: Items.values()) {
            System.out.println(items.ordinal() + items.name() + " : " + items.getPrice());
        }
    }
}