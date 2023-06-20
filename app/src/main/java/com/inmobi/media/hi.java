package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: TelemetryDao.java */
/* loaded from: classes3.dex */
public class hi extends gl {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25670a = "hi";

    public hi() {
        he a10 = he.a();
        a10.a("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a10.b();
    }

    public static void a(hj hjVar) {
        he a10 = he.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", hjVar.f25672b);
        contentValues.put("payload", hjVar.a());
        contentValues.put("ts", String.valueOf(hjVar.f25673c));
        a10.a("telemetry", contentValues);
        a10.b();
    }

    @Override // com.inmobi.media.gl
    public final void b(long j10) {
        he a10 = he.a();
        a10.a("telemetry", "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j10 * 1000))});
        a10.b();
    }

    @Override // com.inmobi.media.gl
    public final void c(long j10) {
        Context c10 = ho.c();
        if (c10 != null) {
            hf.a(c10, "batch_processing_info").a("telemetry_last_batch_process", j10);
        }
    }

    @Override // com.inmobi.media.gl
    public final long c() {
        Context c10 = ho.c();
        if (c10 == null) {
            return -1L;
        }
        return hf.a(c10, "batch_processing_info").b("telemetry_last_batch_process", -1L);
    }

    public static List<hj> a(int i10) {
        he a10 = he.a();
        List<ContentValues> a11 = a10.a("telemetry", null, null, null, null, null, "ts ASC", String.valueOf(i10));
        ArrayList arrayList = new ArrayList();
        a10.b();
        for (ContentValues contentValues : a11) {
            arrayList.add(hj.a(contentValues));
        }
        return arrayList;
    }

    @Override // com.inmobi.media.gl
    public final boolean a(long j10) {
        List<hj> a10 = a(1);
        return a10.size() > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a10.get(0).f25673c) >= j10;
    }

    @Override // com.inmobi.media.gl
    public final boolean a(long j10, long j11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(System.currentTimeMillis()) + j10;
        List<hj> a10 = a(1);
        return a10.size() > 0 && seconds - timeUnit.toSeconds(a10.get(0).f25673c) > j11;
    }

    @Override // com.inmobi.media.gl
    public final int a() {
        he a10 = he.a();
        int a11 = a10.a("telemetry");
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
        a10.a("telemetry", "id IN (" + ((Object) sb2) + ")", null);
        a10.b();
    }
}
