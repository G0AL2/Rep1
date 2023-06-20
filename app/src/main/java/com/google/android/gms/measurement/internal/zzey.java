package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzey extends zzhc {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzew zzd;
    private final zzew zze;
    private final zzew zzf;
    private final zzew zzg;
    private final zzew zzh;
    private final zzew zzi;
    private final zzew zzj;
    private final zzew zzk;
    private final zzew zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzey(zzgi zzgiVar) {
        super(zzgiVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzew(this, 6, false, false);
        this.zze = new zzew(this, 6, true, false);
        this.zzf = new zzew(this, 6, false, true);
        this.zzg = new zzew(this, 5, false, false);
        this.zzh = new zzew(this, 5, true, false);
        this.zzi = new zzew(this, 5, false, true);
        this.zzj = new zzew(this, 4, false, false);
        this.zzk = new zzew(this, 3, false, false);
        this.zzl = new zzew(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzex(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzo(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zzp = zzp(z10, obj);
        String zzp2 = zzp(z10, obj2);
        String zzp3 = zzp(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb2.append(str2);
            sb2.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb2.append(str3);
            sb2.append(zzp3);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    static String zzp(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            String str2 = obj.toString().charAt(0) == '-' ? Constants.FILENAME_SEQUENCE_SEPARATOR : "";
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            return str2 + round + "..." + str2 + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
                String zzy = zzy(zzgi.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzy(className).equals(zzy)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb2.toString();
            } else if (!(obj instanceof zzex)) {
                return z10 ? Constants.FILENAME_SEQUENCE_SEPARATOR : obj.toString();
            } else {
                str = ((zzex) obj).zza;
                return str;
            }
        }
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final zzew zzc() {
        return this.zzk;
    }

    public final zzew zzd() {
        return this.zzd;
    }

    public final zzew zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzhc
    protected final boolean zzf() {
        return false;
    }

    public final zzew zzh() {
        return this.zze;
    }

    public final zzew zzi() {
        return this.zzj;
    }

    public final zzew zzj() {
        return this.zzl;
    }

    public final zzew zzk() {
        return this.zzg;
    }

    public final zzew zzl() {
        return this.zzi;
    }

    public final zzew zzm() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzs.zzy() != null) {
                    this.zzc = this.zzs.zzy();
                } else {
                    this.zzc = this.zzs.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzt(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(zzq(), i10)) {
            Log.println(i10, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzgf zzo = this.zzs.zzo();
        if (zzo == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else if (!zzo.zzx()) {
            Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
        } else {
            zzo.zzp(new zzev(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
        }
    }
}
