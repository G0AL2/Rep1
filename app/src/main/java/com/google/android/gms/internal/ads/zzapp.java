package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapp extends zzaqn {
    private static final zzaqo zzi = new zzaqo();
    private final Context zzj;

    public zzapp(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, Context context, zzalb zzalbVar) {
        super(zzapcVar, "8zPzMumx8VK4Q4ZZMffWEJsAX0/i9gohXVA/VhPpWBNlLRmzgRsEh/j6Aaymt8Wu", "GsEHhtmZy7+TitdN6KLdSnSR7WpVlkZahwBwH9Jv1wQ=", zzaliVar, i10, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaly zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzai()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i10;
        zzamo zzamoVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzamo zzamoVar2 = (zzamo) zza.get();
            if (zzamoVar2 == null || zzapf.zzg(zzamoVar2.zza) || zzamoVar2.zza.equals("E") || zzamoVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzapf.zzg(null)) {
                    if (!zzapf.zzg(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    i10 = (bool.booleanValue() && this.zzb.zzp()) ? 4 : 3;
                } else {
                    i10 = 5;
                }
                Boolean valueOf = Boolean.valueOf(i10 == 3);
                Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbW);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbV)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzapf.zzg(zzb)) {
                    zzb = zzc();
                }
                zzamo zzamoVar3 = new zzamo((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzapf.zzg(zzamoVar3.zza) || zzamoVar3.zza.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 == 3) {
                        String zzc = zzc();
                        if (!zzapf.zzg(zzc)) {
                            zzamoVar3.zza = zzc;
                        }
                    } else if (i11 == 4) {
                        throw null;
                    }
                }
                zza.set(zzamoVar3);
            }
            zzamoVar = (zzamo) zza.get();
        }
        synchronized (this.zze) {
            if (zzamoVar != null) {
                this.zze.zzw(zzamoVar.zza);
                this.zze.zzW(zzamoVar.zzb);
                this.zze.zzY(zzamoVar.zzc);
                this.zze.zzh(zzamoVar.zzd);
                this.zze.zzv(zzamoVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzapf.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbX));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzapf.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbY)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final zzfvt zzf = zzfvt.zzf();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaqp
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        zzfvt zzfvtVar = zzfvt.this;
                        if (list == null) {
                            zzfvtVar.zzd(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                                if (apkChecksum.getType() == 8) {
                                    zzfvtVar.zzd(zzapf.zzc(apkChecksum.getValue()));
                                    return;
                                }
                            }
                            zzfvtVar.zzd(null);
                        } catch (Throwable unused) {
                            zzfvtVar.zzd(null);
                        }
                    }
                });
                return (String) zzf.get();
            }
            return null;
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
