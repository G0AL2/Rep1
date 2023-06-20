package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcce implements zzccj {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgol zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccg zzi;
    private final zzccf zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcce(Context context, zzcfo zzcfoVar, zzccg zzccgVar, String str, zzccf zzccfVar, byte[] bArr) {
        Preconditions.checkNotNull(zzccgVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzccfVar;
        this.zzi = zzccgVar;
        for (String str2 : zzccgVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgol zza = zzgpq.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgom zza2 = zzgon.zza();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zza2.zza(str3);
        }
        zza.zzg((zzgon) zza2.zzal());
        zzgpl zza3 = zzgpm.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = zzcfoVar.zza;
        if (str4 != null) {
            zza3.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgpm) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzccg zza() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(Map map) throws Exception {
        zzgpj zzgpjVar;
        zzfvl zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgpjVar = (zzgpj) this.zze.get(str);
                            }
                            if (zzgpjVar == null) {
                                zzcci.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzgpjVar.zza(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbjw.zzb.zze()).booleanValue()) {
                    zzcfi.zzf("Failed to get SafeBrowsing metadata", e10);
                }
                return zzfvc.zzh(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z10 = this.zza;
        if ((z10 && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z10 && this.zzi.zzd))) {
            synchronized (this.zzj) {
                for (zzgpj zzgpjVar2 : this.zze.values()) {
                    this.zzd.zzc((zzgpk) zzgpjVar2.zzal());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzcci.zzb()) {
                    String zzl = this.zzd.zzl();
                    String zzk = this.zzd.zzk();
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + zzl + "\n  clickUrl: " + zzk + "\n  resources: \n");
                    for (zzgpk zzgpkVar : this.zzd.zzm()) {
                        sb2.append("    [");
                        sb2.append(zzgpkVar.zza());
                        sb2.append("] ");
                        sb2.append(zzgpkVar.zze());
                    }
                    zzcci.zza(sb2.toString());
                }
                zzfvl zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgpq) this.zzd.zzal()).zzaw());
                if (zzcci.zzb()) {
                    zzb2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcci.zza("Pinged SB successfully.");
                        }
                    }, zzcfv.zza);
                }
                zzm = zzfvc.zzm(zzb2, new zzfok() { // from class: com.google.android.gms.internal.ads.zzcca
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj) {
                        String str2 = (String) obj;
                        int i11 = zzcce.zzb;
                        return null;
                    }
                }, zzcfv.zzf);
            }
            return zzm;
        }
        return zzfvc.zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzd(String str, Map map, int i10) {
        synchronized (this.zzj) {
            if (i10 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i10 == 3) {
                    ((zzgpj) this.zze.get(str)).zze(zzgpi.zza(3));
                }
                return;
            }
            zzgpj zzc2 = zzgpk.zzc();
            int zza = zzgpi.zza(i10);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgou zza2 = zzgox.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgos zza3 = zzgot.zza();
                        zza3.zza(zzgji.zzx(str2));
                        zza3.zzb(zzgji.zzx(str3));
                        zza2.zza((zzgot) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzgox) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfvl zzi = zzfvc.zzi(Collections.emptyMap());
            zzfuj zzfujVar = new zzfuj() { // from class: com.google.android.gms.internal.ads.zzccb
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return zzcce.this.zzb((Map) obj);
                }
            };
            zzfvm zzfvmVar = zzcfv.zzf;
            zzfvl zzn = zzfvc.zzn(zzi, zzfujVar, zzfvmVar);
            zzfvl zzo = zzfvc.zzo(zzn, 10L, TimeUnit.SECONDS, zzcfv.zzd);
            zzfvc.zzr(zzn, new zzccd(this, zzo), zzfvmVar);
            zzc.add(zzo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgjf zzt = zzgji.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgol zzgolVar = this.zzd;
            zzgpc zza = zzgpe.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgolVar.zzi((zzgpe) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzccj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzccg r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzcfi.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzcfi.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzcfi.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzcci.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzccc r8 = new com.google.android.gms.internal.ads.zzccc
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzf(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcce.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
