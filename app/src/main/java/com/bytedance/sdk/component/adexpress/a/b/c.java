package com.bytedance.sdk.component.adexpress.a.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.android.gms.common.internal.ImagesContract;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: TmplDbHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f9338a;

    /* renamed from: c  reason: collision with root package name */
    private Object f9340c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private LruCache<String, com.bytedance.sdk.component.adexpress.a.c.b> f9341d = new LruCache<String, com.bytedance.sdk.component.adexpress.a.c.b>(2000) { // from class: com.bytedance.sdk.component.adexpress.a.b.c.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.a.c.b bVar) {
            return 1;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private Set<String> f9339b = Collections.synchronizedSet(new HashSet());

    private c() {
    }

    public static c a() {
        if (f9338a == null) {
            synchronized (c.class) {
                if (f9338a == null) {
                    f9338a = new c();
                }
            }
        }
        return f9338a;
    }

    private void c(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.a.c.b> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.f9341d) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.f9340c) {
            this.f9341d.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> b(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.a.a.a.a().b() != null) {
            HashSet hashSet = new HashSet();
            Cursor a10 = com.bytedance.sdk.component.adexpress.a.a.a.a().b().a("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (a10 != null) {
                while (a10.moveToNext()) {
                    try {
                        hashSet.add(a10.getString(a10.getColumnIndex("id")));
                    } finally {
                        a10.close();
                    }
                }
                return hashSet;
            }
        }
        return null;
    }

    public static String c() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ," + ImagesContract.URL + " TEXT , data TEXT , " + MediationMetaData.KEY_VERSION + " TEXT , update_time TEXT)";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bytedance.sdk.component.adexpress.a.c.b a(String str) {
        com.bytedance.sdk.component.adexpress.a.c.b bVar;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.a.a.a.a().b() == null) {
            return null;
        }
        synchronized (this.f9340c) {
            bVar = this.f9341d.get(String.valueOf(str));
        }
        if (bVar != null) {
            return bVar;
        }
        Cursor a10 = com.bytedance.sdk.component.adexpress.a.a.a.a().b().a("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (a10 != null) {
            try {
                if (a10.moveToNext()) {
                    String string = a10.getString(a10.getColumnIndex("rit"));
                    String string2 = a10.getString(a10.getColumnIndex("id"));
                    String string3 = a10.getString(a10.getColumnIndex("md5"));
                    String string4 = a10.getString(a10.getColumnIndex(ImagesContract.URL));
                    String string5 = a10.getString(a10.getColumnIndex("data"));
                    com.bytedance.sdk.component.adexpress.a.c.b a11 = new com.bytedance.sdk.component.adexpress.a.c.b().a(string).b(string2).c(string3).d(string4).e(string5).f(a10.getString(a10.getColumnIndex(MediationMetaData.KEY_VERSION))).a(Long.valueOf(a10.getLong(a10.getColumnIndex("update_time"))));
                    synchronized (this.f9340c) {
                        this.f9341d.put(string2, a11);
                    }
                    this.f9339b.add(string2);
                    return a11;
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.a.c.b> b() {
        if (com.bytedance.sdk.component.adexpress.a.a.a.a().b() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor a10 = com.bytedance.sdk.component.adexpress.a.a.a.a().b().a("template_diff_new", null, null, null, null, null, null);
        if (a10 != null) {
            while (a10.moveToNext()) {
                try {
                    String string = a10.getString(a10.getColumnIndex("rit"));
                    String string2 = a10.getString(a10.getColumnIndex("id"));
                    String string3 = a10.getString(a10.getColumnIndex("md5"));
                    String string4 = a10.getString(a10.getColumnIndex(ImagesContract.URL));
                    String string5 = a10.getString(a10.getColumnIndex("data"));
                    String string6 = a10.getString(a10.getColumnIndex(MediationMetaData.KEY_VERSION));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.a.c.b().a(string).b(string2).c(string3).d(string4).e(string5).f(string6).a(Long.valueOf(a10.getLong(a10.getColumnIndex("update_time")))));
                    synchronized (this.f9340c) {
                        this.f9341d.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.f9339b.add(string2);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.bytedance.sdk.component.adexpress.a.c.b bVar) {
        if (bVar == null || com.bytedance.sdk.component.adexpress.a.a.a.a().b() == null || TextUtils.isEmpty(bVar.b())) {
            return;
        }
        Cursor a10 = com.bytedance.sdk.component.adexpress.a.a.a.a().b().a("template_diff_new", null, "id=?", new String[]{bVar.b()}, null, null, null);
        boolean z10 = a10 != null && a10.getCount() > 0;
        if (a10 != null) {
            try {
                a10.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", bVar.a());
        contentValues.put("id", bVar.b());
        contentValues.put("md5", bVar.c());
        contentValues.put(ImagesContract.URL, bVar.d());
        contentValues.put("data", bVar.e());
        contentValues.put(MediationMetaData.KEY_VERSION, bVar.f());
        contentValues.put("update_time", bVar.g());
        if (z10) {
            com.bytedance.sdk.component.adexpress.a.a.a.a().b().a("template_diff_new", contentValues, "id=?", new String[]{bVar.b()});
        } else {
            com.bytedance.sdk.component.adexpress.a.a.a.a().b().a("template_diff_new", contentValues);
        }
        synchronized (this.f9340c) {
            this.f9341d.put(bVar.b(), bVar);
        }
        this.f9339b.add(bVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.a.a.a.a().b() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                c(strArr[i10]);
                com.bytedance.sdk.component.adexpress.a.a.a.a().b().a("template_diff_new", "id=?", new String[]{strArr[i10]});
            }
        }
    }
}
