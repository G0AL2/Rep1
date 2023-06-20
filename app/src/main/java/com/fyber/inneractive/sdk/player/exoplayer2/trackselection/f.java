package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f19367a;

    /* renamed from: b  reason: collision with root package name */
    public final e[] f19368b;

    /* renamed from: c  reason: collision with root package name */
    public int f19369c;

    public f(e... eVarArr) {
        this.f19368b = eVarArr;
        this.f19367a = eVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19368b, ((f) obj).f19368b);
    }

    public int hashCode() {
        if (this.f19369c == 0) {
            this.f19369c = Arrays.hashCode(this.f19368b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f19369c;
    }
}
