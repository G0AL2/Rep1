package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzanz implements zzany {
    protected static volatile zzapc zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    private double zzr;
    private double zzs;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzt = false;
    protected boolean zzp = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzanz(Context context) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcu)).booleanValue()) {
                zzamr.zzd();
            } else {
                zzapd.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzm(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanz.zzm(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzaot;

    protected abstract zzali zzb(Context context, View view, Activity activity);

    protected abstract zzali zzc(Context context, zzalb zzalbVar);

    protected abstract zzali zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context) {
        if (!zzapf.zzf()) {
            return zzm(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    protected abstract zzape zzi(MotionEvent motionEvent) throws zzaot;

    @Override // com.google.android.gms.internal.ads.zzany
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l10;
        if (this.zzt) {
            zzj();
            this.zzt = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzr = motionEvent.getRawX();
            this.zzs = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d10 = rawX - this.zzr;
            double d11 = rawY - this.zzs;
            this.zzk += Math.sqrt((d10 * d10) + (d11 * d11));
            this.zzr = rawX;
            this.zzs = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzape zzi = zzi(motionEvent);
                    Long l11 = zzi.zzd;
                    if (l11 != null && zzi.zzg != null) {
                        this.zzi += l11.longValue() + zzi.zzg.longValue();
                    }
                    if (this.zzq != null && (l10 = zzi.zze) != null && zzi.zzh != null) {
                        this.zzj += l10.longValue() + zzi.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzaot unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final synchronized void zzl(int i10, int i11, int i12) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbZ)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f10 = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public void zzn(View view) {
    }
}
