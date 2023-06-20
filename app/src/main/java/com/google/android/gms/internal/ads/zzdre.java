package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdre extends zzbqu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbkm {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdk zzb;
    private zzdnc zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdre(zzdnc zzdncVar, zzdnh zzdnhVar) {
        this.zza = zzdnhVar.zzf();
        this.zzb = zzdnhVar.zzj();
        this.zzc = zzdncVar;
        if (zzdnhVar.zzr() != null) {
            zzdnhVar.zzr().zzao(this);
        }
    }

    private final void zzg() {
        View view;
        zzdnc zzdncVar = this.zzc;
        if (zzdncVar == null || (view = this.zza) == null) {
            return;
        }
        zzdncVar.zzv(view, Collections.emptyMap(), Collections.emptyMap(), zzdnc.zzP(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbqy zzbqyVar, int i10) {
        try {
            zzbqyVar.zze(i10);
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final com.google.android.gms.ads.internal.client.zzdk zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcfi.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final zzbky zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcfi.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdnc zzdncVar = this.zzc;
        if (zzdncVar == null || zzdncVar.zza() == null) {
            return null;
        }
        return zzdncVar.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdnc zzdncVar = this.zzc;
        if (zzdncVar != null) {
            zzdncVar.zzV();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdrd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzf(IObjectWrapper iObjectWrapper, zzbqy zzbqyVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcfi.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbqyVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                zzcfi.zzg("Instream ad should not be used again.");
                zzi(zzbqyVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcgi.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcgi.zzb(this.zza, this);
            zzg();
            try {
                zzbqyVar.zzf();
                return;
            } catch (RemoteException e10) {
                zzcfi.zzl("#007 Could not call remote method.", e10);
                return;
            }
        }
        zzcfi.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
        zzi(zzbqyVar, 0);
    }
}
