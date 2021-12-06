package main;

public class Convert {
    public static void main(String[] args) {
        double mdh = Double.valueOf(args[0]);
        double fov0 = Double.valueOf(args[1]);
        double fov1 = Double.valueOf(args[2]);
        double sens = Double.valueOf(args[3]);
        double resultSens = sens * Math.atan(mdh * Math.tan(fov0 * 0.5 * Math.PI / 180)) / Math.atan(mdh * Math.tan(fov1 * 0.5 * Math.PI / 180));
        System.out.println("Sensivity(cm/360) = " + sens + "; Fov(for this sens) = " + fov0);
        System.out.println("Result Sensivity(cm/360) = " + resultSens + "; Second Fov = " + fov1);
        System.out.println("MDH coefficient = " + mdh);
    }
}
