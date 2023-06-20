package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import f0.f;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import y.e;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
class g extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f39868b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f39869c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f39870d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f39871e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f39869c = constructor;
        f39868b = cls;
        f39870d = method2;
        f39871e = method;
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f39870d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f39868b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f39871e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        Method method = f39870d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object n() {
        try {
            return f39869c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // z.k
    public Typeface b(Context context, e.b bVar, Resources resources, int i10) {
        e.c[] a10;
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        for (e.c cVar : bVar.a()) {
            ByteBuffer b10 = l.b(context, resources, cVar.b());
            if (b10 == null || !k(n10, b10, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return l(n10);
    }

    @Override // z.k
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        androidx.collection.g gVar = new androidx.collection.g();
        for (f.b bVar : bVarArr) {
            Uri d10 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d10);
            if (byteBuffer == null) {
                byteBuffer = l.f(context, cancellationSignal, d10);
                gVar.put(d10, byteBuffer);
            }
            if (byteBuffer == null || !k(n10, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface l10 = l(n10);
        if (l10 == null) {
            return null;
        }
        return Typeface.create(l10, i10);
    }
}
