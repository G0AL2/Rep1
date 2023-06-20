package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzchi {
    @VisibleForTesting
    protected static final AtomicInteger zza = new AtomicInteger(0);
    @VisibleForTesting
    protected static final AtomicInteger zzb = new AtomicInteger(0);

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract void zzC(Uri[] uriArr, String str);

    public abstract void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void zzE();

    public abstract void zzF(long j10);

    public abstract void zzG(int i10);

    public abstract void zzH(int i10);

    public abstract void zzI(zzchh zzchhVar);

    public abstract void zzJ(int i10);

    public abstract void zzK(int i10);

    public abstract void zzL(boolean z10);

    public abstract void zzM(boolean z10);

    public abstract void zzN(int i10);

    public abstract void zzO(Surface surface, boolean z10) throws IOException;

    public abstract void zzP(float f10, boolean z10) throws IOException;

    public abstract void zzQ();

    public abstract boolean zzR();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
