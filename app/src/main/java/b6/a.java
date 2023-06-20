package b6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r5.m;

/* compiled from: BasePostprocessor.java */
/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config f4833a = Bitmap.Config.ARGB_8888;

    /* renamed from: b  reason: collision with root package name */
    private static Method f4834b;

    private static void d(Bitmap bitmap, Bitmap bitmap2) {
        if (m.a() && bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (f4834b == null) {
                    int i10 = Bitmaps.f14855a;
                    f4834b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                f4834b.invoke(null, bitmap, bitmap2);
                return;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
            }
        }
        new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
    }

    @Override // b6.d
    public c4.a<Bitmap> a(Bitmap bitmap, o5.f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f4833a;
        }
        c4.a<Bitmap> d10 = fVar.d(width, height, config);
        try {
            f(d10.y(), bitmap);
            return d10.clone();
        } finally {
            c4.a.w(d10);
        }
    }

    @Override // b6.d
    public t3.d b() {
        return null;
    }

    public void e(Bitmap bitmap) {
    }

    public void f(Bitmap bitmap, Bitmap bitmap2) {
        d(bitmap, bitmap2);
        e(bitmap);
    }

    @Override // b6.d
    public String getName() {
        return "Unknown postprocessor";
    }
}
