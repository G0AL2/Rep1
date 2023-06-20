package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static Printer f6628a;

    /* renamed from: b  reason: collision with root package name */
    private static l f6629b;

    /* renamed from: f  reason: collision with root package name */
    private static final Printer f6630f = new Printer() { // from class: com.apm.insight.runtime.l.1
        @Override // android.util.Printer
        public void println(String str) {
            if (str == null) {
                return;
            }
            if (str.charAt(0) == '>') {
                l.a().a(str);
            } else if (str.charAt(0) == '<') {
                l.a().b(str);
            }
            if (l.f6628a == null || l.f6628a == l.f6630f) {
                return;
            }
            l.f6628a.println(str);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private long f6631c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final List<Printer> f6632d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<Printer> f6633e = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f6634g = false;

    private l() {
    }

    public static l a() {
        if (f6629b == null) {
            synchronized (l.class) {
                if (f6629b == null) {
                    f6629b = new l();
                }
            }
        }
        return f6629b;
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.l.q.a(th);
        }
    }

    void a(String str) {
        com.apm.insight.b.f.a(false);
        this.f6631c = -1L;
        try {
            a(this.f6632d, str);
        } catch (Exception e10) {
            com.apm.insight.l.q.a((Throwable) e10);
        }
    }

    void b(String str) {
        this.f6631c = SystemClock.uptimeMillis();
        try {
            a(this.f6633e, str);
        } catch (Exception e10) {
            com.apm.insight.l.q.b((Throwable) e10);
        }
    }

    public boolean b() {
        return this.f6631c != -1 && SystemClock.uptimeMillis() - this.f6631c > 5000;
    }
}
