package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzal extends zzkw {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzak zzj;
    private final zzks zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zzli zzliVar) {
        super(zzliVar);
        this.zzk = new zzks(this.zzs.zzaw());
        this.zzs.zzf();
        this.zzj = new zzak(this, this.zzs.zzav(), "google_app_measurement.db");
    }

    static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.zzs.zzaz().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                this.zzs.zzaz().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzd("Error deleting user property. appId", zzey.zzn(str), this.zzs.zzj().zzf(str2), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0358, code lost:
        if (zzh().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035a, code lost:
        r23.zzs.zzaz().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzey.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0373, code lost:
        r23.zzs.zzaz().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzey.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0386, code lost:
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (((com.google.android.gms.internal.measurement.zzes) r11.next()).zzj() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r23.zzs.zzaz().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzey.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r12 = (com.google.android.gms.internal.measurement.zzej) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.zzg()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
        r0 = r23.zzs.zzaz().zzk();
        r8 = com.google.android.gms.measurement.internal.zzey.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r12.zzp() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
        r3 = r12.zzby();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023d, code lost:
        if (r12.zzp() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0259, code lost:
        if (r12.zzq() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        if (zzh().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027b, code lost:
        r23.zzs.zzaz().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzey.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028e, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        r23.zzs.zzaz().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzey.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
        r21 = r4;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b8, code lost:
        if (r0.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ba, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzes) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.zze()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d6, code lost:
        r0 = r23.zzs.zzaz().zzk();
        r7 = com.google.android.gms.measurement.internal.zzey.zzn(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ee, code lost:
        if (r3.zzj() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fa, code lost:
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0303, code lost:
        r4 = r3.zzby();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x031a, code lost:
        if (r3.zzj() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0325, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0338, code lost:
        if (r3.zzk() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzB(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzB(java.lang.String, java.util.List):void");
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzg zzgVar) {
        Preconditions.checkNotNull(zzgVar);
        zzg();
        zzW();
        String zzt = zzgVar.zzt();
        Preconditions.checkNotNull(zzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzt);
        contentValues.put("app_instance_id", zzgVar.zzu());
        contentValues.put("gmp_app_id", zzgVar.zzy());
        contentValues.put("resettable_device_id_hash", zzgVar.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzn()));
        contentValues.put("app_version", zzgVar.zzw());
        contentValues.put("app_store", zzgVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzaj()));
        contentValues.put("day", Long.valueOf(zzgVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzb()));
        contentValues.put("firebase_instance_id", zzgVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzh()));
        contentValues.put("health_monitor_sample", zzgVar.zzz());
        contentValues.put("android_id", Long.valueOf(zzgVar.zza()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzai()));
        contentValues.put("admob_app_id", zzgVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzk()));
        contentValues.put("session_stitching_token", zzgVar.zzB());
        List zzC = zzgVar.zzC();
        if (zzC != null) {
            if (zzC.isEmpty()) {
                this.zzs.zzaz().zzk().zzb("Safelisted events should not be an empty list. appId", zzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzC));
            }
        }
        zznz.zzc();
        if (this.zzs.zzf().zzs(null, zzel.zzay) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzt}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzs.zzaz().zzd().zzb("Failed to insert/update app (got -1). appId", zzey.zzn(zzt));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzc("Error storing app. appId", zzey.zzn(zzt), e10);
        }
    }

    public final void zzE(zzar zzarVar) {
        Preconditions.checkNotNull(zzarVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzarVar.zza);
        contentValues.put("name", zzarVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzarVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzarVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzarVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzarVar.zzg));
        contentValues.put("last_bundled_day", zzarVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzarVar.zzi);
        contentValues.put("last_sampling_rate", zzarVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzarVar.zze));
        Boolean bool = zzarVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzs.zzaz().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzey.zzn(zzarVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzc("Error storing event aggregates. appId", zzey.zzn(zzarVar.zza), e10);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    protected final boolean zzI() {
        Context zzav = this.zzs.zzav();
        this.zzs.zzf();
        return zzav.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l10, long j10, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzfsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l10);
        byte[] zzby = zzfsVar.zzby();
        this.zzs.zzaz().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(zzby.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzby);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzs.zzaz().zzd().zzb("Failed to insert complex main event (got -1). appId", zzey.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzc("Error storing complex main event. appId", zzey.zzn(str), e10);
            return false;
        }
    }

    public final boolean zzK(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zzW();
        String str = zzabVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzabVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzabVar.zzb);
        contentValues.put("name", zzabVar.zzc.zzb);
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, Preconditions.checkNotNull(zzabVar.zzc.zza()));
        contentValues.put("active", Boolean.valueOf(zzabVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzabVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzabVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().zzao(zzabVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzabVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().zzao(zzabVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzabVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzabVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().zzao(zzabVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzs.zzaz().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzey.zzn(str));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzc("Error storing conditional user property", zzey.zzn(str), e10);
        }
        return true;
    }

    public final boolean zzL(zzln zzlnVar) {
        Preconditions.checkNotNull(zzlnVar);
        zzg();
        zzW();
        if (zzp(zzlnVar.zza, zzlnVar.zzc) == null) {
            if (zzlp.zzai(zzlnVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlnVar.zza}) >= this.zzs.zzf().zzf(zzlnVar.zza, zzel.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlnVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlnVar.zza, zzlnVar.zzb});
                this.zzs.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlnVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzlnVar.zzb);
        contentValues.put("name", zzlnVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlnVar.zzd));
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzlnVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzs.zzaz().zzd().zzb("Failed to insert/update user property (got -1). appId", zzey.zzn(zzlnVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzc("Error storing user property. appId", zzey.zzn(zzlnVar.zza), e10);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0225: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:99:0x0225 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void zzU(String str, long j10, long j11, zzlf zzlfVar) {
        ?? r42;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr;
        Preconditions.checkNotNull(zzlfVar);
        zzg();
        zzW();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                r42 = TextUtils.isEmpty(null);
                try {
                    if (r42 != 0) {
                        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        rawQuery = zzh2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (i10 != 0 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", i10 != 0 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i11 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        rawQuery = zzh2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (i11 != 0 ? " and rowid <= ?" : "") + " order by rowid limit 1;", i11 != 0 ? new String[]{null, String.valueOf(j11)} : new String[]{null});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str4 = string;
                    try {
                        Cursor query = zzh2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str4}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.zzs.zzaz().zzd().zzb("Raw event metadata record is missing. appId", zzey.zzn(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgb) zzlk.zzl(com.google.android.gms.internal.measurement.zzgc.zzu(), query.getBlob(0))).zzaE();
                                    if (query.moveToNext()) {
                                        this.zzs.zzaz().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzey.zzn(str3));
                                    }
                                    query.close();
                                    Preconditions.checkNotNull(zzgcVar);
                                    zzlfVar.zza = zzgcVar;
                                    if (j11 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str3, str4, String.valueOf(j11)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str3, str4};
                                    }
                                    Cursor query2 = zzh2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                    if (query2.moveToFirst()) {
                                        do {
                                            long j12 = query2.getLong(0);
                                            try {
                                                com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) zzlk.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), query2.getBlob(3));
                                                zzfrVar.zzi(query2.getString(1));
                                                zzfrVar.zzm(query2.getLong(2));
                                                if (!zzlfVar.zza(j12, (com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE())) {
                                                    query2.close();
                                                    return;
                                                }
                                            } catch (IOException e10) {
                                                this.zzs.zzaz().zzd().zzc("Data loss. Failed to merge raw event. appId", zzey.zzn(str3), e10);
                                            }
                                        } while (query2.moveToNext());
                                        query2.close();
                                        return;
                                    }
                                    this.zzs.zzaz().zzk().zzb("Raw event data disappeared while in transaction. appId", zzey.zzn(str3));
                                    query2.close();
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    r42 = query;
                                    this.zzs.zzaz().zzd().zzc("Data loss. Error selecting raw event. appId", zzey.zzn(str3), e);
                                    if (r42 != 0) {
                                        r42.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = query;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e12) {
                                this.zzs.zzaz().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzey.zzn(str3), e12);
                                query.close();
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        r42 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (SQLiteException e16) {
                e = e16;
                r42 = 0;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor2 = cursor;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzd("Error deleting conditional property", zzey.zzn(str), this.zzs.zzj().zzf(str2), e10);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final long zzc(String str, String str2) {
        long zzaa;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        long j10 = 0;
        try {
            try {
                zzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (zzaa == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzaz().zzd().zzc("Failed to insert column (got -1). appId", zzey.zzn(str), "first_open_count");
                        return -1L;
                    }
                    zzaa = 0;
                }
            } finally {
                zzh2.endTransaction();
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + zzaa));
            if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                this.zzs.zzaz().zzd().zzc("Failed to update column (got 0). appId", zzey.zzn(str), "first_open_count");
                return -1L;
            }
            zzh2.setTransactionSuccessful();
            return zzaa;
        } catch (SQLiteException e11) {
            e = e11;
            j10 = zzaa;
            this.zzs.zzaz().zzd().zzd("Error inserting column. appId", zzey.zzn(str), "first_open_count", e);
            zzh2.endTransaction();
            return j10;
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzk().zzb("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.zzh()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.zzgi r8 = r7.zzs     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzaz()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfr r3 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzli r2 = com.google.android.gms.measurement.internal.zzlk.zzl(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzkc r2 = r2.zzaE()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzli r8 = r7.zzf     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfw r3 = (com.google.android.gms.internal.measurement.zzfw) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.zzv()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.zzy()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.zzw()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgi r3 = r7.zzs     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzey.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.zzc(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.zzgi r2 = r7.zzs     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d A[Catch: SQLiteException -> 0x01ea, all -> 0x0209, TryCatch #0 {SQLiteException -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0159, B:25:0x0167, B:24:0x0163, B:26:0x016a, B:28:0x0172, B:32:0x017a, B:36:0x0193, B:38:0x019e, B:39:0x01b0, B:41:0x01c1, B:42:0x01ca, B:44:0x01d3, B:35:0x018f, B:18:0x011d), top: B:62:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0159 A[Catch: SQLiteException -> 0x01ea, all -> 0x0209, TryCatch #0 {SQLiteException -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0159, B:25:0x0167, B:24:0x0163, B:26:0x016a, B:28:0x0172, B:32:0x017a, B:36:0x0193, B:38:0x019e, B:39:0x01b0, B:41:0x01c1, B:42:0x01ca, B:44:0x01d3, B:35:0x018f, B:18:0x011d), top: B:62:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f A[Catch: SQLiteException -> 0x01ea, all -> 0x0209, TryCatch #0 {SQLiteException -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0159, B:25:0x0167, B:24:0x0163, B:26:0x016a, B:28:0x0172, B:32:0x017a, B:36:0x0193, B:38:0x019e, B:39:0x01b0, B:41:0x01c1, B:42:0x01ca, B:44:0x01d3, B:35:0x018f, B:18:0x011d), top: B:62:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019e A[Catch: SQLiteException -> 0x01ea, all -> 0x0209, TryCatch #0 {SQLiteException -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0159, B:25:0x0167, B:24:0x0163, B:26:0x016a, B:28:0x0172, B:32:0x017a, B:36:0x0193, B:38:0x019e, B:39:0x01b0, B:41:0x01c1, B:42:0x01ca, B:44:0x01d3, B:35:0x018f, B:18:0x011d), top: B:62:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c1 A[Catch: SQLiteException -> 0x01ea, all -> 0x0209, TryCatch #0 {SQLiteException -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0159, B:25:0x0167, B:24:0x0163, B:26:0x016a, B:28:0x0172, B:32:0x017a, B:36:0x0193, B:38:0x019e, B:39:0x01b0, B:41:0x01c1, B:42:0x01ca, B:44:0x01d3, B:35:0x018f, B:18:0x011d), top: B:62:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d3 A[Catch: SQLiteException -> 0x01ea, all -> 0x0209, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01ea, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0159, B:25:0x0167, B:24:0x0163, B:26:0x016a, B:28:0x0172, B:32:0x017a, B:36:0x0193, B:38:0x019e, B:39:0x01b0, B:41:0x01c1, B:42:0x01ca, B:44:0x01d3, B:35:0x018f, B:18:0x011d), top: B:62:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zzj(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzab zzk(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    public final zzaj zzl(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return zzm(j10, str, 1L, false, false, z12, false, z14);
    }

    public final zzaj zzm(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzaj zzajVar = new zzaj();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzs.zzaz().zzk().zzb("Not updating daily counts, app is not known. appId", zzey.zzn(str));
                    query.close();
                    return zzajVar;
                }
                if (query.getLong(0) == j10) {
                    zzajVar.zzb = query.getLong(1);
                    zzajVar.zza = query.getLong(2);
                    zzajVar.zzc = query.getLong(3);
                    zzajVar.zzd = query.getLong(4);
                    zzajVar.zze = query.getLong(5);
                }
                if (z10) {
                    zzajVar.zzb += j11;
                }
                if (z11) {
                    zzajVar.zza += j11;
                }
                if (z12) {
                    zzajVar.zzc += j11;
                }
                if (z13) {
                    zzajVar.zzd += j11;
                }
                if (z14) {
                    zzajVar.zze += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(zzajVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzajVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzajVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzajVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzajVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzajVar;
            } catch (SQLiteException e10) {
                this.zzs.zzaz().zzd().zzc("Error updating daily counts. appId", zzey.zzn(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return zzajVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzar zzn(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzar");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzln zzp(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.zzg()
            r19.zzW()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzh()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.zzq(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzln r0 = new com.google.android.gms.measurement.internal.zzln     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzgi r5 = r1.zzs     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzet r5 = r5.zzj()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.zzf(r9)     // Catch: java.lang.Throwable -> La2
            r2.zzd(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzln");
    }

    @VisibleForTesting
    final Object zzq(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.zzs.zzaz().zzd().zza("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.zzs.zzaz().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    this.zzs.zzaz().zzd().zza("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i10);
            }
            return Double.valueOf(cursor.getDouble(i10));
        } else {
            return Long.valueOf(cursor.getLong(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzr() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zzh()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.zzgi r3 = r6.zzs     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzr():java.lang.String");
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.zzs.zzaz().zzd();
        r27.zzs.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzt(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzs.zzf();
                cursor = zzh().query("user_attributes", new String[]{"name", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzs.zzaz().zzd().zzb("Read invalid user property value, ignoring it. appId", zzey.zzn(str));
                    } else {
                        arrayList.add(new zzln(str, str2, string, j10, zzq));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.zzs.zzaz().zzd().zzc("Error querying user properties. appId", zzey.zzn(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r0 = r17.zzs.zzaz().zzd();
        r17.zzs.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzv(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzs.zzaz().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                this.zzs.zzaz().zzd().zzb("Error incrementing retry count. error", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzs.zzaw().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzs.zzf();
            if (abs > ((Long) zzel.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    this.zzs.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzs.zzaw().currentTimeMillis()), String.valueOf(zzaf.zzA())});
                    if (delete > 0) {
                        this.zzs.zzaz().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
