package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f38932a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<c, SparseArray<b>> f38933b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f38934c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        static ColorStateList a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f38935a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f38936b;

        b(ColorStateList colorStateList, Configuration configuration) {
            this.f38935a = colorStateList;
            this.f38936b = configuration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final Resources f38937a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f38938b;

        c(Resources resources, Resources.Theme theme) {
            this.f38937a = resources;
            this.f38938b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f38937a.equals(cVar.f38937a) && h0.c.a(this.f38938b, cVar.f38938b);
        }

        public int hashCode() {
            return h0.c.b(this.f38937a, this.f38938b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Typeface f38939a;

            a(Typeface typeface) {
                this.f38939a = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e(this.f38939a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f38941a;

            b(int i10) {
                this.f38941a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d(this.f38941a);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i10, Handler handler) {
            c(handler).post(new b(i10));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i10);

        public abstract void e(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        static class a {

            /* renamed from: a  reason: collision with root package name */
            private static final Object f38943a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f38944b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f38945c;

            static void a(Resources.Theme theme) {
                synchronized (f38943a) {
                    if (!f38945c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f38944b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f38945c = true;
                    }
                    Method method = f38944b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f38944b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.a(theme);
            } else if (i10 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(c cVar, int i10, ColorStateList colorStateList) {
        synchronized (f38934c) {
            WeakHashMap<c, SparseArray<b>> weakHashMap = f38933b;
            SparseArray<b> sparseArray = weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i10, new b(colorStateList, cVar.f38937a.getConfiguration()));
        }
    }

    private static ColorStateList b(c cVar, int i10) {
        b bVar;
        synchronized (f38934c) {
            SparseArray<b> sparseArray = f38933b.get(cVar);
            if (sparseArray != null && sparseArray.size() > 0 && (bVar = sparseArray.get(i10)) != null) {
                if (bVar.f38936b.equals(cVar.f38937a.getConfiguration())) {
                    return bVar.f38935a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    public static int c(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i10, theme);
        }
        return resources.getColor(i10);
    }

    public static ColorStateList d(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        c cVar = new c(resources, theme);
        ColorStateList b10 = b(cVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList k10 = k(resources, i10, theme);
        if (k10 != null) {
            a(cVar, i10, k10);
            return k10;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return a.a(resources, i10, theme);
        } else {
            return resources.getColorStateList(i10);
        }
    }

    public static Drawable e(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i10, theme);
        }
        return resources.getDrawable(i10);
    }

    public static Drawable f(Resources resources, int i10, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
        if (i12 >= 15) {
            return resources.getDrawableForDensity(i10, i11);
        }
        return resources.getDrawable(i10);
    }

    public static Typeface g(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i10, TypedValue typedValue, int i11, d dVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, typedValue, i11, dVar, null, true, false);
    }

    public static void i(Context context, int i10, d dVar, Handler handler) throws Resources.NotFoundException {
        h0.g.f(dVar);
        if (context.isRestricted()) {
            dVar.a(-4, handler);
        } else {
            m(context, i10, new TypedValue(), 0, dVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal<TypedValue> threadLocal = f38932a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static ColorStateList k(Resources resources, int i10, Resources.Theme theme) {
        if (l(resources, i10)) {
            return null;
        }
        try {
            return y.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean l(Resources resources, int i10) {
        TypedValue j10 = j();
        resources.getValue(i10, j10, true);
        int i11 = j10.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface m(Context context, int i10, TypedValue typedValue, int i11, d dVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface n10 = n(context, resources, typedValue, i10, i11, dVar, handler, z10, z11);
        if (n10 == null && dVar == null && !z11) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
        }
        return n10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface n(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, y.h.d r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.a(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = z.e.f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.b(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            y.e$a r2 = y.e.b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = z.e.c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = z.e.d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.b(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.a(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, y.h$d, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
