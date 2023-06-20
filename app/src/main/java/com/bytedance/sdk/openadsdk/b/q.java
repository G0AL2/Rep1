package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: StatsBatchEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class q extends s {
    public q(Context context) {
        super(context);
    }

    public static String d() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ,gen_time TEXT , retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.openadsdk.b.s, com.bytedance.sdk.openadsdk.b.f
    public void a(int i10) {
        this.f11167a.a("stats_serverbusy_retrycount", i10);
    }

    @Override // com.bytedance.sdk.openadsdk.b.s, com.bytedance.sdk.openadsdk.b.f
    public int b() {
        return this.f11167a.b("stats_serverbusy_retrycount", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.b.s
    public String c() {
        return "logstatsbatch";
    }
}
