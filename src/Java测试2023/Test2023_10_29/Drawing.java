package Java测试2023.Test2023_10_29;

interface Drawing {
    public void drawLine(double x1);
    public void drawCircle();
}
class v1 implements Drawing{
    @Override
    public void drawLine(double x1) {

    }

    @Override
    public void drawCircle() {

    }

}
abstract class Shape{
    private Drawing _dp;
    abstract public void draw();
    public void drawLine(double x1){
        _dp.drawLine(x1);
    }
}
