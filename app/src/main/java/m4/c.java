package m4;

import android.content.Context;
import r5.h;
import r5.i;
import r5.l;

/* compiled from: Fresco.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f34212a = c.class;

    /* renamed from: b  reason: collision with root package name */
    private static f f34213b = null;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f34214c = false;

    private c() {
    }

    public static h a() {
        return b().j();
    }

    public static l b() {
        return l.l();
    }

    public static void c(Context context, i iVar) {
        d(context, iVar, null);
    }

    public static void d(Context context, i iVar, b bVar) {
        e(context, iVar, bVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (c6.b.d() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (c6.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (c6.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (c6.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (c6.b.d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        c6.b.b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r5, r5.i r6, m4.b r7, boolean r8) {
        /*
            boolean r0 = c6.b.d()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Fresco#initialize"
            c6.b.a(r0)
        Lb:
            boolean r0 = m4.c.f34214c
            r1 = 1
            if (r0 == 0) goto L18
            java.lang.Class<?> r0 = m4.c.f34212a
            java.lang.String r2 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            z3.a.C(r0, r2)
            goto L1a
        L18:
            m4.c.f34214c = r1
        L1a:
            r5.m.b(r8)
            boolean r8 = i7.a.c()
            if (r8 != 0) goto L97
            boolean r8 = c6.b.d()
            if (r8 == 0) goto L2e
            java.lang.String r8 = "Fresco.initialize->SoLoader.init"
            c6.b.a(r8)
        L2e:
            java.lang.Class<com.facebook.imagepipeline.nativecode.NativeCodeInitializer> r8 = com.facebook.imagepipeline.nativecode.NativeCodeInitializer.class
            java.lang.String r0 = "init"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r1[r4] = r5     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r8.invoke(r0, r1)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            boolean r8 = c6.b.d()
            if (r8 == 0) goto L97
            goto L89
        L4c:
            r5 = move-exception
            goto L8d
        L4e:
            i7.c r8 = new i7.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            i7.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = c6.b.d()
            if (r8 == 0) goto L97
            goto L89
        L5d:
            i7.c r8 = new i7.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            i7.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = c6.b.d()
            if (r8 == 0) goto L97
            goto L89
        L6c:
            i7.c r8 = new i7.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            i7.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = c6.b.d()
            if (r8 == 0) goto L97
            goto L89
        L7b:
            i7.c r8 = new i7.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            i7.a.b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = c6.b.d()
            if (r8 == 0) goto L97
        L89:
            c6.b.b()
            goto L97
        L8d:
            boolean r6 = c6.b.d()
            if (r6 == 0) goto L96
            c6.b.b()
        L96:
            throw r5
        L97:
            android.content.Context r5 = r5.getApplicationContext()
            if (r6 != 0) goto La1
            r5.l.u(r5)
            goto La4
        La1:
            r5.l.v(r6)
        La4:
            f(r5, r7)
            boolean r5 = c6.b.d()
            if (r5 == 0) goto Lb0
            c6.b.b()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.c.e(android.content.Context, r5.i, m4.b, boolean):void");
    }

    private static void f(Context context, b bVar) {
        if (c6.b.d()) {
            c6.b.a("Fresco.initializeDrawee");
        }
        f fVar = new f(context, bVar);
        f34213b = fVar;
        com.facebook.drawee.view.e.g(fVar);
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    public static e g() {
        return f34213b.get();
    }
}
