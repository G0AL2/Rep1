package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzha extends zzen {
    private final zzli zza;
    private Boolean zzb;
    private String zzc;

    public zzha(zzli zzliVar, String str) {
        Preconditions.checkNotNull(zzliVar);
        this.zza = zzliVar;
        this.zzc = null;
    }

    private final void zzA(zzav zzavVar, zzp zzpVar) {
        this.zza.zzA();
        this.zza.zzD(zzavVar, zzpVar);
    }

    private final void zzy(zzp zzpVar, boolean z10) {
        Preconditions.checkNotNull(zzpVar);
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzz(zzpVar.zza, false);
        this.zza.zzv().zzX(zzpVar.zzb, zzpVar.zzq);
    }

    private final void zzz(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.zzb == null) {
                        if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzav(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zzav()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z11 = false;
                            this.zzb = Boolean.valueOf(z11);
                        }
                        z11 = true;
                        this.zzb = Boolean.valueOf(z11);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.zza.zzaz().zzd().zzb("Measurement Service called with invalid calling package. appId", zzey.zzn(str));
                    throw e10;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzav(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (str.equals(this.zzc)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.zza.zzaz().zzd().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzav zzb(zzav zzavVar, zzp zzpVar) {
        zzat zzatVar;
        if ("_cmp".equals(zzavVar.zza) && (zzatVar = zzavVar.zzb) != null && zzatVar.zza() != 0) {
            String zzg = zzavVar.zzb.zzg("_cis");
            if ("referrer broadcast".equals(zzg) || "referrer API".equals(zzg)) {
                this.zza.zzaz().zzi().zzb("Event has been filtered ", zzavVar.toString());
                return new zzav("_cmpx", zzavVar.zzb, zzavVar.zzc, zzavVar.zzd);
            }
        }
        return zzavVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final String zzd(zzp zzpVar) {
        zzy(zzpVar, false);
        return this.zza.zzx(zzpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zze(zzp zzpVar, boolean z10) {
        zzy(zzpVar, false);
        String str = zzpVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzln> list = (List) this.zza.zzaA().zzh(new zzgx(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzln zzlnVar : list) {
                if (z10 || !zzlp.zzah(zzlnVar.zzc)) {
                    arrayList.add(new zzll(zzlnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaz().zzd().zzc("Failed to get user properties. appId", zzey.zzn(zzpVar.zza), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzf(String str, String str2, zzp zzpVar) {
        zzy(zzpVar, false);
        String str3 = zzpVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaA().zzh(new zzgo(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaz().zzd().zzb("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaA().zzh(new zzgp(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaz().zzd().zzb("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzh(String str, String str2, boolean z10, zzp zzpVar) {
        zzy(zzpVar, false);
        String str3 = zzpVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzln> list = (List) this.zza.zzaA().zzh(new zzgm(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzln zzlnVar : list) {
                if (z10 || !zzlp.zzah(zzlnVar.zzc)) {
                    arrayList.add(new zzll(zzlnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaz().zzd().zzc("Failed to query user properties. appId", zzey.zzn(zzpVar.zza), e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzi(String str, String str2, String str3, boolean z10) {
        zzz(str, true);
        try {
            List<zzln> list = (List) this.zza.zzaA().zzh(new zzgn(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzln zzlnVar : list) {
                if (z10 || !zzlp.zzah(zzlnVar.zzc)) {
                    arrayList.add(new zzll(zzlnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaz().zzd().zzc("Failed to get user properties as. appId", zzey.zzn(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzj(zzp zzpVar) {
        zzy(zzpVar, false);
        zzx(new zzgy(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzk(zzav zzavVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzavVar);
        zzy(zzpVar, false);
        zzx(new zzgt(this, zzavVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzl(zzav zzavVar, String str, String str2) {
        Preconditions.checkNotNull(zzavVar);
        Preconditions.checkNotEmpty(str);
        zzz(str, true);
        zzx(new zzgu(this, zzavVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzm(zzp zzpVar) {
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzz(zzpVar.zza, false);
        zzx(new zzgq(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzn(zzab zzabVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotNull(zzabVar.zzc);
        zzy(zzpVar, false);
        zzab zzabVar2 = new zzab(zzabVar);
        zzabVar2.zza = zzpVar.zza;
        zzx(new zzgk(this, zzabVar2, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzo(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        Preconditions.checkNotNull(zzabVar.zzc);
        Preconditions.checkNotEmpty(zzabVar.zza);
        zzz(zzabVar.zza, true);
        zzx(new zzgl(this, new zzab(zzabVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzp(zzp zzpVar) {
        Preconditions.checkNotEmpty(zzpVar.zza);
        Preconditions.checkNotNull(zzpVar.zzv);
        zzgs zzgsVar = new zzgs(this, zzpVar);
        Preconditions.checkNotNull(zzgsVar);
        if (this.zza.zzaA().zzs()) {
            zzgsVar.run();
        } else {
            this.zza.zzaA().zzq(zzgsVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzq(long j10, String str, String str2, String str3) {
        zzx(new zzgz(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzr(final Bundle bundle, zzp zzpVar) {
        zzy(zzpVar, false);
        final String str = zzpVar.zza;
        Preconditions.checkNotNull(str);
        zzx(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgj
            @Override // java.lang.Runnable
            public final void run() {
                zzha.this.zzw(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzs(zzp zzpVar) {
        zzy(zzpVar, false);
        zzx(new zzgr(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzt(zzll zzllVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzllVar);
        zzy(zzpVar, false);
        zzx(new zzgw(this, zzllVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final byte[] zzu(zzav zzavVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzavVar);
        zzz(str, true);
        this.zza.zzaz().zzc().zzb("Log and bundle. event", this.zza.zzj().zzd(zzavVar.zza));
        long nanoTime = this.zza.zzaw().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzaA().zzi(new zzgv(this, zzavVar, str)).get();
            if (bArr == null) {
                this.zza.zzaz().zzd().zzb("Log and bundle returned null. appId", zzey.zzn(str));
                bArr = new byte[0];
            }
            this.zza.zzaz().zzc().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzj().zzd(zzavVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzaw().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaz().zzd().zzd("Failed to log and bundle. appId, event, error", zzey.zzn(str), this.zza.zzj().zzd(zzavVar.zza), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv(zzav zzavVar, zzp zzpVar) {
        if (!this.zza.zzo().zzo(zzpVar.zza)) {
            zzA(zzavVar, zzpVar);
            return;
        }
        this.zza.zzaz().zzj().zzb("EES config found for", zzpVar.zza);
        zzfz zzo = this.zza.zzo();
        String str = zzpVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzo.zzd.get(str);
        if (zzcVar != null) {
            try {
                Map zzs = this.zza.zzu().zzs(zzavVar.zzb.zzc(), true);
                String zza = zzhf.zza(zzavVar.zza);
                if (zza == null) {
                    zza = zzavVar.zza;
                }
                if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(zza, zzavVar.zzd, zzs))) {
                    if (zzcVar.zzg()) {
                        this.zza.zzaz().zzj().zzb("EES edited event", zzavVar.zza);
                        zzA(this.zza.zzu().zzi(zzcVar.zza().zzb()), zzpVar);
                    } else {
                        zzA(zzavVar, zzpVar);
                    }
                    if (zzcVar.zzf()) {
                        for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                            this.zza.zzaz().zzj().zzb("EES logging created event", zzaaVar.zzd());
                            zzA(this.zza.zzu().zzi(zzaaVar), zzpVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zza.zzaz().zzd().zzc("EES error. appId, eventName", zzpVar.zzb, zzavVar.zza);
            }
            this.zza.zzaz().zzj().zzb("EES was not applied to event", zzavVar.zza);
            zzA(zzavVar, zzpVar);
            return;
        }
        this.zza.zzaz().zzj().zzb("EES not loaded for", zzpVar.zza);
        zzA(zzavVar, zzpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzal zzi = this.zza.zzi();
        zzi.zzg();
        zzi.zzW();
        byte[] zzby = zzi.zzf.zzu().zzj(new zzaq(zzi.zzs, "", str, "dep", 0L, 0L, bundle)).zzby();
        zzi.zzs.zzaz().zzj().zzc("Saving default event parameters, appId, data size", zzi.zzs.zzj().zzd(str), Integer.valueOf(zzby.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzby);
        try {
            if (zzi.zzh().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzi.zzs.zzaz().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzey.zzn(str));
            }
        } catch (SQLiteException e10) {
            zzi.zzs.zzaz().zzd().zzc("Error storing default event parameters. appId", zzey.zzn(str), e10);
        }
    }

    @VisibleForTesting
    final void zzx(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzaA().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaA().zzp(runnable);
        }
    }
}
