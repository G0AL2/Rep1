package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f6237a;

    /* renamed from: b  reason: collision with root package name */
    private static Printer f6238b;

    /* renamed from: d  reason: collision with root package name */
    private static e f6240d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f6241e;

    /* renamed from: c  reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f6239c = new CopyOnWriteArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f6242f = false;

    /* renamed from: g  reason: collision with root package name */
    private static long f6243g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static int f6244h = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);
    }

    public static void a() {
        if (f6237a) {
            return;
        }
        f6237a = true;
        f6238b = new Printer() { // from class: com.apm.insight.b.i.1
            @Override // android.util.Printer
            public void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean z10 = false;
                if (str.charAt(0) == '>') {
                    z10 = true;
                } else if (str.charAt(0) != '<') {
                    return;
                }
                i.a(z10, str);
            }
        };
        j.a();
        j.a(f6238b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f6239c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z10, String str) {
        e eVar;
        e eVar2;
        long nanoTime = System.nanoTime();
        e.f6169a = nanoTime / 1000000;
        e.f6170b = SystemClock.currentThreadTimeMillis();
        if (z10 && (eVar2 = f6240d) != null && eVar2.a()) {
            f6240d.a(str);
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f6239c;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            e eVar3 = copyOnWriteArrayList.get(i10);
            if (eVar3 != null && eVar3.a()) {
                boolean z11 = eVar3.f6171c;
                if (z10) {
                    if (!z11) {
                        eVar3.a(str);
                    }
                } else if (z11) {
                    eVar3.b(str);
                }
            } else if (!z10 && eVar3.f6171c) {
                eVar3.b("");
            }
        }
        if (!z10 && (eVar = f6240d) != null && eVar.a()) {
            f6240d.b("");
        }
        if (f6242f) {
            f6243g += System.nanoTime() - nanoTime;
            int i11 = f6244h;
            f6244h = i11 + 1;
            if (i11 >= 1000) {
                if (f6241e != null) {
                    f6241e.a(f6243g);
                }
                f6244h = 0;
                f6243g = 0L;
                f6242f = false;
            }
        }
    }
}
