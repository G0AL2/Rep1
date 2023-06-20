package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvb {
    private static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap zzd = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvb(Context context) {
        this.zzb = (Context) Preconditions.checkNotNull(context);
        zzd.zza();
        this.zzc = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public static String zzb(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzvb zzvbVar, String str) {
        zzva zzvaVar = (zzva) zzvbVar.zzd.get(str);
        if (zzvaVar == null || zzae.zzd(zzvaVar.zzd) || zzae.zzd(zzvaVar.zze) || zzvaVar.zzb.isEmpty()) {
            return;
        }
        for (zztg zztgVar : zzvaVar.zzb) {
            zztgVar.zzo(PhoneAuthCredential.n1(zzvaVar.zzd, zzvaVar.zze));
        }
        zzvaVar.zzh = true;
    }

    private static String zzm(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(zzm.zzc));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.d("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            zza.e("NoSuchAlgorithm: ".concat(String.valueOf(e10.getMessage())), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn(String str) {
        zzva zzvaVar = (zzva) this.zzd.get(str);
        if (zzvaVar == null || zzvaVar.zzh || zzae.zzd(zzvaVar.zzd)) {
            return;
        }
        zza.w("Timed out waiting for SMS.", new Object[0]);
        for (zztg zztgVar : zzvaVar.zzb) {
            zztgVar.zza(zzvaVar.zzd);
        }
        zzvaVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzo */
    public final void zzh(String str) {
        zzva zzvaVar = (zzva) this.zzd.get(str);
        if (zzvaVar == null) {
            return;
        }
        if (!zzvaVar.zzi) {
            zzn(str);
        }
        zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        Signature[] apkContentsSigners;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                apkContentsSigners = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 64).signatures;
            } else {
                apkContentsSigners = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String zzm = zzm(packageName, apkContentsSigners[0].toCharsString());
            if (zzm != null) {
                return zzm;
            }
            zza.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(zztg zztgVar, String str) {
        zzva zzvaVar = (zzva) this.zzd.get(str);
        if (zzvaVar == null) {
            return;
        }
        zzvaVar.zzb.add(zztgVar);
        if (zzvaVar.zzg) {
            zztgVar.zzb(zzvaVar.zzd);
        }
        if (zzvaVar.zzh) {
            zztgVar.zzo(PhoneAuthCredential.n1(zzvaVar.zzd, zzvaVar.zze));
        }
        if (zzvaVar.zzi) {
            zztgVar.zza(zzvaVar.zzd);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(String str) {
        zzva zzvaVar = (zzva) this.zzd.get(str);
        if (zzvaVar == null) {
            return;
        }
        ScheduledFuture scheduledFuture = zzvaVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzvaVar.zzf.cancel(false);
        }
        zzvaVar.zzb.clear();
        this.zzd.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk(final String str, zztg zztgVar, long j10, boolean z10) {
        this.zzd.put(str, new zzva(j10, z10));
        zzi(zztgVar, str);
        zzva zzvaVar = (zzva) this.zzd.get(str);
        long j11 = zzvaVar.zza;
        if (j11 <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzvaVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzuw
            @Override // java.lang.Runnable
            public final void run() {
                zzvb.this.zzh(str);
            }
        }, j11, TimeUnit.SECONDS);
        if (!zzvaVar.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzuz zzuzVar = new zzuz(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        this.zzb.getApplicationContext().registerReceiver(zzuzVar, intentFilter);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzux(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzl(String str) {
        return this.zzd.get(str) != null;
    }
}
