package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzaoa extends zzanz {
    protected static final Object zzr = new Object();
    static boolean zzs = false;
    private static final String zzw = "zzaoa";
    private static long zzx;
    private static zzaog zzy;
    private static zzapl zzz;
    private final Map zzA;
    protected boolean zzt;
    protected final String zzu;
    zzapj zzv;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaoa(Context context, String str, boolean z10) {
        super(context);
        this.zzt = false;
        this.zzA = new HashMap();
        this.zzu = str;
        this.zzt = z10;
    }

    protected static zzapc zzj(Context context, boolean z10) {
        if (zzanz.zza == null) {
            synchronized (zzr) {
                if (zzanz.zza == null) {
                    zzapc zzg = zzapc.zzg(context, "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", z10);
                    if (zzg.zzr()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcs)).booleanValue()) {
                                zzg.zzt("B6686OwUhvg9sC2Ywr/ef2K7k4+w2mnrIbLdBdrqQ7su4WMxR3/prcgS0L+6eNyY", "1l/ngTeh7Ob+HSjt2mKdxpX2SEfG+yjkE9qsfrYWj1c=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        zzg.zzt("Za6LxNnVxz2lEtZQYrJ2QLB5PwaCpmcdWBAdgk+Rc+b6fjcW8QKpJ7ITar8M3xU9", "2mbuydE9pw99Ld1EHQbedo6oUJcW1o/QWNiH9X+lcIw=", Context.class);
                        zzg.zzt("jP+6II/RqbFgO1yXDlTKTZh3PSPs7B8S68QmevSn/bVP2NzeS5BO3umQKUdsHS/c", "GLyIO6R2q01pjCn0D3/H49YHLEvqvbC5vDeJpi09sqQ=", Context.class);
                        zzg.zzt("EQnlrBUlHjk2AEt0zmKDh6D/4LKq1nD5m8E6B+NGkhfc83YRi+bdMQpWJDofZ7UC", "vT7QqRHPYW89dMOJkMQAS7XgxAAvbeOb6ybNiPRYWg8=", Context.class);
                        zzg.zzt("zzBoiLmCSl4qpONTaYkbu2H1+be7dFpyqhOnbG674OZpERvkqiVrsp9nWT5kU4lr", "4H+WN9tI0y+WKEjRpYWQhzjGaRdS7qtgrPx+7wzXofs=", Context.class);
                        zzg.zzt("GsNdMg7ydPRZME6lhbr2mgr/qEeHLJHBW4TYBUuwzuP8n8dRXlAExueisFv9fzjL", "wuFo2c62LxPcBxajXZblz51/QLk1c9RXgln2kF6l+tg=", Context.class);
                        Class cls = Boolean.TYPE;
                        zzg.zzt("BRgqZ9Vg4IM5miPoGPKIX+tShrXoisnhV1cWTsEoWNSALbfoi2OgJtSBw3h9+Bqo", "SAUyhp29xMzgJ0ZztJOiGInn+oDyrZ4+r7quECKL/6s=", Context.class, cls);
                        zzg.zzt("tGUqnRBT0Z8VLsYZLT0IoD5T4HRaaLpJNvmxlM5fu89BQ2YOdHgaf4qUlK58s24H", "LZbLZn8XvuN809srP2sgyvIe+LVffcIatfOggVsL/5c=", Context.class);
                        zzg.zzt("HKJ68+GFVOzzlXIErXZFscWEuic4IS+F1/JC4SL0ZBjl5Wpepiw6AwYzzVdq4ZK/", "QnEQ5Lj6VZj+ZyIvg9+5D3/xHwfXHkc5MHdc8LLlnMs=", Context.class);
                        zzg.zzt("dsH99Z2rkUKkIdFxul1Y0+14Lw9GA4hWLh0RcEKja+lMBEoQnGZF5kVhq/ImGdeP", "QB5q1SF7dU7PAKl1Qfw/e+quDFkRrjwkZl4xOfEvluE=", MotionEvent.class, DisplayMetrics.class);
                        zzg.zzt("WUfVTOsJHOND4XgPghL23YwTgyX5VPyE24WQrLHqNZz9nfhclwI4H/j9q0Mn+psv", "2GY9xtlRxNZciAIhICoIbv+iSeAm7ZM43xRzSyyZ7zc=", MotionEvent.class, DisplayMetrics.class);
                        zzg.zzt("FmiCZESJMiUiPEVFp8/sySGg9zk5i1lJsy88E60+KsD4lJB1UVftaJnD830H1Cnc", "B8qnIZWGEs7xms3SbQDilR0QM+SibSnQfZbTzlo06bE=", new Class[0]);
                        zzg.zzt("oSBV0gkM1yTotHLC+K1O/2QESKvM1OzdR7LLRpJm660IC9CZK+wk8pHl5h8TdV48", "A3Rh/mKF+88qDRUgTtU47eZJOyPh9v2tsYzP/5oF+dA=", new Class[0]);
                        zzg.zzt("DNoIUzNgQ+tGaWufI617pdeOeFxPy3ypVgJRNb/REDqvDPWkZ+hwt80uPBr78PA1", "keEhYPq98yaHF5Dzpggt8ckKDSAXe9vFpWufiQ8oXDY=", new Class[0]);
                        zzg.zzt("NuaVE443qhtP6/N+u8tA8HilHNLFyQFq7pn4MjW5OGwcdLTSMQ1k8XjYehsxVeon", "z5NXQuc0uiNSVbndYdMaUlJv3uv2TfesAU8D9T9pl4E=", new Class[0]);
                        zzg.zzt("zo8V8X8kshYkxeE23t3OyXdoh3FPhn0ETnxP8vKAUZieFhalf6x5LNoDw8Q1oLRS", "Hf8oHWnCgsj7Y9XZDlAl+qeEGkjuhCtSnXpSHq9fewc=", new Class[0]);
                        zzg.zzt("J3h/yn9IydN0jKZWyOmBNA2CGG4oT7iCghUPqzDf4kG+cww4wp/vL8nWOQWDaiv6", "+oHygsI2eAotNvI8PLMFrbhe03kQ9oSi83I/J9IxJZk=", new Class[0]);
                        zzg.zzt("8zPzMumx8VK4Q4ZZMffWEJsAX0/i9gohXVA/VhPpWBNlLRmzgRsEh/j6Aaymt8Wu", "GsEHhtmZy7+TitdN6KLdSnSR7WpVlkZahwBwH9Jv1wQ=", Context.class, cls, String.class);
                        zzg.zzt("aZvf8nokSQAvHIIdmzwu8civ2+qb07zM1ZEz6qZf1UzLfoKt8BndVgmiOXFGATXV", "1Q5N5QhnMtop76rkewUHBq0dfu+Fpixkwg9xHoBYaMc=", StackTraceElement[].class);
                        zzg.zzt("f7Ni+qJ74MqRBDIn5zt+Qvnt6llN8c82PMULXlCAep3wzIprbOB6YjqpQItX7QwB", "MVJdjUEx+rB88W0UPnVsndOuLU6aovPyFF5b36lJGoA=", View.class, DisplayMetrics.class, cls, cls);
                        zzg.zzt("1fofpOOYcFfS5YFFd3ctXz8Mp5NAKFN2TSgOzUMkaRdV9dKus3ViOY+jtkwxi6r2", "5dATknTk87foLpzL0Dq3Gho5ELQoI7cNb0jy2DaFKNg=", Context.class, cls);
                        zzg.zzt("bJ19ecmml/ZL+PAjNo6P4un4UIg2zol83OavxH1sy4lr9vgJAAspRAybhuIko55U", "vAwaartPSmuJV+jFjOXlfyM3UPFY8tl7jDP13kq4YYw=", View.class, Activity.class, cls);
                        zzg.zzt("03Rb8b+VDPWNz2ZsdwvaSzyRMvfwK65RukwsWnYSmw87NOTFb26HoizUZBquofyN", "4NlIZpWANWCeruMUGSc5tEkf3o6K0hyRt+/1nSu0QU8=", Long.TYPE);
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcx)).booleanValue()) {
                                zzg.zzt("sQRnRw5AtmLjG4zPuRRzbU9KCNWkvhkIESw7dU0UKjciZOTbDwuGbxSLRs8Rwqdx", "QTFg2pa0CDlg9dgYpioKGLNjWwgLSvJpA082RZAjjog=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        zzg.zzt("bldCWkVDnh6c0tW17EB2ImW8Helv6jy9hD1h4hlV/96dlwBa7zb3YoFOuZ30CDAy", "8jULXqwjN4p3qVyOWkn9K2tUG5k4XuLNgEq0xlRqu/g=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcz)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    zzg.zzt("XdACBmHPjNtNHtvuxJIzO5INAuD0sY2N7kIXkPlZf2/7KHZWQ+7Wr4DDubVydJNF", "y+g//F0lHk9VQdkf/Jc605unsex1+WIt3b6Nn2DqnLo=", NetworkCapabilities.class, cls2, cls2);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcg)).booleanValue()) {
                                zzg.zzt("e6wNdaLD6UNhzFmw+sulW0Dd6tS/ZIj4VP2rchYxgmyyl8SG0R852+ZvHvO065lU", "4WajQiAzbn6P/4aXItZyiVPs318La/hzY2eQhgLxpjo=", long[].class, Context.class, View.class);
                            }
                        } catch (IllegalStateException unused4) {
                        }
                    }
                    zzanz.zza = zzg;
                }
            }
        }
        return zzanz.zza;
    }

    static zzape zzm(zzapc zzapcVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzaot {
        Method zzj = zzapcVar.zzj("dsH99Z2rkUKkIdFxul1Y0+14Lw9GA4hWLh0RcEKja+lMBEoQnGZF5kVhq/ImGdeP", "QB5q1SF7dU7PAKl1Qfw/e+quDFkRrjwkZl4xOfEvluE=");
        if (zzj != null && motionEvent != null) {
            try {
                return new zzape((String) zzj.invoke(null, motionEvent, displayMetrics));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new zzaot(e10);
            }
        }
        throw new zzaot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized void zzq(Context context, boolean z10) {
        synchronized (zzaoa.class) {
            if (zzs) {
                return;
            }
            zzx = System.currentTimeMillis() / 1000;
            zzanz.zza = zzj(context, z10);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcz)).booleanValue()) {
                zzy = zzaog.zzc(context);
            }
            ExecutorService zzk = zzanz.zza.zzk();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcA)).booleanValue() && zzk != null) {
                zzz = zzapl.zzd(context, zzk);
            }
            zzs = true;
        }
    }

    protected static final void zzr(List list) {
        ExecutorService zzk;
        if (zzanz.zza == null || (zzk = zzanz.zza.zzk()) == null || list.isEmpty()) {
            return;
        }
        try {
            zzk.invokeAll(list, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcc)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Log.d(zzw, String.format("class methods got exception: %s", zzapf.zze(e10)));
        }
    }

    private final synchronized void zzs(zzapc zzapcVar, zzali zzaliVar) {
        MotionEvent motionEvent;
        try {
            zzape zzm = zzm(zzapcVar, this.zzb, this.zzq);
            Long l10 = zzm.zza;
            if (l10 != null) {
                zzaliVar.zzM(l10.longValue());
            }
            Long l11 = zzm.zzb;
            if (l11 != null) {
                zzaliVar.zzN(l11.longValue());
            }
            Long l12 = zzm.zzc;
            if (l12 != null) {
                zzaliVar.zzK(l12.longValue());
            }
            if (this.zzp) {
                Long l13 = zzm.zzd;
                if (l13 != null) {
                    zzaliVar.zzJ(l13.longValue());
                }
                Long l14 = zzm.zze;
                if (l14 != null) {
                    zzaliVar.zzG(l14.longValue());
                }
            }
        } catch (zzaot unused) {
        }
        zzalu zza = zzalv.zza();
        if (this.zzd > 0 && zzapf.zzh(this.zzq)) {
            zza.zzd(zzapf.zza(this.zzk, 1, this.zzq));
            zza.zzq(zzapf.zza(this.zzn - this.zzl, 1, this.zzq));
            zza.zzr(zzapf.zza(this.zzo - this.zzm, 1, this.zzq));
            zza.zzj(zzapf.zza(this.zzl, 1, this.zzq));
            zza.zzl(zzapf.zza(this.zzm, 1, this.zzq));
            if (this.zzp && (motionEvent = this.zzb) != null) {
                long zza2 = zzapf.zza(((this.zzl - this.zzn) + motionEvent.getRawX()) - this.zzb.getX(), 1, this.zzq);
                if (zza2 != 0) {
                    zza.zzo(zza2);
                }
                long zza3 = zzapf.zza(((this.zzm - this.zzo) + this.zzb.getRawY()) - this.zzb.getY(), 1, this.zzq);
                if (zza3 != 0) {
                    zza.zzp(zza3);
                }
            }
        }
        try {
            zzape zzi = zzi(this.zzb);
            Long l15 = zzi.zza;
            if (l15 != null) {
                zza.zzk(l15.longValue());
            }
            Long l16 = zzi.zzb;
            if (l16 != null) {
                zza.zzm(l16.longValue());
            }
            zza.zzi(zzi.zzc.longValue());
            if (this.zzp) {
                Long l17 = zzi.zze;
                if (l17 != null) {
                    zza.zzg(l17.longValue());
                }
                Long l18 = zzi.zzd;
                if (l18 != null) {
                    zza.zzh(l18.longValue());
                }
                Long l19 = zzi.zzf;
                if (l19 != null) {
                    zza.zzt(l19.longValue() != 0 ? 2 : 1);
                }
                if (this.zze > 0) {
                    Long valueOf = zzapf.zzh(this.zzq) ? Long.valueOf(Math.round(this.zzj / this.zze)) : null;
                    if (valueOf != null) {
                        zza.zzb(valueOf.longValue());
                    } else {
                        zza.zza();
                    }
                    zza.zzc(Math.round(this.zzi / this.zze));
                }
                Long l20 = zzi.zzi;
                if (l20 != null) {
                    zza.zze(l20.longValue());
                }
                Long l21 = zzi.zzj;
                if (l21 != null) {
                    zza.zzn(l21.longValue());
                }
                Long l22 = zzi.zzk;
                if (l22 != null) {
                    zza.zzs(l22.longValue() != 0 ? 2 : 1);
                }
            }
        } catch (zzaot unused2) {
        }
        long j10 = this.zzh;
        if (j10 > 0) {
            zza.zzf(j10);
        }
        zzaliVar.zzQ((zzalv) zza.zzal());
        long j11 = this.zzd;
        if (j11 > 0) {
            zzaliVar.zzH(j11);
        }
        long j12 = this.zze;
        if (j12 > 0) {
            zzaliVar.zzI(j12);
        }
        long j13 = this.zzf;
        if (j13 > 0) {
            zzaliVar.zzL(j13);
        }
        long j14 = this.zzg;
        if (j14 > 0) {
            zzaliVar.zzF(j14);
        }
        try {
            int size = this.zzc.size() - 1;
            if (size > 0) {
                zzaliVar.zzb();
                for (int i10 = 0; i10 < size; i10++) {
                    zzape zzm2 = zzm(zzanz.zza, (MotionEvent) this.zzc.get(i10), this.zzq);
                    zzalu zza4 = zzalv.zza();
                    zza4.zzk(zzm2.zza.longValue());
                    zza4.zzm(zzm2.zzb.longValue());
                    zzaliVar.zza((zzalv) zza4.zzal());
                }
            }
        } catch (zzaot unused3) {
            zzaliVar.zzb();
        }
    }

    private static final void zzt() {
        zzapl zzaplVar = zzz;
        if (zzaplVar != null) {
            zzaplVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    protected final long zza(StackTraceElement[] stackTraceElementArr) throws zzaot {
        Method zzj = zzanz.zza.zzj("aZvf8nokSQAvHIIdmzwu8civ2+qb07zM1ZEz6qZf1UzLfoKt8BndVgmiOXFGATXV", "1Q5N5QhnMtop76rkewUHBq0dfu+Fpixkwg9xHoBYaMc=");
        if (zzj != null && stackTraceElementArr != null) {
            try {
                return new zzaou((String) zzj.invoke(null, stackTraceElementArr)).zza.longValue();
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new zzaot(e10);
            }
        }
        throw new zzaot();
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    protected final zzali zzb(Context context, View view, Activity activity) {
        zzt();
        zzali zza = zzaly.zza();
        if (!TextUtils.isEmpty(this.zzu)) {
            zza.zzg(this.zzu);
        }
        zzp(zzj(context, this.zzt), zza, view, activity, true);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    protected final zzali zzc(Context context, zzalb zzalbVar) {
        zzt();
        zzali zza = zzaly.zza();
        if (!TextUtils.isEmpty(this.zzu)) {
            zza.zzg(this.zzu);
        }
        zzapc zzj = zzj(context, this.zzt);
        if (zzj.zzk() != null) {
            zzr(zzo(zzj, context, zza, null));
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    protected final zzali zzd(Context context, View view, Activity activity) {
        zzt();
        zzali zza = zzaly.zza();
        zza.zzg(this.zzu);
        zzp(zzj(context, this.zzt), zza, view, activity, false);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    protected final zzape zzi(MotionEvent motionEvent) throws zzaot {
        Method zzj = zzanz.zza.zzj("WUfVTOsJHOND4XgPghL23YwTgyX5VPyE24WQrLHqNZz9nfhclwI4H/j9q0Mn+psv", "2GY9xtlRxNZciAIhICoIbv+iSeAm7ZM43xRzSyyZ7zc=");
        if (zzj != null && motionEvent != null) {
            try {
                return new zzape((String) zzj.invoke(null, motionEvent, this.zzq));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new zzaot(e10);
            }
        }
        throw new zzaot();
    }

    @Override // com.google.android.gms.internal.ads.zzanz, com.google.android.gms.internal.ads.zzany
    public final void zzn(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcf)).booleanValue()) {
            if (this.zzv == null) {
                zzapc zzapcVar = zzanz.zza;
                this.zzv = new zzapj(zzapcVar.zza, zzapcVar.zzf());
            }
            this.zzv.zzd(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List zzo(zzapc zzapcVar, Context context, zzali zzaliVar, zzalb zzalbVar) {
        long j10;
        long j11;
        int zza = zzapcVar.zza();
        ArrayList arrayList = new ArrayList();
        if (!zzapcVar.zzr()) {
            zzaliVar.zzC(16384L);
            return arrayList;
        }
        arrayList.add(new zzapp(zzapcVar, "8zPzMumx8VK4Q4ZZMffWEJsAX0/i9gohXVA/VhPpWBNlLRmzgRsEh/j6Aaymt8Wu", "GsEHhtmZy7+TitdN6KLdSnSR7WpVlkZahwBwH9Jv1wQ=", zzaliVar, zza, 27, context, null));
        arrayList.add(new zzaps(zzapcVar, "FmiCZESJMiUiPEVFp8/sySGg9zk5i1lJsy88E60+KsD4lJB1UVftaJnD830H1Cnc", "B8qnIZWGEs7xms3SbQDilR0QM+SibSnQfZbTzlo06bE=", zzaliVar, zzx, zza, 25));
        arrayList.add(new zzaqa(zzapcVar, "DNoIUzNgQ+tGaWufI617pdeOeFxPy3ypVgJRNb/REDqvDPWkZ+hwt80uPBr78PA1", "keEhYPq98yaHF5Dzpggt8ckKDSAXe9vFpWufiQ8oXDY=", zzaliVar, zza, 1));
        arrayList.add(new zzaqd(zzapcVar, "EQnlrBUlHjk2AEt0zmKDh6D/4LKq1nD5m8E6B+NGkhfc83YRi+bdMQpWJDofZ7UC", "vT7QqRHPYW89dMOJkMQAS7XgxAAvbeOb6ybNiPRYWg8=", zzaliVar, zza, 31));
        arrayList.add(new zzaqi(zzapcVar, "oSBV0gkM1yTotHLC+K1O/2QESKvM1OzdR7LLRpJm660IC9CZK+wk8pHl5h8TdV48", "A3Rh/mKF+88qDRUgTtU47eZJOyPh9v2tsYzP/5oF+dA=", zzaliVar, zza, 33));
        arrayList.add(new zzapo(zzapcVar, "jP+6II/RqbFgO1yXDlTKTZh3PSPs7B8S68QmevSn/bVP2NzeS5BO3umQKUdsHS/c", "GLyIO6R2q01pjCn0D3/H49YHLEvqvbC5vDeJpi09sqQ=", zzaliVar, zza, 29, context));
        arrayList.add(new zzapq(zzapcVar, "zzBoiLmCSl4qpONTaYkbu2H1+be7dFpyqhOnbG674OZpERvkqiVrsp9nWT5kU4lr", "4H+WN9tI0y+WKEjRpYWQhzjGaRdS7qtgrPx+7wzXofs=", zzaliVar, zza, 5));
        arrayList.add(new zzapz(zzapcVar, "GsNdMg7ydPRZME6lhbr2mgr/qEeHLJHBW4TYBUuwzuP8n8dRXlAExueisFv9fzjL", "wuFo2c62LxPcBxajXZblz51/QLk1c9RXgln2kF6l+tg=", zzaliVar, zza, 12));
        arrayList.add(new zzaqb(zzapcVar, "BRgqZ9Vg4IM5miPoGPKIX+tShrXoisnhV1cWTsEoWNSALbfoi2OgJtSBw3h9+Bqo", "SAUyhp29xMzgJ0ZztJOiGInn+oDyrZ4+r7quECKL/6s=", zzaliVar, zza, 3));
        arrayList.add(new zzapr(zzapcVar, "NuaVE443qhtP6/N+u8tA8HilHNLFyQFq7pn4MjW5OGwcdLTSMQ1k8XjYehsxVeon", "z5NXQuc0uiNSVbndYdMaUlJv3uv2TfesAU8D9T9pl4E=", zzaliVar, zza, 44));
        arrayList.add(new zzapw(zzapcVar, "zo8V8X8kshYkxeE23t3OyXdoh3FPhn0ETnxP8vKAUZieFhalf6x5LNoDw8Q1oLRS", "Hf8oHWnCgsj7Y9XZDlAl+qeEGkjuhCtSnXpSHq9fewc=", zzaliVar, zza, 22));
        arrayList.add(new zzaqj(zzapcVar, "tGUqnRBT0Z8VLsYZLT0IoD5T4HRaaLpJNvmxlM5fu89BQ2YOdHgaf4qUlK58s24H", "LZbLZn8XvuN809srP2sgyvIe+LVffcIatfOggVsL/5c=", zzaliVar, zza, 48));
        arrayList.add(new zzapn(zzapcVar, "HKJ68+GFVOzzlXIErXZFscWEuic4IS+F1/JC4SL0ZBjl5Wpepiw6AwYzzVdq4ZK/", "QnEQ5Lj6VZj+ZyIvg9+5D3/xHwfXHkc5MHdc8LLlnMs=", zzaliVar, zza, 49));
        arrayList.add(new zzaqg(zzapcVar, "J3h/yn9IydN0jKZWyOmBNA2CGG4oT7iCghUPqzDf4kG+cww4wp/vL8nWOQWDaiv6", "+oHygsI2eAotNvI8PLMFrbhe03kQ9oSi83I/J9IxJZk=", zzaliVar, zza, 51));
        arrayList.add(new zzaqe(zzapcVar, "1fofpOOYcFfS5YFFd3ctXz8Mp5NAKFN2TSgOzUMkaRdV9dKus3ViOY+jtkwxi6r2", "5dATknTk87foLpzL0Dq3Gho5ELQoI7cNb0jy2DaFKNg=", zzaliVar, zza, 61));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcz)).booleanValue()) {
                zzapl zzaplVar = zzz;
                if (zzaplVar != null) {
                    j10 = zzaplVar.zzc();
                    j11 = zzaplVar.zzb();
                } else {
                    j10 = -1;
                    j11 = -1;
                }
                arrayList.add(new zzapy(zzapcVar, "XdACBmHPjNtNHtvuxJIzO5INAuD0sY2N7kIXkPlZf2/7KHZWQ+7Wr4DDubVydJNF", "y+g//F0lHk9VQdkf/Jc605unsex1+WIt3b6Nn2DqnLo=", zzaliVar, zza, 11, zzy, j10, j11));
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcx)).booleanValue()) {
            arrayList.add(new zzaqc(zzapcVar, "sQRnRw5AtmLjG4zPuRRzbU9KCNWkvhkIESw7dU0UKjciZOTbDwuGbxSLRs8Rwqdx", "QTFg2pa0CDlg9dgYpioKGLNjWwgLSvJpA082RZAjjog=", zzaliVar, zza, 73));
        }
        arrayList.add(new zzapx(zzapcVar, "bldCWkVDnh6c0tW17EB2ImW8Helv6jy9hD1h4hlV/96dlwBa7zb3YoFOuZ30CDAy", "8jULXqwjN4p3qVyOWkn9K2tUG5k4XuLNgEq0xlRqu/g=", zzaliVar, zza, 76));
        return arrayList;
    }

    protected final void zzp(zzapc zzapcVar, zzali zzaliVar, View view, Activity activity, boolean z10) {
        List list;
        if (!zzapcVar.zzr()) {
            zzaliVar.zzC(16384L);
            list = Arrays.asList(new zzapu(zzapcVar, zzaliVar));
        } else {
            zzs(zzapcVar, zzaliVar);
            ArrayList arrayList = new ArrayList();
            if (zzapcVar.zzk() != null) {
                int zza = zzapcVar.zza();
                arrayList.add(new zzapu(zzapcVar, zzaliVar));
                arrayList.add(new zzaqa(zzapcVar, "DNoIUzNgQ+tGaWufI617pdeOeFxPy3ypVgJRNb/REDqvDPWkZ+hwt80uPBr78PA1", "keEhYPq98yaHF5Dzpggt8ckKDSAXe9vFpWufiQ8oXDY=", zzaliVar, zza, 1));
                arrayList.add(new zzaps(zzapcVar, "FmiCZESJMiUiPEVFp8/sySGg9zk5i1lJsy88E60+KsD4lJB1UVftaJnD830H1Cnc", "B8qnIZWGEs7xms3SbQDilR0QM+SibSnQfZbTzlo06bE=", zzaliVar, zzx, zza, 25));
                arrayList.add(new zzapr(zzapcVar, "NuaVE443qhtP6/N+u8tA8HilHNLFyQFq7pn4MjW5OGwcdLTSMQ1k8XjYehsxVeon", "z5NXQuc0uiNSVbndYdMaUlJv3uv2TfesAU8D9T9pl4E=", zzaliVar, zza, 44));
                arrayList.add(new zzapz(zzapcVar, "GsNdMg7ydPRZME6lhbr2mgr/qEeHLJHBW4TYBUuwzuP8n8dRXlAExueisFv9fzjL", "wuFo2c62LxPcBxajXZblz51/QLk1c9RXgln2kF6l+tg=", zzaliVar, zza, 12));
                arrayList.add(new zzaqb(zzapcVar, "BRgqZ9Vg4IM5miPoGPKIX+tShrXoisnhV1cWTsEoWNSALbfoi2OgJtSBw3h9+Bqo", "SAUyhp29xMzgJ0ZztJOiGInn+oDyrZ4+r7quECKL/6s=", zzaliVar, zza, 3));
                arrayList.add(new zzapw(zzapcVar, "zo8V8X8kshYkxeE23t3OyXdoh3FPhn0ETnxP8vKAUZieFhalf6x5LNoDw8Q1oLRS", "Hf8oHWnCgsj7Y9XZDlAl+qeEGkjuhCtSnXpSHq9fewc=", zzaliVar, zza, 22));
                arrayList.add(new zzapq(zzapcVar, "zzBoiLmCSl4qpONTaYkbu2H1+be7dFpyqhOnbG674OZpERvkqiVrsp9nWT5kU4lr", "4H+WN9tI0y+WKEjRpYWQhzjGaRdS7qtgrPx+7wzXofs=", zzaliVar, zza, 5));
                arrayList.add(new zzaqj(zzapcVar, "tGUqnRBT0Z8VLsYZLT0IoD5T4HRaaLpJNvmxlM5fu89BQ2YOdHgaf4qUlK58s24H", "LZbLZn8XvuN809srP2sgyvIe+LVffcIatfOggVsL/5c=", zzaliVar, zza, 48));
                arrayList.add(new zzapn(zzapcVar, "HKJ68+GFVOzzlXIErXZFscWEuic4IS+F1/JC4SL0ZBjl5Wpepiw6AwYzzVdq4ZK/", "QnEQ5Lj6VZj+ZyIvg9+5D3/xHwfXHkc5MHdc8LLlnMs=", zzaliVar, zza, 49));
                arrayList.add(new zzaqg(zzapcVar, "J3h/yn9IydN0jKZWyOmBNA2CGG4oT7iCghUPqzDf4kG+cww4wp/vL8nWOQWDaiv6", "+oHygsI2eAotNvI8PLMFrbhe03kQ9oSi83I/J9IxJZk=", zzaliVar, zza, 51));
                arrayList.add(new zzaqf(zzapcVar, "aZvf8nokSQAvHIIdmzwu8civ2+qb07zM1ZEz6qZf1UzLfoKt8BndVgmiOXFGATXV", "1Q5N5QhnMtop76rkewUHBq0dfu+Fpixkwg9xHoBYaMc=", zzaliVar, zza, 45, new Throwable().getStackTrace()));
                arrayList.add(new zzaqk(zzapcVar, "f7Ni+qJ74MqRBDIn5zt+Qvnt6llN8c82PMULXlCAep3wzIprbOB6YjqpQItX7QwB", "MVJdjUEx+rB88W0UPnVsndOuLU6aovPyFF5b36lJGoA=", zzaliVar, zza, 57, view));
                arrayList.add(new zzaqe(zzapcVar, "1fofpOOYcFfS5YFFd3ctXz8Mp5NAKFN2TSgOzUMkaRdV9dKus3ViOY+jtkwxi6r2", "5dATknTk87foLpzL0Dq3Gho5ELQoI7cNb0jy2DaFKNg=", zzaliVar, zza, 61));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcd)).booleanValue()) {
                    arrayList.add(new zzapm(zzapcVar, "bJ19ecmml/ZL+PAjNo6P4un4UIg2zol83OavxH1sy4lr9vgJAAspRAybhuIko55U", "vAwaartPSmuJV+jFjOXlfyM3UPFY8tl7jDP13kq4YYw=", zzaliVar, zza, 62, view, activity));
                }
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcf)).booleanValue()) {
                        arrayList.add(new zzaqh(zzapcVar, "03Rb8b+VDPWNz2ZsdwvaSzyRMvfwK65RukwsWnYSmw87NOTFb26HoizUZBquofyN", "4NlIZpWANWCeruMUGSc5tEkf3o6K0hyRt+/1nSu0QU8=", zzaliVar, zza, 53, this.zzv));
                    }
                } else {
                    try {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcg)).booleanValue()) {
                            arrayList.add(new zzapv(zzapcVar, "e6wNdaLD6UNhzFmw+sulW0Dd6tS/ZIj4VP2rchYxgmyyl8SG0R852+ZvHvO065lU", "4WajQiAzbn6P/4aXItZyiVPs318La/hzY2eQhgLxpjo=", zzaliVar, zza, 85, this.zzA, view));
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
            }
            list = arrayList;
        }
        zzr(list);
    }
}
