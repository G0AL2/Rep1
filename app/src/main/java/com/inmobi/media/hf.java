package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* compiled from: KeyValueStore.java */
/* loaded from: classes3.dex */
public final class hf {

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, hf> f25654b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f25655c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f25656a;

    private hf(Context context, String str) {
        this.f25656a = context.getSharedPreferences(str, 0);
    }

    public static String a(String str) {
        return "com.im.keyValueStore.".concat(String.valueOf(str));
    }

    public final String b(String str) {
        return this.f25656a.getString(str, null);
    }

    public final int c(String str) {
        return this.f25656a.getInt(str, RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean d(String str) {
        return this.f25656a.contains(str);
    }

    public final boolean e(String str) {
        if (d(str)) {
            SharedPreferences.Editor edit = this.f25656a.edit();
            edit.remove(str);
            edit.apply();
            return true;
        }
        return false;
    }

    public static hf a(Context context, String str) {
        String a10 = a(str);
        hf hfVar = f25654b.get(a10);
        if (hfVar != null) {
            return hfVar;
        }
        synchronized (f25655c) {
            hf hfVar2 = f25654b.get(a10);
            if (hfVar2 != null) {
                return hfVar2;
            }
            hf hfVar3 = new hf(context, a10);
            f25654b.put(a10, hfVar3);
            return hfVar3;
        }
    }

    public final long b(String str, long j10) {
        return this.f25656a.getLong(str, j10);
    }

    public final boolean b(String str, boolean z10) {
        return this.f25656a.getBoolean(str, z10);
    }

    public final void a(String str, String str2) {
        SharedPreferences.Editor edit = this.f25656a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final void a(String str, int i10) {
        SharedPreferences.Editor edit = this.f25656a.edit();
        edit.putInt(str, i10);
        edit.apply();
    }

    public final void a(String str, long j10) {
        SharedPreferences.Editor edit = this.f25656a.edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    public final void a(String str, boolean z10) {
        SharedPreferences.Editor edit = this.f25656a.edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }
}
