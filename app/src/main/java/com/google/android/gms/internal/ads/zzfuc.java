package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfuc extends zzfuh {
    private static final Logger zza = Logger.getLogger(zzfuc.class.getName());
    private zzfre zzb;
    private final boolean zzc;
    private final boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuc(zzfre zzfreVar, boolean z10, boolean z11) {
        super(zzfreVar.size());
        this.zzb = zzfreVar;
        this.zzc = z10;
        this.zze = z11;
    }

    private final void zzG(int i10, Future future) {
        try {
            zzg(i10, zzfvc.zzp(future));
        } catch (Error e10) {
            e = e10;
            zzI(e);
        } catch (RuntimeException e11) {
            e = e11;
            zzI(e);
        } catch (ExecutionException e12) {
            zzI(e12.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzy(zzfre zzfreVar) {
        int zzB = zzB();
        int i10 = 0;
        zzfou.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfreVar != null) {
                zzfti it = zzfreVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            zzF();
            zzv();
            zzz(2);
        }
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zze(th) && zzK(zzE(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzftt
    public final String zza() {
        zzfre zzfreVar = this.zzb;
        if (zzfreVar != null) {
            zzfreVar.toString();
            return "futures=".concat(zzfreVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    protected final void zzb() {
        zzfre zzfreVar = this.zzb;
        zzz(1);
        if ((zzfreVar != null) && isCancelled()) {
            boolean zzu = zzu();
            zzfti it = zzfreVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzu);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    final void zzf(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable zzp = zzp();
        zzp.getClass();
        zzK(set, zzp);
    }

    abstract void zzg(int i10, Object obj);

    abstract void zzv();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzw() {
        zzfre zzfreVar = this.zzb;
        zzfreVar.getClass();
        if (zzfreVar.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzfti it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final zzfvl zzfvlVar = (zzfvl) it.next();
                zzfvlVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfua
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfuc.this.zzx(zzfvlVar, i10);
                    }
                }, zzfuq.INSTANCE);
                i10++;
            }
        } else {
            final zzfre zzfreVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfub
                @Override // java.lang.Runnable
                public final void run() {
                    zzfuc.this.zzy(zzfreVar2);
                }
            };
            zzfti it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                ((zzfvl) it2.next()).zzc(runnable, zzfuq.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(zzfvl zzfvlVar, int i10) {
        try {
            if (zzfvlVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, zzfvlVar);
            }
        } finally {
            zzy(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzz(int i10) {
        this.zzb = null;
    }
}
