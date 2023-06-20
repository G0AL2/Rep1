package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: HighPriorityEventRepertoryImpl.java */
/* loaded from: classes.dex */
public class m extends g {
    public m(Context context) {
        super(context);
    }

    public static String f() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ,gen_time TEXT , retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.openadsdk.b.g
    public String d() {
        return "loghighpriority";
    }
}
