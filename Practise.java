package Src;

import ASimulatorSystem.Practice.1;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.SwingUtilities;

public final class Practice {
    boolean negative;

    public Practice() {
        this(false);
    }

    public Practice(boolean negative) {
        this.negative = negative;
    }

    public String convert(BufferedImage image) {
        StringBuilder sb = new StringBuilder((image.getWidth() + 1) * image.getHeight());

        for(int y = 0; y < image.getHeight(); ++y) {
            if (sb.length() != 0) {
                sb.append("\n");
            }

            for(int x = 0; x < image.getWidth(); ++x) {
                Color pixelColor = new Color(image.getRGB(x, y));
                double gValue = (double)pixelColor.getRed() * 0.2989D + (double)pixelColor.getBlue() * 0.587D + (double)pixelColor.getGreen() * 0.114D;
                char s = this.negative ? this.returnStrNeg(gValue) : this.returnStrPos(gValue);
                sb.append(s);
            }
        }

        return sb.toString();
    }

    private char returnStrPos(double g) {
        char str;
        if (g >= 230.0D) {
            str = ' ';
        } else if (g >= 200.0D) {
            str = '.';
        } else if (g >= 180.0D) {
            str = '*';
        } else if (g >= 160.0D) {
            str = ':';
        } else if (g >= 130.0D) {
            str = 'o';
        } else if (g >= 100.0D) {
            str = '&';
        } else if (g >= 70.0D) {
            str = '8';
        } else if (g >= 50.0D) {
            str = '#';
        } else {
            str = '@';
        }

        return str;
    }

    private char returnStrNeg(double g) {
        char str;
        if (g >= 230.0D) {
            str = '@';
        } else if (g >= 200.0D) {
            str = '#';
        } else if (g >= 180.0D) {
            str = '8';
        } else if (g >= 160.0D) {
            str = '&';
        } else if (g >= 130.0D) {
            str = 'o';
        } else if (g >= 100.0D) {
            str = ':';
        } else if (g >= 70.0D) {
            str = '*';
        } else if (g >= 50.0D) {
            str = '.';
        } else {
            str = ' ';
        }

        return str;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new 1());
    }
}
