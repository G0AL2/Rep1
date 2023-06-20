package j8;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: DeviceInfo.java */
/* loaded from: classes2.dex */
public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public final int f32616a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32617b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32618c;

    static {
        new m(0, 0, 0);
    }

    public m(int i10, int i11, int i12) {
        this.f32616a = i10;
        this.f32617b = i11;
        this.f32618c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f32616a == mVar.f32616a && this.f32617b == mVar.f32617b && this.f32618c == mVar.f32618c;
        }
        return false;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f32616a) * 31) + this.f32617b) * 31) + this.f32618c;
    }
}
