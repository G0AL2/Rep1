package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private static final Map<String, l0<h>> f5874a = new HashMap();

    /* renamed from: b */
    private static final byte[] f5875b = {80, 75, 3, 4};

    private static boolean A(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean B(mf.h hVar) {
        try {
            mf.h peek = hVar.peek();
            for (byte b10 : f5875b) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            i2.d.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ void C(String str, AtomicBoolean atomicBoolean, Throwable th) {
        f5874a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ j0 D(h hVar) throws Exception {
        return new j0(hVar);
    }

    public static /* synthetic */ void E(String str, AtomicBoolean atomicBoolean, h hVar) {
        f5874a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ j0 H(WeakReference weakReference, Context context, int i10, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i10, str);
    }

    public static /* synthetic */ j0 I(Context context, String str, String str2) throws Exception {
        j0<h> c10 = c.d(context).c(str, str2);
        if (str2 != null && c10.b() != null) {
            b2.g.b().c(str2, c10.b());
        }
        return c10;
    }

    private static String J(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(A(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, Throwable th) {
        C(str, atomicBoolean, th);
    }

    public static /* synthetic */ j0 b(Context context, String str, String str2) {
        return m(context, str, str2);
    }

    public static /* synthetic */ j0 c(WeakReference weakReference, Context context, int i10, String str) {
        return H(weakReference, context, i10, str);
    }

    public static /* synthetic */ void d(String str, AtomicBoolean atomicBoolean, h hVar) {
        E(str, atomicBoolean, hVar);
    }

    public static /* synthetic */ j0 e(h hVar) {
        return D(hVar);
    }

    public static /* synthetic */ j0 f(InputStream inputStream, String str) {
        return o(inputStream, str);
    }

    public static /* synthetic */ j0 g(Context context, String str, String str2) {
        return I(context, str, str2);
    }

    private static l0<h> h(final String str, Callable<j0<h>> callable) {
        final h a10 = str == null ? null : b2.g.b().a(str);
        if (a10 != null) {
            return new l0<>(new Callable() { // from class: com.airbnb.lottie.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return p.e(h.this);
                }
            });
        }
        if (str != null) {
            Map<String, l0<h>> map = f5874a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        l0<h> l0Var = new l0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            l0Var.d(new f0() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.f0
                public final void a(Object obj) {
                    p.d(str, atomicBoolean, (h) obj);
                }
            });
            l0Var.c(new f0() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.f0
                public final void a(Object obj) {
                    p.a(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f5874a.put(str, l0Var);
            }
        }
        return l0Var;
    }

    private static e0 i(h hVar, String str) {
        for (e0 e0Var : hVar.j().values()) {
            if (e0Var.b().equals(str)) {
                return e0Var;
            }
        }
        return null;
    }

    public static l0<h> j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static l0<h> k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: com.airbnb.lottie.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.b(applicationContext, str, str2);
            }
        });
    }

    public static j0<h> l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static j0<h> m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return o(context.getAssets().open(str), str2);
            }
            return y(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new j0<>(e10);
        }
    }

    public static l0<h> n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: com.airbnb.lottie.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.f(inputStream, str);
            }
        });
    }

    public static j0<h> o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    private static j0<h> p(InputStream inputStream, String str, boolean z10) {
        try {
            return q(h2.c.C(mf.r.d(mf.r.k(inputStream))), str);
        } finally {
            if (z10) {
                i2.h.c(inputStream);
            }
        }
    }

    public static j0<h> q(h2.c cVar, String str) {
        return r(cVar, str, true);
    }

    private static j0<h> r(h2.c cVar, String str, boolean z10) {
        try {
            try {
                h a10 = g2.w.a(cVar);
                if (str != null) {
                    b2.g.b().c(str, a10);
                }
                j0<h> j0Var = new j0<>(a10);
                if (z10) {
                    i2.h.c(cVar);
                }
                return j0Var;
            } catch (Exception e10) {
                j0<h> j0Var2 = new j0<>(e10);
                if (z10) {
                    i2.h.c(cVar);
                }
                return j0Var2;
            }
        } catch (Throwable th) {
            if (z10) {
                i2.h.c(cVar);
            }
            throw th;
        }
    }

    public static l0<h> s(Context context, int i10) {
        return t(context, i10, J(context, i10));
    }

    public static l0<h> t(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: com.airbnb.lottie.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.c(weakReference, applicationContext, i10, str);
            }
        });
    }

    public static j0<h> u(Context context, int i10) {
        return v(context, i10, J(context, i10));
    }

    public static j0<h> v(Context context, int i10, String str) {
        try {
            mf.h d10 = mf.r.d(mf.r.k(context.getResources().openRawResource(i10)));
            if (B(d10).booleanValue()) {
                return y(new ZipInputStream(d10.h1()), str);
            }
            return o(d10.h1(), str);
        } catch (Resources.NotFoundException e10) {
            return new j0<>(e10);
        }
    }

    public static l0<h> w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static l0<h> x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.g(context, str, str2);
            }
        });
    }

    public static j0<h> y(ZipInputStream zipInputStream, String str) {
        try {
            return z(zipInputStream, str);
        } finally {
            i2.h.c(zipInputStream);
        }
    }

    private static j0<h> z(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            h hVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    hVar = r(h2.c.C(mf.r.d(mf.r.k(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (hVar == null) {
                return new j0<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                e0 i10 = i(hVar, (String) entry.getKey());
                if (i10 != null) {
                    i10.f(i2.h.l((Bitmap) entry.getValue(), i10.e(), i10.c()));
                }
            }
            for (Map.Entry<String, e0> entry2 : hVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new j0<>(new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            if (str != null) {
                b2.g.b().c(str, hVar);
            }
            return new j0<>(hVar);
        } catch (IOException e10) {
            return new j0<>(e10);
        }
    }
}
