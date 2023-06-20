package com.vehiclecloud.app.videofetch.unit;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.reactnativecommunity.asyncstorage.e;
import org.json.JSONObject;
import qe.k;
import timber.log.a;

/* compiled from: AsyncStorageHelper.kt */
/* loaded from: classes3.dex */
public final class AsyncStorageHelper {
    private static final String SELECTION = "key = ?";
    private static final String TABLE_CATALYST = "catalystLocalStorage";
    private static final String VALUE_COLUMN = "value";
    public static final AsyncStorageHelper INSTANCE = new AsyncStorageHelper();
    private static final String KEY_COLUMN = "key";
    private static final String[] COLUMNS = {KEY_COLUMN, "value"};

    private AsyncStorageHelper() {
    }

    public static final JSONObject query(Context context, String str) {
        JSONObject jSONObject;
        k.f(context, "context");
        k.f(str, KEY_COLUMN);
        Cursor query = e.q(context).l().query(TABLE_CATALYST, COLUMNS, SELECTION, new String[]{str}, null, null, null);
        try {
            try {
            } catch (Exception e10) {
                a.f37331a.e(e10, "AsyncStorageHelper query get ex:", new Object[0]);
            }
            if (query.getCount() != 0) {
                query.moveToNext();
                jSONObject = new JSONObject(query.getString(1));
                ne.a.a(query, null);
                return jSONObject;
            }
            jSONObject = null;
            ne.a.a(query, null);
            return jSONObject;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ne.a.a(query, th);
                throw th2;
            }
        }
    }

    public final void set(Context context, String str, String str2) {
        k.f(context, "context");
        k.f(str, KEY_COLUMN);
        k.f(str2, "value");
        SQLiteDatabase l10 = e.q(context).l();
        try {
            try {
                l10.beginTransaction();
                l10.execSQL("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?)", new String[]{str, str2});
                l10.setTransactionSuccessful();
                try {
                    l10.endTransaction();
                } catch (Exception e10) {
                    a.f37331a.e(e10, "AsyncStorageHelper set when endTransaction get ex:", new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    l10.endTransaction();
                } catch (Exception e11) {
                    a.f37331a.e(e11, "AsyncStorageHelper set when endTransaction get ex:", new Object[0]);
                }
                throw th;
            }
        } catch (Exception e12) {
            a.f37331a.e(e12, "AsyncStorageHelper set get ex:", new Object[0]);
            try {
                l10.endTransaction();
            } catch (Exception e13) {
                a.f37331a.e(e13, "AsyncStorageHelper set when endTransaction get ex:", new Object[0]);
            }
        }
    }
}
