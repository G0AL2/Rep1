package yc;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
@KeepForSdk
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f39518a;

    @KeepForSdk
    public b(String str) {
        this.f39518a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return Objects.equal(this.f39518a, ((b) obj).f39518a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f39518a);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY, this.f39518a).toString();
    }
}
