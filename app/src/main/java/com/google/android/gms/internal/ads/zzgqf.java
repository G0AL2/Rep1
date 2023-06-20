package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzgqf implements Iterator, Closeable, zzakp {
    private static final zzako zza = new zzgqe("eof ");
    private static final zzgqm zzb = zzgqm.zzb(zzgqf.class);
    protected zzakl zzc;
    protected zzgqg zzd;
    zzako zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzako zzakoVar = this.zze;
        if (zzakoVar == zza) {
            return false;
        }
        if (zzakoVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzako) this.zzh.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd */
    public final zzako next() {
        zzako zzb2;
        zzako zzakoVar = this.zze;
        if (zzakoVar != null && zzakoVar != zza) {
            this.zze = null;
            return zzakoVar;
        }
        zzgqg zzgqgVar = this.zzd;
        if (zzgqgVar != null && this.zzf < this.zzg) {
            try {
                synchronized (zzgqgVar) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.zze = zza;
        throw new NoSuchElementException();
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgql(this.zzh, this);
    }

    public final void zzf(zzgqg zzgqgVar, long j10, zzakl zzaklVar) throws IOException {
        this.zzd = zzgqgVar;
        this.zzf = zzgqgVar.zzb();
        zzgqgVar.zze(zzgqgVar.zzb() + j10);
        this.zzg = zzgqgVar.zzb();
        this.zzc = zzaklVar;
    }
}
