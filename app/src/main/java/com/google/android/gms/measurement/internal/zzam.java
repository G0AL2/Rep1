package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzam {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zza(com.google.android.gms.measurement.internal.zzey r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) throws android.database.sqlite.SQLiteException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zza(com.google.android.gms.measurement.internal.zzey, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(zzey zzeyVar, SQLiteDatabase sQLiteDatabase) {
        if (zzeyVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzeyVar.zzk().zza("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzeyVar.zzk().zza("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzeyVar.zzk().zza("Failed to turn on database read permission for owner");
            }
            if (file.setWritable(true, true)) {
                return;
            }
            zzeyVar.zzk().zza("Failed to turn on database write permission for owner");
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
