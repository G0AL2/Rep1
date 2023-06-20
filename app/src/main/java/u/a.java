package u;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CustomSupport.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: CustomSupport.java */
    /* renamed from: u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0511a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37334a;

        static {
            int[] iArr = new int[b.EnumC0043b.values().length];
            f37334a = iArr;
            try {
                iArr[b.EnumC0043b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37334a[b.EnumC0043b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37334a[b.EnumC0043b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37334a[b.EnumC0043b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37334a[b.EnumC0043b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37334a[b.EnumC0043b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37334a[b.EnumC0043b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.b bVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + bVar.b();
        try {
            boolean z10 = true;
            switch (C0511a.f37334a[bVar.c().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int a10 = a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a11 = a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a10 << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a11 << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + bVar.b());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    objArr[0] = Boolean.valueOf(z10);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            Log.e("CustomSupport", "cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.b(view) + "\"");
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            Log.e("CustomSupport", "no method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.b(view) + "\"");
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }
}
