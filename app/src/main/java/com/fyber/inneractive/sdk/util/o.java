package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public class o implements com.fyber.inneractive.sdk.network.u<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f20314b;

    public o(String str, long j10) {
        this.f20313a = str;
        this.f20314b = j10;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z10) {
        String str2 = str;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.f20313a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str2);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f20314b));
    }
}
