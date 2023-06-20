package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: d  reason: collision with root package name */
    public static final m f19141d = new m(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f19142a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19143b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19144c;

    public m(float f10, float f11) {
        this.f19142a = f10;
        this.f19143b = f11;
        this.f19144c = Math.round(f10 * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f19142a == mVar.f19142a && this.f19143b == mVar.f19143b;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f19142a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f19143b);
    }
}
