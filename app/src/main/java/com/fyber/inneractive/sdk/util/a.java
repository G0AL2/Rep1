package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.network.q;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public InneractiveAdSpot f20225a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f20227c;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20226b = false;

    /* renamed from: d  reason: collision with root package name */
    public long f20228d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f20229e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f20230f = 0;

    public void a(boolean z10) {
        if (!this.f20226b) {
            Object[] objArr = new Object[2];
            objArr[0] = "AdExperienceLatency: ";
            objArr[1] = z10 ? "skip" : "close";
            IAlog.a("%s%s timer started", objArr);
            this.f20228d = System.currentTimeMillis();
            this.f20226b = true;
            this.f20227c = z10;
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = "AdExperienceLatency: ";
        objArr2[1] = z10 ? "skip" : "close";
        IAlog.a("%s%s timer could not start. Timer is in action!", objArr2);
    }

    public void b() {
        if (!this.f20226b || this.f20229e <= 0) {
            return;
        }
        this.f20230f += System.currentTimeMillis() - this.f20229e;
        this.f20229e = 0L;
    }

    public void c() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        if (this.f20226b) {
            String a10 = c0.a(this.f20228d, this.f20230f);
            InneractiveAdSpot inneractiveAdSpot = this.f20225a;
            com.fyber.inneractive.sdk.flow.j adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.p pVar = this.f20227c ? com.fyber.inneractive.sdk.network.p.USER_SKIP_ACTION_LATENCY : com.fyber.inneractive.sdk.network.p.USER_CLOSE_ACTION_LATENCY;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f17239a : null;
            com.fyber.inneractive.sdk.response.e c10 = adContent != null ? adContent.c() : null;
            JSONArray c11 = (adContent == null || (sVar = adContent.f17241c) == null) ? null : sVar.c();
            q.a aVar = new q.a(c10);
            aVar.f17683c = pVar;
            aVar.f17681a = inneractiveAdRequest;
            aVar.f17684d = c11;
            Object[] objArr = new Object[2];
            objArr[0] = this.f20227c ? "skip_action_latency" : "close_action_latency";
            objArr[1] = a10;
            aVar.a(objArr);
            aVar.a((String) null);
            a();
        }
    }

    public void a() {
        this.f20228d = 0L;
        this.f20229e = 0L;
        this.f20230f = 0L;
        this.f20226b = false;
    }
}
