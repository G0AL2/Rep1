package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;

/* loaded from: classes2.dex */
public final class n implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19489a;

    /* renamed from: b  reason: collision with root package name */
    public final a0<? super g> f19490b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a f19491c;

    public n(Context context, a0<? super g> a0Var, g.a aVar) {
        this.f19489a = context.getApplicationContext();
        this.f19490b = a0Var;
        this.f19491c = aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g.a
    public g a() {
        return new m(this.f19489a, this.f19490b, this.f19491c.a());
    }
}
