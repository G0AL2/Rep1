package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public abstract class zzcz<T> {
    public static final /* synthetic */ int zzd = 0;
    private static volatile zzcy zze = null;
    private static volatile boolean zzf = false;
    final zzcx zzb;
    final String zzc;
    private final T zzj;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzcz<?>>> zzg = new AtomicReference<>();
    private static final zzdb zzh = new zzdb(new Object() { // from class: com.google.android.gms.internal.auth.zzcr
    }, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzcz(zzcx zzcxVar, String str, Object obj, boolean z10, zzct zzctVar) {
        if (zzcxVar.zzb != null) {
            this.zzb = zzcxVar;
            this.zzc = str;
            this.zzj = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zza;
            synchronized (obj) {
                if (zze == null) {
                    synchronized (obj) {
                        zzcy zzcyVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzcyVar == null || zzcyVar.zza() != context) {
                            zzcg.zzd();
                            zzda.zzc();
                            zzcn.zze();
                            zze = new zzcd(context, zzdk.zza(new zzdg() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // com.google.android.gms.internal.auth.zzdg
                                public final Object zza() {
                                    zzde zzc;
                                    zzde zzc2;
                                    Context context2 = context;
                                    int i10 = zzcz.zzd;
                                    String str = Build.TYPE;
                                    String str2 = Build.TAGS;
                                    if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                                        return zzde.zzc();
                                    }
                                    if (zzcc.zza() && !context2.isDeviceProtectedStorage()) {
                                        context2 = context2.createDeviceProtectedStorageContext();
                                    }
                                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        StrictMode.allowThreadDiskWrites();
                                        try {
                                            File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                            zzc = file.exists() ? zzde.zzd(file) : zzde.zzc();
                                        } catch (RuntimeException e10) {
                                            Log.e("HermeticFileOverrides", "no data dir", e10);
                                            zzc = zzde.zzc();
                                        }
                                        if (zzc.zzb()) {
                                            File file2 = (File) zzc.zza();
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                try {
                                                    HashMap hashMap = new HashMap();
                                                    HashMap hashMap2 = new HashMap();
                                                    while (true) {
                                                        String readLine = bufferedReader.readLine();
                                                        if (readLine == null) {
                                                            break;
                                                        }
                                                        String[] split = readLine.split(" ", 3);
                                                        if (split.length != 3) {
                                                            Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                                        } else {
                                                            String str3 = new String(split[0]);
                                                            String decode = Uri.decode(new String(split[1]));
                                                            String str4 = (String) hashMap2.get(split[2]);
                                                            if (str4 == null) {
                                                                String str5 = new String(split[2]);
                                                                str4 = Uri.decode(str5);
                                                                if (str4.length() < 1024 || str4 == str5) {
                                                                    hashMap2.put(str5, str4);
                                                                }
                                                            }
                                                            if (!hashMap.containsKey(str3)) {
                                                                hashMap.put(str3, new HashMap());
                                                            }
                                                            ((Map) hashMap.get(str3)).put(decode, str4);
                                                        }
                                                    }
                                                    String valueOf = String.valueOf(file2);
                                                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
                                                    sb2.append("Parsed ");
                                                    sb2.append(valueOf);
                                                    Log.i("HermeticFileOverrides", sb2.toString());
                                                    zzco zzcoVar = new zzco(hashMap);
                                                    bufferedReader.close();
                                                    zzc2 = zzde.zzd(zzcoVar);
                                                } catch (Throwable th) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e11) {
                                                throw new RuntimeException(e11);
                                            }
                                        } else {
                                            zzc2 = zzde.zzc();
                                        }
                                        return zzc2;
                                    } finally {
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract T zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T zzb() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zzb.zzd;
        return this.zzc;
    }
}
