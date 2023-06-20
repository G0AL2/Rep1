package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ob.e;
import sb.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzuh implements zzuj {
    private boolean zza;
    protected final int zzb;
    protected e zzd;
    protected FirebaseUser zze;
    protected Object zzf;
    protected m zzg;
    protected Executor zzi;
    protected zzwe zzj;
    protected zzvx zzk;
    protected zzvj zzl;
    protected zzwp zzm;
    protected String zzn;
    protected String zzo;
    protected AuthCredential zzp;
    protected String zzq;
    protected String zzr;
    protected zzps zzs;
    @VisibleForTesting
    Object zzt;
    @VisibleForTesting
    Status zzu;
    protected zzug zzv;
    @VisibleForTesting
    final zzue zzc = new zzue(this);
    protected final List zzh = new ArrayList();

    public zzuh(int i10) {
        this.zzb = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzj(zzuh zzuhVar) {
        zzuhVar.zzb();
        Preconditions.checkState(zzuhVar.zza, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzk(zzuh zzuhVar, Status status) {
        m mVar = zzuhVar.zzg;
        if (mVar != null) {
            mVar.zzb(status);
        }
    }

    public abstract void zzb();

    public final zzuh zzd(Object obj) {
        this.zzf = Preconditions.checkNotNull(obj, "external callback cannot be null");
        return this;
    }

    public final zzuh zze(m mVar) {
        this.zzg = (m) Preconditions.checkNotNull(mVar, "external failure callback cannot be null");
        return this;
    }

    public final zzuh zzf(e eVar) {
        this.zzd = (e) Preconditions.checkNotNull(eVar, "firebaseApp cannot be null");
        return this;
    }

    public final zzuh zzg(FirebaseUser firebaseUser) {
        this.zze = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzuh zzh(PhoneAuthProvider.a aVar, Activity activity, Executor executor, String str) {
        PhoneAuthProvider.a zza = zzuv.zza(str, aVar, this);
        synchronized (this.zzh) {
            this.zzh.add((PhoneAuthProvider.a) Preconditions.checkNotNull(zza));
        }
        if (activity != null) {
            zzty.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    public final void zzl(Status status) {
        this.zza = true;
        this.zzu = status;
        this.zzv.zza(null, status);
    }

    public final void zzm(Object obj) {
        this.zza = true;
        this.zzt = obj;
        this.zzv.zza(obj, null);
    }
}
