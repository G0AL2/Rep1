package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private int f26717a;

    /* renamed from: b  reason: collision with root package name */
    private long f26718b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f26719c;

    public c(int i10, long j10, JSONObject jSONObject) {
        this.f26717a = -1;
        this.f26718b = -1L;
        this.f26717a = i10;
        this.f26718b = j10;
        this.f26719c = jSONObject;
    }

    public c(int i10, JSONObject jSONObject) {
        this.f26717a = -1;
        this.f26718b = -1L;
        this.f26717a = i10;
        this.f26718b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f26719c = new JSONObject();
        } else {
            this.f26719c = jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(String str, int i10) {
        if ("ironbeast".equals(str)) {
            return new e(i10);
        }
        if ("outcome".equals(str)) {
            return new f(i10);
        }
        if (i10 == 2) {
            return new e(i10);
        }
        if (i10 == 3) {
            return new f(i10);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }

    public int a() {
        return this.f26717a;
    }

    public void a(int i10) {
        this.f26717a = i10;
    }

    public void a(String str, Object obj) {
        try {
            this.f26719c.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public long b() {
        return this.f26718b;
    }

    public String c() {
        return this.f26719c.toString();
    }

    public JSONObject d() {
        return this.f26719c;
    }
}
