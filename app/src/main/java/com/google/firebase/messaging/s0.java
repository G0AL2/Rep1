package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a */
    private final SharedPreferences f23541a;

    /* renamed from: b */
    private final String f23542b;

    /* renamed from: c */
    private final String f23543c;

    /* renamed from: e */
    private final Executor f23545e;

    /* renamed from: d */
    final ArrayDeque<String> f23544d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f23546f = false;

    private s0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f23541a = sharedPreferences;
        this.f23542b = str;
        this.f23543c = str2;
        this.f23545e = executor;
    }

    public static /* synthetic */ void a(s0 s0Var) {
        s0Var.h();
    }

    private boolean b(boolean z10) {
        if (z10 && !this.f23546f) {
            i();
        }
        return z10;
    }

    public static s0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        s0 s0Var = new s0(sharedPreferences, str, str2, executor);
        s0Var.d();
        return s0Var;
    }

    private void d() {
        synchronized (this.f23544d) {
            this.f23544d.clear();
            String string = this.f23541a.getString(this.f23542b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f23543c)) {
                String[] split = string.split(this.f23543c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f23544d.add(str);
                    }
                }
            }
        }
    }

    public void h() {
        synchronized (this.f23544d) {
            this.f23541a.edit().putString(this.f23542b, g()).commit();
        }
    }

    private void i() {
        this.f23545e.execute(new Runnable() { // from class: com.google.firebase.messaging.r0
            @Override // java.lang.Runnable
            public final void run() {
                s0.a(s0.this);
            }
        });
    }

    public String e() {
        String peek;
        synchronized (this.f23544d) {
            peek = this.f23544d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean b10;
        synchronized (this.f23544d) {
            b10 = b(this.f23544d.remove(obj));
        }
        return b10;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f23544d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f23543c);
        }
        return sb2.toString();
    }
}
