package ba;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: TrackSelectionArray.java */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f5137a;

    /* renamed from: b  reason: collision with root package name */
    private final t[] f5138b;

    /* renamed from: c  reason: collision with root package name */
    private int f5139c;

    public u(t... tVarArr) {
        this.f5138b = tVarArr;
        this.f5137a = tVarArr.length;
    }

    public t a(int i10) {
        return this.f5138b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5138b, ((u) obj).f5138b);
    }

    public int hashCode() {
        if (this.f5139c == 0) {
            this.f5139c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f5138b);
        }
        return this.f5139c;
    }
}
