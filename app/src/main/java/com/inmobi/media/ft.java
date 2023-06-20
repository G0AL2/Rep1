package com.inmobi.media;

import android.content.ContentValues;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigDao.java */
/* loaded from: classes3.dex */
public class ft {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25494a = "ft";

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f25495b = {"account_id", "config_value", "config_type", "update_ts"};

    public ft() {
        he a10 = he.a();
        a10.a("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
        a10.b();
    }

    private static fr a(ContentValues contentValues) throws JSONException {
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        return fr.a(contentValues.getAsString("config_type"), new JSONObject(asString), contentValues.getAsString("account_id"));
    }

    public static boolean b(String str, String str2) {
        try {
            he a10 = he.a();
            int b10 = a10.b("config_db", "account_id=? AND config_type=?", d(str, str2));
            a10.b();
            return b10 <= 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public static long c(String str, String str2) {
        try {
            he a10 = he.a();
            List<ContentValues> a11 = a10.a("config_db", f25495b, "account_id=? AND config_type=?", d(str, str2), null, null, null, null);
            r0 = a11.isEmpty() ? 0L : a11.get(0).getAsLong("update_ts").longValue();
            a10.b();
        } catch (Exception unused) {
        }
        return r0;
    }

    private static String[] d(String str, String str2) {
        return new String[]{str2, str};
    }

    public static void a(fr frVar) {
        try {
            if (frVar.g() == null) {
                return;
            }
            he a10 = he.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("account_id", frVar.g());
            JSONObject c10 = frVar.c();
            if (c10 == null) {
                c10 = new JSONObject();
            }
            contentValues.put("config_value", c10.toString());
            contentValues.put("config_type", frVar.b());
            contentValues.put("update_ts", Long.valueOf(System.currentTimeMillis()));
            a10.a("config_db", contentValues, "account_id=? AND config_type=?", d(frVar.b(), frVar.g()));
            a10.b();
        } catch (Exception unused) {
        }
    }

    public static fr a(String str, String str2) {
        fr frVar;
        try {
            he a10 = he.a();
            List<ContentValues> a11 = a10.a("config_db", f25495b, "account_id=? AND config_type=?", d(str, str2), null, null, null, null);
            frVar = !a11.isEmpty() ? a(a11.get(0)) : null;
            try {
                a10.b();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            frVar = null;
        }
        return frVar == null ? fr.a(str, null) : frVar;
    }

    public static LinkedList<fr> a() {
        LinkedList<fr> linkedList = new LinkedList<>();
        try {
            he a10 = he.a();
            List<ContentValues> a11 = a10.a("config_db", f25495b, null, null, null, null, null, null);
            if (!a11.isEmpty()) {
                for (ContentValues contentValues : a11) {
                    linkedList.add(a(contentValues));
                }
            }
            a10.b();
        } catch (Exception unused) {
        }
        return linkedList;
    }

    public static void a(String str, String str2, long j10) {
        try {
            he a10 = he.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_ts", Long.valueOf(j10));
            a10.b("config_db", contentValues, "account_id=? AND config_type=?", d(str, str2));
            a10.b();
        } catch (Exception unused) {
        }
    }
}
