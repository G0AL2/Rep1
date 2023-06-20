package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzty  reason: invalid package */
/* loaded from: classes2.dex */
final class zzty extends LifecycleCallback {
    private final List zza;

    private zzty(LifecycleFragment lifecycleFragment, List list) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
        this.zza = list;
    }

    public static void zza(Activity activity, List list) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        if (((zzty) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", zzty.class)) == null) {
            new zzty(fragment, list);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.zza) {
            this.zza.clear();
        }
    }
}
