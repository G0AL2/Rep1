package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f23410b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f23411c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static i f23412d;

    /* renamed from: a  reason: collision with root package name */
    private final xc.a f23413a;

    private i(xc.a aVar) {
        this.f23413a = aVar;
    }

    public static i c() {
        return d(xc.b.a());
    }

    public static i d(xc.a aVar) {
        if (f23412d == null) {
            f23412d = new i(aVar);
        }
        return f23412d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return f23411c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f23413a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(vc.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f23410b;
    }
}
