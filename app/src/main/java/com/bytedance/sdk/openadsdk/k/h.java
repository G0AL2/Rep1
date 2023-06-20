package com.bytedance.sdk.openadsdk.k;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TrackRetryRepertoryImpl.java */
/* loaded from: classes.dex */
public class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private Context f13447a;

    public h(Context context) {
        this.f13447a = context;
    }

    @Override // com.bytedance.sdk.openadsdk.k.g
    public synchronized List<f> a() {
        LinkedList linkedList;
        linkedList = new LinkedList();
        com.bytedance.sdk.openadsdk.multipro.aidl.c cVar = new com.bytedance.sdk.openadsdk.multipro.aidl.c(com.bytedance.sdk.openadsdk.multipro.a.a.a(this.f13447a, "trackurl", null, null, null, null, null, null));
        while (cVar.moveToNext()) {
            linkedList.add(new f(cVar.getString(cVar.getColumnIndex("id")), cVar.getString(cVar.getColumnIndex(ImagesContract.URL)), cVar.getInt(cVar.getColumnIndex("retry"))));
        }
        cVar.close();
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.k.g
    public synchronized void b(f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.a());
        contentValues.put(ImagesContract.URL, fVar.b());
        contentValues.put("replaceholder", (Integer) 1);
        contentValues.put("retry", Integer.valueOf(fVar.c()));
        com.bytedance.sdk.openadsdk.multipro.a.a.a(this.f13447a, "trackurl", contentValues, "id=?", new String[]{fVar.a()});
    }

    @Override // com.bytedance.sdk.openadsdk.k.g
    public synchronized void c(f fVar) {
        com.bytedance.sdk.openadsdk.multipro.a.a.a(this.f13447a, "trackurl", "id=?", new String[]{fVar.a()});
    }

    public static String b() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE," + ImagesContract.URL + " TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.openadsdk.k.g
    public synchronized void a(f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.a());
        contentValues.put(ImagesContract.URL, fVar.b());
        contentValues.put("replaceholder", (Integer) 1);
        contentValues.put("retry", Integer.valueOf(fVar.c()));
        com.bytedance.sdk.openadsdk.multipro.a.a.a(this.f13447a, "trackurl", contentValues);
    }
}
