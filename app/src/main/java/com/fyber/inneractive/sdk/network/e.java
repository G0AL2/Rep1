package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class e implements u<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17546a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JSONArray f17547b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f17548c;

    public e(c cVar, String str, JSONArray jSONArray, long j10) {
        this.f17546a = str;
        this.f17547b = jSONArray;
        this.f17548c = j10;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z10) {
        String str2 = str;
        IAlog.a("Event Request: Hitting URL finished: %s, body: %s", this.f17546a, this.f17547b);
        if (exc == null) {
            IAlog.a("Event Request: Hitting URL response code: %s", str2);
        } else {
            IAlog.a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f17548c));
    }
}
