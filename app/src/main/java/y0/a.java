package y0;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import fe.l;
import qe.k;
import ve.p;

/* compiled from: CursorUtil.kt */
/* loaded from: classes.dex */
public final class a {
    public static final Cursor a(Cursor cursor) {
        MatrixCursor matrixCursor;
        k.f(cursor, l6.c.f33710i);
        if (Build.VERSION.SDK_INT > 15) {
            try {
                matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
                while (cursor.moveToNext()) {
                    Object[] objArr = new Object[cursor.getColumnCount()];
                    int columnCount = cursor.getColumnCount();
                    for (int i10 = 0; i10 < columnCount; i10++) {
                        int type = cursor.getType(i10);
                        if (type == 0) {
                            objArr[i10] = null;
                        } else if (type == 1) {
                            objArr[i10] = Long.valueOf(cursor.getLong(i10));
                        } else if (type == 2) {
                            objArr[i10] = Double.valueOf(cursor.getDouble(i10));
                        } else if (type == 3) {
                            objArr[i10] = cursor.getString(i10);
                        } else if (type == 4) {
                            objArr[i10] = cursor.getBlob(i10);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    matrixCursor.addRow(objArr);
                }
                ne.a.a(cursor, null);
            } finally {
            }
        } else {
            try {
                matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
                while (cursor.moveToNext()) {
                    Object[] objArr2 = new Object[cursor.getColumnCount()];
                    int columnCount2 = cursor.getColumnCount();
                    for (int i11 = 0; i11 < columnCount2; i11++) {
                        int type2 = cursor.getType(i11);
                        if (type2 == 0) {
                            objArr2[i11] = null;
                        } else if (type2 == 1) {
                            objArr2[i11] = Long.valueOf(cursor.getLong(i11));
                        } else if (type2 == 2) {
                            objArr2[i11] = Double.valueOf(cursor.getDouble(i11));
                        } else if (type2 == 3) {
                            objArr2[i11] = cursor.getString(i11);
                        } else if (type2 == 4) {
                            objArr2[i11] = cursor.getBlob(i11);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    matrixCursor.addRow(objArr2);
                }
            } finally {
                cursor.close();
            }
        }
        return matrixCursor;
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        k.e(columnNames, "columnNames");
        return c(columnNames, str);
    }

    public static final int c(String[] strArr, String str) {
        boolean k10;
        boolean k11;
        k.f(strArr, "columnNames");
        k.f(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str4 = strArr[i10];
            int i12 = i11 + 1;
            if (str4.length() >= str.length() + 2) {
                k10 = p.k(str4, str2, false, 2, null);
                if (k10) {
                    return i11;
                }
                if (str4.charAt(0) == '`') {
                    k11 = p.k(str4, str3, false, 2, null);
                    if (k11) {
                        return i11;
                    }
                } else {
                    continue;
                }
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }

    public static final int d(Cursor cursor, String str) {
        k.f(cursor, l6.c.f33710i);
        k.f(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static final int e(Cursor cursor, String str) {
        String str2;
        k.f(cursor, l6.c.f33710i);
        k.f(str, "name");
        int d10 = d(cursor, str);
        if (d10 >= 0) {
            return d10;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            k.e(columnNames, "c.columnNames");
            str2 = l.v(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
