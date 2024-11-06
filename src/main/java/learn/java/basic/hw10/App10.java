package learn.java.basic.hw10;

public class App10 {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Ivanov","Oleg","Genadievich",42,"IvanovOG@mail.com");
        users[1] = new User("Petrov","Pavel","Alekseevich",30,"PetrovPA@mail.com");
        users[2] = new User("Pavlov","Sergey","Ivanovich",40,"PavlovSI@mail.com");
        users[3] = new User("Nikolaey","Igor","Borisovich",50,"PavlovSI@mail.com");
        users[4] = new User("Abramov","Aleksey","Vasilevich",25,"PavlovSI@mail.com");
        users[5] = new User("Shilov","Andrey","Ivanovich",30,"ShilovSI@mail.com");
        users[6] = new User("Borisov","Denis","Alekseevich",35,"BorisovSI@mail.com");
        users[7] = new User("Karpov","Sergey","Anatolevich",40,"KarpovSI@mail.com");
        users[8] = new User("Dair","Spartac","Feizov",45,"DairSF@mail.com");
        users[9] = new User("Gan","Vas","Waris",50,"GanVW@mail.com");

        for (int i = 0; i < users.length; i++) {
            users[i].info();
        }

        Box box = new Box(10, 10 , 10, "White");
        box.repaintBox();
        box.openBox();
        box.closeBox();
        box.printInfoDox();
    }
}
