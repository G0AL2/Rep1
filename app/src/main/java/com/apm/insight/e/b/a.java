package com.apm.insight.e.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.l.q;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final String f6270a = "_id";

    /* renamed from: b  reason: collision with root package name */
    protected final String f6271b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str) {
        this.f6271b = str;
    }

    protected abstract ContentValues a(T t10);

    protected abstract HashMap<String, String> a();

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(this.f6271b);
            sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a10 = a();
            if (a10 != null) {
                for (String str : a10.keySet()) {
                    sb2.append(str);
                    sb2.append(" ");
                    sb2.append(a10.get(str));
                    sb2.append(",");
                }
                sb2.delete(sb2.length() - 1, sb2.length());
                sb2.append(")");
                sQLiteDatabase.execSQL(sb2.toString());
            }
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t10) {
        if (sQLiteDatabase == null || t10 == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f6271b, null, a((a<T>) t10));
        } catch (Throwable th) {
            q.b(th);
        }
    }
}
