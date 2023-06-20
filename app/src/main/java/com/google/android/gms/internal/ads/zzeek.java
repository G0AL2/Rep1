package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeek {
    private final zzbdm zza;
    private final Context zzb;
    private final zzedo zzc;
    private final zzcfo zzd;
    private final String zze;
    private final zzfgp zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzeek(Context context, zzcfo zzcfoVar, zzbdm zzbdmVar, zzedo zzedoVar, String str, zzfgp zzfgpVar) {
        this.zzb = context;
        this.zzd = zzcfoVar;
        this.zza = zzbdmVar;
        this.zzc = zzedoVar;
        this.zze = str;
        this.zzf = zzfgpVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zzbfv zzbfvVar = (zzbfv) arrayList.get(i10);
            if (zzbfvVar.zzw() == 2 && zzbfvVar.zze() > j10) {
                j10 = zzbfvVar.zze();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzb = zzfgo.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzeed.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzeed.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzeed.zzb(sQLiteDatabase, 2)));
            zzb.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzeed.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzbfv zzbfvVar = (zzbfv) zzc.get(i10);
                zzfgo zzb2 = zzfgo.zzb("oa_signals");
                zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                zzbfq zzf = zzbfvVar.zzf();
                String valueOf = zzf.zzf() ? String.valueOf(zzf.zzh() - 1) : "-1";
                String obj = zzfrx.zzb(zzbfvVar.zzk(), new zzfok() { // from class: com.google.android.gms.internal.ads.zzeej
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj2) {
                        return ((zzbek) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzbfvVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzbfvVar.zzw() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzbfvVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzbfvVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", valueOf);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzbfvVar.zzx() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzbfvVar.zzt() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzbfvVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzbfvVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzbfvVar.zzv() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzbfvVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzeed.zzc(sQLiteDatabase);
            zzbfw zza = zzbga.zza();
            zza.zzb(this.zzb.getPackageName());
            zza.zzd(Build.MODEL);
            zza.zze(zzeed.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzg(zzeed.zza(sQLiteDatabase, 1));
            zza.zzc(zzeed.zza(sQLiteDatabase, 3));
            zza.zzh(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
            zza.zzf(zzeed.zzb(sQLiteDatabase, 2));
            final zzbga zzbgaVar = (zzbga) zza.zzal();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzeeh
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbfb zzbfbVar) {
                    zzbfbVar.zzi(zzbga.this);
                }
            });
            zzbgl zza2 = zzbgm.zza();
            zza2.zza(this.zzd.zzb);
            zza2.zzc(this.zzd.zzc);
            zza2.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzbgm zzbgmVar = (zzbgm) zza2.zzal();
            this.zza.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzeei
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbfb zzbfbVar) {
                    zzbgm zzbgmVar2 = zzbgm.this;
                    zzbet zzbetVar = (zzbet) zzbfbVar.zzb().zzaz();
                    zzbetVar.zzb(zzbgmVar2);
                    zzbfbVar.zzg(zzbetVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzeed.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeeg
                @Override // com.google.android.gms.internal.ads.zzffi
                public final Object zza(Object obj) {
                    zzeek.this.zza(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            zzcfi.zzg("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
