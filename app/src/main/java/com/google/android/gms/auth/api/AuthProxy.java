package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.auth.zzbo;
import com.google.android.gms.internal.auth.zzbt;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public final class AuthProxy {
    @ShowFirstParty
    @KeepForSdk
    public static final Api<AuthProxyOptions> API;
    @ShowFirstParty
    @KeepForSdk
    public static final ProxyApi ProxyApi;
    public static final Api.ClientKey<zzbe> zza;
    private static final Api.AbstractClientBuilder<zzbe, AuthProxyOptions> zzb;

    static {
        Api.ClientKey<zzbe> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        API = new Api<>("Auth.PROXY_API", zzaVar, clientKey);
        ProxyApi = new zzbt();
    }

    @KeepForSdk
    public static ProxyClient getClient(Activity activity, AuthProxyOptions authProxyOptions) {
        return new zzbo(activity, authProxyOptions);
    }

    @KeepForSdk
    public static ProxyClient getClient(Context context, AuthProxyOptions authProxyOptions) {
        return new zzbo(context, authProxyOptions);
    }
}
