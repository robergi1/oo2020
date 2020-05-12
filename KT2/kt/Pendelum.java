public class Pendelum {

    private int position;
    private int step;
    private int elapsedTicks;
    public String pendelumName;

    Pendelum(int step, String pendelumName) {
        this.position = 0;
        this.step = step;
        this.pendelumName = pendelumName;
    }

    public void Move() {
        elapsedTicks++;
        if (elapsedTicks % step == 0) {
            position += 1;

        }
    }

}