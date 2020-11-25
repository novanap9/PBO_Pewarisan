package PBO_Pewarisan;

public class main {

    public static void main(String[] args) {
        //Deklarasi Tim
        Tim LupaJawaban = new Tim("Lupa Jawaban");
        
        //Deklarasi Member
        Member orang_1 = new Member("Novan", 25);
        Member orang_2 = new Member("Aqirul", 21);
        Member orang_3 = new Member("Fafa", 19);
        
        //Deklarasi Trainee
        Member orang_4 = new Trainee("Wawan", 23, 5);
        Member orang_5 = new Trainee("Bima", 22, 7);
        Member orang_6 = new Trainee("Panji", 26, 9);
        
        //Menambahkan data pada ArrayList
        LupaJawaban.addMember(orang_1);
        LupaJawaban.addMember(orang_2);
        LupaJawaban.addMember(orang_3);
        LupaJawaban.addMember(orang_4);
        LupaJawaban.addMember(orang_5);
        LupaJawaban.addMember(orang_6);
        
        //Output
        LupaJawaban.displayFullMember();
        LupaJawaban.displayTrainee();
    }
    
}
