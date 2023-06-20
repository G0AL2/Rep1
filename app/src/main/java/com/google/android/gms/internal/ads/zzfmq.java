package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmq {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzflx zze;
    private boolean zzf;

    public zzfmq(Context context, int i10, zzflx zzflxVar, boolean z10) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i10 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzflxVar;
        this.zzf = z10;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzaqs zzaqsVar) {
        zzaqu zze = zzaqv.zze();
        zze.zze(zzaqsVar.zzd().zzk());
        zze.zza(zzaqsVar.zzd().zzj());
        zze.zzb(zzaqsVar.zzd().zza());
        zze.zzd(zzaqsVar.zzd().zzd());
        zze.zzc(zzaqsVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzaqv) zze.zzal()).zzas().zzE());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i10, long j10) {
        zzflx zzflxVar = this.zze;
        if (zzflxVar != null) {
            zzflxVar.zza(i10, j10);
        }
    }

    private final void zzj(int i10, long j10, String str) {
        zzflx zzflxVar = this.zze;
        if (zzflxVar != null) {
            zzflxVar.zzb(i10, j10, str);
        }
    }

    private final zzaqv zzk(int i10) {
        String string;
        zzgkc zzb;
        if (i10 == 1) {
            string = this.zzc.getString(zzh(), null);
        } else {
            string = this.zzc.getString(zzg(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzgji zzv = zzgji.zzv(Hex.stringToBytes(string));
            if (this.zzf) {
                zzb = zzgkc.zza();
            } else {
                zzb = zzgkc.zzb();
            }
            return zzaqv.zzi(zzv, zzb);
        } catch (zzglc unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzaqs zzaqsVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfmk.zze(new File(zze(zzaqsVar.zzd().zzk()), "pcbc"), zzaqsVar.zze().zzE())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzaqsVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(zzaqs zzaqsVar, zzfmp zzfmpVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaqv zzk = zzk(1);
            String zzk2 = zzaqsVar.zzd().zzk();
            if (zzk != null && zzk.zzk().equals(zzk2)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zzk2);
            if (zze.exists()) {
                zzj(4023, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? "0" : "1") + ",f:" + (true != zze.isFile() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zzk2);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfmk.zze(file, zzaqsVar.zzf().zzE())) {
                zzi(4016, currentTimeMillis);
                return false;
            } else if (!zzfmk.zze(file2, zzaqsVar.zze().zzE())) {
                zzi(4017, currentTimeMillis);
                return false;
            } else if (zzfmpVar != null && !zzfmpVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfmk.zzd(zze2);
                return false;
            } else {
                String zzf = zzf(zzaqsVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                if (string != null) {
                    edit.putString(zzg(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzaqv zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzaqv zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfmk.zzd(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            }
        }
    }

    public final zzfmi zzc(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaqv zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfmi(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaqv zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            } else {
                zzi(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
