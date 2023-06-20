package com.facebook.systrace;

import android.os.Trace;

/* compiled from: Systrace.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: Systrace.java */
    /* renamed from: com.facebook.systrace.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0222a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');

        EnumC0222a(char c10) {
        }
    }

    public static void a(long j10, String str, int i10) {
    }

    public static void b(long j10, String str, int i10, long j11) {
    }

    public static void c(long j10, String str) {
        Trace.beginSection(str);
    }

    public static void d(long j10, String str, int i10) {
    }

    public static void e(long j10, String str, int i10) {
    }

    public static void f(long j10, String str, int i10, long j11) {
    }

    public static void g(long j10) {
        Trace.endSection();
    }

    public static boolean h(long j10) {
        return false;
    }

    public static void i(TraceListener traceListener) {
    }

    public static void j(long j10, String str, int i10) {
    }

    public static void k(long j10, String str, int i10) {
    }

    public static void l(long j10, String str, EnumC0222a enumC0222a) {
    }

    public static void m(TraceListener traceListener) {
    }
}
