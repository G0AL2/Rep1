package com.google.android.gms.safetynet;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.safetynet.zzae;
import com.google.android.gms.internal.safetynet.zzaf;
import com.google.android.gms.internal.safetynet.zzag;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
public final class SafetyNet {
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final SafetyNetApi SafetyNetApi;
    public static final Api.ClientKey<zzaf> zza;
    public static final Api.AbstractClientBuilder<zzaf, Api.ApiOptions.NoOptions> zzb;
    @ShowFirstParty
    public static final zzag zzc;

    static {
        Api.ClientKey<zzaf> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzk zzkVar = new zzk();
        zzb = zzkVar;
        API = new Api<>("SafetyNet.API", zzkVar, clientKey);
        SafetyNetApi = new zzae();
        zzc = new zzag();
    }

    private SafetyNet() {
    }

    public static SafetyNetClient getClient(Activity activity) {
        return new SafetyNetClient(activity);
    }

    public static SafetyNetClient getClient(Context context) {
        return new SafetyNetClient(context);
    }
}
