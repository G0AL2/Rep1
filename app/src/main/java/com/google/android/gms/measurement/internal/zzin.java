package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.a;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzol;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzin extends zzf {
    @VisibleForTesting
    protected zzim zza;
    final zzr zzb;
    @VisibleForTesting
    protected boolean zzc;
    private zzhi zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzah zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzlo zzn;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzin(zzgi zzgiVar) {
        super(zzgiVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzib(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzah(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzr(zzgiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac */
    public final void zzC(Bundle bundle, long j10) {
        if (TextUtils.isEmpty(this.zzs.zzh().zzm())) {
            zzS(bundle, 0, j10);
        } else {
            this.zzs.zzaz().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(Boolean bool, boolean z10) {
        zzg();
        zza();
        this.zzs.zzaz().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z10) {
            zzfn zzm = this.zzs.zzm();
            zzgi zzgiVar = zzm.zzs;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            zzae();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae() {
        zzg();
        String zza = this.zzs.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzaa("app", "_npa", null, this.zzs.zzaw().currentTimeMillis());
            } else {
                zzaa("app", "_npa", Long.valueOf(true != InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(zza) ? 0L : 1L), this.zzs.zzaw().currentTimeMillis());
            }
        }
        if (this.zzs.zzJ() && this.zzc) {
            this.zzs.zzaz().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzz();
            zzol.zzc();
            if (this.zzs.zzf().zzs(null, zzel.zzae)) {
                this.zzs.zzu().zza.zza();
            }
            this.zzs.zzaA().zzp(new zzhq(this));
            return;
        }
        this.zzs.zzaz().zzc().zza("Updating Scion state (FE)");
        this.zzs.zzt().zzI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzv(zzin zzinVar, zzah zzahVar, zzah zzahVar2) {
        boolean z10;
        zzag[] zzagVarArr = {zzag.ANALYTICS_STORAGE, zzag.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z10 = false;
                break;
            }
            zzag zzagVar = zzagVarArr[i10];
            if (!zzahVar2.zzi(zzagVar) && zzahVar.zzi(zzagVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean zzl = zzahVar.zzl(zzahVar2, zzag.ANALYTICS_STORAGE, zzag.AD_STORAGE);
        if (z10 || zzl) {
            zzinVar.zzs.zzh().zzo();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzin zzinVar, zzah zzahVar, int i10, long j10, boolean z10, boolean z11) {
        zzinVar.zzg();
        zzinVar.zza();
        if (j10 <= zzinVar.zzl && zzah.zzj(zzinVar.zzm, i10)) {
            zzinVar.zzs.zzaz().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzahVar);
            return;
        }
        zzfn zzm = zzinVar.zzs.zzm();
        zzgi zzgiVar = zzm.zzs;
        zzm.zzg();
        if (zzm.zzl(i10)) {
            SharedPreferences.Editor edit = zzm.zza().edit();
            edit.putString("consent_settings", zzahVar.zzh());
            edit.putInt("consent_source", i10);
            edit.apply();
            zzinVar.zzl = j10;
            zzinVar.zzm = i10;
            zzinVar.zzs.zzt().zzF(z10);
            if (z11) {
                zzinVar.zzs.zzt().zzu(new AtomicReference());
                return;
            }
            return;
        }
        zzinVar.zzs.zzaz().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzaw().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaA().zzp(new zzhx(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzs.zzav().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzs.zzav().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzD(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzaf(obj)) {
                    this.zzs.zzv().zzN(this.zzn, null, 27, null, null, 0);
                }
                this.zzs.zzaz().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlp.zzah(str)) {
                this.zzs.zzaz().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlp zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.zzaa("param", str, 100, obj)) {
                    this.zzs.zzv().zzO(zza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc = this.zzs.zzf().zzc();
        if (zza.size() > zzc) {
            int i10 = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                i10++;
                if (i10 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzs.zzv().zzN(this.zzn, null, 26, null, null, 0);
            this.zzs.zzaz().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(zza);
        this.zzs.zzt().zzH(zza);
    }

    public final void zzE(String str, String str2, Bundle bundle) {
        zzF(str, str2, bundle, true, true, this.zzs.zzaw().currentTimeMillis());
    }

    public final void zzF(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzlp.zzal(str2, "screen_view")) {
            this.zzs.zzs().zzx(bundle2, j10);
        } else {
            zzN(str3, str2, j10, bundle2, z11, !z11 || this.zzd == null || zzlp.zzah(str2), z10, null);
        }
    }

    public final void zzG(String str, String str2, Bundle bundle, String str3) {
        zzgi.zzO();
        zzN("auto", str2, this.zzs.zzaw().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH(String str, String str2, Bundle bundle) {
        zzg();
        zzI(str, str2, this.zzs.zzaw().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzI(String str, String str2, long j10, Bundle bundle) {
        zzg();
        zzJ(str, str2, j10, bundle, true, this.zzd == null || zzlp.zzah(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzJ(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        long j11;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (this.zzs.zzJ()) {
            List zzn = this.zzs.zzh().zzn();
            if (zzn != null && !zzn.contains(str2)) {
                this.zzs.zzaz().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.zzf) {
                this.zzf = true;
                try {
                    if (!this.zzs.zzN()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzav().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzav());
                    } catch (Exception e10) {
                        this.zzs.zzaz().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    this.zzs.zzaz().zzi().zza("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.zzs.zzax();
                zzaa("auto", "_lgclid", bundle.getString("gclid"), this.zzs.zzaw().currentTimeMillis());
            }
            this.zzs.zzax();
            if (z10 && zzlp.zzam(str2)) {
                this.zzs.zzv().zzL(bundle, this.zzs.zzm().zzr.zza());
            }
            if (!z12) {
                this.zzs.zzax();
                if (!"_iap".equals(str2)) {
                    zzlp zzv = this.zzs.zzv();
                    int i10 = 2;
                    if (zzv.zzac("event", str2)) {
                        if (zzv.zzZ("event", zzhf.zza, zzhf.zzb, str2)) {
                            zzv.zzs.zzf();
                            if (zzv.zzY("event", 40, str2)) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 13;
                        }
                    }
                    if (i10 != 0) {
                        this.zzs.zzaz().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                        zzlp zzv2 = this.zzs.zzv();
                        this.zzs.zzf();
                        this.zzs.zzv().zzN(this.zzn, null, i10, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            zzpm.zzc();
            if (this.zzs.zzf().zzs(null, zzel.zzat)) {
                this.zzs.zzax();
                zziu zzj = this.zzs.zzs().zzj(false);
                if (zzj != null && !bundle.containsKey("_sc")) {
                    zzj.zzd = true;
                }
                zzlp.zzK(zzj, bundle, z10 && !z12);
            } else {
                this.zzs.zzax();
                zziu zzj2 = this.zzs.zzs().zzj(false);
                if (zzj2 != null && !bundle.containsKey("_sc")) {
                    zzj2.zzd = true;
                }
                zzlp.zzK(zzj2, bundle, z10 && !z12);
            }
            boolean equals = "am".equals(str);
            boolean zzah = zzlp.zzah(str2);
            if (!z10 || this.zzd == null || zzah) {
                z13 = equals;
            } else if (!equals) {
                this.zzs.zzaz().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j10);
                return;
            } else {
                z13 = true;
            }
            if (this.zzs.zzM()) {
                int zzh = this.zzs.zzv().zzh(str2);
                if (zzh != 0) {
                    this.zzs.zzaz().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzlp zzv3 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().zzN(this.zzn, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle zzy = this.zzs.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
                Preconditions.checkNotNull(zzy);
                this.zzs.zzax();
                if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                    zzkp zzkpVar = this.zzs.zzu().zzb;
                    long elapsedRealtime = zzkpVar.zzc.zzs.zzaw().elapsedRealtime();
                    long j12 = elapsedRealtime - zzkpVar.zzb;
                    zzkpVar.zzb = elapsedRealtime;
                    if (j12 > 0) {
                        this.zzs.zzv().zzI(zzy, j12);
                    }
                }
                zzoc.zzc();
                if (this.zzs.zzf().zzs(null, zzel.zzad)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        zzlp zzv4 = this.zzs.zzv();
                        String string = zzy.getString("_ffr");
                        if (Strings.isEmptyOrWhitespace(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!zzlp.zzal(string, zzv4.zzs.zzm().zzo.zza())) {
                            zzv4.zzs.zzm().zzo.zzb(string);
                        } else {
                            zzv4.zzs.zzaz().zzc().zza("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String zza = this.zzs.zzv().zzs.zzm().zzo.zza();
                        if (!TextUtils.isEmpty(zza)) {
                            zzy.putString("_ffr", zza);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzy);
                if (this.zzs.zzm().zzj.zza() > 0 && this.zzs.zzm().zzk(j10) && this.zzs.zzm().zzl.zzb()) {
                    this.zzs.zzaz().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j11 = 0;
                    zzaa("auto", "_sid", null, this.zzs.zzaw().currentTimeMillis());
                    zzaa("auto", "_sno", null, this.zzs.zzaw().currentTimeMillis());
                    zzaa("auto", "_se", null, this.zzs.zzaw().currentTimeMillis());
                } else {
                    str4 = "_ae";
                    j11 = 0;
                }
                if (zzy.getLong("extend_session", j11) == 1) {
                    this.zzs.zzaz().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.zzs.zzu().zza.zzb(j10, true);
                }
                ArrayList arrayList2 = new ArrayList(zzy.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str7 = (String) arrayList2.get(i11);
                    if (str7 != null) {
                        this.zzs.zzv();
                        Object obj = zzy.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            zzy.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i12);
                    if (i12 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z11) {
                        bundle2 = this.zzs.zzv().zzt(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.zzs.zzt().zzA(new zzav(str6, new zzat(bundle3), str, j10), str3);
                    if (!z13) {
                        for (zzhj zzhjVar : this.zze) {
                            zzhjVar.onEvent(str, str2, new Bundle(bundle3), j10);
                        }
                    }
                }
                this.zzs.zzax();
                if (this.zzs.zzs().zzj(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.zzs.zzu().zzb.zzd(true, true, this.zzs.zzaw().elapsedRealtime());
                return;
            }
            return;
        }
        this.zzs.zzaz().zzc().zza("Event not sent since app measurement is disabled");
    }

    public final void zzK(zzhj zzhjVar) {
        zza();
        Preconditions.checkNotNull(zzhjVar);
        if (this.zze.add(zzhjVar)) {
            return;
        }
        this.zzs.zzaz().zzk().zza("OnEventListener already registered");
    }

    public final void zzL(long j10) {
        this.zzg.set(null);
        this.zzs.zzaA().zzp(new zzhv(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzM(long j10, boolean z10) {
        zzg();
        zza();
        this.zzs.zzaz().zzc().zza("Resetting analytics data (FE)");
        zzkr zzu = this.zzs.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        boolean zzJ = this.zzs.zzJ();
        zzfn zzm = this.zzs.zzm();
        zzm.zzc.zzb(j10);
        if (!TextUtils.isEmpty(zzm.zzs.zzm().zzo.zza())) {
            zzm.zzo.zzb(null);
        }
        zzol.zzc();
        zzaf zzf = zzm.zzs.zzf();
        zzek zzekVar = zzel.zzae;
        if (zzf.zzs(null, zzekVar)) {
            zzm.zzj.zzb(0L);
        }
        if (!zzm.zzs.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzp.zzb(null);
        zzm.zzq.zzb(0L);
        zzm.zzr.zzb(null);
        if (z10) {
            this.zzs.zzt().zzC();
        }
        zzol.zzc();
        if (this.zzs.zzf().zzs(null, zzekVar)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzN(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.zzs.zzaA().zzp(new zzhs(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    final void zzO(String str, String str2, long j10, Object obj) {
        this.zzs.zzaA().zzp(new zzht(this, str, str2, obj, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzP(String str) {
        this.zzg.set(str);
    }

    public final void zzQ(Bundle bundle) {
        zzR(bundle, this.zzs.zzaw().currentTimeMillis());
    }

    public final void zzR(Bundle bundle, long j10) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzs.zzaz().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzhe.zza(bundle2, "app_id", String.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzhe.zza(bundle2, "name", String.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzhe.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.zzs.zzv().zzl(string) == 0) {
            if (this.zzs.zzv().zzd(string, obj) == 0) {
                Object zzB = this.zzs.zzv().zzB(string, obj);
                if (zzB == null) {
                    this.zzs.zzaz().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
                    return;
                }
                zzhe.zzb(bundle2, zzB);
                long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    this.zzs.zzf();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.zzs.zzaz().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                this.zzs.zzf();
                if (j12 <= 15552000000L && j12 >= 1) {
                    this.zzs.zzaA().zzp(new zzhw(this, bundle2));
                    return;
                } else {
                    this.zzs.zzaz().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j12));
                    return;
                }
            }
            this.zzs.zzaz().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        this.zzs.zzaz().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
    }

    public final void zzS(Bundle bundle, int i10, long j10) {
        zza();
        String zzg = zzah.zzg(bundle);
        if (zzg != null) {
            this.zzs.zzaz().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzs.zzaz().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzT(zzah.zza(bundle), i10, j10);
    }

    public final void zzT(zzah zzahVar, int i10, long j10) {
        zzah zzahVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        zzah zzahVar3 = zzahVar;
        zza();
        if (i10 != -10 && zzahVar.zze() == null && zzahVar.zzf() == null) {
            this.zzs.zzaz().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            zzahVar2 = this.zzi;
            z10 = true;
            z11 = false;
            if (zzah.zzj(i10, this.zzj)) {
                boolean zzk = zzahVar3.zzk(this.zzi);
                zzag zzagVar = zzag.ANALYTICS_STORAGE;
                if (zzahVar3.zzi(zzagVar) && !this.zzi.zzi(zzagVar)) {
                    z11 = true;
                }
                zzahVar3 = zzahVar3.zzd(this.zzi);
                this.zzi = zzahVar3;
                this.zzj = i10;
                z12 = z11;
                z11 = zzk;
            } else {
                z10 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.zzs.zzaz().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzahVar3);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z11) {
            this.zzg.set(null);
            this.zzs.zzaA().zzq(new zzih(this, zzahVar3, j10, i10, andIncrement, z12, zzahVar2));
            return;
        }
        zzii zziiVar = new zzii(this, zzahVar3, i10, andIncrement, z12, zzahVar2);
        if (i10 != 30 && i10 != -10) {
            this.zzs.zzaA().zzp(zziiVar);
        } else {
            this.zzs.zzaA().zzq(zziiVar);
        }
    }

    public final void zzU(final Bundle bundle, final long j10) {
        zzof.zzc();
        if (this.zzs.zzf().zzs(null, zzel.zzal)) {
            this.zzs.zzaA().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzho
                @Override // java.lang.Runnable
                public final void run() {
                    zzin.this.zzC(bundle, j10);
                }
            });
        } else {
            zzC(bundle, j10);
        }
    }

    public final void zzV(zzhi zzhiVar) {
        zzhi zzhiVar2;
        zzg();
        zza();
        if (zzhiVar != null && zzhiVar != (zzhiVar2 = this.zzd)) {
            Preconditions.checkState(zzhiVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhiVar;
    }

    public final void zzW(Boolean bool) {
        zza();
        this.zzs.zzaA().zzp(new zzig(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzX(zzah zzahVar) {
        zzg();
        boolean z10 = (zzahVar.zzi(zzag.ANALYTICS_STORAGE) && zzahVar.zzi(zzag.AD_STORAGE)) || this.zzs.zzt().zzM();
        if (z10 != this.zzs.zzK()) {
            this.zzs.zzG(z10);
            zzfn zzm = this.zzs.zzm();
            zzgi zzgiVar = zzm.zzs;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                zzad(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void zzY(String str, String str2, Object obj, boolean z10) {
        zzZ("auto", "_ldl", obj, true, this.zzs.zzaw().currentTimeMillis());
    }

    public final void zzZ(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        String str3 = str == null ? "app" : str;
        if (z10) {
            i10 = this.zzs.zzv().zzl(str2);
        } else {
            zzlp zzv = this.zzs.zzv();
            if (zzv.zzac("user property", str2)) {
                if (zzv.zzZ("user property", zzhh.zza, null, str2)) {
                    zzv.zzs.zzf();
                    if (zzv.zzY("user property", 24, str2)) {
                        i10 = 0;
                    }
                } else {
                    i10 = 15;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            zzlp zzv2 = this.zzs.zzv();
            this.zzs.zzf();
            this.zzs.zzv().zzN(this.zzn, null, i10, "_ev", zzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int zzd = this.zzs.zzv().zzd(str2, obj);
            if (zzd != 0) {
                zzlp zzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzN(this.zzn, null, zzd, "_ev", zzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object zzB = this.zzs.zzv().zzB(str2, obj);
            if (zzB != null) {
                zzO(str3, str2, j10, zzB);
            }
        } else {
            zzO(str3, str2, j10, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaa(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzgi r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfn r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfm r10 = r10.zzh
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.zzb(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            com.google.android.gms.measurement.internal.zzgi r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfn r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfm r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            com.google.android.gms.measurement.internal.zzgi r10 = r8.zzs
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L7e
            com.google.android.gms.measurement.internal.zzgi r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzey r9 = r9.zzaz()
            com.google.android.gms.measurement.internal.zzew r9 = r9.zzj()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L7e:
            com.google.android.gms.measurement.internal.zzgi r10 = r8.zzs
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L87
            return
        L87:
            com.google.android.gms.measurement.internal.zzll r10 = new com.google.android.gms.measurement.internal.zzll
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzgi r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzkb r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzin.zzaa(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzab(zzhj zzhjVar) {
        zza();
        Preconditions.checkNotNull(zzhjVar);
        if (this.zze.remove(zzhjVar)) {
            return;
        }
        this.zzs.zzaz().zzk().zza("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaA().zzd(atomicReference, 15000L, "boolean test flag value", new zzhz(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaA().zzd(atomicReference, 15000L, "double test flag value", new zzif(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaA().zzd(atomicReference, 15000L, "int test flag value", new zzie(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaA().zzd(atomicReference, 15000L, "long test flag value", new zzid(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zziu zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zziu zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaA().zzd(atomicReference, 15000L, "String test flag value", new zzic(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzs.zzaA().zzs()) {
            this.zzs.zzaz().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzs.zzax();
        if (zzaa.zza()) {
            this.zzs.zzaz().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaA().zzd(atomicReference, 5000L, "get conditional user properties", new zzhy(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzaz().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzlp.zzH(list);
    }

    public final List zzt(boolean z10) {
        zza();
        this.zzs.zzaz().zzj().zza("Getting user properties (FE)");
        if (!this.zzs.zzaA().zzs()) {
            this.zzs.zzax();
            if (zzaa.zza()) {
                this.zzs.zzaz().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzs.zzaA().zzd(atomicReference, 5000L, "get user properties", new zzhu(this, atomicReference, z10));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.zzs.zzaz().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
                return Collections.emptyList();
            }
            return list;
        }
        this.zzs.zzaz().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z10) {
        if (this.zzs.zzaA().zzs()) {
            this.zzs.zzaz().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzax();
        if (zzaa.zza()) {
            this.zzs.zzaz().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaA().zzd(atomicReference, 5000L, "get user properties", new zzia(this, atomicReference, null, str, str2, z10));
        List<zzll> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzaz().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        a aVar = new a(list.size());
        for (zzll zzllVar : list) {
            Object zza = zzllVar.zza();
            if (zza != null) {
                aVar.put(zzllVar.zzb, zza);
            }
        }
        return aVar;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzel.zzY)) {
                zzaf zzf = this.zzs.zzf();
                zzf.zzs.zzax();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzs.zzaz().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaA().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzin zzinVar = zzin.this;
                            zzinVar.zzg();
                            if (!zzinVar.zzs.zzm().zzm.zzb()) {
                                long zza = zzinVar.zzs.zzm().zzn.zza();
                                zzinVar.zzs.zzm().zzn.zzb(1 + zza);
                                zzinVar.zzs.zzf();
                                if (zza >= 5) {
                                    zzinVar.zzs.zzaz().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    zzinVar.zzs.zzm().zzm.zza(true);
                                    return;
                                }
                                zzinVar.zzs.zzE();
                                return;
                            }
                            zzinVar.zzs.zzaz().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzfn zzm = this.zzs.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzH("auto", "_ou", bundle);
        }
    }
}
