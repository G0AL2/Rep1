package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzet {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzes zzd;

    public zzet(zzes zzesVar) {
        this.zzd = zzesVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (zzlp.zzal(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String zza(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zzb((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(valueOf);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzb(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(zze(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zza(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzc(zzav zzavVar) {
        String zzb2;
        if (!this.zzd.zza()) {
            return zzavVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzavVar.zzc);
        sb2.append(",name=");
        sb2.append(zzd(zzavVar.zza));
        sb2.append(",params=");
        zzat zzatVar = zzavVar.zzb;
        if (zzatVar == null) {
            zzb2 = null;
        } else if (!this.zzd.zza()) {
            zzb2 = zzatVar.toString();
        } else {
            zzb2 = zzb(zzatVar.zzc());
        }
        sb2.append(zzb2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhf.zzc, zzhf.zza, zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhg.zzb, zzhg.zza, zzb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return zzg(str, zzhh.zzb, zzhh.zza, zzc);
        }
        return str;
    }
}
