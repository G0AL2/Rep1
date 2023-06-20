package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: DbStore.java */
/* loaded from: classes3.dex */
public final class he {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25648a = "he";

    /* renamed from: b  reason: collision with root package name */
    private static volatile he f25649b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f25650c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f25651d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static int f25652e;

    /* renamed from: f  reason: collision with root package name */
    private SQLiteDatabase f25653f;

    private he() {
        try {
            this.f25653f = new hd(ho.c()).getWritableDatabase();
            f25649b = this;
        } catch (Exception unused) {
        }
    }

    public static he a() {
        synchronized (f25651d) {
            f25652e++;
        }
        he heVar = f25649b;
        if (heVar == null) {
            synchronized (f25650c) {
                heVar = f25649b;
                if (heVar == null) {
                    heVar = new he();
                    f25649b = heVar;
                }
            }
        }
        return heVar;
    }

    public final int b(String str, ContentValues contentValues, String str2, String[] strArr) {
        int updateWithOnConflict;
        try {
            synchronized (f25650c) {
                updateWithOnConflict = this.f25653f.updateWithOnConflict(str, contentValues, str2, strArr, 4);
            }
            return updateWithOnConflict;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final int b(String str, String str2, String[] strArr) {
        Cursor cursor = null;
        try {
            String str3 = "SELECT COUNT(*) FROM " + str + " WHERE " + str2 + " ; ";
            synchronized (f25650c) {
                cursor = this.f25653f.rawQuery(str3, strArr);
            }
            cursor.moveToFirst();
            int i10 = cursor.getInt(0);
            cursor.close();
            cursor.close();
            return i10;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
                return -1;
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a(String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            synchronized (f25650c) {
                if (-1 == a(str, contentValues)) {
                    b(str, contentValues, str2, strArr);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final long a(String str, ContentValues contentValues) {
        long insertWithOnConflict;
        try {
            synchronized (f25650c) {
                insertWithOnConflict = this.f25653f.insertWithOnConflict(str, null, contentValues, 4);
            }
            return insertWithOnConflict;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final void b(String str) {
        try {
            String str2 = "DROP TABLE IF EXISTS \"" + str + "\"";
            synchronized (f25650c) {
                this.f25653f.execSQL(str2);
            }
        } catch (Exception unused) {
        }
    }

    public final int a(String str, String str2, String[] strArr) {
        int delete;
        try {
            synchronized (f25650c) {
                delete = this.f25653f.delete(str, str2, strArr);
            }
            return delete;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final void b() {
        try {
            synchronized (f25651d) {
                int i10 = f25652e - 1;
                f25652e = i10;
                if (i10 == 0) {
                    synchronized (f25650c) {
                        this.f25653f.close();
                    }
                    f25649b = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (0 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.content.ContentValues> a(java.lang.String r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r14 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.Object r3 = com.inmobi.media.he.f25650c     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L4a
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L4a
            r4 = r14
            android.database.sqlite.SQLiteDatabase r5 = r4.f25653f     // Catch: java.lang.Throwable -> L3b
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r0 == 0) goto L37
        L26:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            android.database.DatabaseUtils.cursorRowToContentValues(r2, r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r1.add(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r0 != 0) goto L26
        L37:
            r2.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            goto L4d
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
        L3e:
            r0 = move-exception
            goto L44
        L40:
            goto L4b
        L42:
            r0 = move-exception
            r4 = r14
        L44:
            if (r2 == 0) goto L49
            r2.close()
        L49:
            throw r0
        L4a:
            r4 = r14
        L4b:
            if (r2 == 0) goto L50
        L4d:
            r2.close()
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.he.a(java.lang.String, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final int a(String str) {
        Cursor cursor = null;
        try {
            String str2 = "SELECT COUNT(*) FROM " + str + " ; ";
            synchronized (f25650c) {
                cursor = this.f25653f.rawQuery(str2, null);
            }
            cursor.moveToFirst();
            int i10 = cursor.getInt(0);
            cursor.close();
            cursor.close();
            return i10;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
                return -1;
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a(String str, String str2) {
        try {
            String str3 = "CREATE TABLE IF NOT EXISTS " + str + str2 + ";";
            synchronized (f25650c) {
                this.f25653f.execSQL(str3);
            }
        } catch (Exception unused) {
        }
    }
}
