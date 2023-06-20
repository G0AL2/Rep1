package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzak extends SQLiteOpenHelper {
    final /* synthetic */ zzal zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzal zzalVar, Context context, String str) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzalVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        zzks zzksVar;
        zzks zzksVar2;
        zzks zzksVar3;
        zzal zzalVar = this.zza;
        zzksVar = zzalVar.zzk;
        zzalVar.zzs.zzf();
        if (zzksVar.zzc(3600000L)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                zzksVar2 = this.zza.zzk;
                zzksVar2.zzb();
                this.zza.zzs.zzaz().zzd().zza("Opening the database failed, dropping and recreating it");
                this.zza.zzs.zzf();
                if (!this.zza.zzs.zzav().getDatabasePath("google_app_measurement.db").delete()) {
                    this.zza.zzs.zzaz().zzd().zzb("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    zzksVar3 = this.zza.zzk;
                    zzksVar3.zza();
                    return writableDatabase;
                } catch (SQLiteException e10) {
                    this.zza.zzs.zzaz().zzd().zzb("Failed to open freshly created database", e10);
                    throw e10;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzam.zzb(this.zza.zzs.zzaz(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        zzey zzaz = this.zza.zzs.zzaz();
        strArr = zzal.zza;
        zzam.zza(zzaz, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        zzam.zza(this.zza.zzs.zzaz(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        zzey zzaz2 = this.zza.zzs.zzaz();
        strArr2 = zzal.zzb;
        zzam.zza(zzaz2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        zzey zzaz3 = this.zza.zzs.zzaz();
        strArr3 = zzal.zzc;
        zzam.zza(zzaz3, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        zzey zzaz4 = this.zza.zzs.zzaz();
        strArr4 = zzal.zze;
        zzam.zza(zzaz4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        zzam.zza(this.zza.zzs.zzaz(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        zzey zzaz5 = this.zza.zzs.zzaz();
        strArr5 = zzal.zzd;
        zzam.zza(zzaz5, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        zzey zzaz6 = this.zza.zzs.zzaz();
        strArr6 = zzal.zzg;
        zzam.zza(zzaz6, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
        zzey zzaz7 = this.zza.zzs.zzaz();
        strArr7 = zzal.zzh;
        zzam.zza(zzaz7, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
        zzam.zza(this.zza.zzs.zzaz(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        zzey zzaz8 = this.zza.zzs.zzaz();
        strArr8 = zzal.zzi;
        zzam.zza(zzaz8, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
        zzam.zza(this.zza.zzs.zzaz(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        zzam.zza(this.zza.zzs.zzaz(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        zzam.zza(this.zza.zzs.zzaz(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
