package com.airbnb.lottie;

import android.content.Context;
import java.io.File;

/* compiled from: L.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f5729a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5730b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f5731c;

    /* renamed from: d  reason: collision with root package name */
    private static long[] f5732d;

    /* renamed from: e  reason: collision with root package name */
    private static int f5733e;

    /* renamed from: f  reason: collision with root package name */
    private static int f5734f;

    /* renamed from: g  reason: collision with root package name */
    private static f2.f f5735g;

    /* renamed from: h  reason: collision with root package name */
    private static f2.e f5736h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile f2.h f5737i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile f2.g f5738j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: L.java */
    /* loaded from: classes.dex */
    public class a implements f2.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5739a;

        a(Context context) {
            this.f5739a = context;
        }

        @Override // f2.e
        public File a() {
            return new File(this.f5739a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (f5730b) {
            int i10 = f5733e;
            if (i10 == 20) {
                f5734f++;
                return;
            }
            f5731c[i10] = str;
            f5732d[i10] = System.nanoTime();
            e0.j.a(str);
            f5733e++;
        }
    }

    public static float b(String str) {
        int i10 = f5734f;
        if (i10 > 0) {
            f5734f = i10 - 1;
            return 0.0f;
        } else if (f5730b) {
            int i11 = f5733e - 1;
            f5733e = i11;
            if (i11 != -1) {
                if (str.equals(f5731c[i11])) {
                    e0.j.b();
                    return ((float) (System.nanoTime() - f5732d[f5733e])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f5731c[f5733e] + ".");
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return 0.0f;
        }
    }

    public static f2.g c(Context context) {
        Context applicationContext = context.getApplicationContext();
        f2.g gVar = f5738j;
        if (gVar == null) {
            synchronized (f2.g.class) {
                gVar = f5738j;
                if (gVar == null) {
                    f2.e eVar = f5736h;
                    if (eVar == null) {
                        eVar = new a(applicationContext);
                    }
                    gVar = new f2.g(eVar);
                    f5738j = gVar;
                }
            }
        }
        return gVar;
    }

    public static f2.h d(Context context) {
        f2.h hVar = f5737i;
        if (hVar == null) {
            synchronized (f2.h.class) {
                hVar = f5737i;
                if (hVar == null) {
                    f2.g c10 = c(context);
                    f2.f fVar = f5735g;
                    if (fVar == null) {
                        fVar = new f2.b();
                    }
                    hVar = new f2.h(c10, fVar);
                    f5737i = hVar;
                }
            }
        }
        return hVar;
    }
}
