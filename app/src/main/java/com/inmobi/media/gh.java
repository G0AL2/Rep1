package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashDao.java */
/* loaded from: classes3.dex */
public class gh extends gl {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25538a = "gh";

    public gh() {
        he a10 = he.a();
        a10.a(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a10.b();
    }

    public static void a(gi giVar) {
        he a10 = he.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", giVar.f25541b);
        contentValues.put("componentType", giVar.f25543d);
        contentValues.put("eventType", giVar.f25542c);
        contentValues.put("payload", giVar.a());
        contentValues.put("ts", String.valueOf(giVar.f25544e));
        a10.a(AppMeasurement.CRASH_ORIGIN, contentValues);
        a10.b();
    }

    @Override // com.inmobi.media.gl
    public final void b(long j10) {
        he a10 = he.a();
        a10.a(AppMeasurement.CRASH_ORIGIN, "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j10 * 1000))});
        a10.b();
    }

    @Override // com.inmobi.media.gl
    public final void c(long j10) {
        Context c10 = ho.c();
        if (c10 != null) {
            hf.a(c10, "batch_processing_info").a("crash_last_batch_process", j10);
        }
    }

    @Override // com.inmobi.media.gl
    public final long c() {
        Context c10 = ho.c();
        if (c10 != null) {
            return hf.a(c10, "batch_processing_info").b("crash_last_batch_process", -1L);
        }
        return -1L;
    }

    public static void b() {
        he a10 = he.a();
        List<ContentValues> a11 = a10.a(AppMeasurement.CRASH_ORIGIN, null, null, null, null, null, "ts ASC", "1");
        if (!a11.isEmpty()) {
            String asString = a11.get(0).getAsString("id");
            a10.a(AppMeasurement.CRASH_ORIGIN, "id IN (" + asString + ")", null);
        }
        a10.b();
    }

    public static List<gi> a(int i10) {
        he a10 = he.a();
        List<ContentValues> a11 = a10.a(AppMeasurement.CRASH_ORIGIN, null, null, null, null, null, "ts ASC", String.valueOf(i10));
        ArrayList arrayList = new ArrayList();
        a10.b();
        for (ContentValues contentValues : a11) {
            arrayList.add(gi.a(contentValues));
        }
        return arrayList;
    }

    @Override // com.inmobi.media.gl
    public final boolean a(long j10) {
        List<gi> a10 = a(1);
        return a10.size() > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a10.get(0).f25544e) > j10;
    }

    @Override // com.inmobi.media.gl
    public final boolean a(long j10, long j11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(System.currentTimeMillis()) + j10;
        List<gi> a10 = a(1);
        return a10.size() > 0 && seconds - timeUnit.toSeconds(a10.get(0).f25544e) >= j11;
    }

    @Override // com.inmobi.media.gl
    public final int a() {
        he a10 = he.a();
        int a11 = a10.a(AppMeasurement.CRASH_ORIGIN);
        a10.b();
        return a11;
    }

    @Override // com.inmobi.media.gl
    public final void a(List<Integer> list) {
        if (list.isEmpty()) {
            return;
        }
        he a10 = he.a();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size() - 1; i10++) {
            sb2.append(list.get(i10));
            sb2.append(",");
        }
        sb2.append(String.valueOf(list.get(list.size() - 1)));
        a10.a(AppMeasurement.CRASH_ORIGIN, "id IN (" + ((Object) sb2) + ")", null);
        a10.b();
    }
}
