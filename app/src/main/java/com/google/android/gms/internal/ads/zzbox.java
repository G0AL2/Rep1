package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.l;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import l6.c;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbox implements zzbom {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdwh zzb;
    private final zzfgp zzc;
    private final zzbwp zze;
    private final zzees zzf;
    private com.google.android.gms.ads.internal.overlay.zzu zzg = null;
    private final zzcfn zzd = new zzcfn(null);

    public zzbox(com.google.android.gms.ads.internal.zzb zzbVar, zzbwp zzbwpVar, zzees zzeesVar, zzdwh zzdwhVar, zzfgp zzfgpVar) {
        this.zza = zzbVar;
        this.zze = zzbwpVar;
        this.zzf = zzeesVar;
        this.zzb = zzdwhVar;
        this.zzc = zzfgpVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return c.f33710i.equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    @VisibleForTesting
    static Uri zzc(Context context, zzaoc zzaocVar, Uri uri, View view, Activity activity) {
        if (zzaocVar == null) {
            return uri;
        }
        try {
            return zzaocVar.zze(uri) ? zzaocVar.zza(uri, context, view, activity) : uri;
        } catch (zzaod unused) {
            return uri;
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            zzcfi.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (com.google.android.gms.internal.ads.zzbow.zzc(r11, r5, r6, r7) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        r11 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzh(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbox.zzh(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzi(boolean z10) {
        zzbwp zzbwpVar = this.zze;
        if (zzbwpVar != null) {
            zzbwpVar.zza(z10);
        }
    }

    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
        zzdwh zzdwhVar = this.zzb;
        if (zzdwhVar != null) {
            zzefa.zzc(context, zzdwhVar, this.zzc, this.zzf, str2, "offline_open");
        }
        zzcli zzcliVar = (zzcli) zzaVar;
        boolean z10 = zzcliVar.zzQ().zzi() && zzcliVar.zzk() == null;
        if (zzv) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (l.f(context).a() && zzw != null && !z10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhb)).booleanValue()) {
                if (zzcliVar.zzQ().zzi()) {
                    zzefa.zzh(zzcliVar.zzk(), null, zzw, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    ((zzcmn) zzaVar).zzaG(zzw, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdwh zzdwhVar2 = this.zzb;
                if (zzdwhVar2 != null) {
                    zzefa.zzc(context, zzdwhVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.zzf.zzc(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!l.f(context).a()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzw == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhb)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z10) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzefa.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i10) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgp zzfgpVar = this.zzc;
            zzfgo zzb = zzfgo.zzb("cct_action");
            zzb.zza("cct_open_status", zzbiw.zza(i10));
            zzfgpVar.zzb(zzb);
            return;
        }
        zzdwg zza = this.zzb.zza();
        zza.zzb("action", "cct_action");
        zza.zzb("cct_open_status", zzbiw.zza(i10));
        zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    /* renamed from: zze */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z10;
        HashMap hashMap;
        Object obj;
        zzcli zzcliVar = (zzcli) zzaVar;
        String zzc = zzcdp.zzc((String) map.get("u"), zzcliVar.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzcfi.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        zzfbl zzF = zzcliVar.zzF();
        zzfbo zzR = zzcliVar.zzR();
        boolean z11 = false;
        if (zzF == null || zzR == null) {
            str = "";
            z10 = false;
        } else {
            z10 = zzF.zzak;
            str = zzR.zzb;
        }
        boolean z12 = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzih)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcliVar.zzaC()) {
                zzcfi.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzi(false);
            ((zzcmn) zzaVar).zzaH(zzf(map), zzb(map), z12);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzi(false);
            if (zzc != null) {
                ((zzcmn) zzaVar).zzaI(zzf(map), zzb(map), zzc, z12);
            } else {
                ((zzcmn) zzaVar).zzaJ(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z12);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcliVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdC)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdI)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdG)).booleanValue()) {
                        z11 = true;
                        break;
                    }
                    String str3 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdH);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : zzfpg.zzc(zzfoh.zzc(';')).zzd(str3)) {
                            if (str4.equals(packageName)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zzg = zzbix.zzg(zzcliVar.getContext());
            if (z11) {
                if (!zzg) {
                    zzk(4);
                } else {
                    zzi(true);
                    if (TextUtils.isEmpty(zzc)) {
                        zzcfi.zzj("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(zzc), zzcliVar.zzH(), zzcliVar.zzk()));
                    if (z10 && this.zzf != null && zzj(zzaVar, zzcliVar.getContext(), zzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbou(this);
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z12);
                    return;
                }
            }
            map.put("use_first_package", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            map.put("use_running_process", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            zzh(zzaVar, map, z10, str, z12);
        } else if ("app".equalsIgnoreCase(str2) && InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equalsIgnoreCase((String) map.get("system_browser"))) {
            zzh(zzaVar, map, z10, str, z12);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgT)).booleanValue()) {
                zzi(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzcfi.zzj("Package name missing from open app action.");
                } else if (!z10 || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), str5, str)) {
                    PackageManager packageManager = zzcliVar.getContext().getPackageManager();
                    if (packageManager == null) {
                        zzcfi.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z12);
                    }
                }
            }
        } else {
            zzi(true);
            String str6 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e10) {
                    zzcfi.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e10);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd2 = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), data, zzcliVar.zzH(), zzcliVar.zzk()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgU)).booleanValue()) {
                            intent2.setDataAndType(zzd2, intent2.getType());
                        }
                    }
                    intent2.setData(zzd2);
                }
            }
            boolean z13 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhf)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z13) {
                hashMap = hashMap2;
                obj = "p";
                this.zzg = new zzbov(this, z12, zzaVar, hashMap2, map);
                z12 = false;
            } else {
                hashMap = hashMap2;
                obj = "p";
            }
            if (intent2 != null) {
                if (!z10 || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), intent2.getData().toString(), str)) {
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z12);
                    return;
                } else if (z13) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbrd) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(zzc), zzcliVar.zzH(), zzcliVar.zzk())).toString();
            }
            if (!z10 || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), zzc, str)) {
                ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), zzc, (String) map.get(InneractiveMediationDefs.GENDER_MALE), (String) map.get(obj), (String) map.get(c.f33710i), (String) map.get(InneractiveMediationDefs.GENDER_FEMALE), (String) map.get("e"), this.zzg), z12);
            } else if (z13) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((zzbrd) zzaVar).zzd("openIntentAsync", hashMap4);
            }
        }
    }
}
