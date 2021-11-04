package com.umb.thermometer;

import android.content.Context;
import android.util.DisplayMetrics;

import java.util.Random;

public class Utils {
    public static float convertDpToPixel(float dp, Context context) {
        return dp * ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    public static float randInt(int min, int max) {
        final int random = new Random().nextInt((max - min) + 1) + min;
        return random;
    }
}
