package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcin implements zzayj {
    private final zzayy zza;
    private final Context zzb;
    private final zzayj zzc;
    private final String zzd;
    private final int zze;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbcy zzj;
    private final zzciv zzr;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn = false;
    private long zzo = 0;
    private final AtomicLong zzq = new AtomicLong(-1);
    private zzfvl zzp = null;
    private final boolean zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();

    public zzcin(Context context, zzayj zzayjVar, String str, int i10, zzayy zzayyVar, zzciv zzcivVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzayjVar;
        this.zza = zzayyVar;
        this.zzr = zzcivVar;
        this.zzd = str;
        this.zze = i10;
    }

    private final void zzl(zzayl zzaylVar) {
        zzayy zzayyVar = this.zza;
        if (zzayyVar != null) {
            ((zzciz) zzayyVar).zzk(this, zzaylVar);
        }
    }

    private final boolean zzm() {
        if (this.zzf) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzds)).booleanValue() || this.zzm) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdt)).booleanValue() && !this.zzn;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int zza;
        zzayy zzayyVar;
        if (this.zzh) {
            InputStream inputStream = this.zzg;
            if (inputStream != null) {
                zza = inputStream.read(bArr, i10, i11);
            } else {
                zza = this.zzc.zza(bArr, i10, i11);
            }
            if ((!this.zzf || this.zzg != null) && (zzayyVar = this.zza) != null) {
                ((zzciz) zzayyVar).zzW(this, zza);
            }
            return zza;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzayj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzayl r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcin.zzb(com.google.android.gms.internal.ads.zzayl):long");
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
            return;
        }
        this.zzc.zzd();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        if (this.zzj == null) {
            return -1L;
        }
        if (this.zzq.get() != -1) {
            return this.zzq.get();
        }
        synchronized (this) {
            if (this.zzp == null) {
                this.zzp = zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcim
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzcin.this.zzg();
                    }
                });
            }
        }
        if (this.zzp.isDone()) {
            try {
                this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                return this.zzq.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Long zzg() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzj));
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final boolean zzi() {
        return this.zzn;
    }

    public final boolean zzj() {
        return this.zzm;
    }

    public final boolean zzk() {
        return this.zzl;
    }
}
