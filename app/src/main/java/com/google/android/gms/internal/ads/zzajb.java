package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzajb implements Comparable {
    private final zzajm zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzajf zzf;
    private Integer zzg;
    private zzaje zzh;
    private boolean zzi;
    private zzaik zzj;
    private zzaja zzk;
    private final zzaip zzl;

    public zzajb(int i10, String str, zzajf zzajfVar) {
        Uri parse;
        String host;
        this.zza = zzajm.zza ? new zzajm() : null;
        this.zze = new Object();
        int i11 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzajfVar;
        this.zzl = new zzaip();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.zzd = i11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzajb) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        return "[ ] " + str + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaik zzd() {
        return this.zzj;
    }

    public final zzajb zze(zzaik zzaikVar) {
        this.zzj = zzaikVar;
        return this;
    }

    public final zzajb zzf(zzaje zzajeVar) {
        this.zzh = zzajeVar;
        return this;
    }

    public final zzajb zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzajh zzh(zzaix zzaixVar);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb != 0) {
            String num = Integer.toString(1);
            return num + Constants.FILENAME_SEQUENCE_SEPARATOR + str;
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaij {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzajm.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzajk zzajkVar) {
        zzajf zzajfVar;
        synchronized (this.zze) {
            zzajfVar = this.zzf;
        }
        if (zzajfVar != null) {
            zzajfVar.zza(zzajkVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzaje zzajeVar = this.zzh;
        if (zzajeVar != null) {
            zzajeVar.zzb(this);
        }
        if (zzajm.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaiz(this, str, id2));
                return;
            }
            this.zza.zza(str, id2);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzaja zzajaVar;
        synchronized (this.zze) {
            zzajaVar = this.zzk;
        }
        if (zzajaVar != null) {
            zzajaVar.zza(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs(zzajh zzajhVar) {
        zzaja zzajaVar;
        synchronized (this.zze) {
            zzajaVar = this.zzk;
        }
        if (zzajaVar != null) {
            zzajaVar.zzb(this, zzajhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt(int i10) {
        zzaje zzajeVar = this.zzh;
        if (zzajeVar != null) {
            zzajeVar.zzc(this, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(zzaja zzajaVar) {
        synchronized (this.zze) {
            this.zzk = zzajaVar;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaij {
        return null;
    }

    public final zzaip zzy() {
        return this.zzl;
    }
}
