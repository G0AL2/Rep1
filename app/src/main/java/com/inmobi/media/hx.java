package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PrefDao.java */
/* loaded from: classes3.dex */
public final class hx {

    /* renamed from: a  reason: collision with root package name */
    private final hf f25708a;

    public hx(Context context, String str) {
        this.f25708a = hf.a(context, str);
    }

    public final void a(String str, String str2) {
        this.f25708a.a(str, str2);
    }

    public final void b(String str, String str2) {
        this.f25708a.a(str, str2);
        a(System.currentTimeMillis() / 1000);
    }

    public final Boolean c(String str) {
        if (this.f25708a.d(str)) {
            return Boolean.valueOf(this.f25708a.b(str, true));
        }
        return null;
    }

    public final boolean d(String str) {
        return this.f25708a.d(str);
    }

    public final boolean e(String str) {
        return this.f25708a.e(str);
    }

    public final void a(String str, Set<String> set) {
        SharedPreferences.Editor edit = this.f25708a.f25656a.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    public final String b(String str) {
        return this.f25708a.b(str);
    }

    public final void b() {
        SharedPreferences.Editor edit = this.f25708a.f25656a.edit();
        edit.clear();
        edit.apply();
    }

    public final void a(String str, boolean z10) {
        this.f25708a.a(str, z10);
    }

    public final Set<String> a(String str) {
        return this.f25708a.f25656a.getStringSet(str, null);
    }

    public final long a() {
        return this.f25708a.b("last_ts", 0L);
    }

    public final void a(long j10) {
        this.f25708a.a("last_ts", j10);
    }
}
