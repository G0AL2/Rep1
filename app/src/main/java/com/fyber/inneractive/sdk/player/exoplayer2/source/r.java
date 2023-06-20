package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f19329a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.i[] f19330b;

    /* renamed from: c  reason: collision with root package name */
    public int f19331c;

    public r(com.fyber.inneractive.sdk.player.exoplayer2.i... iVarArr) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(iVarArr.length > 0);
        this.f19330b = iVarArr;
        this.f19329a = iVarArr.length;
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.i a(int i10) {
        return this.f19330b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f19329a == rVar.f19329a && Arrays.equals(this.f19330b, rVar.f19330b);
    }

    public int hashCode() {
        if (this.f19331c == 0) {
            this.f19331c = Arrays.hashCode(this.f19330b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f19331c;
    }

    public int a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
        int i10 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = this.f19330b;
            if (i10 >= iVarArr.length) {
                return -1;
            }
            if (iVar == iVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }
}
