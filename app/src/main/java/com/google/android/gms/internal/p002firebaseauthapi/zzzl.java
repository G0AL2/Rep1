package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import com.google.android.gms.internal.p002firebaseauthapi.zzzl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzl  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzzl<MessageType extends zzzl<MessageType, BuilderType>, BuilderType extends zzzh<MessageType, BuilderType>> extends zzxs<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzabu zzc = zzabu.zzc();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzC(Method method, Object obj, Object... objArr) {
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
    public static Object zzD(zzaaq zzaaqVar, String str, Object[] objArr) {
        return new zzaba(zzaaqVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzE(Class cls, zzzl zzzlVar) {
        zzb.put(cls, zzzlVar);
    }

    private static zzzl zza(zzzl zzzlVar) throws zzzt {
        if (zzzlVar == null || zzzlVar.zzG()) {
            return zzzlVar;
        }
        zzzt zza = new zzabs(zzzlVar).zza();
        zza.zzh(zzzlVar);
        throw zza;
    }

    private static zzzl zzb(zzzl zzzlVar, byte[] bArr, int i10, int i11, zzyy zzyyVar) throws zzzt {
        zzzl zzzlVar2 = (zzzl) zzzlVar.zzj(4, null, null);
        try {
            zzabc zzb2 = zzaay.zza().zzb(zzzlVar2.getClass());
            zzb2.zzi(zzzlVar2, bArr, 0, i11, new zzxv(zzyyVar));
            zzb2.zzf(zzzlVar2);
            if (zzzlVar2.zza == 0) {
                return zzzlVar2;
            }
            throw new RuntimeException();
        } catch (zzabs e10) {
            zzzt zza = e10.zza();
            zza.zzh(zzzlVar2);
            throw zza;
        } catch (zzzt e11) {
            e11.zzh(zzzlVar2);
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzzt) {
                throw ((zzzt) e12.getCause());
            }
            zzzt zzztVar = new zzzt(e12);
            zzztVar.zzh(zzzlVar2);
            throw zzztVar;
        } catch (IndexOutOfBoundsException unused) {
            zzzt zzi = zzzt.zzi();
            zzi.zzh(zzzlVar2);
            throw zzi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzl zzv(Class cls) {
        Map map = zzb;
        zzzl zzzlVar = (zzzl) map.get(cls);
        if (zzzlVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzzlVar = (zzzl) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzzlVar == null) {
            zzzlVar = (zzzl) ((zzzl) zzacd.zze(cls)).zzj(6, null, null);
            if (zzzlVar != null) {
                map.put(cls, zzzlVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzzlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzzl zzw(zzzl zzzlVar, zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        zzym zzh = zzyiVar.zzh();
        zzzl zzzlVar2 = (zzzl) zzzlVar.zzj(4, null, null);
        try {
            zzabc zzb2 = zzaay.zza().zzb(zzzlVar2.getClass());
            zzb2.zzh(zzzlVar2, zzyn.zzq(zzh), zzyyVar);
            zzb2.zzf(zzzlVar2);
            try {
                zzh.zzm(0);
                zza(zzzlVar2);
                return zzzlVar2;
            } catch (zzzt e10) {
                e10.zzh(zzzlVar2);
                throw e10;
            }
        } catch (zzabs e11) {
            zzzt zza = e11.zza();
            zza.zzh(zzzlVar2);
            throw zza;
        } catch (zzzt e12) {
            e12.zzh(zzzlVar2);
            throw e12;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzzt) {
                throw ((zzzt) e13.getCause());
            }
            zzzt zzztVar = new zzzt(e13);
            zzztVar.zzh(zzzlVar2);
            throw zzztVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzzt) {
                throw ((zzzt) e14.getCause());
            }
            throw e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzzl zzx(zzzl zzzlVar, byte[] bArr, zzyy zzyyVar) throws zzzt {
        zzzl zzb2 = zzb(zzzlVar, bArr, 0, bArr.length, zzyyVar);
        zza(zzb2);
        return zzb2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzzq zzy() {
        return zzaaz.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzzq zzz(zzzq zzzqVar) {
        int size = zzzqVar.size();
        return zzzqVar.zzd(size == 0 ? 10 : size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaay.zza().zzb(getClass()).zzj(this, (zzzl) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzb2 = zzaay.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzaas.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final /* synthetic */ zzaap zzA() {
        return (zzzh) zzj(5, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final /* synthetic */ zzaap zzB() {
        zzzh zzzhVar = (zzzh) zzj(5, null, null);
        zzzhVar.zzj(this);
        return zzzhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final void zzF(zzyt zzytVar) throws IOException {
        zzaay.zza().zzb(getClass()).zzn(this, zzyu.zza(zzytVar));
    }

    public final boolean zzG() {
        byte byteValue = ((Byte) zzj(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzaay.zza().zzb(getClass()).zzk(this);
        zzj(2, true != zzk ? null : this, null);
        return zzk;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaar
    public final /* synthetic */ zzaaq zzH() {
        return (zzzl) zzj(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzj(int i10, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxs
    public final int zzn() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxs
    public final void zzp(int i10) {
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaaq
    public final int zzs() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int zza = zzaay.zza().zzb(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzzh zzt() {
        return (zzzh) zzj(5, null, null);
    }

    public final zzzh zzu() {
        zzzh zzzhVar = (zzzh) zzj(5, null, null);
        zzzhVar.zzj(this);
        return zzzhVar;
    }
}
