package a3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.f.h;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoProxyDB.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f56e;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Map<String, a3.a>> f57a;

    /* renamed from: b  reason: collision with root package name */
    private final d f58b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f59c;

    /* renamed from: d  reason: collision with root package name */
    private volatile SQLiteStatement f60d;

    /* compiled from: VideoProxyDB.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a3.a f61a;

        a(a3.a aVar) {
            this.f61a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.f60d != null) {
                    c.this.f60d.clearBindings();
                } else {
                    c cVar = c.this;
                    cVar.f60d = cVar.f58b.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                }
                c.this.f60d.bindString(1, this.f61a.f51a);
                c.this.f60d.bindString(2, this.f61a.f52b);
                c.this.f60d.bindLong(3, this.f61a.f53c);
                c.this.f60d.bindLong(4, this.f61a.f54d);
                c.this.f60d.bindString(5, this.f61a.f55e);
                c.this.f60d.executeInsert();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: VideoProxyDB.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f63a;

        b(int i10) {
            this.f63a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f58b.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(this.f63a)});
            } catch (Throwable unused) {
            }
        }
    }

    private c(Context context) {
        SparseArray<Map<String, a3.a>> sparseArray = new SparseArray<>(2);
        this.f57a = sparseArray;
        this.f59c = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new h(5, "video_proxy_db"));
        this.f58b = new d(context.getApplicationContext());
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    public static c b(Context context) {
        if (f56e == null) {
            synchronized (c.class) {
                if (f56e == null) {
                    f56e = new c(context);
                }
            }
        }
        return f56e;
    }

    private String i(int i10) {
        if (i10 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10 << 1);
        sb2.append("?");
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(",?");
        }
        return sb2.toString();
    }

    public a3.a a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, a3.a> map = this.f57a.get(i10);
        a3.a aVar = map == null ? null : map.get(str);
        if (aVar != null) {
            return aVar;
        }
        try {
            Cursor query = this.f58b.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i10)}, null, null, null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    aVar = new a3.a(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i10, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (aVar != null && map != null) {
                map.put(str, aVar);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void e(int i10) {
        Map<String, a3.a> map = this.f57a.get(i10);
        if (map != null) {
            map.clear();
        }
        this.f59c.execute(new b(i10));
    }

    public void f(a3.a aVar) {
        if (aVar != null) {
            Map<String, a3.a> map = this.f57a.get(aVar.f54d);
            if (map != null) {
                map.put(aVar.f51a, aVar);
            }
            this.f59c.execute(new a(aVar));
        }
    }

    public void g(Collection<String> collection, int i10) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        String[] strArr = new String[size];
        int i11 = -1;
        Map<String, a3.a> map = this.f57a.get(i10);
        for (String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i11++;
            strArr[i11] = str;
        }
        strArr[i11 + 1] = String.valueOf(i10);
        try {
            SQLiteDatabase writableDatabase = this.f58b.getWritableDatabase();
            writableDatabase.delete("video_http_header_t", "key IN(" + i(size) + ") AND flag=?", strArr);
        } catch (Throwable unused) {
        }
    }
}
