package atelier07;

import cours04.FigureGeometrique; // 假设 FigureGeometrique 是一个抽象类
import java.lang.Comparable;

public class Cercle extends FigureGeometrique implements Comparable<Cercle> {
    private double rayon; // 圆的半径

    // 构造函数
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // 获取圆的半径
    public double getRayon() {
        return rayon;
    }

    // 设置圆的半径
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // 实现 FigureGeometrique 的抽象方法：计算面积
    
    public double calculerSurface() {
        return Math.PI * rayon * rayon; // 面积公式：π * r^2
    }

    // 实现 FigureGeometrique 的抽象方法：计算周长
   
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon; // 周长公式：2 * π * r
    }

    // 实现 Comparable 接口的方法：比较两个圆的面积
    @Override
    public int compareTo(Cercle autreCercle) {
        return Double.compare(this.calculerSurface(), autreCercle.calculerSurface());
    }

    // 重写 toString 方法，用于打印圆的信息
   
    public String toString() {
        return "Cercle de rayon " + rayon + ", Surface: " + calculerSurface() + ", Périmètre: " + calculerPerimetre();
    }
}
