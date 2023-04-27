package TrafficLights;

public class Light {

    private Color color;

    public Light(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void changeColor () {
        if (getColor() == Color.RED) {    //if (this.color == Color.RED) {
            setColor(Color.GREEN);;      //this.color = Color.GREEN
        }else if (this.color == Color.GREEN) {
            this.color = Color.YELLOW;
        } else if (this.color == Color.YELLOW) {
            this.color = Color.RED;

        }
    }
}
