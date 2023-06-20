package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import f0.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.e;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
class f extends k {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f39863b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f39864c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f39865d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f39866e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f39867f = false;

    private static boolean k(Object obj, String str, int i10, boolean z10) {
        n();
        try {
            return ((Boolean) f39865d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(f39863b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f39866e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f39867f) {
            return;
        }
        f39867f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f39864c = constructor;
        f39863b = cls;
        f39865d = method2;
        f39866e = method;
    }

    private static Object o() {
        n();
        try {
            return f39864c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // z.k
    public Typeface b(Context context, e.b bVar, Resources resources, int i10) {
        e.c[] a10;
        Object o10 = o();
        for (e.c cVar : bVar.a()) {
            File e10 = l.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!l.c(e10, resources, cVar.b())) {
                    return null;
                }
                if (!k(o10, e10.getPath(), cVar.e(), cVar.f())) {
                    return null;
                }
                e10.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return l(o10);
    }

    @Override // z.k
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
        f.b h10 = h(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h10.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m10 = m(openFileDescriptor);
            if (m10 != null && m10.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m10);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d10 = super.d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d10;
        } catch (IOException unused) {
            return null;
        }
    }
}
