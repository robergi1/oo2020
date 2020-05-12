import java.util.ArrayList;
import java.util.List;

public class Clock {

    long period;
    boolean label = true;
    int elapsedTicks;
    public List<Cog> cogList = new ArrayList<>();
    public List<Pendelum> pendelumList = new ArrayList<>();

    public Clock(float length) {
        CalculatePeriod(length);
    }

    private void CalculatePeriod(double length) {
        var temp = (long) 2 * Math.PI * Math.sqrt(length / 9.8);
        period = new Double(temp).longValue();
    }

    private String GetLabel() {
        label = !label;
        if (label) {
            return "TIK";
        } else {
            return "TAK";
        }

    }

    public void Joincog(Cog c) {
        cogList.add(c);
    }

    public void AddPendelum(Pendelum p) {
        pendelumList.add(p);
    }

    public void Start() {
        while (true)

            try {
                Thread.sleep(this.period);
                elapsedTicks++;
                System.out.println(GetLabel());
                cogList.forEach(Cog::Tick);
                pendelumList.forEach(Pendelum::Move);
                System.out.println("");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    };
}