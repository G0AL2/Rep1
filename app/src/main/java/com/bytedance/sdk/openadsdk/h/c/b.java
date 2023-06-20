package com.bytedance.sdk.openadsdk.h.c;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: LogStatsCache.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f13310a;

    /* renamed from: b  reason: collision with root package name */
    private Context f13311b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f13312c = new AtomicBoolean(false);

    private b() {
        b();
    }

    public static b a() {
        if (f13310a == null) {
            synchronized (b.class) {
                if (f13310a == null) {
                    f13310a = new b();
                }
            }
        }
        return f13310a;
    }

    public void b() {
        if (this.f13312c.get() || m.a() == null) {
            return;
        }
        this.f13311b = m.a();
        this.f13312c.set(true);
    }

    public synchronized void c() {
        if (!this.f13312c.get()) {
            b();
        } else {
            try {
                com.bytedance.sdk.openadsdk.multipro.a.a.a(this.f13311b, "logstats", "retry >=?", new String[]{String.valueOf(5)});
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized List<c.a> d() {
        LinkedList linkedList = new LinkedList();
        if (!this.f13312c.get()) {
            b();
            return linkedList;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.c cVar = new com.bytedance.sdk.openadsdk.multipro.aidl.c(com.bytedance.sdk.openadsdk.multipro.a.a.a(this.f13311b, "logstats", new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "retry <?", new String[]{String.valueOf(5)}, null, null, null));
        while (cVar.moveToNext()) {
            try {
                linkedList.add(new c.a(cVar.getString(cVar.getColumnIndex("id")), new JSONObject(cVar.getString(cVar.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE)))));
            } catch (Exception unused) {
            }
        }
        cVar.close();
        return linkedList;
    }
}
