package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static int f6245a = 5;

    /* renamed from: b  reason: collision with root package name */
    private static b f6246b;

    /* renamed from: c  reason: collision with root package name */
    private static a f6247c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6248d;

    /* renamed from: e  reason: collision with root package name */
    private static Printer f6249e;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);
    }

    /* loaded from: classes.dex */
    static class b implements Printer {

        /* renamed from: a  reason: collision with root package name */
        List<Printer> f6250a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        List<Printer> f6251b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        List<Printer> f6252c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        boolean f6253d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f6254e = false;

        b() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = j.f6247c != null ? System.currentTimeMillis() : 0L;
            if (str.charAt(0) == '>' && this.f6254e) {
                for (Printer printer : this.f6252c) {
                    if (!this.f6250a.contains(printer)) {
                        this.f6250a.add(printer);
                    }
                }
                this.f6252c.clear();
                this.f6254e = false;
            }
            if (this.f6250a.size() > j.f6245a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f6250a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.charAt(0) == '<' && this.f6253d) {
                for (Printer printer3 : this.f6251b) {
                    this.f6250a.remove(printer3);
                    this.f6252c.remove(printer3);
                }
                this.f6251b.clear();
                this.f6253d = false;
            }
            if (j.f6247c == null || currentTimeMillis <= 0) {
                return;
            }
            j.f6247c.a(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public static void a() {
        if (f6248d) {
            return;
        }
        f6248d = true;
        f6246b = new b();
        Printer d10 = d();
        f6249e = d10;
        if (d10 != null) {
            f6246b.f6250a.add(d10);
        }
        Looper.getMainLooper().setMessageLogging(f6246b);
    }

    public static void a(Printer printer) {
        if (printer == null || f6246b.f6252c.contains(printer)) {
            return;
        }
        f6246b.f6252c.add(printer);
        f6246b.f6254e = true;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
