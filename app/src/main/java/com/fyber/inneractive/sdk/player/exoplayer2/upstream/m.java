package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public final g f19484a;

    /* renamed from: b  reason: collision with root package name */
    public final g f19485b;

    /* renamed from: c  reason: collision with root package name */
    public final g f19486c;

    /* renamed from: d  reason: collision with root package name */
    public final g f19487d;

    /* renamed from: e  reason: collision with root package name */
    public g f19488e;

    public m(Context context, a0<? super g> a0Var, g gVar) {
        this.f19484a = (g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
        this.f19485b = new q(a0Var);
        this.f19486c = new c(context, a0Var);
        this.f19487d = new e(context, a0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws IOException {
        boolean z10 = true;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f19488e == null);
        String scheme = jVar.f19462a.getScheme();
        Uri uri = jVar.f19462a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.f19606a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !scheme2.equals("file")) {
            z10 = false;
        }
        if (z10) {
            if (jVar.f19462a.getPath().startsWith("/android_asset/")) {
                this.f19488e = this.f19486c;
            } else {
                this.f19488e = this.f19485b;
            }
        } else if ("asset".equals(scheme)) {
            this.f19488e = this.f19486c;
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            this.f19488e = this.f19487d;
        } else {
            this.f19488e = this.f19484a;
        }
        return this.f19488e.a(jVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        g gVar = this.f19488e;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f19488e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        return this.f19488e.a(bArr, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        g gVar = this.f19488e;
        if (gVar == null) {
            return null;
        }
        return gVar.a();
    }
}
