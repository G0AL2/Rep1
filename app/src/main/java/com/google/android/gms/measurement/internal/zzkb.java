package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzkb extends zzf {
    private final zzka zza;
    private zzeo zzb;
    private volatile Boolean zzc;
    private final zzao zzd;
    private final zzks zze;
    private final List zzf;
    private final zzao zzg;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzkb(zzgi zzgiVar) {
        super(zzgiVar);
        this.zzf = new ArrayList();
        this.zze = new zzks(zzgiVar.zzaw());
        this.zza = new zzka(this);
        this.zzd = new zzjl(this, zzgiVar);
        this.zzg = new zzjn(this, zzgiVar);
    }

    private final zzp zzO(boolean z10) {
        Pair zza;
        this.zzs.zzax();
        zzep zzh = this.zzs.zzh();
        String str = null;
        if (z10) {
            zzey zzaz = this.zzs.zzaz();
            if (zzaz.zzs.zzm().zzb != null && (zza = zzaz.zzs.zzm().zzb.zza()) != null && zza != zzfn.zza) {
                str = String.valueOf(zza.second) + ":" + ((String) zza.first);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzs.zzaz().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable runnable : this.zzf) {
            try {
                runnable.run();
            } catch (RuntimeException e10) {
                this.zzs.zzaz().zzd().zzb("Task exception while flushing queue", e10);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzao zzaoVar = this.zzd;
        this.zzs.zzf();
        zzaoVar.zzd(((Long) zzel.zzI.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzs.zzf();
        if (size >= 1000) {
            this.zzs.zzaz().zzd().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzs.zzax();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzkb zzkbVar, ComponentName componentName) {
        zzkbVar.zzg();
        if (zzkbVar.zzb != null) {
            zzkbVar.zzb = null;
            zzkbVar.zzs.zzaz().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzkbVar.zzg();
            zzkbVar.zzr();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzA(zzav zzavVar, String str) {
        Preconditions.checkNotNull(zzavVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjq(this, true, zzO(true), this.zzs.zzi().zzo(zzavVar), zzavVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzav zzavVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            this.zzs.zzaz().zzk().zza("Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzS(zzcfVar, new byte[0]);
            return;
        }
        zzR(new zzjm(this, zzavVar, str, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzC() {
        zzg();
        zza();
        zzp zzO = zzO(false);
        zzS();
        this.zzs.zzi().zzj();
        zzR(new zzjf(this, zzO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzD(zzeo zzeoVar, AbstractSafeParcelable abstractSafeParcelable, zzp zzpVar) {
        int i10;
        zzg();
        zza();
        zzS();
        this.zzs.zzf();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzs.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i10 = zzi.size();
            } else {
                i10 = 0;
            }
            if (abstractSafeParcelable != null && i10 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i13);
                if (abstractSafeParcelable2 instanceof zzav) {
                    try {
                        zzeoVar.zzk((zzav) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e10) {
                        this.zzs.zzaz().zzd().zzb("Failed to send event to the service", e10);
                    }
                } else if (abstractSafeParcelable2 instanceof zzll) {
                    try {
                        zzeoVar.zzt((zzll) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e11) {
                        this.zzs.zzaz().zzd().zzb("Failed to send user property to the service", e11);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        zzeoVar.zzn((zzab) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e12) {
                        this.zzs.zzaz().zzd().zzb("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    this.zzs.zzaz().zzd().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzE(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zza();
        this.zzs.zzax();
        zzR(new zzjr(this, true, zzO(true), this.zzs.zzi().zzn(zzabVar), new zzab(zzabVar), zzabVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzF(boolean z10) {
        zzg();
        zza();
        if (z10) {
            zzS();
            this.zzs.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjp(this, zzO(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzG(zziu zziuVar) {
        zzg();
        zza();
        zzR(new zzjj(this, zziuVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzjk(this, zzO(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzI() {
        zzg();
        zza();
        zzR(new zzjo(this, zzO(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final void zzJ(zzeo zzeoVar) {
        zzg();
        Preconditions.checkNotNull(zzeoVar);
        this.zzb = zzeoVar;
        zzQ();
        zzP();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzK(zzll zzllVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzjd(this, zzO(true), this.zzs.zzi().zzp(zzllVar), zzllVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzs.zzv().zzm() >= ((Integer) zzel.zzai.zza(null)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzN() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkb.zzN():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzj() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzq() {
        zzg();
        zza();
        zzp zzO = zzO(true);
        this.zzs.zzi().zzk();
        zzR(new zzji(this, zzO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (!zzN()) {
            if (this.zzs.zzf().zzx()) {
                return;
            }
            this.zzs.zzax();
            List<ResolveInfo> queryIntentServices = this.zzs.zzav().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzav(), "com.google.android.gms.measurement.AppMeasurementService"), Constants.MIN_PROGRESS_STEP);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context zzav = this.zzs.zzav();
                this.zzs.zzax();
                intent.setComponent(new ComponentName(zzav, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zzb(intent);
                return;
            }
            this.zzs.zzaz().zzd().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.zza.zzc();
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzav(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzjh(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzjg(this, atomicReference, zzO(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjt(this, str, str2, zzO(false), zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjs(this, atomicReference, null, str2, str3, zzO(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzx(AtomicReference atomicReference, boolean z10) {
        zzg();
        zza();
        zzR(new zzje(this, atomicReference, zzO(false), z10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z10) {
        zzg();
        zza();
        zzR(new zzjc(this, str, str2, zzO(false), z10, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        zzg();
        zza();
        zzR(new zzju(this, atomicReference, null, str2, str3, zzO(false), z10));
    }
}
