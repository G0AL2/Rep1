package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class b implements u<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17721a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f17722b;

    public b(String str, long j10) {
        this.f17721a = str;
        this.f17722b = j10;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z10) {
        String str2 = str;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.f17721a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str2);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f17722b));
    }
}
