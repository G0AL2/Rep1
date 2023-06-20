package l8;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: AuxEffectInfo.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f33942a;

    /* renamed from: b  reason: collision with root package name */
    public final float f33943b;

    public v(int i10, float f10) {
        this.f33942a = i10;
        this.f33943b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f33942a == vVar.f33942a && Float.compare(vVar.f33943b, this.f33943b) == 0;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f33942a) * 31) + Float.floatToIntBits(this.f33943b);
    }
}
