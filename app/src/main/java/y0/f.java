package y0;

import android.database.Cursor;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fe.g0;
import fe.h0;
import fe.l0;
import fe.o;
import fe.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import qe.k;
import y0.e;
import z0.g;

/* compiled from: TableInfo.kt */
/* loaded from: classes.dex */
public final class f {
    private static final Map<String, e.a> a(g gVar, String str) {
        Map c10;
        Map<String, e.a> b10;
        Map<String, e.a> g10;
        Map c11;
        Map<String, e.a> b11;
        Map<String, e.a> g11;
        Cursor I0 = gVar.I0("PRAGMA table_info(`" + str + "`)");
        if (Build.VERSION.SDK_INT > 15) {
            try {
                if (I0.getColumnCount() <= 0) {
                    g11 = h0.g();
                    ne.a.a(I0, null);
                    return g11;
                }
                int columnIndex = I0.getColumnIndex("name");
                int columnIndex2 = I0.getColumnIndex("type");
                int columnIndex3 = I0.getColumnIndex("notnull");
                int columnIndex4 = I0.getColumnIndex("pk");
                int columnIndex5 = I0.getColumnIndex("dflt_value");
                c11 = g0.c();
                while (I0.moveToNext()) {
                    String string = I0.getString(columnIndex);
                    String string2 = I0.getString(columnIndex2);
                    boolean z10 = I0.getInt(columnIndex3) != 0;
                    int i10 = I0.getInt(columnIndex4);
                    String string3 = I0.getString(columnIndex5);
                    k.e(string, "name");
                    k.e(string2, "type");
                    c11.put(string, new e.a(string, string2, z10, i10, string3, 2));
                }
                b11 = g0.b(c11);
                ne.a.a(I0, null);
                return b11;
            } finally {
            }
        } else {
            try {
                if (I0.getColumnCount() <= 0) {
                    g10 = h0.g();
                    return g10;
                }
                int columnIndex6 = I0.getColumnIndex("name");
                int columnIndex7 = I0.getColumnIndex("type");
                int columnIndex8 = I0.getColumnIndex("notnull");
                int columnIndex9 = I0.getColumnIndex("pk");
                int columnIndex10 = I0.getColumnIndex("dflt_value");
                c10 = g0.c();
                while (I0.moveToNext()) {
                    String string4 = I0.getString(columnIndex6);
                    String string5 = I0.getString(columnIndex7);
                    boolean z11 = I0.getInt(columnIndex8) != 0;
                    int i11 = I0.getInt(columnIndex9);
                    String string6 = I0.getString(columnIndex10);
                    k.e(string4, "name");
                    k.e(string5, "type");
                    c10.put(string4, new e.a(string4, string5, z11, i11, string6, 2));
                }
                b10 = g0.b(c10);
                return b10;
            } finally {
                I0.close();
            }
        }
    }

