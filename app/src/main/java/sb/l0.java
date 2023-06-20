package sb;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactorInfo;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class l0 extends com.google.firebase.auth.c {
    public l0(String str, MultiFactorInfo multiFactorInfo) {
        Preconditions.checkNotEmpty(str);
        MultiFactorInfo multiFactorInfo2 = (MultiFactorInfo) Preconditions.checkNotNull(multiFactorInfo);
    }
}
