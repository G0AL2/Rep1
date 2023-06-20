package com.bytedance.sdk.openadsdk.core.d;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: FrequentCallController.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f11999a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f12000b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile long f12001c;

    /* renamed from: e  reason: collision with root package name */
    private Handler f12003e;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<C0170a> f12002d = new LinkedList();

    /* renamed from: f  reason: collision with root package name */
    private final f f12004f = m.h();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrequentCallController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0170a {

        /* renamed from: a  reason: collision with root package name */
        private final long f12006a;

        /* renamed from: b  reason: collision with root package name */
        private final String f12007b;

        private C0170a(long j10, String str) {
            this.f12006a = j10;
            this.f12007b = str;
        }
    }

    private a() {
    }

    private synchronized boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = this.f12004f.i();
        long h10 = this.f12004f.h();
        if (this.f12002d.size() > 0 && this.f12002d.size() >= i10) {
            long abs = Math.abs(currentTimeMillis - this.f12002d.peek().f12006a);
            if (abs <= h10) {
                b(h10 - abs);
                return true;
            }
            this.f12002d.poll();
            this.f12002d.offer(new C0170a(currentTimeMillis, str));
        } else {
            this.f12002d.offer(new C0170a(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized String c() {
        String str;
        HashMap hashMap = new HashMap();
        for (C0170a c0170a : this.f12002d) {
            if (hashMap.containsKey(c0170a.f12007b)) {
                hashMap.put(c0170a.f12007b, Integer.valueOf(((Integer) hashMap.get(c0170a.f12007b)).intValue() + 1));
            } else {
                hashMap.put(c0170a.f12007b, 1);
            }
        }
        int i10 = RecyclerView.UNDEFINED_DURATION;
        str = "";
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i10 < intValue) {
                str = str2;
                i10 = intValue;
            }
        }
        return str;
    }

    public static a a() {
        if (f11999a == null) {
            synchronized (a.class) {
                if (f11999a == null) {
                    f11999a = new a();
                }
            }
        }
        return f11999a;
    }

    public synchronized boolean a(String str) {
        if (b(str)) {
            a(true);
            a(f12001c);
        } else {
            a(false);
        }
        return f12000b;
    }

    private synchronized void a(long j10) {
        if (this.f12003e == null) {
            this.f12003e = new Handler(Looper.getMainLooper());
        }
        this.f12003e.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.d.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.a(false);
            }
        }, j10);
    }

    public synchronized boolean b() {
        return f12000b;
    }

    private synchronized void b(long j10) {
        f12001c = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z10) {
        f12000b = z10;
    }
}
