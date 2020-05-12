import java.util.ArrayList;
import java.util.List;

public class Cog implements CogBehavour {

    private int cogCount;
    private int lap;
    private int ticks;
    private String cogName;
    public List<Cog> connectedcogs = new ArrayList<>();
    public List<Pendelum> connectedpendelums = new ArrayList<>();

    public Cog(final int cogCount, final String cogName) {
        this.cogCount = cogCount;
        this.cogName = cogName;
        this.ticks = 1;
        this.lap = 0;
    }



    public void JoinPendelum(final Pendelum h) {

        if (!connectedpendelums.contains(h)) {
            connectedpendelums.add(h);
        }
    }

    public void JoinCog(final Cog g) {

        if (g != this) {
            if (g.connectedcogs.contains(this)) {
            } else {
                if (!connectedcogs.contains(g)) {
                    connectedcogs.add(g);
                }

            }
        }
    }

    public void Tick() {

        if (!connectedcogs.isEmpty()) {
            connectedcogs.stream().forEach(Cog::Tick);
        }

        if (ticks < cogCount) {
            ticks++;
        } else {
            if (!connectedpendelums.isEmpty()) {
                connectedpendelums.stream().forEach(Pendelum::Move);
            }
            ticks = 1;
            lap++;
            System.out.println("(" + this.cogName + ") Lap:" + lap);
        }

    }

}