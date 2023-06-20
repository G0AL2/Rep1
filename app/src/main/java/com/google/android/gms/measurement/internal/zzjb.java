package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjb extends zzf {
    @VisibleForTesting
    protected zziu zza;
    private volatile zziu zzb;
    private volatile zziu zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zziu zzg;
    private zziu zzh;
    private boolean zzi;
    private final Object zzj;
    private zziu zzk;
    private String zzl;

    public zzjb(zzgi zzgiVar) {
        super(zzgiVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(Activity activity, zziu zziuVar, boolean z10) {
        zziu zziuVar2;
        zziu zziuVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zziuVar.zzb == null) {
            zziuVar2 = new zziu(zziuVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zziuVar.zzc, zziuVar.zze, zziuVar.zzf);
        } else {
            zziuVar2 = zziuVar;
        }
        this.zzc = this.zzb;
        this.zzb = zziuVar2;
        this.zzs.zzaA().zzp(new zziw(this, zziuVar2, zziuVar3, this.zzs.zzaw().elapsedRealtime(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zziu zziuVar, zziu zziuVar2, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        long j12;
        zzg();
        boolean z11 = false;
        boolean z12 = (zziuVar2 != null && zziuVar2.zzc == zziuVar.zzc && zzlp.zzal(zziuVar2.zzb, zziuVar.zzb) && zzlp.zzal(zziuVar2.zza, zziuVar.zza)) ? false : true;
        if (z10 && this.zza != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            zzlp.zzK(zziuVar, bundle3, true);
            if (zziuVar2 != null) {
                String str = zziuVar2.zza;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = zziuVar2.zzb;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", zziuVar2.zzc);
            }
            if (z11) {
                zzkp zzkpVar = this.zzs.zzu().zzb;
                long j13 = j10 - zzkpVar.zzb;
                zzkpVar.zzb = j10;
                if (j13 > 0) {
                    this.zzs.zzv().zzI(bundle3, j13);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != zziuVar.zze ? "auto" : "app";
            long currentTimeMillis = this.zzs.zzaw().currentTimeMillis();
            if (zziuVar.zze) {
                j11 = currentTimeMillis;
                long j14 = zziuVar.zzf;
                if (j14 != 0) {
                    j12 = j14;
                    this.zzs.zzq().zzI(str3, "_vs", j12, bundle3);
                }
            } else {
                j11 = currentTimeMillis;
            }
            j12 = j11;
            this.zzs.zzq().zzI(str3, "_vs", j12, bundle3);
        }
        if (z11) {
            zzC(this.zza, true, j10);
        }
        this.zza = zziuVar;
        if (zziuVar.zze) {
            this.zzh = zziuVar;
        }
        this.zzs.zzt().zzG(zziuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzC(zziu zziuVar, boolean z10, long j10) {
        this.zzs.zzd().zzf(this.zzs.zzaw().elapsedRealtime());
        if (!this.zzs.zzu().zzb.zzd(zziuVar != null && zziuVar.zzd, z10, j10) || zziuVar == null) {
            return;
        }
        zziuVar.zzd = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzp(zzjb zzjbVar, Bundle bundle, zziu zziuVar, zziu zziuVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzjbVar.zzB(zziuVar, zziuVar2, j10, true, zzjbVar.zzs.zzv().zzy(null, "screen_view", bundle, null, false));
    }

    private final zziu zzz(Activity activity) {
        Preconditions.checkNotNull(activity);
        zziu zziuVar = (zziu) this.zzd.get(activity);
        if (zziuVar == null) {
            zziu zziuVar2 = new zziu(null, zzl(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.zzd.put(activity, zziuVar2);
            zziuVar = zziuVar2;
        }
        return this.zzg != null ? this.zzg : zziuVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final zziu zzi() {
        return this.zzb;
    }

    public final zziu zzj(boolean z10) {
        zza();
        zzg();
        if (z10) {
            zziu zziuVar = this.zza;
            return zziuVar != null ? zziuVar : this.zzh;
        }
        return this.zza;
    }

    @VisibleForTesting
    final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 > 100) {
            this.zzs.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zziu(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzs.zzaw().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.zzb = null;
            this.zzs.zzaA().zzp(new zziy(this, elapsedRealtime));
            return;
        }
        zziu zzz = zzz(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzs.zzaA().zzp(new zziz(this, zzz, elapsedRealtime));
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.zzg = null;
                    this.zzs.zzaA().zzp(new zzja(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzs.zzaA().zzp(new zzix(this));
            return;
        }
        zzA(activity, zzz(activity), false);
        zzd zzd = this.zzs.zzd();
        zzd.zzs.zzaA().zzp(new zzc(zzd, zzd.zzs.zzaw().elapsedRealtime()));
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zziu zziuVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zziuVar = (zziu) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zziuVar.zzc);
        bundle2.putString("name", zziuVar.zza);
        bundle2.putString("referrer_name", zziuVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzw(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            boolean r0 = r0.zzu()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.zza(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.zziu r0 = r3.zzb
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.zza(r5)
            return
        L30:
            java.util.Map r1 = r3.zzd
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.zza(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.zzl(r6, r1)
        L54:
            java.lang.String r1 = r0.zzb
            boolean r1 = com.google.android.gms.measurement.internal.zzlp.zzal(r1, r6)
            java.lang.String r0 = r0.zza
            boolean r0 = com.google.android.gms.measurement.internal.zzlp.zzal(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.zza(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.zzgi r1 = r3.zzs
            r1.zzf()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzl()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.zzgi r1 = r3.zzs
            r1.zzf()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzl()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzj()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.zzc(r2, r1, r6)
            com.google.android.gms.measurement.internal.zziu r0 = new com.google.android.gms.measurement.internal.zziu
            com.google.android.gms.measurement.internal.zzgi r1 = r3.zzs
            com.google.android.gms.measurement.internal.zzlp r1 = r1.zzv()
            long r1 = r1.zzq()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.zzd
            r5.put(r4, r0)
            r5 = 1
            r3.zzA(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjb.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjb.zzx(android.os.Bundle, long):void");
    }

    public final void zzy(String str, zziu zziuVar) {
        zzg();
        synchronized (this) {
            String str2 = this.zzl;
            if (str2 == null || str2.equals(str) || zziuVar != null) {
                this.zzl = str;
                this.zzk = zziuVar;
            }
        }
    }
}
