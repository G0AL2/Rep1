package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenk implements zzetg {
    private final zzfvm zza;
    private final zzfvm zzb;
    private final Context zzc;
    private final zzfcd zzd;
    private final View zze;

    public zzenk(zzfvm zzfvmVar, zzfvm zzfvmVar2, Context context, zzfcd zzfcdVar, ViewGroup viewGroup) {
        this.zza = zzfvmVar;
        this.zzb = zzfvmVar2;
        this.zzc = context;
        this.zzd = zzfcdVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzbhz.zzc(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzir)).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeni
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzenk.this.zzc();
                }
            });
        }
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenk.this.zzd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzenl zzc() throws Exception {
        return new zzenl(this.zzc, this.zzd.zze, zze());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzenl zzd() throws Exception {
        return new zzenl(this.zzc, this.zzd.zze, zze());
    }
}
