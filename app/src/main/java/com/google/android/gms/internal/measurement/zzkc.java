package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkc;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public abstract class zzkc<MessageType extends zzkc<MessageType, BuilderType>, BuilderType extends zzjy<MessageType, BuilderType>> extends zzil<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzmm zzc = zzmm.zzc();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkc zzbC(Class cls) {
        Map map = zza;
        zzkc zzkcVar = (zzkc) map.get(cls);
        if (zzkcVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkcVar = (zzkc) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzkcVar == null) {
            zzkcVar = (zzkc) ((zzkc) zzmv.zze(cls)).zzl(6, null, null);
            if (zzkcVar != null) {
                map.put(cls, zzkcVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzkcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzkh zzbD() {
        return zzkd.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzki zzbE() {
        return zzky.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzki zzbF(zzki zzkiVar) {
        int size = zzkiVar.size();
        return zzkiVar.zze(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzkj zzbG() {
        return zzls.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzkj zzbH(zzkj zzkjVar) {
        int size = zzkjVar.size();
        return zzkjVar.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzbK(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzbL(zzlj zzljVar, String str, Object[] objArr) {
        return new zzlt(zzljVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzbM(Class cls, zzkc zzkcVar) {
        zza.put(cls, zzkcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlr.zza().zzb(getClass()).zzj(this, (zzkc) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int zzb = zzlr.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zzll.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzjy zzbA() {
        return (zzjy) zzl(5, null, null);
    }

    public final zzjy zzbB() {
        zzjy zzjyVar = (zzjy) zzl(5, null, null);
        zzjyVar.zzaC(this);
        return zzjyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final /* synthetic */ zzli zzbI() {
        return (zzjy) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final /* synthetic */ zzli zzbJ() {
        zzjy zzjyVar = (zzjy) zzl(5, null, null);
        zzjyVar.zzaC(this);
        return zzjyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zzbN(zzjj zzjjVar) throws IOException {
        zzlr.zza().zzb(getClass()).zzi(this, zzjk.zza(zzjjVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final /* synthetic */ zzlj zzbR() {
        return (zzkc) zzl(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzil
    public final int zzbu() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzbx(int i10) {
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zzbz() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int zza2 = zzlr.zza().zzb(getClass()).zza(this);
            this.zzd = zza2;
            return zza2;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzl(int i10, Object obj, Object obj2);
}
