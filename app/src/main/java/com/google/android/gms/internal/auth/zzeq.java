package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeo;
import com.google.android.gms.internal.auth.zzeq;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public abstract class zzeq<MessageType extends zzeq<MessageType, BuilderType>, BuilderType extends zzeo<MessageType, BuilderType>> extends zzdm<MessageType, BuilderType> {
    private static final Map<Object, zzeq<?, ?>> zzb = new ConcurrentHashMap();
    protected zzgq zzc = zzgq.zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzeq> T zza(Class<T> cls) {
        Map<Object, zzeq<?, ?>> map = zzb;
        zzeq<?, ?> zzeqVar = map.get(cls);
        if (zzeqVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeqVar = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzeqVar == null) {
            zzeqVar = (zzeq) ((zzeq) zzgz.zze(cls)).zzj(6, null, null);
            if (zzeqVar != null) {
                map.put(cls, zzeqVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzeqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzeq<T, ?>> T zzb(T t10, byte[] bArr) throws zzew {
        boolean z10 = false;
        T t11 = (T) zzc(t10, bArr, 0, bArr.length, zzeg.zza());
        if (t11 != null) {
            byte byteValue = ((Byte) t11.zzj(1, null, null)).byteValue();
            if (byteValue == 1) {
                z10 = true;
            } else if (byteValue != 0) {
                z10 = zzfy.zza().zzb(t11.getClass()).zzi(t11);
                t11.zzj(2, true != z10 ? null : t11, null);
            }
            if (!z10) {
                zzew zzewVar = new zzew(new zzgo(t11).getMessage());
                zzewVar.zze(t11);
                throw zzewVar;
            }
        }
        return t11;
    }

    static <T extends zzeq<T, ?>> T zzc(T t10, byte[] bArr, int i10, int i11, zzeg zzegVar) throws zzew {
        T t11 = (T) t10.zzj(4, null, null);
        try {
            zzgb zzb2 = zzfy.zza().zzb(t11.getClass());
            zzb2.zzg(t11, bArr, 0, i11, new zzdp(zzegVar));
            zzb2.zze(t11);
            if (t11.zza == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (zzew e10) {
            e10.zze(t11);
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzew) {
                throw ((zzew) e11.getCause());
            }
            zzew zzewVar = new zzew(e11);
            zzewVar.zze(t11);
            throw zzewVar;
        } catch (IndexOutOfBoundsException unused) {
            zzew zzf = zzew.zzf();
            zzf.zze(t11);
            throw zzf;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzeu<E> zzd() {
        return zzfz.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzf(Method method, Object obj, Object... objArr) {
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
    public static Object zzg(zzfq zzfqVar, String str, Object[] objArr) {
        return new zzga(zzfqVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzeq> void zzi(Class<T> cls, T t10) {
        zzb.put(cls, t10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfy.zza().zzb(getClass()).zzh(this, (zzeq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zza = zzfy.zza().zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfs.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.zzfq
    public final /* bridge */ /* synthetic */ zzfp zze() {
        zzeo zzeoVar = (zzeo) zzj(5, null, null);
        zzeoVar.zze(this);
        return zzeoVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfr
    public final /* bridge */ /* synthetic */ zzfq zzh() {
        return (zzeq) zzj(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzj(int i10, Object obj, Object obj2);
}
