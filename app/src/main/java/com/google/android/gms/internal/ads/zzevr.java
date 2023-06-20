package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevr implements zzgqu {
    public static zzetj zza(Context context, zzcef zzcefVar, zzceg zzcegVar, Object obj, zzeub zzeubVar, zzeve zzeveVar, zzgqo zzgqoVar, zzgqo zzgqoVar2, zzgqo zzgqoVar3, zzgqo zzgqoVar4, zzgqo zzgqoVar5, zzgqo zzgqoVar6, zzgqo zzgqoVar7, zzgqo zzgqoVar8, zzgqo zzgqoVar9, Executor executor, zzfhs zzfhsVar, zzdwh zzdwhVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeux) obj);
        hashSet.add(zzeubVar);
        hashSet.add(zzeveVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeI)).booleanValue()) {
            hashSet.add((zzetg) zzgqoVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeJ)).booleanValue()) {
            hashSet.add((zzetg) zzgqoVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeK)).booleanValue()) {
            hashSet.add((zzetg) zzgqoVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeL)).booleanValue()) {
            hashSet.add((zzetg) zzgqoVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeP)).booleanValue()) {
            hashSet.add((zzetg) zzgqoVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeQ)).booleanValue()) {
            hashSet.add((zzetg) zzgqoVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcq)).booleanValue()) {
            hashSet.add((zzetg) zzgqoVar9.zzb());
        }
        return new zzetj(context, executor, hashSet, zzfhsVar, zzdwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
