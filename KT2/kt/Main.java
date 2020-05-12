public class Main {

    public static void main(String[] args) {

        float length = 4;
        Clock clock = new Clock(length * 100000);

        Cog c1 = new Cog(11, "cog1");
        Cog c2 = new Cog(10, "cog2");
        Cog c3 = new Cog(2, "cog3");

        c1.JoinCog(c1);
        c1.JoinCog(c2);
        c2.JoinCog(c1);
        c2.JoinCog(c3);

        clock.Joincog(c1);

        Pendelum second = new SecondPendelum(1, "S");

        c2.JoinPendelum(second);

        clock.Start();

    }
}