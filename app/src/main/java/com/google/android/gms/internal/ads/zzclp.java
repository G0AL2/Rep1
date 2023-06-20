package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.z;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public class zzclp extends WebViewClient implements zzcmv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzccj zza;
    private final zzcli zzc;
    private final zzbdm zzd;
    private final HashMap zze;
    private final Object zzf;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcmt zzi;
    private zzcmu zzj;
    private zzbnm zzk;
    private zzbno zzl;
    private zzdjg zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzw zzs;
    private zzbwu zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private zzbwp zzv;
    private zzfii zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzclp(zzcli zzcliVar, zzbdm zzbdmVar, boolean z10) {
        zzbwu zzbwuVar = new zzbwu(zzcliVar, zzcliVar.zzG(), new zzbhj(zzcliVar.getContext()));
        this.zze = new HashMap();
        this.zzf = new Object();
        this.zzd = zzbdmVar;
        this.zzc = zzcliVar;
        this.zzp = z10;
        this.zzt = zzbwuVar;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeD)).split(",")));
    }

    private static WebResourceResponse zzM() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaD)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzN(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.zzt.zzp().zze(this.zzc.getContext(), this.zzc.zzp().zza, false, httpURLConnection, false, 60000);
                        zzcfh zzcfhVar = new zzcfh(null);
                        zzcfhVar.zzc(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzcfhVar.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                return null;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzcfi.zzj("Protocol is null");
                                return zzM();
                            } else if (!protocol.equals("http") && !protocol.equals("https")) {
                                zzcfi.zzj("Unsupported scheme: " + protocol);
                                return zzM();
                            } else {
                                zzcfi.zze("Redirecting to " + headerField);
                                httpURLConnection.disconnect();
                                url = url2;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            return com.google.android.gms.ads.internal.util.zzs.zzL(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzO(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbom) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzP() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(final View view, final zzccj zzccjVar, final int i10) {
        if (!zzccjVar.zzi() || i10 <= 0) {
            return;
        }
        zzccjVar.zzg(view);
        if (zzccjVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcll
                @Override // java.lang.Runnable
                public final void run() {
                    zzclp.this.zzn(view, zzccjVar, i10);
                }
            }, 100L);
        }
    }

    private static final boolean zzR(boolean z10, zzcli zzcliVar) {
        return (!z10 || zzcliVar.zzQ().zzi() || zzcliVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaB()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzW();
                return;
            }
            this.zzx = true;
            zzcmu zzcmuVar = this.zzj;
            if (zzcmuVar != null) {
                zzcmuVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzI()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzccj zzccjVar = this.zza;
                        if (zzccjVar != null) {
                            zzccjVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdjg zzdjgVar = this.zzm;
                    if (zzdjgVar != null) {
                        zzdjgVar.zzq();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzI().willNotDraw()) {
                try {
                    zzaoc zzK = this.zzc.zzK();
                    if (zzK != null && zzK.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcli zzcliVar = this.zzc;
                        parse = zzK.zza(parse, context, (View) zzcliVar, zzcliVar.zzk());
                    }
                } catch (zzaod unused) {
                    zzcfi.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar != null && !zzbVar.zzc()) {
                    this.zzu.zzb(str);
                } else {
                    zzr(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                }
            } else {
                zzcfi.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzA(int i10, int i11) {
        zzbwp zzbwpVar = this.zzv;
        if (zzbwpVar != null) {
            zzbwpVar.zzd(i10, i11);
        }
    }

    public final void zzB(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzC(boolean z10) {
        synchronized (this.zzf) {
            this.zzr = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzD() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
                @Override // java.lang.Runnable
                public final void run() {
                    zzclp.this.zzm();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzE(boolean z10) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzF(zzcmu zzcmuVar) {
        this.zzj = zzcmuVar;
    }

    public final void zzG(String str, zzbom zzbomVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbomVar);
        }
    }

    public final void zzH(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbom> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbom zzbomVar : list) {
                if (predicate.apply(zzbomVar)) {
                    arrayList.add(zzbomVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzI() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzr;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final boolean zzJ() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzp;
        }
        return z10;
    }

    public final boolean zzK() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzq;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzL(com.google.android.gms.ads.internal.client.zza zzaVar, zzbnm zzbnmVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbno zzbnoVar, com.google.android.gms.ads.internal.overlay.zzw zzwVar, boolean z10, zzbop zzbopVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbww zzbwwVar, zzccj zzccjVar, final zzees zzeesVar, final zzfii zzfiiVar, zzdwh zzdwhVar, zzfgp zzfgpVar, zzbon zzbonVar, final zzdjg zzdjgVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzccjVar, null) : zzbVar;
        this.zzv = new zzbwp(this.zzc, zzbwwVar);
        this.zza = zzccjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaL)).booleanValue()) {
            zzx("/adMetadata", new zzbnl(zzbnmVar));
        }
        if (zzbnoVar != null) {
            zzx("/appEvent", new zzbnn(zzbnoVar));
        }
        zzx("/backButton", zzbol.zzj);
        zzx("/refresh", zzbol.zzk);
        zzx("/canOpenApp", zzbol.zzb);
        zzx("/canOpenURLs", zzbol.zza);
        zzx("/canOpenIntents", zzbol.zzc);
        zzx("/close", zzbol.zzd);
        zzx("/customClose", zzbol.zze);
        zzx("/instrument", zzbol.zzn);
        zzx("/delayPageLoaded", zzbol.zzp);
        zzx("/delayPageClosed", zzbol.zzq);
        zzx("/getLocationInfo", zzbol.zzr);
        zzx("/log", zzbol.zzg);
        zzx("/mraid", new zzbot(zzbVar2, this.zzv, zzbwwVar));
        zzbwu zzbwuVar = this.zzt;
        if (zzbwuVar != null) {
            zzx("/mraidLoaded", zzbwuVar);
        }
        zzx("/open", new zzbox(zzbVar2, this.zzv, zzeesVar, zzdwhVar, zzfgpVar));
        zzx("/precache", new zzcjv());
        zzx("/touch", zzbol.zzi);
        zzx("/video", zzbol.zzl);
        zzx("/videoMeta", zzbol.zzm);
        if (zzeesVar != null && zzfiiVar != null) {
            zzx("/click", new zzbom() { // from class: com.google.android.gms.internal.ads.zzfck
                @Override // com.google.android.gms.internal.ads.zzbom
                public final void zza(Object obj, Map map) {
                    zzdjg zzdjgVar2 = zzdjg.this;
                    zzfii zzfiiVar2 = zzfiiVar;
                    zzees zzeesVar2 = zzeesVar;
                    zzcli zzcliVar = (zzcli) obj;
                    zzbol.zzd(map, zzdjgVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcfi.zzj("URL missing from click GMSG.");
                    } else {
                        zzfvc.zzr(zzbol.zzb(zzcliVar, str), new zzfcl(zzcliVar, zzfiiVar2, zzeesVar2), zzcfv.zza);
                    }
                }
            });
            zzx("/httpTrack", new zzbom() { // from class: com.google.android.gms.internal.ads.zzfcj
                @Override // com.google.android.gms.internal.ads.zzbom
                public final void zza(Object obj, Map map) {
                    zzfii zzfiiVar2 = zzfii.this;
                    zzees zzeesVar2 = zzeesVar;
                    zzckz zzckzVar = (zzckz) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcfi.zzj("URL missing from httpTrack GMSG.");
                    } else if (!zzckzVar.zzF().zzak) {
                        zzfiiVar2.zzc(str, null);
                    } else {
                        zzeesVar2.zzd(new zzeeu(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), ((zzcmf) zzckzVar).zzR().zzb, str, 2));
                    }
                }
            });
        } else {
            zzx("/click", zzbol.zza(zzdjgVar));
            zzx("/httpTrack", zzbol.zzf);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzx("/logScionEvent", new zzbos(this.zzc.getContext()));
        }
        if (zzbopVar != null) {
            zzx("/setInterstitialProperties", new zzboo(zzbopVar, null));
        }
        if (zzbonVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
                zzx("/inspectorNetworkExtras", zzbonVar);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbnmVar;
        this.zzl = zzbnoVar;
        this.zzs = zzwVar;
        this.zzu = zzbVar2;
        this.zzm = zzdjgVar;
        this.zzn = z10;
        this.zzw = zzfiiVar;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzc(String str, Map map) {
        zzbcv zzb2;
        try {
            if (((Boolean) zzbjq.zza.zze()).booleanValue() && this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.zzw.zzc(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String zzc = zzcdp.zzc(str, this.zzc.getContext(), this.zzA);
            if (!zzc.equals(str)) {
                return zzN(zzc, map);
            }
            zzbcy zza = zzbcy.zza(Uri.parse(str));
            if (zza != null && (zzb2 = com.google.android.gms.ads.internal.zzt.zzc().zzb(zza)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (zzcfh.zzl() && ((Boolean) zzbjl.zzb.zze()).booleanValue()) {
                return zzN(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "AdWebViewClient.interceptRequest");
            return zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && this.zzc.zzo() != null) {
                zzbig.zza(this.zzc.zzo().zza(), this.zzc.zzn(), "awfllc");
            }
            zzcmt zzcmtVar = this.zzi;
            boolean z10 = false;
            if (!this.zzy && !this.zzo) {
                z10 = true;
            }
            zzcmtVar.zza(z10);
            this.zzi = null;
        }
        this.zzc.zzae();
    }

    public final void zzh(boolean z10) {
        this.zzA = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzi(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeC)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeE)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzfvc.zzr(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcln(this, list, path, uri), zzcfv.zze);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            zzO(com.google.android.gms.ads.internal.util.zzs.zzK(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfJ)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzf() == null) {
            return;
        }
        final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
        zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclj
            @Override // java.lang.Runnable
            public final void run() {
                String str = substring;
                int i10 = zzclp.zzb;
                com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzj() {
        zzbdm zzbdmVar = this.zzd;
        if (zzbdmVar != null) {
            zzbdmVar.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzk() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzl() {
        this.zzz--;
        zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzc.zzac();
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zzc.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(View view, zzccj zzccjVar, int i10) {
        zzQ(view, zzccjVar, i10 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzo(int i10, int i11, boolean z10) {
        zzbwu zzbwuVar = this.zzt;
        if (zzbwuVar != null) {
            zzbwuVar.zzb(i10, i11);
        }
        zzbwp zzbwpVar = this.zzv;
        if (zzbwpVar != null) {
            zzbwpVar.zzc(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzp() {
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            WebView zzI = this.zzc.zzI();
            if (z.T(zzI)) {
                zzQ(zzI, zzccjVar, 10);
                return;
            }
            zzP();
            zzclm zzclmVar = new zzclm(this, zzccjVar);
            this.zzC = zzclmVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzclmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzdjg zzdjgVar = this.zzm;
        if (zzdjgVar != null) {
            zzdjgVar.zzq();
        }
    }

    public final void zzr(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z11 = true;
        if (!zzR && z10) {
            z11 = false;
        }
        zzu(new AdOverlayInfoParcel(zzcVar, zzR ? null : this.zzg, zzaC ? null : this.zzh, this.zzs, this.zzc.zzp(), this.zzc, z11 ? null : this.zzm));
    }

    public final void zzs(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzees zzeesVar, zzdwh zzdwhVar, zzfgp zzfgpVar, String str, String str2, int i10) {
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzcliVar, zzcliVar.zzp(), zzbrVar, zzeesVar, zzdwhVar, zzfgpVar, str, str2, 14));
    }

    public final void zzt(boolean z10, int i10, boolean z11) {
        boolean zzR = zzR(this.zzc.zzaC(), this.zzc);
        boolean z12 = true;
        if (!zzR && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zzs;
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzoVar, zzwVar, zzcliVar, z10, i10, zzcliVar.zzp(), z12 ? null : this.zzm));
    }

    public final void zzu(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbwp zzbwpVar = this.zzv;
        boolean zze = zzbwpVar != null ? zzbwpVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzj();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze);
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzccjVar.zzh(str);
        }
    }

    public final void zzv(boolean z10, int i10, String str, boolean z11) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z12 = true;
        if (!zzR && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        zzclo zzcloVar = zzaC ? null : new zzclo(this.zzc, this.zzh);
        zzbnm zzbnmVar = this.zzk;
        zzbno zzbnoVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zzs;
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzcloVar, zzbnmVar, zzbnoVar, zzwVar, zzcliVar, z10, i10, str, zzcliVar.zzp(), z12 ? null : this.zzm));
    }

    public final void zzw(boolean z10, int i10, String str, String str2, boolean z11) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z12 = true;
        if (!zzR && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        zzclo zzcloVar = zzaC ? null : new zzclo(this.zzc, this.zzh);
        zzbnm zzbnmVar = this.zzk;
        zzbno zzbnoVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zzs;
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzcloVar, zzbnmVar, zzbnoVar, zzwVar, zzcliVar, z10, i10, str, str2, zzcliVar.zzp(), z12 ? null : this.zzm));
    }

    public final void zzx(String str, zzbom zzbomVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbomVar);
        }
    }

    public final void zzy() {
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            zzccjVar.zze();
            this.zza = null;
        }
        zzP();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbwp zzbwpVar = this.zzv;
            if (zzbwpVar != null) {
                zzbwpVar.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzz(zzcmt zzcmtVar) {
        this.zzi = zzcmtVar;
    }
}
