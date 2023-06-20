package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqm {
    protected static final String zza = "zzaqm";
    private final zzapc zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzaqm(zzapc zzapcVar, String str, String str2, Class... clsArr) {
        this.zzb = zzapcVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzapcVar.zzk().submit(new zzaql(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzaqm zzaqmVar) {
        CountDownLatch countDownLatch;
        Class loadClass;
        try {
            zzapc zzapcVar = zzaqmVar.zzb;
            loadClass = zzapcVar.zzi().loadClass(zzaqmVar.zzc(zzapcVar.zzu(), zzaqmVar.zzc));
        } catch (zzaoh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzaqmVar.zzg;
        } catch (Throwable th) {
            zzaqmVar.zzg.countDown();
            throw th;
        }
        if (loadClass == null) {
            countDownLatch = zzaqmVar.zzg;
        } else {
            zzaqmVar.zze = loadClass.getMethod(zzaqmVar.zzc(zzaqmVar.zzb.zzu(), zzaqmVar.zzd), zzaqmVar.zzf);
            if (zzaqmVar.zze == null) {
                countDownLatch = zzaqmVar.zzg;
            }
            countDownLatch = zzaqmVar.zzg;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaoh, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
