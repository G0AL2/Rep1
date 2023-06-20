package va;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: RippleUtils.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f38019a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f38020b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f38021c;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f38022d;

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f38023e;

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f38024f;

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f38025g;

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f38026h;

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f38027i;

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f38028j;

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f38029k;

    /* renamed from: l  reason: collision with root package name */
    static final String f38030l;

    static {
        f38019a = Build.VERSION.SDK_INT >= 21;
        f38020b = new int[]{16842919};
        f38021c = new int[]{16843623, 16842908};
        f38022d = new int[]{16842908};
        f38023e = new int[]{16843623};
        f38024f = new int[]{16842913, 16842919};
        f38025g = new int[]{16842913, 16843623, 16842908};
        f38026h = new int[]{16842913, 16842908};
        f38027i = new int[]{16842913, 16843623};
        f38028j = new int[]{16842913};
        f38029k = new int[]{16842910, 16842919};
        f38030l = b.class.getSimpleName();
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f38019a) {
            return new ColorStateList(new int[][]{f38028j, StateSet.NOTHING}, new int[]{c(colorStateList, f38024f), c(colorStateList, f38020b)});
        }
        int[] iArr = f38024f;
        int[] iArr2 = f38025g;
        int[] iArr3 = f38026h;
        int[] iArr4 = f38027i;
        int[] iArr5 = f38020b;
        int[] iArr6 = f38021c;
        int[] iArr7 = f38022d;
        int[] iArr8 = f38023e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f38028j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    private static int b(int i10) {
        return z.a.f(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f38019a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f38029k, 0)) != 0) {
                Log.w(f38030l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
