package sb;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzx;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class e extends com.google.firebase.auth.w {

    /* renamed from: a  reason: collision with root package name */
    private final zzx f36919a;

    public e(zzx zzxVar) {
        Preconditions.checkNotNull(zzxVar);
        this.f36919a = zzxVar;
    }

    @Override // com.google.firebase.auth.w
    public final List<MultiFactorInfo> a() {
        return this.f36919a.L1();
    }
}
