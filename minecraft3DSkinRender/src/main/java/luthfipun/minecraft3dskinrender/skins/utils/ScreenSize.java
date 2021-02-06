package luthfipun.minecraft3dskinrender.skins.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenSize {
    private int h;
    private int w;

    public static int getHeightPX(final Context context) {
        final Display defaultDisplay = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        final Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    public static int getWidthPX(final Context context) {
        final Display defaultDisplay = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        final Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static int getWidthDP(Context context) {
        Display display = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density = context.getResources().getDisplayMetrics().density;
        float dpWidth = (outMetrics.widthPixels / density);
        return (int) (dpWidth);
    }

    public static int getHeightDP(Context context) {
        Display display = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);

        float density = context.getResources().getDisplayMetrics().density;
        float dpHeight = (displayMetrics.heightPixels / density);
        return (int) (dpHeight);
    }
}
