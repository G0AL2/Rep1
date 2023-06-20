package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaod;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdhd;
import com.google.android.gms.internal.ads.zzdse;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzfcb;
import com.google.android.gms.internal.ads.zzfcz;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfui;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzfvm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaa extends zzcdy {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcfo zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzcnf zzf;
    private Context zzg;
    private final zzaoc zzh;
    private final zzfcz zzi;
    private final zzfvm zzk;
    private final ScheduledExecutorService zzl;
    private zzbyt zzm;
    private final zzc zzq;
    private final zzdwm zzr;
    private final zzfii zzs;
    private zzdwc zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzay.zzc().zzb(zzbhz.zzgj)).booleanValue();
    private final boolean zzu = ((Boolean) zzay.zzc().zzb(zzbhz.zzgi)).booleanValue();
    private final boolean zzv = ((Boolean) zzay.zzc().zzb(zzbhz.zzgk)).booleanValue();
    private final boolean zzw = ((Boolean) zzay.zzc().zzb(zzbhz.zzgm)).booleanValue();
    private final String zzx = (String) zzay.zzc().zzb(zzbhz.zzgl);
    private final String zzy = (String) zzay.zzc().zzb(zzbhz.zzgn);
    private final String zzC = (String) zzay.zzc().zzb(zzbhz.zzgo);

    public zzaa(zzcnf zzcnfVar, Context context, zzaoc zzaocVar, zzfcz zzfczVar, zzfvm zzfvmVar, ScheduledExecutorService scheduledExecutorService, zzdwm zzdwmVar, zzfii zzfiiVar, zzcfo zzcfoVar) {
        List list;
        this.zzf = zzcnfVar;
        this.zzg = context;
        this.zzh = zzaocVar;
        this.zzi = zzfczVar;
        this.zzk = zzfvmVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcnfVar.zzm();
        this.zzr = zzdwmVar;
        this.zzs = zzfiiVar;
        this.zzA = zzcfoVar;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgp)).booleanValue()) {
            this.zzD = zzX((String) zzay.zzc().zzb(zzbhz.zzgq));
            this.zzE = zzX((String) zzay.zzc().zzb(zzbhz.zzgr));
            this.zzF = zzX((String) zzay.zzc().zzb(zzbhz.zzgs));
            list = zzX((String) zzay.zzc().zzb(zzbhz.zzgt));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    public static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzG(zzaa zzaaVar, final String str, final String str2, final zzdwc zzdwcVar) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfU)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzga)).booleanValue()) {
                zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaa.this.zzI(str, str2, zzdwcVar);
                    }
                });
            } else {
                zzaaVar.zzq.zzd(str, str2, zzdwcVar);
            }
        }
    }

    public static final /* synthetic */ Uri zzP(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzW(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        char c10;
        zzfcb zzfcbVar = new zzfcb();
        zzbhr zzbhrVar = zzbhz.zzgv;
        if (((Boolean) zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
            if ("REWARDED".equals(str2)) {
                zzfcbVar.zzo().zza(2);
            } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
                zzfcbVar.zzo().zza(3);
            }
        }
        zzg zzn = this.zzf.zzn();
        zzdbd zzdbdVar = new zzdbd();
        zzdbdVar.zzc(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfcbVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfcbVar.zzE(zzlVar);
        if (zzqVar == null) {
            if (((Boolean) zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                switch (str2.hashCode()) {
                    case -1999289321:
                        if (str2.equals("NATIVE")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 543046670:
                        if (str2.equals("REWARDED")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1854800829:
                        if (str2.equals("REWARDED_INTERSTITIAL")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1951953708:
                        if (str2.equals("BANNER")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 == 0) {
                    zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
                } else if (c10 == 1 || c10 == 2) {
                    zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
                } else if (c10 != 3) {
                    zzqVar = new com.google.android.gms.ads.internal.client.zzq();
                } else {
                    zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
                }
            } else {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq();
            }
        }
        zzfcbVar.zzr(zzqVar);
        zzfcbVar.zzx(true);
        zzdbdVar.zzf(zzfcbVar.zzG());
        zzn.zza(zzdbdVar.zzg());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzn.zzb(new zzae(zzacVar, null));
        new zzdhd();
        zzh zzc2 = zzn.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final zzfvl zzR(final String str) {
        final zzdse[] zzdseVarArr = new zzdse[1];
        zzfvl zzn = zzfvc.zzn(this.zzi.zza(), new zzfuj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzaa.this.zzv(zzdseVarArr, str, (zzdse) obj);
            }
        }, this.zzk);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzaa.this.zzH(zzdseVarArr);
            }
        }, this.zzk);
        return zzfvc.zzf(zzfvc.zzm((zzfut) zzfvc.zzo(zzfut.zzv(zzn), ((Integer) zzay.zzc().zzb(zzbhz.zzgy)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfok() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                int i10 = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfok() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                int i10 = zzaa.zze;
                zzcfi.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbyk zzbykVar, boolean z10) {
        zzfvl zzb2;
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            zzcfi.zzj("The updating URL feature is not enabled.");
            try {
                zzbykVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzcfi.zzh("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            zzcfi.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzN(uri)) {
                zzcfi.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzfvc.zzi(uri);
            } else {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzaa.this.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzV()) {
                    zzb2 = zzfvc.zzn(zzb2, new zzfuj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.zzfuj
                        public final zzfvl zza(Object obj) {
                            return zzaa.zzt(zzaa.this, (Uri) obj);
                        }
                    }, this.zzk);
                } else {
                    zzcfi.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(zzb2);
        }
        zzfvc.zzr(zzfvc.zze(arrayList), new zzy(this, zzbykVar, z10), this.zzf.zzA());
    }

    private final void zzT(final List list, final IObjectWrapper iObjectWrapper, zzbyk zzbykVar, boolean z10) {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            try {
                zzbykVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzcfi.zzh("", e10);
                return;
            }
        }
        zzfvl zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaa.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzV()) {
            zzb2 = zzfvc.zzn(zzb2, new zzfuj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return zzaa.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzcfi.zzi("Asset view map is empty.");
        }
        zzfvc.zzr(zzb2, new zzx(this, zzbykVar, z10), this.zzf.zzA());
    }

    private static boolean zzU(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        Map map;
        zzbyt zzbytVar = this.zzm;
        return (zzbytVar == null || (map = zzbytVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    public static final Uri zzW(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            return Uri.parse(uri2.substring(0, i10) + str + "=" + str2 + "&" + uri2.substring(i10));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzX(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfpi.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzfhs zzr(zzfvl zzfvlVar, zzced zzcedVar) {
        if (zzfhu.zza() && ((Boolean) zzbji.zze.zze()).booleanValue()) {
            try {
                zzfhs zzb2 = ((zzh) zzfvc.zzp(zzfvlVar)).zzb();
                zzb2.zzd(new ArrayList(Collections.singletonList(zzcedVar.zzb)));
                com.google.android.gms.ads.internal.client.zzl zzlVar = zzcedVar.zzd;
                zzb2.zzb(zzlVar == null ? "" : zzlVar.zzp);
                return zzb2;
            } catch (ExecutionException e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
                return null;
            }
        }
        return null;
    }

    public static /* synthetic */ zzfvl zzt(zzaa zzaaVar, final Uri uri) {
        return zzfvc.zzm(zzaaVar.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfok() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return zzaa.zzP(uri, (String) obj);
            }
        }, zzaaVar.zzk);
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(zzW(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (!TextUtils.isEmpty(zzh)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzO(uri)) {
                    zzcfi.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzW(uri, "ms", zzh));
                }
            }
            if (arrayList.isEmpty()) {
                throw new Exception("Empty impression URLs result.");
            }
            return arrayList;
        }
        throw new Exception("Failed to get view signals.");
    }

    public final /* synthetic */ void zzH(zzdse[] zzdseVarArr) {
        zzdse zzdseVar = zzdseVarArr[0];
        if (zzdseVar != null) {
            this.zzi.zzb(zzfvc.zzi(zzdseVar));
        }
    }

    public final /* synthetic */ void zzI(String str, String str2, zzdwc zzdwcVar) {
        this.zzq.zzd(str, str2, zzdwcVar);
    }

    public final boolean zzN(Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    public final boolean zzO(Uri uri) {
        return zzU(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zze(IObjectWrapper iObjectWrapper, final zzced zzcedVar, zzcdw zzcdwVar) {
        zzfvl zzi;
        zzfvl zzc2;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfhh zza2 = zzfhg.zza(context, 22);
        zza2.zzf();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzit)).booleanValue()) {
            zzfvm zzfvmVar = zzcfv.zza;
            zzi = zzfvmVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzaa.this.zzq(zzcedVar);
                }
            });
            zzc2 = zzfvc.zzn(zzi, new zzfuj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzfvmVar);
        } else {
            zzh zzQ = zzQ(this.zzg, zzcedVar.zza, zzcedVar.zzb, zzcedVar.zzc, zzcedVar.zzd);
            zzi = zzfvc.zzi(zzQ);
            zzc2 = zzQ.zzc();
        }
        zzfvc.zzr(zzc2, new zzw(this, zzi, zzcedVar, zzcdwVar, zza2, com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()), this.zzf.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzf(zzbyt zzbytVar) {
        this.zzm = zzbytVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) {
        zzS(list, iObjectWrapper, zzbykVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) {
        zzT(list, iObjectWrapper, zzbykVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper) {
        zzfvl zzc2;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhO)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                zzcfi.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzhP)).booleanValue()) {
                if (((Boolean) zzay.zzc().zzb(zzbhz.zzit)).booleanValue()) {
                    zzc2 = zzfvc.zzl(new zzfui() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                        @Override // com.google.android.gms.internal.ads.zzfui
                        public final zzfvl zza() {
                            return zzaa.this.zzu();
                        }
                    }, zzcfv.zza);
                } else {
                    zzc2 = zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
                }
                zzfvc.zzr(zzc2, new zzz(this), this.zzf.zzA());
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzcfi.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zzcfi.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr), "gmaSdk");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbyt zzbytVar = this.zzm;
            this.zzn = zzbx.zza(motionEvent, zzbytVar == null ? null : zzbytVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            obtain.setLocation(point.x, point.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) {
        zzS(list, iObjectWrapper, zzbykVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyk zzbykVar) {
        zzT(list, iObjectWrapper, zzbykVar, false);
    }

    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaod e10) {
            zzcfi.zzk("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzh zzq(zzced zzcedVar) throws Exception {
        return zzQ(this.zzg, zzcedVar.zza, zzcedVar.zzb, zzcedVar.zzc, zzcedVar.zzd);
    }

    public final /* synthetic */ zzfvl zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    public final /* synthetic */ zzfvl zzv(zzdse[] zzdseVarArr, String str, zzdse zzdseVar) throws Exception {
        zzdseVarArr[0] = zzdseVar;
        Context context = this.zzg;
        zzbyt zzbytVar = this.zzm;
        Map map = zzbytVar.zzb;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzbytVar.zza);
        JSONObject zzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbx.zzf(this.zzm.zza);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdseVar.zzd(str, jSONObject);
    }

    public final /* synthetic */ zzfvl zzw(final ArrayList arrayList) throws Exception {
        return zzfvc.zzm(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfok() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return zzaa.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
