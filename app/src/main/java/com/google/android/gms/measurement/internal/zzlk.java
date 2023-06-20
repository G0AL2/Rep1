package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.internal.measurement.zzpp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlk extends zzkw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlk(zzli zzliVar) {
        super(zzliVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean zzA(zzav zzavVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzavVar);
        Preconditions.checkNotNull(zzpVar);
        return (TextUtils.isEmpty(zzpVar.zzb) && TextUtils.isEmpty(zzpVar.zzq)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final com.google.android.gms.internal.measurement.zzfw zzB(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzfsVar.zzi()) {
            if (zzfwVar.zzg().equals(str)) {
                return zzfwVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object zzC(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        com.google.android.gms.internal.measurement.zzfw zzB = zzB(zzfsVar, str);
        if (zzB != null) {
            if (zzB.zzy()) {
                return zzB.zzh();
            }
            if (zzB.zzw()) {
                return Long.valueOf(zzB.zzd());
            }
            if (zzB.zzu()) {
                return Double.valueOf(zzB.zza());
            }
            if (zzB.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfw> zzi = zzB.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzi) {
                    if (zzfwVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfw zzfwVar2 : zzfwVar.zzi()) {
                            if (zzfwVar2.zzy()) {
                                bundle.putString(zzfwVar2.zzg(), zzfwVar2.zzh());
                            } else if (zzfwVar2.zzw()) {
                                bundle.putLong(zzfwVar2.zzg(), zzfwVar2.zzd());
                            } else if (zzfwVar2.zzu()) {
                                bundle.putDouble(zzfwVar2.zzg(), zzfwVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void zzD(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it.next();
            if (zzfwVar != null) {
                zzF(sb2, i11);
                sb2.append("param {\n");
                zzI(sb2, i11, "name", zzfwVar.zzx() ? this.zzs.zzj().zze(zzfwVar.zzg()) : null);
                zzI(sb2, i11, "string_value", zzfwVar.zzy() ? zzfwVar.zzh() : null);
                zzI(sb2, i11, "int_value", zzfwVar.zzw() ? Long.valueOf(zzfwVar.zzd()) : null);
                zzI(sb2, i11, "double_value", zzfwVar.zzu() ? Double.valueOf(zzfwVar.zza()) : null);
                if (zzfwVar.zzc() > 0) {
                    zzD(sb2, i11, zzfwVar.zzi());
                }
                zzF(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void zzE(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append("filter {\n");
        if (zzelVar.zzh()) {
            zzI(sb2, i10, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            zzI(sb2, i10, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.zzex zzd = zzelVar.zzd();
            if (zzd != null) {
                zzF(sb2, i11);
                sb2.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb2, i11, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzI(sb2, i11, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzI(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzF(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzF(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zzF(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            zzJ(sb2, i10 + 1, "number_filter", zzelVar.zzc());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    private static final void zzF(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final String zzG(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzH(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzgh zzghVar) {
        if (zzghVar == null) {
            return;
        }
        zzF(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzghVar.zzb() != 0) {
            zzF(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : zzghVar.zzk()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzghVar.zzd() != 0) {
            zzF(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zzghVar.zzn()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zzghVar.zza() != 0) {
            zzF(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzfqVar.zzh() ? Integer.valueOf(zzfqVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzfqVar.zzg() ? Long.valueOf(zzfqVar.zzb()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zzghVar.zzc() != 0) {
            zzF(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.zzgj zzgjVar : zzghVar.zzm()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzgjVar.zzi() ? Integer.valueOf(zzgjVar.zzb()) : null);
                sb2.append(": [");
                int i19 = 0;
                for (Long l12 : zzgjVar.zzf()) {
                    long longValue = l12.longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        zzF(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzI(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzJ(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        if (zzeqVar == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzeqVar.zzg()) {
            int zzm = zzeqVar.zzm();
            zzI(sb2, i10, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzeqVar.zzi()) {
            zzI(sb2, i10, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            zzI(sb2, i10, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            zzI(sb2, i10, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            zzI(sb2, i10, "max_comparison_value", zzeqVar.zzd());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(com.google.android.gms.internal.measurement.zzgb zzgbVar, String str) {
        if (zzgbVar != null) {
            for (int i10 = 0; i10 < zzgbVar.zzb(); i10++) {
                if (str.equals(zzgbVar.zzap(i10).zzf())) {
                    return i10;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.internal.measurement.zzli zzl(com.google.android.gms.internal.measurement.zzli zzliVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkm {
        com.google.android.gms.internal.measurement.zzjo zzb = com.google.android.gms.internal.measurement.zzjo.zzb();
        if (zzb != null) {
            return zzliVar.zzaA(bArr, zzb);
        }
        return zzliVar.zzaz(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzv(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzz(com.google.android.gms.internal.measurement.zzfr zzfrVar, String str, Object obj) {
        List zzp = zzfrVar.zzp();
        int i10 = 0;
        while (true) {
            if (i10 >= zzp.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfw) zzp.get(i10)).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            zzfrVar.zzj(i10, zze);
        } else {
            zzfrVar.zze(zze);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzF = zzlp.zzF();
        if (zzF == null) {
            this.zzs.zzaz().zzd().zza("Failed to get MD5");
            return 0L;
        }
        return zzlp.zzp(zzF.digest(bArr));
    }

    final Bundle zzf(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                zzpa.zzc();
                if (this.zzs.zzf().zzs(null, zzel.zzam)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(zzf((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i11), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzaz().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzav zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzf = zzf(zzaaVar.zze(), true);
        String obj2 = (!zzf.containsKey("_o") || (obj = zzf.get("_o")) == null) ? "app" : obj.toString();
        String zzb = zzhf.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzav(zzb, new zzat(zzf), obj2, zzaaVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.zzfs zzj(zzaq zzaqVar) {
        com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
        zze.zzl(zzaqVar.zze);
        zzas zzasVar = new zzas(zzaqVar.zzf);
        while (zzasVar.hasNext()) {
            String next = zzasVar.next();
            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
            zze2.zzj(next);
            Object zzf = zzaqVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzt(zze2, zzf);
            zze.zze(zze2);
        }
        return (com.google.android.gms.internal.measurement.zzfs) zze.zzaE();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzm(com.google.android.gms.internal.measurement.zzga zzgaVar) {
        if (zzgaVar == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgc zzgcVar : zzgaVar.zzd()) {
            if (zzgcVar != null) {
                zzF(sb2, 1);
                sb2.append("bundle {\n");
                if (zzgcVar.zzbm()) {
                    zzI(sb2, 1, "protocol_version", Integer.valueOf(zzgcVar.zzd()));
                }
                zzpp.zzc();
                if (this.zzs.zzf().zzs(null, zzel.zzaH) && zzgcVar.zzbp()) {
                    zzI(sb2, 1, "session_stitching_token", zzgcVar.zzL());
                }
                zzI(sb2, 1, "platform", zzgcVar.zzJ());
                if (zzgcVar.zzbi()) {
                    zzI(sb2, 1, "gmp_version", Long.valueOf(zzgcVar.zzn()));
                }
                if (zzgcVar.zzbt()) {
                    zzI(sb2, 1, "uploading_gmp_version", Long.valueOf(zzgcVar.zzs()));
                }
                if (zzgcVar.zzbg()) {
                    zzI(sb2, 1, "dynamite_version", Long.valueOf(zzgcVar.zzk()));
                }
                if (zzgcVar.zzbd()) {
                    zzI(sb2, 1, "config_version", Long.valueOf(zzgcVar.zzi()));
                }
                zzI(sb2, 1, "gmp_app_id", zzgcVar.zzG());
                zzI(sb2, 1, "admob_app_id", zzgcVar.zzx());
                zzI(sb2, 1, "app_id", zzgcVar.zzy());
                zzI(sb2, 1, "app_version", zzgcVar.zzB());
                if (zzgcVar.zzbb()) {
                    zzI(sb2, 1, "app_version_major", Integer.valueOf(zzgcVar.zza()));
                }
                zzI(sb2, 1, "firebase_instance_id", zzgcVar.zzF());
                if (zzgcVar.zzbf()) {
                    zzI(sb2, 1, "dev_cert_hash", Long.valueOf(zzgcVar.zzj()));
                }
                zzI(sb2, 1, "app_store", zzgcVar.zzA());
                if (zzgcVar.zzbs()) {
                    zzI(sb2, 1, "upload_timestamp_millis", Long.valueOf(zzgcVar.zzr()));
                }
                if (zzgcVar.zzbq()) {
                    zzI(sb2, 1, "start_timestamp_millis", Long.valueOf(zzgcVar.zzq()));
                }
                if (zzgcVar.zzbh()) {
                    zzI(sb2, 1, "end_timestamp_millis", Long.valueOf(zzgcVar.zzm()));
                }
                if (zzgcVar.zzbl()) {
                    zzI(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgcVar.zzp()));
                }
                if (zzgcVar.zzbk()) {
                    zzI(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgcVar.zzo()));
                }
                zzI(sb2, 1, "app_instance_id", zzgcVar.zzz());
                zzI(sb2, 1, "resettable_device_id", zzgcVar.zzK());
                zzI(sb2, 1, "ds_id", zzgcVar.zzE());
                if (zzgcVar.zzbj()) {
                    zzI(sb2, 1, "limited_ad_tracking", Boolean.valueOf(zzgcVar.zzaY()));
                }
                zzI(sb2, 1, "os_version", zzgcVar.zzI());
                zzI(sb2, 1, "device_model", zzgcVar.zzD());
                zzI(sb2, 1, "user_default_language", zzgcVar.zzM());
                if (zzgcVar.zzbr()) {
                    zzI(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(zzgcVar.zzf()));
                }
                if (zzgcVar.zzbc()) {
                    zzI(sb2, 1, "bundle_sequential_index", Integer.valueOf(zzgcVar.zzb()));
                }
                if (zzgcVar.zzbo()) {
                    zzI(sb2, 1, "service_upload", Boolean.valueOf(zzgcVar.zzaZ()));
                }
                zzI(sb2, 1, "health_monitor", zzgcVar.zzH());
                if (!this.zzs.zzf().zzs(null, zzel.zzah) && zzgcVar.zzba() && zzgcVar.zzh() != 0) {
                    zzI(sb2, 1, "android_id", Long.valueOf(zzgcVar.zzh()));
                }
                if (zzgcVar.zzbn()) {
                    zzI(sb2, 1, "retry_counter", Integer.valueOf(zzgcVar.zze()));
                }
                if (zzgcVar.zzbe()) {
                    zzI(sb2, 1, "consent_signals", zzgcVar.zzC());
                }
                List<com.google.android.gms.internal.measurement.zzgl> zzP = zzgcVar.zzP();
                if (zzP != null) {
                    for (com.google.android.gms.internal.measurement.zzgl zzglVar : zzP) {
                        if (zzglVar != null) {
                            zzF(sb2, 2);
                            sb2.append("user_property {\n");
                            zzI(sb2, 2, "set_timestamp_millis", zzglVar.zzs() ? Long.valueOf(zzglVar.zzc()) : null);
                            zzI(sb2, 2, "name", this.zzs.zzj().zzf(zzglVar.zzf()));
                            zzI(sb2, 2, "string_value", zzglVar.zzg());
                            zzI(sb2, 2, "int_value", zzglVar.zzr() ? Long.valueOf(zzglVar.zzb()) : null);
                            zzI(sb2, 2, "double_value", zzglVar.zzq() ? Double.valueOf(zzglVar.zza()) : null);
                            zzF(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfo> zzN = zzgcVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfo zzfoVar : zzN) {
                        if (zzfoVar != null) {
                            zzF(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (zzfoVar.zzk()) {
                                zzI(sb2, 2, "audience_id", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzm()) {
                                zzI(sb2, 2, "new_audience", Boolean.valueOf(zzfoVar.zzj()));
                            }
                            zzH(sb2, 2, "current_data", zzfoVar.zzd());
                            if (zzfoVar.zzn()) {
                                zzH(sb2, 2, "previous_data", zzfoVar.zze());
                            }
                            zzF(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfs> zzO = zzgcVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzO) {
                        if (zzfsVar != null) {
                            zzF(sb2, 2);
                            sb2.append("event {\n");
                            zzI(sb2, 2, "name", this.zzs.zzj().zzd(zzfsVar.zzh()));
                            if (zzfsVar.zzu()) {
                                zzI(sb2, 2, "timestamp_millis", Long.valueOf(zzfsVar.zzd()));
                            }
                            if (zzfsVar.zzt()) {
                                zzI(sb2, 2, "previous_timestamp_millis", Long.valueOf(zzfsVar.zzc()));
                            }
                            if (zzfsVar.zzs()) {
                                zzI(sb2, 2, "count", Integer.valueOf(zzfsVar.zza()));
                            }
                            if (zzfsVar.zzb() != 0) {
                                zzD(sb2, 2, zzfsVar.zzi());
                            }
                            zzF(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                zzF(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzo(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            zzI(sb2, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        zzI(sb2, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String zzG = zzG(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!zzG.isEmpty()) {
            zzI(sb2, 0, "filter_type", zzG);
        }
        if (zzejVar.zzo()) {
            zzJ(sb2, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            sb2.append("  filters {\n");
            for (com.google.android.gms.internal.measurement.zzel zzelVar : zzejVar.zzh()) {
                zzE(sb2, 2, zzelVar);
            }
        }
        zzF(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzp(com.google.android.gms.internal.measurement.zzes zzesVar) {
        if (zzesVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            zzI(sb2, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        zzI(sb2, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String zzG = zzG(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!zzG.isEmpty()) {
            zzI(sb2, 0, "filter_type", zzG);
        }
        zzE(sb2, 1, zzesVar.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzq(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzaz().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzaz().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r7 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r7 >= r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        r4.add(zzs((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0.put(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map zzs(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.zzpa.zzc()
            com.google.android.gms.measurement.internal.zzgi r4 = r10.zzs
            com.google.android.gms.measurement.internal.zzaf r4 = r4.zzf()
            r5 = 0
            com.google.android.gms.measurement.internal.zzek r6 = com.google.android.gms.measurement.internal.zzel.zzam
            boolean r4 = r4.zzs(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = 0
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzs(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = 0
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzs(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzs(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlk.zzs(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt(com.google.android.gms.internal.measurement.zzfv zzfvVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.checkNotNull(obj);
        zzfvVar.zzg();
        zzfvVar.zze();
        zzfvVar.zzd();
        zzfvVar.zzf();
        if (obj instanceof String) {
            zzfvVar.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfvVar.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfvVar.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzfw) zze.zzaE());
                    }
                }
            }
            zzfvVar.zzb(arrayList);
        } else {
            this.zzs.zzaz().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(com.google.android.gms.internal.measurement.zzgk zzgkVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgkVar.zzc();
        zzgkVar.zzb();
        zzgkVar.zza();
        if (obj instanceof String) {
            zzgkVar.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzgkVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgkVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzaz().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.zzs.zzaw().currentTimeMillis() - j10) > j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzs.zzaz().zzd().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }
}