    private static final List<e.d> b(Cursor cursor) {
        List c10;
        List a10;
        List<e.d> I;
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        c10 = o.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            k.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            k.e(string2, "cursor.getString(toColumnIndex)");
            c10.add(new e.d(i10, i11, string, string2));
        }
        a10 = o.a(c10);
        I = x.I(a10);
        return I;
    }

    private static final Set<e.c> c(g gVar, String str) {
        Set b10;
        Set<e.c> a10;
        Set b11;
        Set<e.c> a11;
        Cursor I0 = gVar.I0("PRAGMA foreign_key_list(`" + str + "`)");
        if (Build.VERSION.SDK_INT > 15) {
            try {
                int columnIndex = I0.getColumnIndex("id");
                int columnIndex2 = I0.getColumnIndex("seq");
                int columnIndex3 = I0.getColumnIndex("table");
                int columnIndex4 = I0.getColumnIndex("on_delete");
                int columnIndex5 = I0.getColumnIndex("on_update");
                List<e.d> b12 = b(I0);
                I0.moveToPosition(-1);
                b10 = l0.b();
                while (I0.moveToNext()) {
                    if (I0.getInt(columnIndex2) == 0) {
                        int i10 = I0.getInt(columnIndex);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<e.d> arrayList3 = new ArrayList();
                        for (Object obj : b12) {
                            int i11 = columnIndex2;
                            if (((e.d) obj).g() == i10) {
                                arrayList3.add(obj);
                            }
                            columnIndex2 = i11;
                        }
                        int i12 = columnIndex2;
                        for (e.d dVar : arrayList3) {
                            arrayList.add(dVar.f());
                            arrayList2.add(dVar.h());
                        }
                        String string = I0.getString(columnIndex3);
                        k.e(string, "cursor.getString(tableColumnIndex)");
                        String string2 = I0.getString(columnIndex4);
                        k.e(string2, "cursor.getString(onDeleteColumnIndex)");
                        String string3 = I0.getString(columnIndex5);
                        k.e(string3, "cursor.getString(onUpdateColumnIndex)");
                        b10.add(new e.c(string, string2, string3, arrayList, arrayList2));
                        columnIndex2 = i12;
                    }
                }
                a10 = l0.a(b10);
                ne.a.a(I0, null);
                return a10;
            } finally {
            }
        } else {
            try {
                int columnIndex6 = I0.getColumnIndex("id");
                int columnIndex7 = I0.getColumnIndex("seq");
                int columnIndex8 = I0.getColumnIndex("table");
                int columnIndex9 = I0.getColumnIndex("on_delete");
                int columnIndex10 = I0.getColumnIndex("on_update");
                List<e.d> b13 = b(I0);
                I0.moveToPosition(-1);
                b11 = l0.b();
                while (I0.moveToNext()) {
                    if (I0.getInt(columnIndex7) == 0) {
                        int i13 = I0.getInt(columnIndex6);
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList<e.d> arrayList6 = new ArrayList();
                        for (Object obj2 : b13) {
                            int i14 = columnIndex6;
                            int i15 = columnIndex7;
                            if (((e.d) obj2).g() == i13) {
                                arrayList6.add(obj2);
                            }
                            columnIndex6 = i14;
                            columnIndex7 = i15;
                        }
                        int i16 = columnIndex6;
                        int i17 = columnIndex7;
                        for (e.d dVar2 : arrayList6) {
                            arrayList4.add(dVar2.f());
                            arrayList5.add(dVar2.h());
                        }
                        String string4 = I0.getString(columnIndex8);
                        k.e(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = I0.getString(columnIndex9);
                        k.e(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = I0.getString(columnIndex10);
                        k.e(string6, "cursor.getString(onUpdateColumnIndex)");
                        b11.add(new e.c(string4, string5, string6, arrayList4, arrayList5));
                        columnIndex6 = i16;
                        columnIndex7 = i17;
                    }
                }
                a11 = l0.a(b11);
                return a11;
            } finally {
                I0.close();
            }
        }
    }

    private static final e.C0540e d(g gVar, String str, boolean z10) {
        List N;
        List N2;
        e.C0540e c0540e;
        int i10;
        String str2;
        String str3;
        List N3;
        List N4;
        Cursor I0 = gVar.I0("PRAGMA index_xinfo(`" + str + "`)");
        String str4 = "DESC";
        if (Build.VERSION.SDK_INT > 15) {
            try {
                int columnIndex = I0.getColumnIndex("seqno");
                int columnIndex2 = I0.getColumnIndex("cid");
                int columnIndex3 = I0.getColumnIndex("name");
                int columnIndex4 = I0.getColumnIndex("desc");
                if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (I0.moveToNext()) {
                        if (I0.getInt(columnIndex2) >= 0) {
                            int i11 = I0.getInt(columnIndex);
                            String string = I0.getString(columnIndex3);
                            if (I0.getInt(columnIndex4) > 0) {
                                i10 = columnIndex;
                                str3 = str4;
                                str2 = str3;
                            } else {
                                i10 = columnIndex;
                                str2 = str4;
                                str3 = "ASC";
                            }
                            Integer valueOf = Integer.valueOf(i11);
                            k.e(string, "columnName");
                            treeMap.put(valueOf, string);
                            treeMap2.put(Integer.valueOf(i11), str3);
                            columnIndex = i10;
                            str4 = str2;
                        }
                    }
                    Collection values = treeMap.values();
                    k.e(values, "columnsMap.values");
                    N = x.N(values);
                    Collection values2 = treeMap2.values();
                    k.e(values2, "ordersMap.values");
                    N2 = x.N(values2);
                    c0540e = new e.C0540e(str, z10, N, N2);
                    ne.a.a(I0, null);
                }
                ne.a.a(I0, null);
                return null;
            } finally {
            }
        } else {
            try {
                int columnIndex5 = I0.getColumnIndex("seqno");
                int columnIndex6 = I0.getColumnIndex("cid");
                int columnIndex7 = I0.getColumnIndex("name");
                int columnIndex8 = I0.getColumnIndex("desc");
                if (columnIndex5 != -1 && columnIndex6 != -1 && columnIndex7 != -1 && columnIndex8 != -1) {
                    TreeMap treeMap3 = new TreeMap();
                    TreeMap treeMap4 = new TreeMap();
                    while (I0.moveToNext()) {
                        if (I0.getInt(columnIndex6) >= 0) {
                            int i12 = I0.getInt(columnIndex5);
                            String string2 = I0.getString(columnIndex7);
                            int i13 = columnIndex5;
                            String str5 = I0.getInt(columnIndex8) > 0 ? "DESC" : "ASC";
                            Integer valueOf2 = Integer.valueOf(i12);
                            k.e(string2, "columnName");
                            treeMap3.put(valueOf2, string2);
                            treeMap4.put(Integer.valueOf(i12), str5);
                            columnIndex5 = i13;
                        }
                    }
                    Collection values3 = treeMap3.values();
                    k.e(values3, "columnsMap.values");
                    N3 = x.N(values3);
                    Collection values4 = treeMap4.values();
                    k.e(values4, "ordersMap.values");
                    N4 = x.N(values4);
                    c0540e = new e.C0540e(str, z10, N3, N4);
                }
                I0.close();
                return null;
            } finally {
                I0.close();
            }
        }
        return c0540e;
    }

    private static final Set<e.C0540e> e(g gVar, String str) {
        Set b10;
        Set<e.C0540e> a10;
        Set b11;
        Set<e.C0540e> a11;
        Cursor I0 = gVar.I0("PRAGMA index_list(`" + str + "`)");
        if (Build.VERSION.SDK_INT > 15) {
            try {
                int columnIndex = I0.getColumnIndex("name");
                int columnIndex2 = I0.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                int columnIndex3 = I0.getColumnIndex("unique");
                if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                    b10 = l0.b();
                    while (I0.moveToNext()) {
                        if (k.a(l6.c.f33710i, I0.getString(columnIndex2))) {
                            String string = I0.getString(columnIndex);
                            boolean z10 = I0.getInt(columnIndex3) == 1;
                            k.e(string, "name");
                            e.C0540e d10 = d(gVar, string, z10);
                            if (d10 == null) {
                                ne.a.a(I0, null);
                                return null;
                            }
                            b10.add(d10);
                        }
                    }
                    a10 = l0.a(b10);
                    ne.a.a(I0, null);
                    return a10;
                }
                ne.a.a(I0, null);
                return null;
            } finally {
            }
        } else {
            try {
                int columnIndex4 = I0.getColumnIndex("name");
                int columnIndex5 = I0.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                int columnIndex6 = I0.getColumnIndex("unique");
                if (columnIndex4 != -1 && columnIndex5 != -1 && columnIndex6 != -1) {
                    b11 = l0.b();
                    while (I0.moveToNext()) {
                        if (k.a(l6.c.f33710i, I0.getString(columnIndex5))) {
                            String string2 = I0.getString(columnIndex4);
                            boolean z11 = I0.getInt(columnIndex6) == 1;
                            k.e(string2, "name");
                            e.C0540e d11 = d(gVar, string2, z11);
                            if (d11 == null) {
                                return null;
                            }
                            b11.add(d11);
                        }
                    }
                    a11 = l0.a(b11);
                    return a11;
                }
                return null;
            } finally {
                I0.close();
            }
        }
    }

    public static final e f(g gVar, String str) {
        k.f(gVar, "database");
        k.f(str, "tableName");
        return new e(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
