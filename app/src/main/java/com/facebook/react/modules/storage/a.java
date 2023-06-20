package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AsyncLocalStorageUtil.java */
/* loaded from: classes.dex */
public class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i10) {
        String[] strArr = new String[i10];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b(ReadableArray readableArray, int i10, int i11) {
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = readableArray.getString(i10 + i12);
        }
        return strArr;
    }

    private static void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject != null && optJSONObject2 != null) {
                c(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            } else {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
    }

    public static String d(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("catalystLocalStorage", new String[]{AppMeasurementSdk.ConditionalUserProperty.VALUE}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            return query.getString(0);
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String d10 = d(sQLiteDatabase, str);
        if (d10 != null) {
            JSONObject jSONObject = new JSONObject(d10);
            c(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return f(sQLiteDatabase, str, str2);
    }

    static boolean f(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }
}
